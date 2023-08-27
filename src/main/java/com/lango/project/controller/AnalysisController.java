package com.lango.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.lango.project.annotation.AuthCheck;
import com.lango.project.common.BaseResponse;
import com.lango.project.common.ErrorCode;
import com.lango.project.common.ResultUtils;
import com.lango.project.exception.BusinessException;
import com.lango.project.mapper.InterfaceInfoMapper;
import com.lango.project.mapper.UserInterfaceInfoMapper;
import com.lango.project.model.entity.InterfaceInfo;
import com.lango.project.model.entity.UserInterfaceInfo;
import com.lango.project.model.vo.InterfaceInfoVO;
import com.lango.project.service.InterfaceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 分析控制器
 *
 * @author Lango
 * @version 1.0
 */
@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;
    @Resource
    private InterfaceInfoService interfaceInfoService;


    @GetMapping("top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo() {
        List<UserInterfaceInfo> userInterfaceInfoList = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(3);
        Map<Long, List<UserInterfaceInfo>> interfaceInfoIdObjMap = userInterfaceInfoList.stream().collect(Collectors.groupingBy(UserInterfaceInfo::getInterfaceInfoId));
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", interfaceInfoIdObjMap.keySet());
        List<InterfaceInfo> list = interfaceInfoService.list(queryWrapper);
        if (CollectionUtils.isEmpty(list)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<InterfaceInfoVO> interfaceInfoVOList = list.stream().map(interfaceInfo -> {
            InterfaceInfoVO interfaceInfoVO = new InterfaceInfoVO();
            BeanUtils.copyProperties(interfaceInfo, interfaceInfoVO);
            Integer totalNum = interfaceInfoIdObjMap.get(interfaceInfo.getId()).get(0).getTotalNum();
            interfaceInfoVO.setName(interfaceInfo.getName());
            interfaceInfoVO.setTotalNum(totalNum);
            return interfaceInfoVO;
        }).collect(Collectors.toList());
        return ResultUtils.success(interfaceInfoVOList);
    }
}

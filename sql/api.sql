-- 接口信息
create table if not exists langoapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '接口名称',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭，1-开启）',
    `method` varchar(256) not null comment '请求类型',
    `accessKey` varchar(512) not null comment 'accessKey',
    `secretKey` varchar(512) not null comment 'secretKey',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDeleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
    ) comment '接口信息';

insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('戴鑫磊', '胡烨华', 'www.coleman-schinner.name', '田晋鹏', '郝浩轩', 0, '钟伟祺', 2556694);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('武立轩', '黄思聪', 'www.kory-mclaughlin.com', '丁子轩', '蔡博涛', 0, '金苑博', 6957594);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('赖思', '杜雨泽', 'www.annis-collier.org', '赖风华', '朱伟诚', 0, '任涛', 67);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('任昊强', '冯昊强', 'www.laverne-zulauf.name', '洪弘文', '高聪健', 0, '魏烨霖', 63138);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('谭展鹏', '赖楷瑞', 'www.hollis-funk.com', '谢博文', '魏航', 0, '武文', 5084);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('宋鹤轩', '金烨华', 'www.ruthe-quitzon.info', '何靖琪', '邹文轩', 0, '崔浩然', 6);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('顾雨泽', '洪健柏', 'www.meri-schmeler.co', '李明辉', '董天翊', 0, '雷晟睿', 6691);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('孙笑愚', '林峻熙', 'www.letisha-kuhn.info', '曹志泽', '袁健雄', 0, '陶鹏涛', 3087);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('崔昊然', '萧晋鹏', 'www.ha-buckridge.org', '苏钰轩', '万鸿涛', 0, '苏昊强', 32960983);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('夏钰轩', '吴熠彤', 'www.rayford-casper.biz', '雷哲瀚', '严文轩', 0, '朱智宸', 32);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('戴鑫磊', '戴瑾瑜', 'www.avery-boyle.info', '蒋琪', '王嘉熙', 0, '王哲瀚', 2474);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('李天翊', '徐弘文', 'www.yuonne-rath.biz', '唐立辉', '邱睿渊', 0, '黄天翊', 6905088);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('孟鹤轩', '孔智渊', 'www.fabian-torphy.name', '武烨霖', '严绍齐', 0, '阎晟睿', 801494969);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('白立辉', '江智辉', 'www.deloris-paucek.net', '金昊焱', '张鸿煊', 0, '蒋立辉', 6763320166);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('方鸿煊', '龙鑫磊', 'www.keely-walter.org', '曹凯瑞', '陈正豪', 0, '杜航', 1354);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('汪琪', '白昊然', 'www.neal-jaskolski.info', '朱立诚', '胡懿轩', 0, '叶志泽', 883671814);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('曾睿渊', '何振家', 'www.marcene-kilback.info', '戴哲瀚', '白思聪', 0, '吕乐驹', 676747037);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('孙立轩', '孔聪健', 'www.leopoldo-klocko.org', '孙晟睿', '余晓博', 0, '龙鹏', 444);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('卢雪松', '傅雪松', 'www.emmie-kovacek.biz', '丁伟宸', '唐明哲', 0, '胡擎苍', 784);
insert into langoapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('卢睿渊', '陈楷瑞', 'www.joe-ruecker.com', '潘思源', '冯博文', 0, '雷博超', 56668);
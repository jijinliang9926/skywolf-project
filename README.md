狼哥亚马逊跨境ERP
---
功能模块

    主模块：
    finance     - 财务模块（未开发）
    product-dev - 产品开发模块（未开发）
    warehouse   - 仓库模块（未开发）
    operate     - 运营模块


    次模块：
    commont     - 公共功能模块
        1.统一返回类
        2.全局异常处理
        3.分页参数
    generator   - mybatis代码生成器
    gateway     - 网关 （目前只实现了路由功能，认证、熔断降级等后续再实现）
    amazon      - 定时采集数据模块 （未开发）

    
    其它：
    nacos       - 配置中心和注册中心
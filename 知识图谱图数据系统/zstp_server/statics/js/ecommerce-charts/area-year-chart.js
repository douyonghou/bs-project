area_year_chart = echarts.init(document.getElementById('area-year-chart'), 'westeros');
area_year_chart_option = {
    title: {
        text: ''
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['2004', '2005', '2006', '2007', '2008', '2009', '2010', '2011', '2012', '2013', '2014', '2015', '2016', '2017', '2018']
    },
    yAxis: {
        type: 'value'
    },
    series: [{
            name: '北京市',
            type: 'line',
            stack: '总量',
            data: [120, 132, 101, 134, 90, 230, 210, 220, 450, 500, 501, 420, 300, 900, 910]
        },
        {
            name: '上海市',
            type: 'line',
            stack: '总量',
            data: [820, 932, 901, 934, 1290, 1330, 1320, 1220, 1100, 1210, 900, 1200, 1310, 1500, 1600]
        },
        {
            name: '江苏省',
            type: 'line',
            stack: '总量',
            data: [920, 1332, 1301, 1534, 1390, 1330, 1420, 1300, 1320, 1330, 1440, 1500, 1501, 1600, 1800]
        },
        {
            name: '浙江省',
            type: 'line',
            stack: '总量',
            data: [320, 332, 301, 334, 390, 330, 320, 400, 450, 476, 600, 620, 720, 790, 750, 865]
        },
        {
            name: '福建省',
            type: 'line',
            stack: '总量',
            data: [220, 182, 191, 234, 290, 330, 310, 410, 420, 420, 510, 390, 600, 500, 560, 510]
        },
        {
            name: '天津市',
            type: 'line',
            stack: '总量',
            data: [150, 232, 201, 154, 190, 330, 410, 500, 600, 700, 720, 800, 750, 790, 810, 880]
        }
    ]
}
area_year_chart.setOption(area_year_chart_option);
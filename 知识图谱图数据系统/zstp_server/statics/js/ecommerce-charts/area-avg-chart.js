var area_avg_chart = echarts.init(document.getElementById('area-avg-chart'), 'westeros');
var area_avg_option = {
    tooltip: {
        trigger: 'axis',
        axisPointer: { // 坐标轴指示器，坐标轴触发有效
            type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: [{
        data: ['北京市', '上海市', '天津市', '江苏省', '浙江省', '福建省', '山东省', '安徽省', '山西省', '陕西省',
            '四川省', '重庆市', '广东省', '海南省', '云南省', '江西省', '湖南省', '湖北省', '黑龙江省', '吉林省',
            '广西壮族自治区', '贵州省', '西藏自治区', '宁夏回族自治区', '新疆维吾尔自治区', '香港特别行政区', '台湾省',
        ]
    }],
    yAxis: [{
        type: 'value'
    }],
    series: [{
        name: '直接访问',
        type: 'bar',
        barWidth: '60%',
        data: [
            810, 521, 500, 534, 690, 530, 820, 404, 500,
            101, 202, 303, 101, 500, 600, 102, 105, 100,
            400, 506, 502, 210, 310, 450, 102, 234, 300
        ]
    }]
};
area_avg_chart.setOption(area_avg_option);
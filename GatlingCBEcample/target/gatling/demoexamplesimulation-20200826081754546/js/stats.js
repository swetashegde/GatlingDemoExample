var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "4",
        "ok": "4",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1078",
        "ok": "1078",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3832",
        "ok": "3832",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2430",
        "ok": "2430",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1322",
        "ok": "1322",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2405",
        "ok": "2405",
        "ko": "-"
    },
    "percentiles2": {
        "total": "3711",
        "ok": "3711",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3808",
        "ok": "3808",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3827",
        "ok": "3827",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 2,
    "percentage": 50
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2,
    "percentage": 50
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.667",
        "ok": "0.667",
        "ko": "-"
    }
},
contents: {
"req_homepage-339f7": {
        type: "REQUEST",
        name: "Homepage",
path: "Homepage",
pathFormatted: "req_homepage-339f7",
stats: {
    "name": "Homepage",
    "numberOfRequests": {
        "total": "2",
        "ok": "2",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "3670",
        "ok": "3670",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3832",
        "ok": "3832",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3751",
        "ok": "3751",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "81",
        "ok": "81",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3751",
        "ok": "3751",
        "ko": "-"
    },
    "percentiles2": {
        "total": "3792",
        "ok": "3792",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3824",
        "ok": "3824",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3830",
        "ok": "3830",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.333",
        "ok": "0.333",
        "ko": "-"
    }
}
    },"req_login-to-app-3f041": {
        type: "REQUEST",
        name: "Login to app",
path: "Login to app",
pathFormatted: "req_login-to-app-3f041",
stats: {
    "name": "Login to app",
    "numberOfRequests": {
        "total": "2",
        "ok": "2",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1078",
        "ok": "1078",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1140",
        "ok": "1140",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1109",
        "ok": "1109",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "31",
        "ok": "31",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1109",
        "ok": "1109",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1125",
        "ok": "1125",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1137",
        "ok": "1137",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1139",
        "ok": "1139",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 2,
    "percentage": 100
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.333",
        "ok": "0.333",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
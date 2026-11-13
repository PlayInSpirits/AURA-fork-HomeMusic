.class public final Ldefpackage/ih3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public static a(J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "UTC"

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/Date;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/PlayEvent;
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, "hub:"

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static/range {p3 .. p4}, Ldefpackage/ih3;->a(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-static {v0, v2}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v8, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v8, v3

    .line 41
    :goto_0
    if-eqz v1, :cond_1

    .line 42
    .line 43
    move-object v9, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v9, v0

    .line 46
    :goto_1
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const-wide/16 v10, 0x0

    .line 52
    .line 53
    if-eqz p5, :cond_3

    .line 54
    .line 55
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Number;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v12

    .line 59
    cmp-long v2, v12, v10

    .line 60
    .line 61
    if-gez v2, :cond_2

    .line 62
    .line 63
    move-wide v12, v10

    .line 64
    :cond_2
    long-to-double v12, v12

    .line 65
    div-double/2addr v12, v0

    .line 66
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object v2, v3

    .line 72
    :goto_2
    if-eqz p6, :cond_5

    .line 73
    .line 74
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Number;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    cmp-long v4, v12, v10

    .line 79
    .line 80
    if-lez v4, :cond_4

    .line 81
    .line 82
    move-object/from16 v4, p6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v4, v3

    .line 86
    :goto_3
    if-eqz v4, :cond_5

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    long-to-double v3, v3

    .line 93
    div-double/2addr v3, v0

    .line 94
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    :cond_5
    move-object v11, v3

    .line 99
    new-instance v4, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 100
    .line 101
    const v28, 0x107e00

    .line 102
    .line 103
    .line 104
    const/16 v29, 0x0

    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v25, 0x0

    .line 117
    .line 118
    move-object/from16 v7, p0

    .line 119
    .line 120
    move-object/from16 v13, p2

    .line 121
    .line 122
    move-object/from16 v12, p7

    .line 123
    .line 124
    move-object/from16 v21, p8

    .line 125
    .line 126
    move-object/from16 v22, p9

    .line 127
    .line 128
    move-object/from16 v23, p10

    .line 129
    .line 130
    move-object/from16 v20, p11

    .line 131
    .line 132
    move-object/from16 v24, p12

    .line 133
    .line 134
    move-object/from16 v26, p13

    .line 135
    .line 136
    move-object/from16 v27, p14

    .line 137
    .line 138
    move-object v10, v2

    .line 139
    invoke-direct/range {v4 .. v29}, Lcom/eddyizm/tempus/homemusic/PlayEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILdefpackage/xj0;)V

    .line 140
    .line 141
    .line 142
    return-object v4
.end method

.method public static synthetic c(Ldefpackage/ih3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)Lcom/eddyizm/tempus/homemusic/PlayEvent;
    .locals 16

    .line 1
    and-int/lit8 v0, p7, 0x40

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v8, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v8, p6

    .line 9
    .line 10
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    move-object/from16 v3, p3

    .line 27
    .line 28
    move-wide/from16 v4, p4

    .line 29
    .line 30
    invoke-static/range {v1 .. v15}, Ldefpackage/ih3;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

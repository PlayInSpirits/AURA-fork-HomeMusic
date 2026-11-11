.class public final Ltu4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:D

.field public final b:D


# direct methods
.method public constructor <init>(DD)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Ltu4;->a:D

    .line 10
    .line 11
    iput-wide p3, p0, Ltu4;->b:D

    .line 12
    .line 13
    return-void
.end method

.method public static a(DD)Ltu4;
    .locals 16

    .line 1
    new-instance v6, Ltu4;

    .line 2
    .line 3
    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    .line 4
    .line 5
    move-wide/from16 v0, p0

    .line 6
    .line 7
    move-wide/from16 v2, p2

    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lol1;->a(DDD)Lol1;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    move-wide v8, v4

    .line 14
    iget-wide v0, v7, Lol1;->b:D

    .line 15
    .line 16
    sub-double v0, v0, p2

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    move-wide v12, v0

    .line 25
    move-wide v14, v10

    .line 26
    :goto_0
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 27
    .line 28
    cmpg-double v0, v14, v0

    .line 29
    .line 30
    if-gez v0, :cond_3

    .line 31
    .line 32
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->round(D)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iget-wide v2, v7, Lol1;->b:D

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v0, v0, v2

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    move-wide/from16 v0, p0

    .line 47
    .line 48
    move-wide/from16 v2, p2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-double v4, v8, v14

    .line 52
    .line 53
    move-wide/from16 v0, p0

    .line 54
    .line 55
    move-wide/from16 v2, p2

    .line 56
    .line 57
    invoke-static/range {v0 .. v5}, Lol1;->a(DDD)Lol1;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-wide v0, v4, Lol1;->b:D

    .line 62
    .line 63
    sub-double v0, v0, p2

    .line 64
    .line 65
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    cmpg-double v2, v0, v12

    .line 70
    .line 71
    if-gez v2, :cond_1

    .line 72
    .line 73
    move-wide v12, v0

    .line 74
    move-object v7, v4

    .line 75
    :cond_1
    sub-double v4, v8, v14

    .line 76
    .line 77
    move-wide/from16 v0, p0

    .line 78
    .line 79
    move-wide/from16 v2, p2

    .line 80
    .line 81
    invoke-static/range {v0 .. v5}, Lol1;->a(DDD)Lol1;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget-wide v0, v4, Lol1;->b:D

    .line 86
    .line 87
    sub-double/2addr v0, v2

    .line 88
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    cmpg-double v5, v0, v12

    .line 93
    .line 94
    if-gez v5, :cond_2

    .line 95
    .line 96
    move-wide v12, v0

    .line 97
    move-object v7, v4

    .line 98
    :cond_2
    add-double/2addr v14, v10

    .line 99
    goto :goto_0

    .line 100
    :cond_3
    move-wide/from16 v2, p2

    .line 101
    .line 102
    move-wide/from16 v0, p0

    .line 103
    .line 104
    :goto_1
    invoke-direct {v6, v0, v1, v2, v3}, Ltu4;-><init>(DD)V

    .line 105
    .line 106
    .line 107
    return-object v6
.end method

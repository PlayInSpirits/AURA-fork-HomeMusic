.class public abstract Ldefpackage/jz4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/ca1;

.field public static final b:[Ljava/lang/String;

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[I

.field public static final h:[I

.field public static final i:[Ljava/lang/StackTraceElement;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ca1;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ca1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/jz4;->a:Ldefpackage/ca1;

    .line 9
    .line 10
    const-string v0, "audio/mpeg-L2"

    .line 11
    .line 12
    const-string v1, "audio/mpeg"

    .line 13
    .line 14
    const-string v2, "audio/mpeg-L1"

    .line 15
    .line 16
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Ldefpackage/jz4;->b:[Ljava/lang/String;

    .line 21
    .line 22
    const v0, 0xbb80

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7d00

    .line 26
    .line 27
    const v2, 0xac44

    .line 28
    .line 29
    .line 30
    filled-new-array {v2, v0, v1}, [I

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Ldefpackage/jz4;->c:[I

    .line 35
    .line 36
    const/16 v0, 0xe

    .line 37
    .line 38
    new-array v1, v0, [I

    .line 39
    .line 40
    fill-array-data v1, :array_0

    .line 41
    .line 42
    .line 43
    sput-object v1, Ldefpackage/jz4;->d:[I

    .line 44
    .line 45
    new-array v1, v0, [I

    .line 46
    .line 47
    fill-array-data v1, :array_1

    .line 48
    .line 49
    .line 50
    sput-object v1, Ldefpackage/jz4;->e:[I

    .line 51
    .line 52
    new-array v1, v0, [I

    .line 53
    .line 54
    fill-array-data v1, :array_2

    .line 55
    .line 56
    .line 57
    sput-object v1, Ldefpackage/jz4;->f:[I

    .line 58
    .line 59
    new-array v1, v0, [I

    .line 60
    .line 61
    fill-array-data v1, :array_3

    .line 62
    .line 63
    .line 64
    sput-object v1, Ldefpackage/jz4;->g:[I

    .line 65
    .line 66
    new-array v0, v0, [I

    .line 67
    .line 68
    fill-array-data v0, :array_4

    .line 69
    .line 70
    .line 71
    sput-object v0, Ldefpackage/jz4;->h:[I

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 75
    .line 76
    sput-object v0, Ldefpackage/jz4;->i:[Ljava/lang/StackTraceElement;

    .line 77
    .line 78
    return-void

    .line 79
    :array_0
    .array-data 4
        0x7d00
        0xfa00
        0x17700
        0x1f400
        0x27100
        0x2ee00
        0x36b00
        0x3e800
        0x46500
        0x4e200
        0x55f00
        0x5dc00
        0x65900
        0x6d600
    .end array-data

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :array_1
    .array-data 4
        0x7d00
        0xbb80
        0xdac0
        0xfa00
        0x13880
        0x17700
        0x1b580
        0x1f400
        0x23280
        0x27100
        0x2af80
        0x2ee00
        0x36b00
        0x3e800
    .end array-data

    :array_2
    .array-data 4
        0x7d00
        0xbb80
        0xdac0
        0xfa00
        0x13880
        0x17700
        0x1b580
        0x1f400
        0x27100
        0x2ee00
        0x36b00
        0x3e800
        0x4e200
        0x5dc00
    .end array-data

    :array_3
    .array-data 4
        0x7d00
        0x9c40
        0xbb80
        0xdac0
        0xfa00
        0x13880
        0x17700
        0x1b580
        0x1f400
        0x27100
        0x2ee00
        0x36b00
        0x3e800
        0x4e200
    .end array-data

    :array_4
    .array-data 4
        0x1f40
        0x3e80
        0x5dc0
        0x7d00
        0x9c40
        0xbb80
        0xdac0
        0xfa00
        0x13880
        0x17700
        0x1b580
        0x1f400
        0x23280
        0x27100
    .end array-data
.end method

.method public static A(ILjava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ldefpackage/sf1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_16

    .line 5
    .line 6
    instance-of v0, p1, Ldefpackage/gg1;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ldefpackage/gg1;

    .line 12
    .line 13
    invoke-interface {p1}, Ldefpackage/gg1;->getArity()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, Ldefpackage/gf1;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move p1, v1

    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_1
    instance-of v0, p1, Ldefpackage/if1;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    move p1, v2

    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_2
    instance-of v0, p1, Ldefpackage/wf1;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_3
    instance-of v0, p1, Ldefpackage/xf1;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    const/4 p1, 0x3

    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_4
    instance-of v0, p1, Ldefpackage/yf1;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    const/4 p1, 0x4

    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_5
    instance-of v0, p1, Ldefpackage/zf1;

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    const/4 p1, 0x5

    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_6
    instance-of v0, p1, Ldefpackage/ag1;

    .line 62
    .line 63
    if-eqz v0, :cond_7

    .line 64
    .line 65
    const/4 p1, 0x6

    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_7
    instance-of v0, p1, Ldefpackage/bg1;

    .line 69
    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    const/4 p1, 0x7

    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_8
    instance-of v0, p1, Ldefpackage/cg1;

    .line 76
    .line 77
    if-eqz v0, :cond_9

    .line 78
    .line 79
    const/16 p1, 0x8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_9
    instance-of v0, p1, Ldefpackage/dg1;

    .line 83
    .line 84
    if-eqz v0, :cond_a

    .line 85
    .line 86
    const/16 p1, 0x9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_a
    instance-of v0, p1, Ldefpackage/hf1;

    .line 90
    .line 91
    if-eqz v0, :cond_b

    .line 92
    .line 93
    const/16 p1, 0xa

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_b
    instance-of v0, p1, Ldefpackage/jf1;

    .line 97
    .line 98
    if-eqz v0, :cond_c

    .line 99
    .line 100
    const/16 p1, 0xb

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_c
    instance-of v0, p1, Ldefpackage/lf1;

    .line 104
    .line 105
    if-eqz v0, :cond_d

    .line 106
    .line 107
    const/16 p1, 0xd

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_d
    instance-of v0, p1, Ldefpackage/mf1;

    .line 111
    .line 112
    if-eqz v0, :cond_e

    .line 113
    .line 114
    const/16 p1, 0xe

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_e
    instance-of v0, p1, Ldefpackage/nf1;

    .line 118
    .line 119
    if-eqz v0, :cond_f

    .line 120
    .line 121
    const/16 p1, 0xf

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_f
    instance-of v0, p1, Ldefpackage/of1;

    .line 125
    .line 126
    if-eqz v0, :cond_10

    .line 127
    .line 128
    const/16 p1, 0x10

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_10
    instance-of v0, p1, Ldefpackage/pf1;

    .line 132
    .line 133
    if-eqz v0, :cond_11

    .line 134
    .line 135
    const/16 p1, 0x11

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_11
    instance-of v0, p1, Ldefpackage/qf1;

    .line 139
    .line 140
    if-eqz v0, :cond_12

    .line 141
    .line 142
    const/16 p1, 0x12

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_12
    instance-of v0, p1, Ldefpackage/rf1;

    .line 146
    .line 147
    if-eqz v0, :cond_13

    .line 148
    .line 149
    const/16 p1, 0x13

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_13
    instance-of v0, p1, Ldefpackage/tf1;

    .line 153
    .line 154
    if-eqz v0, :cond_14

    .line 155
    .line 156
    const/16 p1, 0x14

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_14
    instance-of p1, p1, Ldefpackage/uf1;

    .line 160
    .line 161
    if-eqz p1, :cond_15

    .line 162
    .line 163
    const/16 p1, 0x15

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_15
    const/4 p1, -0x1

    .line 167
    :goto_0
    if-ne p1, p0, :cond_16

    .line 168
    .line 169
    return v2

    .line 170
    :cond_16
    return v1
.end method

.method public static final B([F)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    aget v0, p0, v2

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    cmpg-float v0, v0, v1

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    aget v3, p0, v0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    cmpg-float v3, v3, v4

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    aget v3, p0, v3

    .line 26
    .line 27
    cmpg-float v3, v3, v4

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    aget v3, p0, v3

    .line 33
    .line 34
    cmpg-float v3, v3, v4

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    aget v3, p0, v3

    .line 40
    .line 41
    cmpg-float v3, v3, v4

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x5

    .line 46
    aget v3, p0, v3

    .line 47
    .line 48
    cmpg-float v3, v3, v1

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x6

    .line 53
    aget v3, p0, v3

    .line 54
    .line 55
    cmpg-float v3, v3, v4

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    const/4 v3, 0x7

    .line 60
    aget v3, p0, v3

    .line 61
    .line 62
    cmpg-float v3, v3, v4

    .line 63
    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    const/16 v3, 0x8

    .line 67
    .line 68
    aget v3, p0, v3

    .line 69
    .line 70
    cmpg-float v3, v3, v4

    .line 71
    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    const/16 v3, 0x9

    .line 75
    .line 76
    aget v3, p0, v3

    .line 77
    .line 78
    cmpg-float v3, v3, v4

    .line 79
    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    const/16 v3, 0xa

    .line 83
    .line 84
    aget v3, p0, v3

    .line 85
    .line 86
    cmpg-float v3, v3, v1

    .line 87
    .line 88
    if-nez v3, :cond_1

    .line 89
    .line 90
    const/16 v3, 0xb

    .line 91
    .line 92
    aget v3, p0, v3

    .line 93
    .line 94
    cmpg-float v3, v3, v4

    .line 95
    .line 96
    if-nez v3, :cond_1

    .line 97
    .line 98
    const/16 v3, 0xc

    .line 99
    .line 100
    aget v3, p0, v3

    .line 101
    .line 102
    cmpg-float v3, v3, v4

    .line 103
    .line 104
    if-nez v3, :cond_1

    .line 105
    .line 106
    const/16 v3, 0xd

    .line 107
    .line 108
    aget v3, p0, v3

    .line 109
    .line 110
    cmpg-float v3, v3, v4

    .line 111
    .line 112
    if-nez v3, :cond_1

    .line 113
    .line 114
    const/16 v3, 0xe

    .line 115
    .line 116
    aget v3, p0, v3

    .line 117
    .line 118
    cmpg-float v3, v3, v4

    .line 119
    .line 120
    if-nez v3, :cond_1

    .line 121
    .line 122
    const/16 v3, 0xf

    .line 123
    .line 124
    aget p0, p0, v3

    .line 125
    .line 126
    cmpg-float p0, p0, v1

    .line 127
    .line 128
    if-nez p0, :cond_1

    .line 129
    .line 130
    return v0

    .line 131
    :cond_1
    return v2
.end method

.method public static C(Lcom/eddyizm/tempus/subsonic/models/Child;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    move p0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    invoke-static {v1, v0, p0}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-static {p1}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static final E(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.work.workdb"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Ldefpackage/nc5;->a:Ljava/lang/String;

    .line 24
    .line 25
    const-string v3, "Migrating WorkDatabase to the no-backup directory"

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v2, Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Ldefpackage/nc5;->b:[Ljava/lang/String;

    .line 50
    .line 51
    array-length v0, p0

    .line 52
    invoke-static {v0}, Ldefpackage/lg2;->W(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/16 v3, 0x10

    .line 57
    .line 58
    if-ge v0, v3, :cond_0

    .line 59
    .line 60
    move v0, v3

    .line 61
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 64
    .line 65
    .line 66
    array-length v0, p0

    .line 67
    const/4 v4, 0x0

    .line 68
    :goto_0
    if-ge v4, v0, :cond_1

    .line 69
    .line 70
    aget-object v5, p0, v4

    .line 71
    .line 72
    new-instance v6, Ljava/io/File;

    .line 73
    .line 74
    new-instance v7, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v7, Ljava/io/File;

    .line 97
    .line 98
    new-instance v8, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_2

    .line 131
    .line 132
    invoke-static {v1, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-direct {p0, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :goto_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/util/Map$Entry;

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/io/File;

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Ljava/io/File;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_3

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_4

    .line 191
    .line 192
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    sget-object v3, Ldefpackage/nc5;->a:Ljava/lang/String;

    .line 197
    .line 198
    new-instance v4, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    const-string v5, "Over-writing contents of "

    .line 201
    .line 202
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v2, v3, v4}, Ldefpackage/cx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_4
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_5

    .line 220
    .line 221
    new-instance v2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v3, "Migrated "

    .line 224
    .line 225
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v1, "to "

    .line 232
    .line 233
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    goto :goto_3

    .line 244
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v3, "Renaming "

    .line 247
    .line 248
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, " to "

    .line 255
    .line 256
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v0, " failed"

    .line 263
    .line 264
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :goto_3
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    sget-object v2, Ldefpackage/nc5;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v1, v2, v0}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_6
    return-void
.end method

.method public static F(Ljava/lang/StringBuilder;II)Ljava/lang/String;
    .locals 7

    .line 1
    if-lt p1, p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x2f

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    :cond_1
    move v0, p1

    .line 19
    move v2, v0

    .line 20
    :goto_0
    if-gt v0, p2, :cond_7

    .line 21
    .line 22
    if-ne v0, p2, :cond_2

    .line 23
    .line 24
    move v3, v0

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ne v3, v1, :cond_6

    .line 31
    .line 32
    add-int/lit8 v3, v0, 0x1

    .line 33
    .line 34
    :goto_1
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    const/16 v5, 0x2e

    .line 37
    .line 38
    if-ne v0, v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-ne v6, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sub-int/2addr v3, v2

    .line 50
    sub-int/2addr p2, v3

    .line 51
    goto :goto_4

    .line 52
    :cond_3
    add-int/lit8 v6, v2, 0x2

    .line 53
    .line 54
    if-ne v0, v6, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-ne v6, v5, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ne v4, v5, :cond_5

    .line 67
    .line 68
    const-string v0, "/"

    .line 69
    .line 70
    add-int/lit8 v2, v2, -0x2

    .line 71
    .line 72
    invoke-virtual {p0, v0, v2}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    if-le v0, p1, :cond_4

    .line 79
    .line 80
    move v2, v0

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move v2, p1

    .line 83
    :goto_2
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    sub-int/2addr v3, v2

    .line 87
    sub-int/2addr p2, v3

    .line 88
    :goto_3
    move v2, v0

    .line 89
    goto :goto_4

    .line 90
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :goto_4
    move v0, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_7
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public static G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    move-object p0, v1

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move-object p1, v1

    .line 14
    :cond_1
    invoke-static {p1}, Ldefpackage/jz4;->x(Ljava/lang/String;)[I

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    aget v3, v1, v2

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x1

    .line 24
    if-eq v3, v4, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    aget p0, v1, v6

    .line 30
    .line 31
    aget p1, v1, v5

    .line 32
    .line 33
    invoke-static {v0, p0, p1}, Ldefpackage/jz4;->F(Ljava/lang/StringBuilder;II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {p0}, Ldefpackage/jz4;->x(Ljava/lang/String;)[I

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v7, 0x3

    .line 46
    aget v8, v1, v7

    .line 47
    .line 48
    if-nez v8, :cond_3

    .line 49
    .line 50
    aget v1, v3, v7

    .line 51
    .line 52
    invoke-virtual {v0, p0, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_3
    aget v7, v1, v5

    .line 64
    .line 65
    if-nez v7, :cond_4

    .line 66
    .line 67
    aget v1, v3, v5

    .line 68
    .line 69
    invoke-virtual {v0, p0, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_4
    aget v7, v1, v6

    .line 81
    .line 82
    if-eqz v7, :cond_5

    .line 83
    .line 84
    aget v3, v3, v2

    .line 85
    .line 86
    add-int/2addr v3, v6

    .line 87
    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    aget p0, v1, v6

    .line 94
    .line 95
    add-int/2addr p0, v3

    .line 96
    aget p1, v1, v5

    .line 97
    .line 98
    add-int/2addr v3, p1

    .line 99
    invoke-static {v0, p0, v3}, Ldefpackage/jz4;->F(Ljava/lang/StringBuilder;II)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_5
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    const/16 v8, 0x2f

    .line 109
    .line 110
    if-ne v7, v8, :cond_6

    .line 111
    .line 112
    aget v4, v3, v6

    .line 113
    .line 114
    invoke-virtual {v0, p0, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    aget p0, v3, v6

    .line 121
    .line 122
    aget p1, v1, v5

    .line 123
    .line 124
    add-int/2addr p1, p0

    .line 125
    invoke-static {v0, p0, p1}, Ldefpackage/jz4;->F(Ljava/lang/StringBuilder;II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :cond_6
    aget v7, v3, v2

    .line 131
    .line 132
    add-int/2addr v7, v5

    .line 133
    aget v9, v3, v6

    .line 134
    .line 135
    if-ge v7, v9, :cond_7

    .line 136
    .line 137
    aget v7, v3, v5

    .line 138
    .line 139
    if-ne v9, v7, :cond_7

    .line 140
    .line 141
    invoke-virtual {v0, p0, v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    aget p0, v3, v6

    .line 151
    .line 152
    aget p1, v1, v5

    .line 153
    .line 154
    add-int/2addr p1, p0

    .line 155
    add-int/2addr p1, v6

    .line 156
    invoke-static {v0, p0, p1}, Ldefpackage/jz4;->F(Ljava/lang/StringBuilder;II)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_7
    aget v7, v3, v5

    .line 162
    .line 163
    sub-int/2addr v7, v6

    .line 164
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->lastIndexOf(II)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-ne v7, v4, :cond_8

    .line 169
    .line 170
    aget v4, v3, v6

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_8
    add-int/lit8 v4, v7, 0x1

    .line 174
    .line 175
    :goto_0
    invoke-virtual {v0, p0, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    aget p0, v3, v6

    .line 182
    .line 183
    aget p1, v1, v5

    .line 184
    .line 185
    add-int/2addr v4, p1

    .line 186
    invoke-static {v0, p0, v4}, Ldefpackage/jz4;->F(Ljava/lang/StringBuilder;II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0
.end method

.method public static H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldefpackage/jz4;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static I(J)I
    .locals 2

    .line 1
    const-wide/32 v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const p0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-wide/32 v0, -0x80000000

    .line 13
    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const/high16 p0, -0x80000000

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    long-to-int p0, p0

    .line 23
    return p0
.end method

.method public static J(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/d34;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/d34;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    sget-object v3, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-static {p0, v2, p2}, Ldefpackage/ot1;->g(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {}, Ldefpackage/hw;->t()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v3, v4, p2, v4}, Ldefpackage/d34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v3, Ldefpackage/mf4;

    .line 56
    .line 57
    invoke-direct {v3, v0, v2, p2}, Ldefpackage/mf4;-><init>(Ldefpackage/d34;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-static {v5, v4, v4, v3}, Ldefpackage/d34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {v5, v4, v4, v3}, Ldefpackage/d34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    if-eqz p2, :cond_3

    .line 74
    .line 75
    new-instance v4, Ljava/util/Date;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {v2, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    if-eqz p2, :cond_8

    .line 85
    .line 86
    invoke-static {}, Ldefpackage/hw;->t()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_8

    .line 91
    .line 92
    invoke-static {}, Ldefpackage/ud3;->X()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_8

    .line 97
    .line 98
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    if-nez p2, :cond_8

    .line 103
    .line 104
    new-instance p2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move-object v1, v0

    .line 124
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v2}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_5

    .line 135
    .line 136
    invoke-static {p0, v1}, Ldefpackage/jz4;->D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_6
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    invoke-static {p0, p2}, Ldefpackage/jz4;->p(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    return-void
.end method

.method public static K(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_1

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_2

    .line 15
    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    const-string p0, "Function9"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-string p0, "Function8"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_2

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_2
    const-string p0, "Function7"

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const-string p0, "Function6"

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_4

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_4
    const-string p0, "Function5"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_5
    const-string p0, "Function4"

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_6

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_6
    const-string p0, "Function3"

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_7

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_7
    const-string p0, "Function2"

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_8

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_8
    const-string p0, "Function1"

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-nez p0, :cond_9

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_9
    const-string p0, "Function0"

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-nez p0, :cond_a

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_a
    const-string p0, "Function22"

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_b

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_b
    const-string p0, "Function21"

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_c

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_c
    const-string p0, "Function20"

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-nez p0, :cond_d

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_d
    const-string p0, "Function19"

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_e

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_e
    const-string p0, "Function18"

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-nez p0, :cond_f

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_f
    const-string p0, "Function17"

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    .line 228
    .line 229
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-nez p0, :cond_10

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_10
    const-string p0, "Function16"

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    .line 241
    .line 242
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_11

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_11
    const-string p0, "Function15"

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    .line 254
    .line 255
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-nez p0, :cond_12

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_12
    const-string p0, "Function14"

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    .line 267
    .line 268
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    if-nez p0, :cond_13

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_13
    const-string p0, "Function13"

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    if-nez p0, :cond_14

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_14
    const-string p0, "Function12"

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    .line 293
    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-nez p0, :cond_15

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_15
    const-string p0, "Function11"

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    .line 306
    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-nez p0, :cond_16

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :cond_16
    const-string p0, "Function10"

    .line 316
    .line 317
    return-object p0

    .line 318
    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    .line 319
    .line 320
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-nez p0, :cond_30

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :sswitch_1
    const-string v0, "java.lang.Throwable"

    .line 329
    .line 330
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    if-nez p0, :cond_17

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :cond_17
    const-string p0, "Throwable"

    .line 339
    .line 340
    return-object p0

    .line 341
    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    .line 342
    .line 343
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result p0

    .line 347
    if-nez p0, :cond_30

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :sswitch_3
    const-string v0, "java.lang.Iterable"

    .line 352
    .line 353
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    if-nez p0, :cond_18

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_18
    const-string p0, "Iterable"

    .line 362
    .line 363
    return-object p0

    .line 364
    :sswitch_4
    const-string v0, "java.lang.String"

    .line 365
    .line 366
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    if-nez p0, :cond_19

    .line 371
    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    :cond_19
    const-string p0, "String"

    .line 375
    .line 376
    return-object p0

    .line 377
    :sswitch_5
    const-string v0, "java.lang.Object"

    .line 378
    .line 379
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    if-nez p0, :cond_1a

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_1a
    const-string p0, "Any"

    .line 388
    .line 389
    return-object p0

    .line 390
    :sswitch_6
    const-string v0, "java.lang.Number"

    .line 391
    .line 392
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result p0

    .line 396
    if-nez p0, :cond_1b

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_1b
    const-string p0, "Number"

    .line 401
    .line 402
    return-object p0

    .line 403
    :sswitch_7
    const-string v0, "java.lang.Double"

    .line 404
    .line 405
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result p0

    .line 409
    if-nez p0, :cond_29

    .line 410
    .line 411
    goto/16 :goto_0

    .line 412
    .line 413
    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    .line 414
    .line 415
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-nez p0, :cond_30

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :sswitch_9
    const-string v0, "java.util.ListIterator"

    .line 424
    .line 425
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    if-nez p0, :cond_1c

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_1c
    const-string p0, "ListIterator"

    .line 434
    .line 435
    return-object p0

    .line 436
    :sswitch_a
    const-string v0, "java.util.Iterator"

    .line 437
    .line 438
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    if-nez p0, :cond_1d

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_1d
    const-string p0, "Iterator"

    .line 447
    .line 448
    return-object p0

    .line 449
    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    .line 450
    .line 451
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    if-nez p0, :cond_30

    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :sswitch_c
    const-string v0, "java.lang.Long"

    .line 460
    .line 461
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result p0

    .line 465
    if-nez p0, :cond_21

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :sswitch_d
    const-string v0, "java.lang.Enum"

    .line 470
    .line 471
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result p0

    .line 475
    if-nez p0, :cond_1e

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_1e
    const-string p0, "Enum"

    .line 480
    .line 481
    return-object p0

    .line 482
    :sswitch_e
    const-string v0, "java.lang.Byte"

    .line 483
    .line 484
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result p0

    .line 488
    if-nez p0, :cond_23

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :sswitch_f
    const-string v0, "java.lang.Boolean"

    .line 493
    .line 494
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result p0

    .line 498
    if-nez p0, :cond_20

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    .line 503
    .line 504
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    if-nez p0, :cond_30

    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :sswitch_11
    const-string v0, "java.lang.Character"

    .line 513
    .line 514
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result p0

    .line 518
    if-nez p0, :cond_22

    .line 519
    .line 520
    goto/16 :goto_0

    .line 521
    .line 522
    :sswitch_12
    const-string v0, "short"

    .line 523
    .line 524
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result p0

    .line 528
    if-nez p0, :cond_25

    .line 529
    .line 530
    goto/16 :goto_0

    .line 531
    .line 532
    :sswitch_13
    const-string v0, "float"

    .line 533
    .line 534
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result p0

    .line 538
    if-nez p0, :cond_26

    .line 539
    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    .line 543
    .line 544
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    if-nez p0, :cond_30

    .line 549
    .line 550
    goto/16 :goto_0

    .line 551
    .line 552
    :sswitch_15
    const-string v0, "java.util.List"

    .line 553
    .line 554
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result p0

    .line 558
    if-nez p0, :cond_1f

    .line 559
    .line 560
    goto/16 :goto_0

    .line 561
    .line 562
    :cond_1f
    const-string p0, "List"

    .line 563
    .line 564
    return-object p0

    .line 565
    :sswitch_16
    const-string v0, "boolean"

    .line 566
    .line 567
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result p0

    .line 571
    if-nez p0, :cond_20

    .line 572
    .line 573
    goto/16 :goto_0

    .line 574
    .line 575
    :cond_20
    const-string p0, "Boolean"

    .line 576
    .line 577
    return-object p0

    .line 578
    :sswitch_17
    const-string v0, "long"

    .line 579
    .line 580
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result p0

    .line 584
    if-nez p0, :cond_21

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :cond_21
    const-string p0, "Long"

    .line 589
    .line 590
    return-object p0

    .line 591
    :sswitch_18
    const-string v0, "char"

    .line 592
    .line 593
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result p0

    .line 597
    if-nez p0, :cond_22

    .line 598
    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :cond_22
    const-string p0, "Char"

    .line 602
    .line 603
    return-object p0

    .line 604
    :sswitch_19
    const-string v0, "byte"

    .line 605
    .line 606
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result p0

    .line 610
    if-nez p0, :cond_23

    .line 611
    .line 612
    goto/16 :goto_0

    .line 613
    .line 614
    :cond_23
    const-string p0, "Byte"

    .line 615
    .line 616
    return-object p0

    .line 617
    :sswitch_1a
    const-string v0, "int"

    .line 618
    .line 619
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-nez p0, :cond_2f

    .line 624
    .line 625
    goto/16 :goto_0

    .line 626
    .line 627
    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    .line 628
    .line 629
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result p0

    .line 633
    if-nez p0, :cond_24

    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :cond_24
    const-string p0, "Entry"

    .line 638
    .line 639
    return-object p0

    .line 640
    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    .line 641
    .line 642
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result p0

    .line 646
    if-nez p0, :cond_30

    .line 647
    .line 648
    goto/16 :goto_0

    .line 649
    .line 650
    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    .line 651
    .line 652
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result p0

    .line 656
    if-nez p0, :cond_30

    .line 657
    .line 658
    goto/16 :goto_0

    .line 659
    .line 660
    :sswitch_1e
    const-string v0, "java.lang.Short"

    .line 661
    .line 662
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result p0

    .line 666
    if-nez p0, :cond_25

    .line 667
    .line 668
    goto/16 :goto_0

    .line 669
    .line 670
    :cond_25
    const-string p0, "Short"

    .line 671
    .line 672
    return-object p0

    .line 673
    :sswitch_1f
    const-string v0, "java.lang.Float"

    .line 674
    .line 675
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result p0

    .line 679
    if-nez p0, :cond_26

    .line 680
    .line 681
    goto/16 :goto_0

    .line 682
    .line 683
    :cond_26
    const-string p0, "Float"

    .line 684
    .line 685
    return-object p0

    .line 686
    :sswitch_20
    const-string v0, "java.util.Collection"

    .line 687
    .line 688
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result p0

    .line 692
    if-nez p0, :cond_27

    .line 693
    .line 694
    goto/16 :goto_0

    .line 695
    .line 696
    :cond_27
    const-string p0, "Collection"

    .line 697
    .line 698
    return-object p0

    .line 699
    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    .line 700
    .line 701
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result p0

    .line 705
    if-nez p0, :cond_28

    .line 706
    .line 707
    goto/16 :goto_0

    .line 708
    .line 709
    :cond_28
    const-string p0, "CharSequence"

    .line 710
    .line 711
    return-object p0

    .line 712
    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    .line 713
    .line 714
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result p0

    .line 718
    if-nez p0, :cond_30

    .line 719
    .line 720
    goto :goto_0

    .line 721
    :sswitch_23
    const-string v0, "double"

    .line 722
    .line 723
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result p0

    .line 727
    if-nez p0, :cond_29

    .line 728
    .line 729
    goto :goto_0

    .line 730
    :cond_29
    const-string p0, "Double"

    .line 731
    .line 732
    return-object p0

    .line 733
    :sswitch_24
    const-string v0, "java.util.Set"

    .line 734
    .line 735
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result p0

    .line 739
    if-nez p0, :cond_2a

    .line 740
    .line 741
    goto :goto_0

    .line 742
    :cond_2a
    const-string p0, "Set"

    .line 743
    .line 744
    return-object p0

    .line 745
    :sswitch_25
    const-string v0, "java.util.Map"

    .line 746
    .line 747
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result p0

    .line 751
    if-nez p0, :cond_2b

    .line 752
    .line 753
    goto :goto_0

    .line 754
    :cond_2b
    const-string p0, "Map"

    .line 755
    .line 756
    return-object p0

    .line 757
    :sswitch_26
    const-string v0, "java.lang.Comparable"

    .line 758
    .line 759
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result p0

    .line 763
    if-nez p0, :cond_2c

    .line 764
    .line 765
    goto :goto_0

    .line 766
    :cond_2c
    const-string p0, "Comparable"

    .line 767
    .line 768
    return-object p0

    .line 769
    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    .line 770
    .line 771
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result p0

    .line 775
    if-nez p0, :cond_2d

    .line 776
    .line 777
    goto :goto_0

    .line 778
    :cond_2d
    const-string p0, "Annotation"

    .line 779
    .line 780
    return-object p0

    .line 781
    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    .line 782
    .line 783
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result p0

    .line 787
    if-nez p0, :cond_2e

    .line 788
    .line 789
    goto :goto_0

    .line 790
    :cond_2e
    const-string p0, "Cloneable"

    .line 791
    .line 792
    return-object p0

    .line 793
    :sswitch_29
    const-string v0, "java.lang.Integer"

    .line 794
    .line 795
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result p0

    .line 799
    if-nez p0, :cond_2f

    .line 800
    .line 801
    goto :goto_0

    .line 802
    :cond_2f
    const-string p0, "Int"

    .line 803
    .line 804
    return-object p0

    .line 805
    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    .line 806
    .line 807
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result p0

    .line 811
    if-nez p0, :cond_30

    .line 812
    .line 813
    :goto_0
    const/4 p0, 0x0

    .line 814
    return-object p0

    .line 815
    :cond_30
    const-string p0, "Companion"

    .line 816
    .line 817
    return-object p0

    .line 818
    nop

    .line 819
    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    :pswitch_data_0
    .packed-switch -0x6bf3d83c
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    :pswitch_data_2
    .packed-switch 0x4c695eb
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final L(Ldefpackage/wv3;)J
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/wv3;->c:F

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/wv3;->a:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, Ldefpackage/wv3;->d:F

    .line 7
    .line 8
    iget p0, p0, Ldefpackage/wv3;->b:F

    .line 9
    .line 10
    sub-float/2addr v1, p0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-long v2, p0

    .line 16
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long v0, p0

    .line 21
    const/16 p0, 0x20

    .line 22
    .line 23
    shl-long/2addr v2, p0

    .line 24
    const-wide v4, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v4

    .line 30
    or-long/2addr v0, v2

    .line 31
    return-wide v0
.end method

.method public static M(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    const-string v0, " cannot be cast to "

    .line 15
    .line 16
    invoke-static {p0, v0, p1}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/lang/ClassCastException;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-class p0, Ldefpackage/jz4;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, p0}, Ldefpackage/h12;->M(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public static N(Ljava/util/Collection;)[I
    .locals 4

    .line 1
    instance-of v0, p0, Ldefpackage/m12;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldefpackage/m12;

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/m12;->n:[I

    .line 8
    .line 9
    iget v1, p0, Ldefpackage/m12;->o:I

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/m12;->p:I

    .line 12
    .line 13
    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    array-length v0, p0

    .line 23
    new-array v1, v0, [I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, p0, v2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v3, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    aput v3, v1, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public static O(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    :goto_0
    move-object p0, v1

    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x2d

    .line 20
    .line 21
    if-ne v2, v3, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ne v0, v2, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    add-int/lit8 v2, v0, 0x1

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, -0x1

    .line 38
    const/16 v5, 0x80

    .line 39
    .line 40
    if-ge v3, v5, :cond_4

    .line 41
    .line 42
    sget-object v6, Ldefpackage/ye2;->a:[B

    .line 43
    .line 44
    aget-byte v3, v6, v3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    sget-object v3, Ldefpackage/ye2;->a:[B

    .line 48
    .line 49
    move v3, v4

    .line 50
    :goto_1
    if-ltz v3, :cond_0

    .line 51
    .line 52
    const/16 v6, 0xa

    .line 53
    .line 54
    if-lt v3, v6, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    neg-int v3, v3

    .line 58
    int-to-long v7, v3

    .line 59
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const-wide/high16 v9, -0x8000000000000000L

    .line 64
    .line 65
    if-ge v2, v3, :cond_9

    .line 66
    .line 67
    add-int/lit8 v3, v2, 0x1

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-ge v2, v5, :cond_6

    .line 74
    .line 75
    sget-object v11, Ldefpackage/ye2;->a:[B

    .line 76
    .line 77
    aget-byte v2, v11, v2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    sget-object v2, Ldefpackage/ye2;->a:[B

    .line 81
    .line 82
    move v2, v4

    .line 83
    :goto_3
    if-ltz v2, :cond_0

    .line 84
    .line 85
    if-ge v2, v6, :cond_0

    .line 86
    .line 87
    const-wide v11, -0xcccccccccccccccL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long v11, v7, v11

    .line 93
    .line 94
    if-gez v11, :cond_7

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_7
    const-wide/16 v11, 0xa

    .line 98
    .line 99
    mul-long/2addr v7, v11

    .line 100
    int-to-long v11, v2

    .line 101
    add-long/2addr v9, v11

    .line 102
    cmp-long v2, v7, v9

    .line 103
    .line 104
    if-gez v2, :cond_8

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_8
    sub-long/2addr v7, v11

    .line 108
    move v2, v3

    .line 109
    goto :goto_2

    .line 110
    :cond_9
    if-eqz v0, :cond_a

    .line 111
    .line 112
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    cmp-long p0, v7, v9

    .line 118
    .line 119
    if-nez p0, :cond_b

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_b
    neg-long v2, v7

    .line 123
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_4
    if-eqz p0, :cond_d

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    invoke-virtual {p0}, Ljava/lang/Long;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    int-to-long v4, v0

    .line 138
    cmp-long v0, v2, v4

    .line 139
    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Long;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_d
    :goto_5
    return-object v1
.end method

.method public static P(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Ldefpackage/ni4;Ljava/util/List;ZLdefpackage/si4;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object v0, p1, Ldefpackage/ni4;->u:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {v1, p2, v0}, Ldefpackage/jz4;->J(Landroid/content/Context;Ljava/util/List;Z)V

    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_3

    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v3, 0xa

    .line 23
    .line 24
    invoke-static {p2, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v2}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v7, v5

    .line 79
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 80
    .line 81
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_1

    .line 90
    .line 91
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {p1, v3}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4}, Ldefpackage/si4;->run()V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v2, p0, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 102
    .line 103
    if-nez v2, :cond_4

    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    instance-of v4, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move-object v3, v5

    .line 119
    :goto_2
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    const v9, 0x7f120008

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v9, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {v2, v4, v0}, Ldefpackage/qg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    :cond_6
    invoke-virtual {v8, v5}, Ldefpackage/fr;->e(Landroid/widget/FrameLayout;)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Ldefpackage/to1;

    .line 160
    .line 161
    move-object v4, p0

    .line 162
    move-object v5, p1

    .line 163
    move-object v2, p2

    .line 164
    move v3, p3

    .line 165
    move-object v7, p4

    .line 166
    invoke-direct/range {v0 .. v7}, Ldefpackage/to1;-><init>(Landroid/content/Context;Ljava/util/List;ZLcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Ldefpackage/ni4;Ljava/util/List;Ldefpackage/si4;)V

    .line 167
    .line 168
    .line 169
    const p0, 0x7f130248

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, p0, v0}, Ldefpackage/qg4;->i(ILandroid/view/View$OnClickListener;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ldefpackage/qg4;->j()V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public static final Q(Ldefpackage/vd0;Ldefpackage/ne0;Ljava/lang/Object;)Ldefpackage/f15;
    .locals 2

    .line 1
    instance-of v0, p0, Ldefpackage/ye0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Ldefpackage/iz;->p:Ldefpackage/iz;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, Ldefpackage/ye0;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, Ldefpackage/nr0;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, Ldefpackage/ye0;->getCallerFrame()Ldefpackage/ye0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, Ldefpackage/f15;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, Ldefpackage/f15;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Ldefpackage/f15;->n0(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final a(Ljava/lang/String;Ldefpackage/dx2;Ldefpackage/zs4;IZIILdefpackage/rg1;I)V
    .locals 11

    .line 1
    move-object/from16 v7, p7

    .line 2
    .line 3
    const v0, -0x3e089999

    .line 4
    .line 5
    .line 6
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->S(I)Ldefpackage/rg1;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v7, p0}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x4

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x2

    .line 19
    :goto_0
    or-int v0, p8, v0

    .line 20
    .line 21
    or-int/lit8 v0, v0, 0x30

    .line 22
    .line 23
    invoke-virtual {v7, p2}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    const/16 v4, 0x100

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v4, 0x80

    .line 33
    .line 34
    :goto_1
    or-int/2addr v0, v4

    .line 35
    const v4, 0x36db6c00

    .line 36
    .line 37
    .line 38
    or-int/2addr v0, v4

    .line 39
    const v4, 0x12492493

    .line 40
    .line 41
    .line 42
    and-int/2addr v4, v0

    .line 43
    const v5, 0x12492492

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x1

    .line 48
    if-eq v4, v5, :cond_2

    .line 49
    .line 50
    move v4, v9

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v4, v8

    .line 53
    :goto_2
    and-int/2addr v0, v9

    .line 54
    invoke-virtual {v7, v0, v4}, Ldefpackage/rg1;->K(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_8

    .line 59
    .line 60
    sget-object v0, Ldefpackage/c94;->a:Ldefpackage/l90;

    .line 61
    .line 62
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    const v0, 0x15483a7f

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->R(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v8}, Ldefpackage/rg1;->o(Z)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Ldefpackage/g90;->k:Ldefpackage/wl4;

    .line 78
    .line 79
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v5, v0

    .line 84
    check-cast v5, Ldefpackage/ha1;

    .line 85
    .line 86
    sget-object v0, Ldefpackage/nr;->a:Ldefpackage/wl4;

    .line 87
    .line 88
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v10, v0

    .line 93
    check-cast v10, Ljava/util/concurrent/Executor;

    .line 94
    .line 95
    if-eqz v10, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v6, 0x1c

    .line 104
    .line 105
    if-lt v4, v6, :cond_5

    .line 106
    .line 107
    const/16 v4, 0x8

    .line 108
    .line 109
    if-lt v0, v4, :cond_5

    .line 110
    .line 111
    const/16 v4, 0x3e8

    .line 112
    .line 113
    if-ge v0, v4, :cond_5

    .line 114
    .line 115
    sget-object v0, Ldefpackage/nr;->b:Ljava/lang/Boolean;

    .line 116
    .line 117
    if-nez v0, :cond_4

    .line 118
    .line 119
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-lt v0, v2, :cond_3

    .line 128
    .line 129
    move v0, v9

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move v0, v8

    .line 132
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sput-object v0, Ldefpackage/nr;->b:Ljava/lang/Boolean;

    .line 137
    .line 138
    :cond_4
    sget-object v0, Ldefpackage/nr;->b:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    const v0, -0x4a85808e

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->R(I)V

    .line 153
    .line 154
    .line 155
    sget-object v0, Ldefpackage/g90;->n:Ldefpackage/wl4;

    .line 156
    .line 157
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    move-object v2, v0

    .line 162
    check-cast v2, Ldefpackage/r62;

    .line 163
    .line 164
    sget-object v0, Ldefpackage/g90;->h:Ldefpackage/wl4;

    .line 165
    .line 166
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    move-object v4, v0

    .line 171
    check-cast v4, Ldefpackage/oo0;

    .line 172
    .line 173
    :try_start_0
    new-instance v0, Ldefpackage/mr;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    move-object v3, p0

    .line 177
    move-object v1, p2

    .line 178
    invoke-direct/range {v0 .. v6}, Ldefpackage/mr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v10, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    .line 183
    .line 184
    :catch_0
    invoke-virtual {v7, v8}, Ldefpackage/rg1;->o(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_5
    const v0, -0x4a69eb75

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->R(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v8}, Ldefpackage/rg1;->o(Z)V

    .line 195
    .line 196
    .line 197
    :goto_4
    const v0, 0x1557cf53

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v0}, Ldefpackage/rg1;->R(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v8}, Ldefpackage/rg1;->o(Z)V

    .line 204
    .line 205
    .line 206
    new-instance v0, Ldefpackage/vs4;

    .line 207
    .line 208
    invoke-direct {v0, p0, p2, v5}, Ldefpackage/vs4;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ldefpackage/ha1;)V

    .line 209
    .line 210
    .line 211
    sget-object v2, Ldefpackage/w01;->b:Ldefpackage/w01;

    .line 212
    .line 213
    iget-wide v4, v7, Ldefpackage/rg1;->T:J

    .line 214
    .line 215
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-static {v7, v0}, Ldefpackage/j51;->E(Ldefpackage/rg1;Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v7}, Ldefpackage/rg1;->k()Ldefpackage/mf3;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    sget-object v6, Ldefpackage/e80;->e:Ldefpackage/fz0;

    .line 228
    .line 229
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7}, Ldefpackage/rg1;->U()V

    .line 233
    .line 234
    .line 235
    iget-boolean v6, v7, Ldefpackage/rg1;->S:Z

    .line 236
    .line 237
    if-eqz v6, :cond_6

    .line 238
    .line 239
    invoke-virtual {v7}, Ldefpackage/rg1;->j()V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_6
    invoke-virtual {v7}, Ldefpackage/rg1;->e0()V

    .line 244
    .line 245
    .line 246
    :goto_5
    sget-object v6, Ldefpackage/fz0;->I:Ldefpackage/d60;

    .line 247
    .line 248
    invoke-static {v6, v7, v2}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object v2, Ldefpackage/fz0;->H:Ldefpackage/d60;

    .line 252
    .line 253
    invoke-static {v2, v7, v5}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v7}, Ldefpackage/l93;->a0(Ldefpackage/rg1;)V

    .line 257
    .line 258
    .line 259
    sget-object v2, Ldefpackage/fz0;->G:Ldefpackage/d60;

    .line 260
    .line 261
    invoke-static {v2, v7, v0}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sget-object v2, Ldefpackage/fz0;->J:Ldefpackage/d60;

    .line 269
    .line 270
    invoke-static {v2, v7, v0}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7, v9}, Ldefpackage/rg1;->o(Z)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Ldefpackage/ax2;->a:Ldefpackage/ax2;

    .line 277
    .line 278
    const v2, 0x7fffffff

    .line 279
    .line 280
    .line 281
    move v6, v2

    .line 282
    move v4, v9

    .line 283
    move v5, v4

    .line 284
    move v7, v5

    .line 285
    move-object v2, v0

    .line 286
    goto :goto_6

    .line 287
    :cond_7
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_8
    invoke-virtual {v7}, Ldefpackage/rg1;->N()V

    .line 292
    .line 293
    .line 294
    move-object v2, p1

    .line 295
    move v4, p3

    .line 296
    move v5, p4

    .line 297
    move/from16 v6, p5

    .line 298
    .line 299
    move/from16 v7, p6

    .line 300
    .line 301
    :goto_6
    invoke-virtual/range {p7 .. p7}, Ldefpackage/rg1;->p()Ldefpackage/lv3;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    if-eqz v9, :cond_9

    .line 306
    .line 307
    new-instance v0, Ldefpackage/lr;

    .line 308
    .line 309
    move-object v1, p0

    .line 310
    move-object v3, p2

    .line 311
    move/from16 v8, p8

    .line 312
    .line 313
    invoke-direct/range {v0 .. v8}, Ldefpackage/lr;-><init>(Ljava/lang/String;Ldefpackage/dx2;Ldefpackage/zs4;IZIII)V

    .line 314
    .line 315
    .line 316
    iput-object v0, v9, Ldefpackage/lv3;->d:Ldefpackage/wf1;

    .line 317
    .line 318
    :cond_9
    return-void
.end method

.method public static final b(Ljava/lang/Object;ILdefpackage/n82;Ldefpackage/r70;Ldefpackage/rg1;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v0, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    const v6, 0x340208e3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v6}, Ldefpackage/rg1;->S(I)Ldefpackage/rg1;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v6, v5, 0x6

    .line 20
    .line 21
    if-nez v6, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    const/4 v6, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v6, 0x2

    .line 32
    :goto_0
    or-int/2addr v6, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v6, v5

    .line 35
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ldefpackage/rg1;->d(I)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v6, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 52
    .line 53
    if-nez v7, :cond_5

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v6, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v5, 0xc00

    .line 68
    .line 69
    if-nez v7, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    const/16 v7, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v7, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v6, v7

    .line 83
    :cond_7
    and-int/lit16 v7, v6, 0x493

    .line 84
    .line 85
    const/16 v8, 0x492

    .line 86
    .line 87
    if-eq v7, v8, :cond_8

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/4 v7, 0x0

    .line 92
    :goto_5
    and-int/lit8 v8, v6, 0x1

    .line 93
    .line 94
    invoke-virtual {v0, v8, v7}, Ldefpackage/rg1;->K(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_11

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v0, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    or-int/2addr v7, v8

    .line 109
    invoke-virtual {v0}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v9, Ldefpackage/j80;->a:Ldefpackage/i80;

    .line 114
    .line 115
    if-nez v7, :cond_9

    .line 116
    .line 117
    if-ne v8, v9, :cond_a

    .line 118
    .line 119
    :cond_9
    new-instance v8, Ldefpackage/l82;

    .line 120
    .line 121
    invoke-direct {v8, v1, v3}, Ldefpackage/l82;-><init>(Ljava/lang/Object;Ldefpackage/n82;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v8}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    check-cast v8, Ldefpackage/l82;

    .line 128
    .line 129
    iput v2, v8, Ldefpackage/l82;->c:I

    .line 130
    .line 131
    iget-object v7, v8, Ldefpackage/l82;->g:Ldefpackage/zd3;

    .line 132
    .line 133
    sget-object v10, Ldefpackage/fg3;->a:Ldefpackage/l90;

    .line 134
    .line 135
    invoke-virtual {v0, v10}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, Ldefpackage/l82;

    .line 140
    .line 141
    invoke-static {}, Ldefpackage/ya4;->t()Ldefpackage/ch4;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    if-eqz v12, :cond_b

    .line 146
    .line 147
    invoke-virtual {v12}, Ldefpackage/ch4;->e()Ldefpackage/if1;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    goto :goto_6

    .line 152
    :cond_b
    const/4 v14, 0x0

    .line 153
    :goto_6
    invoke-static {v12}, Ldefpackage/ya4;->z(Ldefpackage/ch4;)Ldefpackage/ch4;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    :try_start_0
    invoke-virtual {v7}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move-object/from16 v13, v16

    .line 162
    .line 163
    check-cast v13, Ldefpackage/l82;

    .line 164
    .line 165
    if-eq v11, v13, :cond_e

    .line 166
    .line 167
    invoke-virtual {v7, v11}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget v7, v8, Ldefpackage/l82;->d:I

    .line 171
    .line 172
    if-lez v7, :cond_e

    .line 173
    .line 174
    iget-object v7, v8, Ldefpackage/l82;->e:Ldefpackage/l82;

    .line 175
    .line 176
    if-eqz v7, :cond_c

    .line 177
    .line 178
    invoke-virtual {v7}, Ldefpackage/l82;->b()V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    goto :goto_9

    .line 184
    :cond_c
    :goto_7
    if-eqz v11, :cond_d

    .line 185
    .line 186
    invoke-virtual {v11}, Ldefpackage/l82;->a()Ldefpackage/l82;

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_d
    const/4 v11, 0x0

    .line 191
    :goto_8
    iput-object v11, v8, Ldefpackage/l82;->e:Ldefpackage/l82;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    :cond_e
    invoke-static {v12, v15, v14}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v8}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    invoke-virtual {v0}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    if-nez v7, :cond_f

    .line 205
    .line 206
    if-ne v11, v9, :cond_10

    .line 207
    .line 208
    :cond_f
    new-instance v11, Ldefpackage/x;

    .line 209
    .line 210
    const/16 v7, 0x16

    .line 211
    .line 212
    invoke-direct {v11, v7, v8}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v11}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_10
    check-cast v11, Ldefpackage/if1;

    .line 219
    .line 220
    invoke-static {v8, v11, v0}, Ldefpackage/bu;->b(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/rg1;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v10, v8}, Ldefpackage/l90;->a(Ljava/lang/Object;)Ldefpackage/rr3;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    shr-int/lit8 v6, v6, 0x6

    .line 228
    .line 229
    and-int/lit8 v6, v6, 0x70

    .line 230
    .line 231
    const/16 v8, 0x8

    .line 232
    .line 233
    or-int/2addr v6, v8

    .line 234
    invoke-static {v7, v4, v0, v6}, Ldefpackage/gi1;->a(Ldefpackage/rr3;Ldefpackage/r70;Ldefpackage/rg1;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :goto_9
    invoke-static {v12, v15, v14}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :cond_11
    invoke-virtual {v0}, Ldefpackage/rg1;->N()V

    .line 243
    .line 244
    .line 245
    :goto_a
    invoke-virtual {v0}, Ldefpackage/rg1;->p()Ldefpackage/lv3;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    if-eqz v6, :cond_12

    .line 250
    .line 251
    new-instance v0, Ldefpackage/m82;

    .line 252
    .line 253
    invoke-direct/range {v0 .. v5}, Ldefpackage/m82;-><init>(Ljava/lang/Object;ILdefpackage/n82;Ldefpackage/r70;I)V

    .line 254
    .line 255
    .line 256
    iput-object v0, v6, Ldefpackage/lv3;->d:Ldefpackage/wf1;

    .line 257
    .line 258
    :cond_12
    return-void
.end method

.method public static final c(Ldefpackage/e94;)Z
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/n94;->r:Ldefpackage/p94;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    sget-object v1, Ldefpackage/fz0;->O:Ldefpackage/mb;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, Ldefpackage/d94;->g:Ldefpackage/p94;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    sget-object v0, Ldefpackage/d94;->h:Ldefpackage/p94;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static final d(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "light"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    invoke-static {p0}, Ldefpackage/pf;->o(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string v0, "dark"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x2

    .line 26
    invoke-static {p0}, Ldefpackage/pf;->o(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/4 p0, -0x1

    .line 31
    invoke-static {p0}, Ldefpackage/pf;->o(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static varargs e([I)Ljava/util/List;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Ldefpackage/m12;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    array-length v2, p0

    .line 11
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/m12;-><init>(II[I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static f(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/x32;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Ldefpackage/a42;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "kotlin.collections.MutableMap"

    .line 11
    .line 12
    invoke-static {p0, v0}, Ldefpackage/jz4;->M(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0

    .line 17
    :cond_1
    :goto_0
    :try_start_0
    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    const-class v0, Ldefpackage/jz4;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v0}, Ldefpackage/h12;->M(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static final g(Ldefpackage/rm3;Ldefpackage/ni4;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object v0, p1, Ldefpackage/ni4;->v:Ldefpackage/pk;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/pk;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/ni4;->u:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    move v3, v2

    .line 28
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    move-object v5, v4

    .line 37
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 38
    .line 39
    iget-object v6, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v6, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 58
    .line 59
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    :cond_2
    :goto_1
    if-ge v2, v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    move-object v4, v3

    .line 80
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 81
    .line 82
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    return-object p1
.end method

.method public static final h(Ldefpackage/rm3;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Ldefpackage/bd1;Landroid/content/Context;ZLdefpackage/ni4;)V
    .locals 5

    .line 1
    invoke-static {p0, p6}, Ldefpackage/jz4;->g(Ldefpackage/rm3;Ldefpackage/ni4;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 v1, p0, 0x1

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    move v4, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v2

    .line 23
    :goto_0
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v2, v3

    .line 30
    :goto_1
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, v1}, Ldefpackage/v83;->c(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const p2, 0x7f1301fc

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, p2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    move p3, v3

    .line 68
    :cond_2
    :goto_2
    if-ge p3, p2, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    add-int/lit8 p3, p3, 0x1

    .line 75
    .line 76
    move-object v2, v1

    .line 77
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    const/4 p3, 0x1

    .line 98
    if-nez p2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    move v1, v3

    .line 112
    :cond_5
    if-ge v1, p2, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 121
    .line 122
    invoke-static {v2}, Ldefpackage/jz4;->C(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_5

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_3
    move p2, p3

    .line 130
    goto :goto_5

    .line 131
    :cond_7
    :goto_4
    move p2, v3

    .line 132
    :goto_5
    sget-object v1, Ldefpackage/uo1;->p:Ldefpackage/y41;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    if-nez p2, :cond_8

    .line 138
    .line 139
    sget-object p2, Ldefpackage/uo1;->q:Ldefpackage/uo1;

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_8
    if-eqz p5, :cond_9

    .line 143
    .line 144
    sget-object p2, Ldefpackage/uo1;->s:Ldefpackage/uo1;

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_9
    sget-object p2, Ldefpackage/uo1;->r:Ldefpackage/uo1;

    .line 148
    .line 149
    :goto_6
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 150
    .line 151
    .line 152
    move-result-object p5

    .line 153
    const v1, 0x7f0a02e0

    .line 154
    .line 155
    .line 156
    invoke-interface {p5, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 157
    .line 158
    .line 159
    move-result-object p5

    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    xor-int/2addr v1, p3

    .line 165
    invoke-interface {p5, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 166
    .line 167
    .line 168
    iget v1, p2, Ldefpackage/uo1;->n:I

    .line 169
    .line 170
    invoke-interface {p5, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 171
    .line 172
    .line 173
    iget p2, p2, Ldefpackage/uo1;->o:I

    .line 174
    .line 175
    invoke-interface {p5, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    const p5, 0x7f0a02df

    .line 183
    .line 184
    .line 185
    invoke-interface {p2, p5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result p5

    .line 193
    if-eqz p5, :cond_b

    .line 194
    .line 195
    :cond_a
    move p5, v3

    .line 196
    goto :goto_7

    .line 197
    :cond_b
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result p5

    .line 201
    move v1, v3

    .line 202
    :cond_c
    if-ge v1, p5, :cond_a

    .line 203
    .line 204
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 211
    .line 212
    invoke-static {p4, v2}, Ldefpackage/jz4;->D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_c

    .line 217
    .line 218
    move p5, p3

    .line 219
    :goto_7
    invoke-interface {p2, p5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    const p5, 0x7f0a02e5

    .line 227
    .line 228
    .line 229
    invoke-interface {p2, p5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result p5

    .line 237
    if-eqz p5, :cond_e

    .line 238
    .line 239
    :cond_d
    move p4, v3

    .line 240
    goto :goto_8

    .line 241
    :cond_e
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result p5

    .line 245
    move v1, v3

    .line 246
    :cond_f
    if-ge v1, p5, :cond_d

    .line 247
    .line 248
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    add-int/lit8 v1, v1, 0x1

    .line 253
    .line 254
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 255
    .line 256
    invoke-static {p4, v2}, Ldefpackage/jz4;->D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_f

    .line 261
    .line 262
    move p4, p3

    .line 263
    :goto_8
    invoke-interface {p2, p4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    const p4, 0x7f0a02e3

    .line 271
    .line 272
    .line 273
    invoke-interface {p2, p4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    xor-int/2addr p0, p3

    .line 282
    invoke-interface {p2, p0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 283
    .line 284
    .line 285
    const p0, 0x7f0a02e1

    .line 286
    .line 287
    .line 288
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    const p2, 0x7f0a02e2

    .line 293
    .line 294
    .line 295
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    const p4, 0x7f0a02e4

    .line 300
    .line 301
    .line 302
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object p4

    .line 306
    filled-new-array {p0, p2, p4}, [Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-static {p0}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    if-eqz p2, :cond_10

    .line 323
    .line 324
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    check-cast p2, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result p2

    .line 334
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 335
    .line 336
    .line 337
    move-result-object p4

    .line 338
    invoke-interface {p4, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result p4

    .line 346
    xor-int/2addr p4, p3

    .line 347
    invoke-interface {p2, p4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 348
    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_10
    invoke-virtual {p6}, Ldefpackage/ni4;->a()I

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    const-string p1, "payload_homemusic_selection"

    .line 356
    .line 357
    iget-object p2, p6, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 358
    .line 359
    invoke-virtual {p2, v3, p0, p1}, Ldefpackage/ew3;->d(IILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    return-void
.end method

.method public static final i(Ldefpackage/rq3;Ldefpackage/gf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ldefpackage/qq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldefpackage/qq3;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/qq3;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/qq3;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/qq3;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldefpackage/qq3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/qq3;->p:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Ldefpackage/qq3;->n:Ldefpackage/gf1;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget-object v1, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 57
    .line 58
    invoke-interface {p2, v1}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-ne p2, p0, :cond_4

    .line 63
    .line 64
    :try_start_1
    iput-object p1, v0, Ldefpackage/qq3;->n:Ldefpackage/gf1;

    .line 65
    .line 66
    iput v3, v0, Ldefpackage/qq3;->p:I

    .line 67
    .line 68
    new-instance p2, Ldefpackage/cz;

    .line 69
    .line 70
    invoke-static {v0}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p2, v3, v0}, Ldefpackage/cz;-><init>(ILdefpackage/vd0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ldefpackage/cz;->u()V

    .line 78
    .line 79
    .line 80
    new-instance v0, Ldefpackage/kv;

    .line 81
    .line 82
    const/4 v1, 0x2

    .line 83
    invoke-direct {v0, v1, p2}, Ldefpackage/kv;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Ldefpackage/rq3;->s:Ldefpackage/aw;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ldefpackage/aw;->z(Ldefpackage/kv;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Ldefpackage/cz;->q()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    sget-object p2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 96
    .line 97
    if-ne p0, p2, :cond_3

    .line 98
    .line 99
    return-object p2

    .line 100
    :cond_3
    :goto_1
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 104
    .line 105
    return-object p0

    .line 106
    :goto_2
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_4
    const-string p0, "awaitClose() can only be invoked from the producer context"

    .line 111
    .line 112
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v2
.end method

.method public static j(ILjava/lang/Object;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p0, p1}, Ldefpackage/jz4;->A(ILjava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "kotlin.jvm.functions.Function"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p1, p0}, Ldefpackage/jz4;->M(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static final k(Landroid/view/View;Landroid/view/ViewGroup;Ldefpackage/rm3;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, Landroid/widget/ImageView;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v3

    .line 21
    :goto_0
    if-nez v1, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v2, 0x1

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    iget-object v4, p2, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    xor-int/2addr v4, v2

    .line 36
    if-ne v4, v2, :cond_2

    .line 37
    .line 38
    move v4, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v4, v0

    .line 41
    :goto_1
    if-eqz v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p2, p2, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-virtual {p2, p3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    move v0, v2

    .line 61
    :cond_3
    const p2, 0x7f04012d

    .line 62
    .line 63
    .line 64
    const p3, -0x777778

    .line 65
    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2, p2, p3}, Ldefpackage/g12;->s(Landroid/content/Context;II)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 78
    .line 79
    const/16 v6, 0x2e

    .line 80
    .line 81
    invoke-static {v2, v6}, Ldefpackage/v50;->i(II)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-direct {v5, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v5, v3

    .line 90
    :goto_2
    invoke-virtual {p0, v5}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    const/16 v2, 0x16

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/16 v2, 0x12

    .line 99
    .line 100
    :goto_3
    int-to-float v2, v2

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 110
    .line 111
    mul-float/2addr v2, v5

    .line 112
    invoke-static {v2}, Ldefpackage/ji2;->L(F)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iput v2, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 121
    .line 122
    iput v2, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 123
    .line 124
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    const v0, 0x7f080155

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0, p2, p3}, Ldefpackage/g12;->s(Landroid/content/Context;II)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    if-eqz v4, :cond_7

    .line 152
    .line 153
    const p2, 0x7f080156

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 157
    .line 158
    .line 159
    const p2, 0x7f040126

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0, p2, p3}, Ldefpackage/g12;->s(Landroid/content/Context;II)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    const p2, 0x7f080175

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 185
    .line 186
    .line 187
    :goto_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-eqz v4, :cond_8

    .line 192
    .line 193
    const p2, 0x7f130207

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_8
    const p2, 0x7f1301ff

    .line 198
    .line 199
    .line 200
    :goto_5
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public static m(J)I
    .locals 3

    .line 1
    long-to-int v0, p0

    .line 2
    int-to-long v1, v0

    .line 3
    cmp-long v1, v1, p0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    const-string v2, "Out of range: %s"

    .line 11
    .line 12
    invoke-static {v1, v2, p0, p1}, Ldefpackage/rr2;->m(ZLjava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    return v0
.end method

.method public static n(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_1

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_2

    .line 15
    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    const-string p0, "kotlin.Function9"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-string p0, "kotlin.Function8"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_2

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_2
    const-string p0, "kotlin.Function7"

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const-string p0, "kotlin.Function6"

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_4

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_4
    const-string p0, "kotlin.Function5"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_5
    const-string p0, "kotlin.Function4"

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_6

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_6
    const-string p0, "kotlin.Function3"

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_7

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_7
    const-string p0, "kotlin.Function2"

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_8

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_8
    const-string p0, "kotlin.Function1"

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-nez p0, :cond_9

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_9
    const-string p0, "kotlin.Function0"

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-nez p0, :cond_a

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_a
    const-string p0, "kotlin.Function22"

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_b

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_b
    const-string p0, "kotlin.Function21"

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_c

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_c
    const-string p0, "kotlin.Function20"

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-nez p0, :cond_d

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_d
    const-string p0, "kotlin.Function19"

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_e

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_e
    const-string p0, "kotlin.Function18"

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-nez p0, :cond_f

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_f
    const-string p0, "kotlin.Function17"

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    .line 228
    .line 229
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-nez p0, :cond_10

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_10
    const-string p0, "kotlin.Function16"

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    .line 241
    .line 242
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_11

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_11
    const-string p0, "kotlin.Function15"

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    .line 254
    .line 255
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-nez p0, :cond_12

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_12
    const-string p0, "kotlin.Function14"

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    .line 267
    .line 268
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    if-nez p0, :cond_13

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_13
    const-string p0, "kotlin.Function13"

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    if-nez p0, :cond_14

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_14
    const-string p0, "kotlin.Function12"

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    .line 293
    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-nez p0, :cond_15

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_15
    const-string p0, "kotlin.Function11"

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    .line 306
    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-nez p0, :cond_16

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :cond_16
    const-string p0, "kotlin.Function10"

    .line 316
    .line 317
    return-object p0

    .line 318
    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    .line 319
    .line 320
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-nez p0, :cond_17

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_17
    const-string p0, "kotlin.Int.Companion"

    .line 329
    .line 330
    return-object p0

    .line 331
    :sswitch_1
    const-string v0, "java.lang.Throwable"

    .line 332
    .line 333
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    if-nez p0, :cond_18

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_18
    const-string p0, "kotlin.Throwable"

    .line 342
    .line 343
    return-object p0

    .line 344
    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    .line 345
    .line 346
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    if-nez p0, :cond_19

    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_19
    const-string p0, "kotlin.Boolean.Companion"

    .line 355
    .line 356
    return-object p0

    .line 357
    :sswitch_3
    const-string v0, "java.lang.Iterable"

    .line 358
    .line 359
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result p0

    .line 363
    if-nez p0, :cond_1a

    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :cond_1a
    const-string p0, "kotlin.collections.Iterable"

    .line 368
    .line 369
    return-object p0

    .line 370
    :sswitch_4
    const-string v0, "java.lang.String"

    .line 371
    .line 372
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    if-nez p0, :cond_1b

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :cond_1b
    const-string p0, "kotlin.String"

    .line 381
    .line 382
    return-object p0

    .line 383
    :sswitch_5
    const-string v0, "java.lang.Object"

    .line 384
    .line 385
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result p0

    .line 389
    if-nez p0, :cond_1c

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_1c
    const-string p0, "kotlin.Any"

    .line 394
    .line 395
    return-object p0

    .line 396
    :sswitch_6
    const-string v0, "java.lang.Number"

    .line 397
    .line 398
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result p0

    .line 402
    if-nez p0, :cond_1d

    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_1d
    const-string p0, "kotlin.Number"

    .line 407
    .line 408
    return-object p0

    .line 409
    :sswitch_7
    const-string v0, "java.lang.Double"

    .line 410
    .line 411
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result p0

    .line 415
    if-nez p0, :cond_32

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    .line 420
    .line 421
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result p0

    .line 425
    if-nez p0, :cond_1e

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    .line 429
    :cond_1e
    const-string p0, "kotlin.String.Companion"

    .line 430
    .line 431
    return-object p0

    .line 432
    :sswitch_9
    const-string v0, "java.util.ListIterator"

    .line 433
    .line 434
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result p0

    .line 438
    if-nez p0, :cond_1f

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_1f
    const-string p0, "kotlin.collections.ListIterator"

    .line 443
    .line 444
    return-object p0

    .line 445
    :sswitch_a
    const-string v0, "java.util.Iterator"

    .line 446
    .line 447
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    if-nez p0, :cond_20

    .line 452
    .line 453
    goto/16 :goto_0

    .line 454
    .line 455
    :cond_20
    const-string p0, "kotlin.collections.Iterator"

    .line 456
    .line 457
    return-object p0

    .line 458
    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    .line 459
    .line 460
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    if-nez p0, :cond_21

    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    :cond_21
    const-string p0, "kotlin.Float.Companion"

    .line 469
    .line 470
    return-object p0

    .line 471
    :sswitch_c
    const-string v0, "java.lang.Long"

    .line 472
    .line 473
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result p0

    .line 477
    if-nez p0, :cond_27

    .line 478
    .line 479
    goto/16 :goto_0

    .line 480
    .line 481
    :sswitch_d
    const-string v0, "java.lang.Enum"

    .line 482
    .line 483
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result p0

    .line 487
    if-nez p0, :cond_22

    .line 488
    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :cond_22
    const-string p0, "kotlin.Enum"

    .line 492
    .line 493
    return-object p0

    .line 494
    :sswitch_e
    const-string v0, "java.lang.Byte"

    .line 495
    .line 496
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result p0

    .line 500
    if-nez p0, :cond_29

    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :sswitch_f
    const-string v0, "java.lang.Boolean"

    .line 505
    .line 506
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result p0

    .line 510
    if-nez p0, :cond_26

    .line 511
    .line 512
    goto/16 :goto_0

    .line 513
    .line 514
    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    .line 515
    .line 516
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    if-nez p0, :cond_23

    .line 521
    .line 522
    goto/16 :goto_0

    .line 523
    .line 524
    :cond_23
    const-string p0, "kotlin.Enum.Companion"

    .line 525
    .line 526
    return-object p0

    .line 527
    :sswitch_11
    const-string v0, "java.lang.Character"

    .line 528
    .line 529
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    if-nez p0, :cond_28

    .line 534
    .line 535
    goto/16 :goto_0

    .line 536
    .line 537
    :sswitch_12
    const-string v0, "short"

    .line 538
    .line 539
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result p0

    .line 543
    if-nez p0, :cond_2d

    .line 544
    .line 545
    goto/16 :goto_0

    .line 546
    .line 547
    :sswitch_13
    const-string v0, "float"

    .line 548
    .line 549
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    if-nez p0, :cond_2e

    .line 554
    .line 555
    goto/16 :goto_0

    .line 556
    .line 557
    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    .line 558
    .line 559
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result p0

    .line 563
    if-nez p0, :cond_24

    .line 564
    .line 565
    goto/16 :goto_0

    .line 566
    .line 567
    :cond_24
    const-string p0, "kotlin.Short.Companion"

    .line 568
    .line 569
    return-object p0

    .line 570
    :sswitch_15
    const-string v0, "java.util.List"

    .line 571
    .line 572
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result p0

    .line 576
    if-nez p0, :cond_25

    .line 577
    .line 578
    goto/16 :goto_0

    .line 579
    .line 580
    :cond_25
    const-string p0, "kotlin.collections.List"

    .line 581
    .line 582
    return-object p0

    .line 583
    :sswitch_16
    const-string v0, "boolean"

    .line 584
    .line 585
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result p0

    .line 589
    if-nez p0, :cond_26

    .line 590
    .line 591
    goto/16 :goto_0

    .line 592
    .line 593
    :cond_26
    const-string p0, "kotlin.Boolean"

    .line 594
    .line 595
    return-object p0

    .line 596
    :sswitch_17
    const-string v0, "long"

    .line 597
    .line 598
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result p0

    .line 602
    if-nez p0, :cond_27

    .line 603
    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :cond_27
    const-string p0, "kotlin.Long"

    .line 607
    .line 608
    return-object p0

    .line 609
    :sswitch_18
    const-string v0, "char"

    .line 610
    .line 611
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    if-nez p0, :cond_28

    .line 616
    .line 617
    goto/16 :goto_0

    .line 618
    .line 619
    :cond_28
    const-string p0, "kotlin.Char"

    .line 620
    .line 621
    return-object p0

    .line 622
    :sswitch_19
    const-string v0, "byte"

    .line 623
    .line 624
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result p0

    .line 628
    if-nez p0, :cond_29

    .line 629
    .line 630
    goto/16 :goto_0

    .line 631
    .line 632
    :cond_29
    const-string p0, "kotlin.Byte"

    .line 633
    .line 634
    return-object p0

    .line 635
    :sswitch_1a
    const-string v0, "int"

    .line 636
    .line 637
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result p0

    .line 641
    if-nez p0, :cond_38

    .line 642
    .line 643
    goto/16 :goto_0

    .line 644
    .line 645
    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    .line 646
    .line 647
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result p0

    .line 651
    if-nez p0, :cond_2a

    .line 652
    .line 653
    goto/16 :goto_0

    .line 654
    .line 655
    :cond_2a
    const-string p0, "kotlin.collections.Map.Entry"

    .line 656
    .line 657
    return-object p0

    .line 658
    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    .line 659
    .line 660
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result p0

    .line 664
    if-nez p0, :cond_2b

    .line 665
    .line 666
    goto/16 :goto_0

    .line 667
    .line 668
    :cond_2b
    const-string p0, "kotlin.Long.Companion"

    .line 669
    .line 670
    return-object p0

    .line 671
    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    .line 672
    .line 673
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result p0

    .line 677
    if-nez p0, :cond_2c

    .line 678
    .line 679
    goto/16 :goto_0

    .line 680
    .line 681
    :cond_2c
    const-string p0, "kotlin.Char.Companion"

    .line 682
    .line 683
    return-object p0

    .line 684
    :sswitch_1e
    const-string v0, "java.lang.Short"

    .line 685
    .line 686
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result p0

    .line 690
    if-nez p0, :cond_2d

    .line 691
    .line 692
    goto/16 :goto_0

    .line 693
    .line 694
    :cond_2d
    const-string p0, "kotlin.Short"

    .line 695
    .line 696
    return-object p0

    .line 697
    :sswitch_1f
    const-string v0, "java.lang.Float"

    .line 698
    .line 699
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result p0

    .line 703
    if-nez p0, :cond_2e

    .line 704
    .line 705
    goto/16 :goto_0

    .line 706
    .line 707
    :cond_2e
    const-string p0, "kotlin.Float"

    .line 708
    .line 709
    return-object p0

    .line 710
    :sswitch_20
    const-string v0, "java.util.Collection"

    .line 711
    .line 712
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result p0

    .line 716
    if-nez p0, :cond_2f

    .line 717
    .line 718
    goto/16 :goto_0

    .line 719
    .line 720
    :cond_2f
    const-string p0, "kotlin.collections.Collection"

    .line 721
    .line 722
    return-object p0

    .line 723
    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    .line 724
    .line 725
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result p0

    .line 729
    if-nez p0, :cond_30

    .line 730
    .line 731
    goto/16 :goto_0

    .line 732
    .line 733
    :cond_30
    const-string p0, "kotlin.CharSequence"

    .line 734
    .line 735
    return-object p0

    .line 736
    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    .line 737
    .line 738
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result p0

    .line 742
    if-nez p0, :cond_31

    .line 743
    .line 744
    goto :goto_0

    .line 745
    :cond_31
    const-string p0, "kotlin.Byte.Companion"

    .line 746
    .line 747
    return-object p0

    .line 748
    :sswitch_23
    const-string v0, "double"

    .line 749
    .line 750
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result p0

    .line 754
    if-nez p0, :cond_32

    .line 755
    .line 756
    goto :goto_0

    .line 757
    :cond_32
    const-string p0, "kotlin.Double"

    .line 758
    .line 759
    return-object p0

    .line 760
    :sswitch_24
    const-string v0, "java.util.Set"

    .line 761
    .line 762
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result p0

    .line 766
    if-nez p0, :cond_33

    .line 767
    .line 768
    goto :goto_0

    .line 769
    :cond_33
    const-string p0, "kotlin.collections.Set"

    .line 770
    .line 771
    return-object p0

    .line 772
    :sswitch_25
    const-string v0, "java.util.Map"

    .line 773
    .line 774
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result p0

    .line 778
    if-nez p0, :cond_34

    .line 779
    .line 780
    goto :goto_0

    .line 781
    :cond_34
    const-string p0, "kotlin.collections.Map"

    .line 782
    .line 783
    return-object p0

    .line 784
    :sswitch_26
    const-string v0, "java.lang.Comparable"

    .line 785
    .line 786
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result p0

    .line 790
    if-nez p0, :cond_35

    .line 791
    .line 792
    goto :goto_0

    .line 793
    :cond_35
    const-string p0, "kotlin.Comparable"

    .line 794
    .line 795
    return-object p0

    .line 796
    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    .line 797
    .line 798
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result p0

    .line 802
    if-nez p0, :cond_36

    .line 803
    .line 804
    goto :goto_0

    .line 805
    :cond_36
    const-string p0, "kotlin.Annotation"

    .line 806
    .line 807
    return-object p0

    .line 808
    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    .line 809
    .line 810
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result p0

    .line 814
    if-nez p0, :cond_37

    .line 815
    .line 816
    goto :goto_0

    .line 817
    :cond_37
    const-string p0, "kotlin.Cloneable"

    .line 818
    .line 819
    return-object p0

    .line 820
    :sswitch_29
    const-string v0, "java.lang.Integer"

    .line 821
    .line 822
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result p0

    .line 826
    if-nez p0, :cond_38

    .line 827
    .line 828
    goto :goto_0

    .line 829
    :cond_38
    const-string p0, "kotlin.Int"

    .line 830
    .line 831
    return-object p0

    .line 832
    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    .line 833
    .line 834
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    move-result p0

    .line 838
    if-nez p0, :cond_39

    .line 839
    .line 840
    :goto_0
    const/4 p0, 0x0

    .line 841
    return-object p0

    .line 842
    :cond_39
    const-string p0, "kotlin.Double.Companion"

    .line 843
    .line 844
    return-object p0

    .line 845
    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    :pswitch_data_0
    .packed-switch -0x6bf3d83c
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    :pswitch_data_2
    .packed-switch 0x4c695eb
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static o(II)I
    .locals 3

    .line 1
    const v0, 0x3fffffff    # 1.9999999f

    .line 2
    .line 3
    .line 4
    if-gt p1, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :goto_0
    const-string v2, "min (%s) must be less than or equal to max (%s)"

    .line 10
    .line 11
    invoke-static {p1, v0, v2, v1}, Ldefpackage/rr2;->i(IILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static p(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    invoke-static {p1, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    move v4, v1

    .line 39
    :goto_0
    if-ge v4, v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 48
    .line 49
    new-instance v6, Lcom/eddyizm/tempus/model/Download;

    .line 50
    .line 51
    invoke-direct {v6, v5}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p0, v0, v2, v1}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    move v2, v1

    .line 67
    :goto_1
    if-ge v2, v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-static {p0, v3, v4, v4, v1}, Ldefpackage/i51;->b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_2
    return-void
.end method

.method public static final q(Ldefpackage/q81;Ldefpackage/y00;ZLdefpackage/wd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Ldefpackage/t81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldefpackage/t81;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/t81;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/t81;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/t81;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldefpackage/t81;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/t81;->s:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-ne v1, v3, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, Ldefpackage/t81;->q:Z

    .line 41
    .line 42
    iget-object p0, v0, Ldefpackage/t81;->p:Ldefpackage/xv;

    .line 43
    .line 44
    iget-object p1, v0, Ldefpackage/t81;->o:Ldefpackage/y00;

    .line 45
    .line 46
    iget-object v1, v0, Ldefpackage/t81;->n:Ldefpackage/q81;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object p3, p0

    .line 52
    move-object p0, v1

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_4

    .line 56
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_3
    iget-boolean p2, v0, Ldefpackage/t81;->q:Z

    .line 63
    .line 64
    iget-object p0, v0, Ldefpackage/t81;->p:Ldefpackage/xv;

    .line 65
    .line 66
    iget-object p1, v0, Ldefpackage/t81;->o:Ldefpackage/y00;

    .line 67
    .line 68
    iget-object v1, v0, Ldefpackage/t81;->n:Ldefpackage/q81;

    .line 69
    .line 70
    :try_start_1
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :try_start_2
    invoke-interface {p1}, Ldefpackage/y00;->iterator()Ldefpackage/xv;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    :goto_1
    iput-object p0, v0, Ldefpackage/t81;->n:Ldefpackage/q81;

    .line 82
    .line 83
    iput-object p1, v0, Ldefpackage/t81;->o:Ldefpackage/y00;

    .line 84
    .line 85
    iput-object p3, v0, Ldefpackage/t81;->p:Ldefpackage/xv;

    .line 86
    .line 87
    iput-boolean p2, v0, Ldefpackage/t81;->q:Z

    .line 88
    .line 89
    iput v4, v0, Ldefpackage/t81;->s:I

    .line 90
    .line 91
    invoke-virtual {p3, v0}, Ldefpackage/xv;->b(Ldefpackage/wd0;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-ne v1, v5, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    move-object v6, v1

    .line 99
    move-object v1, p0

    .line 100
    move-object p0, p3

    .line 101
    move-object p3, v6

    .line 102
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-eqz p3, :cond_6

    .line 109
    .line 110
    invoke-virtual {p0}, Ldefpackage/xv;->c()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    iput-object v1, v0, Ldefpackage/t81;->n:Ldefpackage/q81;

    .line 115
    .line 116
    iput-object p1, v0, Ldefpackage/t81;->o:Ldefpackage/y00;

    .line 117
    .line 118
    iput-object p0, v0, Ldefpackage/t81;->p:Ldefpackage/xv;

    .line 119
    .line 120
    iput-boolean p2, v0, Ldefpackage/t81;->q:Z

    .line 121
    .line 122
    iput v3, v0, Ldefpackage/t81;->s:I

    .line 123
    .line 124
    invoke-interface {v1, p3, v0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    if-ne p3, v5, :cond_1

    .line 129
    .line 130
    :goto_3
    return-object v5

    .line 131
    :cond_6
    if-eqz p2, :cond_7

    .line 132
    .line 133
    invoke-interface {p1, v2}, Ldefpackage/y00;->f(Ljava/util/concurrent/CancellationException;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 137
    .line 138
    return-object p0

    .line 139
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 140
    :catchall_1
    move-exception p3

    .line 141
    if-eqz p2, :cond_a

    .line 142
    .line 143
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 144
    .line 145
    if-eqz p2, :cond_8

    .line 146
    .line 147
    move-object v2, p0

    .line 148
    check-cast v2, Ljava/util/concurrent/CancellationException;

    .line 149
    .line 150
    :cond_8
    if-nez v2, :cond_9

    .line 151
    .line 152
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 153
    .line 154
    const-string p2, "Channel was consumed, consumer had failed"

    .line 155
    .line 156
    invoke-direct {v2, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-interface {p1, v2}, Ldefpackage/y00;->f(Ljava/util/concurrent/CancellationException;)V

    .line 163
    .line 164
    .line 165
    :cond_a
    throw p3
.end method

.method public static final r(Ldefpackage/df;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Ldefpackage/ud3;->H()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v1}, Ldefpackage/df;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 16
    .line 17
    and-int/lit8 v2, v2, 0x30

    .line 18
    .line 19
    const-string v3, "default"

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    move v2, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v4

    .line 36
    :goto_0
    invoke-static {}, Ldefpackage/ud3;->Q()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    const-string v3, "dark"

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    :cond_1
    move v2, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v2, v4

    .line 55
    :goto_1
    invoke-static {}, Ldefpackage/ud3;->m()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {}, Ldefpackage/ud3;->S()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v6, 0x7

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    new-instance v0, Ldefpackage/gp3;

    .line 67
    .line 68
    invoke-direct {v0, v6}, Ldefpackage/gp3;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v3, Ldefpackage/qr2;

    .line 72
    .line 73
    invoke-direct {v3, v0}, Ldefpackage/qr2;-><init>(Ldefpackage/gp3;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v3}, Ldefpackage/ly0;->a(Ldefpackage/df;Ldefpackage/qr2;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string v3, "HEX:"

    .line 81
    .line 82
    invoke-static {v0, v3, v4}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    invoke-static {v0, v3}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    new-instance v3, Ldefpackage/gp3;

    .line 97
    .line 98
    invoke-direct {v3, v6}, Ldefpackage/gp3;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, v3, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 106
    .line 107
    new-instance v0, Ldefpackage/tb4;

    .line 108
    .line 109
    const/4 v4, 0x5

    .line 110
    invoke-direct {v0, v4}, Ldefpackage/tb4;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, v3, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance v0, Ldefpackage/qr2;

    .line 116
    .line 117
    invoke-direct {v0, v3}, Ldefpackage/qr2;-><init>(Ldefpackage/gp3;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v0}, Ldefpackage/ly0;->a(Ldefpackage/df;Ldefpackage/qr2;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catch_0
    move-exception v0

    .line 125
    const-string v3, "ThemeHelper"

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    new-instance v0, Ldefpackage/gp3;

    .line 135
    .line 136
    invoke-direct {v0, v6}, Ldefpackage/gp3;-><init>(I)V

    .line 137
    .line 138
    .line 139
    new-instance v3, Ldefpackage/qr2;

    .line 140
    .line 141
    invoke-direct {v3, v0}, Ldefpackage/qr2;-><init>(Ldefpackage/gp3;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v3}, Ldefpackage/ly0;->a(Ldefpackage/df;Ldefpackage/qr2;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_2
    const v0, 0x7f04013b

    .line 148
    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    const v2, 0x1010031

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    const v2, 0x1010451

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    const v2, 0x1010452

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    const v0, 0x7f040144

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    const v0, 0x7f040141

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    const v0, 0x7f040140

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    const v0, 0x7f04013d

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    const v0, 0x7f04013e

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    const v0, 0x7f04013f

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    const v0, 0x7f04012b

    .line 220
    .line 221
    .line 222
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v16

    .line 226
    const v0, 0x7f04012c

    .line 227
    .line 228
    .line 229
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v17

    .line 233
    filled-new-array/range {v6 .. v17}, [Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Ldefpackage/gb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 242
    .line 243
    const/16 v3, 0x1b

    .line 244
    .line 245
    if-lt v2, v3, :cond_5

    .line 246
    .line 247
    const v2, 0x101056d

    .line 248
    .line 249
    .line 250
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    :cond_5
    invoke-static {v0}, Ldefpackage/q40;->P0(Ljava/util/List;)[I

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const v2, 0x7f14000c

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v2, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 286
    .line 287
    const/high16 v2, -0x1000000

    .line 288
    .line 289
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_6
    new-instance v2, Landroid/util/TypedValue;

    .line 297
    .line 298
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3, v0, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iget v1, v2, Landroid/util/TypedValue;->data:I

    .line 313
    .line 314
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 315
    .line 316
    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 320
    .line 321
    .line 322
    :goto_3
    return-void
.end method

.method public static s(Ldefpackage/t23;)Ldefpackage/r23;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/k5;->z:Ldefpackage/k5;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ldefpackage/aa4;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    check-cast v0, Ldefpackage/r23;

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const-string p0, "Sequence is empty."

    .line 36
    .line 37
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final t(Ldefpackage/ne0;Ldefpackage/ne0;Z)Ldefpackage/ne0;
    .locals 4

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Ldefpackage/d60;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0, p2}, Ldefpackage/ne0;->s(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v3, Ldefpackage/d60;

    .line 22
    .line 23
    invoke-direct {v3, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v3, p2}, Ldefpackage/ne0;->s(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    invoke-interface {p0, p1}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    new-instance v0, Ldefpackage/d60;

    .line 46
    .line 47
    const/16 v1, 0xb

    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 53
    .line 54
    invoke-interface {p0, v0, v1}, Ldefpackage/ne0;->s(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ldefpackage/ne0;

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    check-cast p1, Ldefpackage/ne0;

    .line 63
    .line 64
    new-instance p2, Ldefpackage/d60;

    .line 65
    .line 66
    const/16 v0, 0xc

    .line 67
    .line 68
    invoke-direct {p2, v0, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2, v1}, Ldefpackage/ne0;->s(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_1
    check-cast p1, Ldefpackage/ne0;

    .line 76
    .line 77
    invoke-interface {p0, p1}, Ldefpackage/ne0;->J(Ldefpackage/ne0;)Ldefpackage/ne0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static u(BBBB)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p1, p1, 0xff

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    or-int/2addr p0, p1

    .line 8
    and-int/lit16 p1, p2, 0xff

    .line 9
    .line 10
    shl-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    or-int/2addr p0, p1

    .line 13
    and-int/lit16 p1, p3, 0xff

    .line 14
    .line 15
    or-int/2addr p0, p1

    .line 16
    return p0
.end method

.method public static v(I)I
    .locals 7

    .line 1
    const/high16 v0, -0x200000

    .line 2
    .line 3
    and-int v1, p0, v0

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ne v1, v0, :cond_c

    .line 7
    .line 8
    ushr-int/lit8 v0, p0, 0x13

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    and-int/2addr v0, v1

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v3, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    ushr-int/lit8 v4, p0, 0x11

    .line 17
    .line 18
    and-int/2addr v4, v1

    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_1
    ushr-int/lit8 v5, p0, 0xc

    .line 23
    .line 24
    const/16 v6, 0xf

    .line 25
    .line 26
    and-int/2addr v5, v6

    .line 27
    if-eqz v5, :cond_c

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    ushr-int/lit8 v6, p0, 0xa

    .line 33
    .line 34
    and-int/2addr v6, v1

    .line 35
    if-ne v6, v1, :cond_3

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    sget-object v2, Ldefpackage/jz4;->c:[I

    .line 39
    .line 40
    aget v2, v2, v6

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    if-ne v0, v6, :cond_4

    .line 44
    .line 45
    div-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    if-nez v0, :cond_5

    .line 49
    .line 50
    div-int/lit8 v2, v2, 0x4

    .line 51
    .line 52
    :cond_5
    :goto_0
    ushr-int/lit8 p0, p0, 0x9

    .line 53
    .line 54
    and-int/2addr p0, v3

    .line 55
    if-ne v4, v1, :cond_7

    .line 56
    .line 57
    if-ne v0, v1, :cond_6

    .line 58
    .line 59
    sget-object v0, Ldefpackage/jz4;->d:[I

    .line 60
    .line 61
    sub-int/2addr v5, v3

    .line 62
    aget v0, v0, v5

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    sget-object v0, Ldefpackage/jz4;->e:[I

    .line 66
    .line 67
    sub-int/2addr v5, v3

    .line 68
    aget v0, v0, v5

    .line 69
    .line 70
    :goto_1
    mul-int/lit8 v0, v0, 0xc

    .line 71
    .line 72
    div-int/2addr v0, v2

    .line 73
    add-int/2addr v0, p0

    .line 74
    mul-int/lit8 v0, v0, 0x4

    .line 75
    .line 76
    return v0

    .line 77
    :cond_7
    if-ne v0, v1, :cond_9

    .line 78
    .line 79
    if-ne v4, v6, :cond_8

    .line 80
    .line 81
    sget-object v6, Ldefpackage/jz4;->f:[I

    .line 82
    .line 83
    sub-int/2addr v5, v3

    .line 84
    aget v5, v6, v5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_8
    sget-object v6, Ldefpackage/jz4;->g:[I

    .line 88
    .line 89
    sub-int/2addr v5, v3

    .line 90
    aget v5, v6, v5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_9
    sget-object v6, Ldefpackage/jz4;->h:[I

    .line 94
    .line 95
    sub-int/2addr v5, v3

    .line 96
    aget v5, v6, v5

    .line 97
    .line 98
    :goto_2
    const/16 v6, 0x90

    .line 99
    .line 100
    if-ne v0, v1, :cond_a

    .line 101
    .line 102
    mul-int/2addr v5, v6

    .line 103
    div-int/2addr v5, v2

    .line 104
    add-int/2addr v5, p0

    .line 105
    return v5

    .line 106
    :cond_a
    if-ne v4, v3, :cond_b

    .line 107
    .line 108
    const/16 v6, 0x48

    .line 109
    .line 110
    :cond_b
    mul-int/2addr v6, v5

    .line 111
    div-int/2addr v6, v2

    .line 112
    add-int/2addr v6, p0

    .line 113
    return v6

    .line 114
    :cond_c
    :goto_3
    return v2
.end method

.method public static final w(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const-string p1, "No valid saved state was found for the key \'"

    .line 9
    .line 10
    const-string v0, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."

    .line 11
    .line 12
    invoke-static {p1, p0, v0}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static x(Ljava/lang/String;)[I
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    aput v3, v0, v2

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v4, 0x23

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ne v4, v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_0
    const/16 v4, 0x3f

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eq v4, v3, :cond_2

    .line 36
    .line 37
    if-le v4, v1, :cond_3

    .line 38
    .line 39
    :cond_2
    move v4, v1

    .line 40
    :cond_3
    const/16 v5, 0x2f

    .line 41
    .line 42
    invoke-virtual {p0, v5}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eq v6, v3, :cond_4

    .line 47
    .line 48
    if-le v6, v4, :cond_5

    .line 49
    .line 50
    :cond_4
    move v6, v4

    .line 51
    :cond_5
    const/16 v7, 0x3a

    .line 52
    .line 53
    invoke-virtual {p0, v7}, Ljava/lang/String;->indexOf(I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-le v7, v6, :cond_6

    .line 58
    .line 59
    move v7, v3

    .line 60
    :cond_6
    add-int/lit8 v6, v7, 0x2

    .line 61
    .line 62
    if-ge v6, v4, :cond_8

    .line 63
    .line 64
    add-int/lit8 v8, v7, 0x1

    .line 65
    .line 66
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-ne v8, v5, :cond_8

    .line 71
    .line 72
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-ne v6, v5, :cond_8

    .line 77
    .line 78
    add-int/lit8 v6, v7, 0x3

    .line 79
    .line 80
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->indexOf(II)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eq p0, v3, :cond_7

    .line 85
    .line 86
    if-le p0, v4, :cond_9

    .line 87
    .line 88
    :cond_7
    move p0, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_8
    add-int/lit8 p0, v7, 0x1

    .line 91
    .line 92
    :cond_9
    :goto_1
    aput v7, v0, v2

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    aput p0, v0, v2

    .line 96
    .line 97
    const/4 p0, 0x2

    .line 98
    aput v4, v0, p0

    .line 99
    .line 100
    const/4 p0, 0x3

    .line 101
    aput v1, v0, p0

    .line 102
    .line 103
    return-object v0
.end method

.method public static y([IIII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    aget v0, p0, p2

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p0, -0x1

    .line 12
    return p0
.end method

.method public static final z(Ldefpackage/rv0;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ldefpackage/cx2;

    .line 3
    .line 4
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 5
    .line 6
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p0, v0}, Ldefpackage/j51;->M(Ldefpackage/eo0;I)Ldefpackage/f63;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ldefpackage/f63;->I0()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract l()V
.end method

.class public final Ldefpackage/dk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/media/MediaCodecInfo$CodecCapabilities;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public j:I

.field public k:I

.field public l:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Ldefpackage/dk2;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 14
    .line 15
    iput-boolean p5, p0, Ldefpackage/dk2;->g:Z

    .line 16
    .line 17
    iput-boolean p8, p0, Ldefpackage/dk2;->e:Z

    .line 18
    .line 19
    iput-boolean p9, p0, Ldefpackage/dk2;->f:Z

    .line 20
    .line 21
    iput-boolean p10, p0, Ldefpackage/dk2;->h:Z

    .line 22
    .line 23
    invoke-static {p2}, Ldefpackage/lw2;->l(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, Ldefpackage/dk2;->i:Z

    .line 28
    .line 29
    const p1, -0x800001

    .line 30
    .line 31
    .line 32
    iput p1, p0, Ldefpackage/dk2;->l:F

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    iput p1, p0, Ldefpackage/dk2;->j:I

    .line 36
    .line 37
    iput p1, p0, Ldefpackage/dk2;->k:I

    .line 38
    .line 39
    return-void
.end method

.method public static a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Landroid/graphics/Point;

    .line 10
    .line 11
    invoke-static {p1, v0}, Ldefpackage/f35;->g(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    mul-int/2addr p1, v0

    .line 16
    invoke-static {p2, v1}, Ldefpackage/f35;->g(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    mul-int/2addr p2, v1

    .line 21
    invoke-direct {v2, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 22
    .line 23
    .line 24
    iget p1, v2, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    iget p2, v2, Landroid/graphics/Point;->y:I

    .line 27
    .line 28
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 29
    .line 30
    cmpl-double v0, p3, v0

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    cmpg-double v0, p3, v0

    .line 37
    .line 38
    if-gez v0, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities;->areSizeAndRateSupported(IID)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getAchievableFrameRatesFor(II)Landroid/util/Range;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/Double;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    cmpg-double p0, p3, p0

    .line 70
    .line 71
    if-gtz p0, :cond_3

    .line 72
    .line 73
    :goto_0
    const/4 p0, 0x1

    .line 74
    return p0

    .line 75
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_4
    :goto_2
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZ)Ldefpackage/dk2;
    .locals 11

    .line 1
    new-instance v0, Ldefpackage/dk2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const-string v3, "adaptive-playback"

    .line 8
    .line 9
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move v8, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v8, v1

    .line 18
    :goto_0
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const-string v3, "tunneled-playback"

    .line 21
    .line 22
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    :cond_1
    if-eqz p3, :cond_2

    .line 27
    .line 28
    const-string v3, "secure-playback"

    .line 29
    .line 30
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    move v9, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v9, v1

    .line 39
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v4, 0x23

    .line 42
    .line 43
    if-lt v3, v4, :cond_4

    .line 44
    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    const-string v3, "detached-surface"

    .line 48
    .line 49
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 56
    .line 57
    const-string v4, "Xiaomi"

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    const-string v4, "OPPO"

    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    const-string v4, "realme"

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_4

    .line 80
    .line 81
    const-string v4, "motorola"

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_4

    .line 88
    .line 89
    const-string v4, "LENOVO"

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move v10, v2

    .line 99
    move-object v1, p0

    .line 100
    move-object v3, p2

    .line 101
    move-object v4, p3

    .line 102
    move v5, p4

    .line 103
    move/from16 v6, p5

    .line 104
    .line 105
    move/from16 v7, p6

    .line 106
    .line 107
    move-object v2, p1

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    :goto_2
    move v10, v1

    .line 110
    move-object v2, p1

    .line 111
    move-object v3, p2

    .line 112
    move-object v4, p3

    .line 113
    move v5, p4

    .line 114
    move/from16 v6, p5

    .line 115
    .line 116
    move/from16 v7, p6

    .line 117
    .line 118
    move-object v1, p0

    .line 119
    :goto_3
    invoke-direct/range {v0 .. v10}, Ldefpackage/dk2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method


# virtual methods
.method public final b(Ldefpackage/tb1;Ldefpackage/tb1;)Ldefpackage/ej0;
    .locals 8

    .line 1
    iget-object v0, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 4
    .line 5
    iget-object v2, p2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p2, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 8
    .line 9
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    iget-boolean v4, p0, Ldefpackage/dk2;->i:Z

    .line 21
    .line 22
    if-eqz v4, :cond_e

    .line 23
    .line 24
    iget v4, p1, Ldefpackage/tb1;->z:I

    .line 25
    .line 26
    iget v5, p2, Ldefpackage/tb1;->z:I

    .line 27
    .line 28
    if-eq v4, v5, :cond_1

    .line 29
    .line 30
    or-int/lit16 v0, v0, 0x400

    .line 31
    .line 32
    :cond_1
    iget v4, p1, Ldefpackage/tb1;->u:I

    .line 33
    .line 34
    iget v5, p2, Ldefpackage/tb1;->u:I

    .line 35
    .line 36
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    iget v4, p1, Ldefpackage/tb1;->v:I

    .line 39
    .line 40
    iget v5, p2, Ldefpackage/tb1;->v:I

    .line 41
    .line 42
    if-eq v4, v5, :cond_3

    .line 43
    .line 44
    :cond_2
    const/4 v2, 0x1

    .line 45
    :cond_3
    iget-boolean v4, p0, Ldefpackage/dk2;->e:Z

    .line 46
    .line 47
    if-nez v4, :cond_4

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    or-int/lit16 v0, v0, 0x200

    .line 52
    .line 53
    :cond_4
    invoke-static {v1}, Ldefpackage/c50;->e(Ldefpackage/c50;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-static {v3}, Ldefpackage/c50;->e(Ldefpackage/c50;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_6

    .line 64
    .line 65
    :cond_5
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_6

    .line 70
    .line 71
    or-int/lit16 v0, v0, 0x800

    .line 72
    .line 73
    :cond_6
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 74
    .line 75
    const-string v3, "SM-T230"

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    const-string v1, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    .line 84
    .line 85
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Ldefpackage/tb1;->b(Ldefpackage/tb1;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_7

    .line 98
    .line 99
    or-int/lit8 v0, v0, 0x2

    .line 100
    .line 101
    :cond_7
    iget v1, p1, Ldefpackage/tb1;->w:I

    .line 102
    .line 103
    const/4 v3, -0x1

    .line 104
    if-eq v1, v3, :cond_8

    .line 105
    .line 106
    iget v4, p1, Ldefpackage/tb1;->x:I

    .line 107
    .line 108
    if-eq v4, v3, :cond_8

    .line 109
    .line 110
    iget v3, p2, Ldefpackage/tb1;->w:I

    .line 111
    .line 112
    if-ne v1, v3, :cond_8

    .line 113
    .line 114
    iget v1, p2, Ldefpackage/tb1;->x:I

    .line 115
    .line 116
    if-ne v4, v1, :cond_8

    .line 117
    .line 118
    if-eqz v2, :cond_8

    .line 119
    .line 120
    or-int/lit8 v0, v0, 0x2

    .line 121
    .line 122
    :cond_8
    if-nez v0, :cond_a

    .line 123
    .line 124
    iget-object v1, p2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 125
    .line 126
    const-string v2, "video/dolby-vision"

    .line 127
    .line 128
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_a

    .line 133
    .line 134
    invoke-static {p1}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {p2}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v1, :cond_9

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Integer;

    .line 149
    .line 150
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_a

    .line 157
    .line 158
    :cond_9
    or-int/lit8 v0, v0, 0x2

    .line 159
    .line 160
    :cond_a
    if-nez v0, :cond_c

    .line 161
    .line 162
    new-instance v1, Ldefpackage/ej0;

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ldefpackage/tb1;->b(Ldefpackage/tb1;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_b

    .line 169
    .line 170
    const/4 v0, 0x3

    .line 171
    :goto_1
    move v5, v0

    .line 172
    goto :goto_2

    .line 173
    :cond_b
    const/4 v0, 0x2

    .line 174
    goto :goto_1

    .line 175
    :goto_2
    const/4 v6, 0x0

    .line 176
    iget-object v2, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 177
    .line 178
    move-object v3, p1

    .line 179
    move-object v4, p2

    .line 180
    invoke-direct/range {v1 .. v6}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_c
    move-object v4, p1

    .line 185
    move-object v5, p2

    .line 186
    :cond_d
    move v7, v0

    .line 187
    goto/16 :goto_3

    .line 188
    .line 189
    :cond_e
    move-object v4, p1

    .line 190
    move-object v5, p2

    .line 191
    iget p1, v4, Ldefpackage/tb1;->F:I

    .line 192
    .line 193
    iget p2, v5, Ldefpackage/tb1;->F:I

    .line 194
    .line 195
    if-eq p1, p2, :cond_f

    .line 196
    .line 197
    or-int/lit16 v0, v0, 0x1000

    .line 198
    .line 199
    :cond_f
    iget p1, v4, Ldefpackage/tb1;->G:I

    .line 200
    .line 201
    iget p2, v5, Ldefpackage/tb1;->G:I

    .line 202
    .line 203
    if-eq p1, p2, :cond_10

    .line 204
    .line 205
    or-int/lit16 v0, v0, 0x2000

    .line 206
    .line 207
    :cond_10
    iget p1, v4, Ldefpackage/tb1;->H:I

    .line 208
    .line 209
    iget p2, v5, Ldefpackage/tb1;->H:I

    .line 210
    .line 211
    if-eq p1, p2, :cond_11

    .line 212
    .line 213
    or-int/lit16 v0, v0, 0x4000

    .line 214
    .line 215
    :cond_11
    iget-object p1, p0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 216
    .line 217
    if-nez v0, :cond_14

    .line 218
    .line 219
    const-string p2, "audio/mp4a-latm"

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    const-string v1, "audio/ac4"

    .line 226
    .line 227
    if-nez p2, :cond_12

    .line 228
    .line 229
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p2

    .line 233
    if-eqz p2, :cond_14

    .line 234
    .line 235
    :cond_12
    invoke-static {v4}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-static {v5}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-eqz p2, :cond_14

    .line 244
    .line 245
    if-eqz v2, :cond_14

    .line 246
    .line 247
    iget-object v3, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, Ljava/lang/Integer;

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    iget-object v6, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v6, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    const/16 v7, 0x2a

    .line 264
    .line 265
    if-ne v3, v7, :cond_13

    .line 266
    .line 267
    if-ne v6, v7, :cond_13

    .line 268
    .line 269
    new-instance v2, Ldefpackage/ej0;

    .line 270
    .line 271
    const/4 v6, 0x3

    .line 272
    const/4 v7, 0x0

    .line 273
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 274
    .line 275
    invoke-direct/range {v2 .. v7}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 276
    .line 277
    .line 278
    return-object v2

    .line 279
    :cond_13
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_14

    .line 284
    .line 285
    invoke-virtual {p2, v2}, Landroid/util/Pair;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    if-eqz p2, :cond_14

    .line 290
    .line 291
    new-instance v2, Ldefpackage/ej0;

    .line 292
    .line 293
    const/4 v6, 0x3

    .line 294
    const/4 v7, 0x0

    .line 295
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 296
    .line 297
    invoke-direct/range {v2 .. v7}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 298
    .line 299
    .line 300
    return-object v2

    .line 301
    :cond_14
    if-nez v0, :cond_16

    .line 302
    .line 303
    const-string p2, "audio/eac3-joc"

    .line 304
    .line 305
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p2

    .line 309
    if-nez p2, :cond_15

    .line 310
    .line 311
    const-string p2, "audio/eac3"

    .line 312
    .line 313
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    if-eqz p2, :cond_16

    .line 318
    .line 319
    :cond_15
    new-instance v2, Ldefpackage/ej0;

    .line 320
    .line 321
    const/4 v6, 0x3

    .line 322
    const/4 v7, 0x0

    .line 323
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 324
    .line 325
    invoke-direct/range {v2 .. v7}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 326
    .line 327
    .line 328
    return-object v2

    .line 329
    :cond_16
    invoke-virtual {v4, v5}, Ldefpackage/tb1;->b(Ldefpackage/tb1;)Z

    .line 330
    .line 331
    .line 332
    move-result p2

    .line 333
    if-nez p2, :cond_17

    .line 334
    .line 335
    or-int/lit8 v0, v0, 0x20

    .line 336
    .line 337
    :cond_17
    const-string p2, "audio/opus"

    .line 338
    .line 339
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_18

    .line 344
    .line 345
    or-int/lit8 p1, v0, 0x2

    .line 346
    .line 347
    move v0, p1

    .line 348
    :cond_18
    if-nez v0, :cond_d

    .line 349
    .line 350
    new-instance v2, Ldefpackage/ej0;

    .line 351
    .line 352
    const/4 v6, 0x1

    .line 353
    const/4 v7, 0x0

    .line 354
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 355
    .line 356
    invoke-direct/range {v2 .. v7}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 357
    .line 358
    .line 359
    return-object v2

    .line 360
    :goto_3
    new-instance v2, Ldefpackage/ej0;

    .line 361
    .line 362
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 363
    .line 364
    const/4 v6, 0x0

    .line 365
    invoke-direct/range {v2 .. v7}, Ldefpackage/ej0;-><init>(Ljava/lang/String;Ldefpackage/tb1;Ldefpackage/tb1;II)V

    .line 366
    .line 367
    .line 368
    return-object v2
.end method

.method public final c(Landroid/content/Context;Ldefpackage/tb1;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static {v1}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v4, -0x1

    .line 12
    const-string v5, "video/hevc"

    .line 13
    .line 14
    iget-object v6, v0, Ldefpackage/dk2;->c:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v7, 0x1

    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    const-string v8, "video/mv-hevc"

    .line 20
    .line 21
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    if-eqz v9, :cond_2

    .line 26
    .line 27
    invoke-static {v6}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    goto/16 :goto_8

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    sget-object v2, Ldefpackage/jk2;->a:Ljava/util/HashMap;

    .line 46
    .line 47
    iget-object v2, v1, Ldefpackage/tb1;->q:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v2}, Ldefpackage/uc5;->q(Ljava/util/List;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    sget-object v9, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 62
    .line 63
    const-string v9, "\\."

    .line 64
    .line 65
    invoke-virtual {v8, v9, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    iget-object v9, v1, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 70
    .line 71
    invoke-static {v2, v8, v9}, Ldefpackage/i40;->c(Ljava/lang/String;[Ljava/lang/String;Ldefpackage/c50;)Landroid/util/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_3
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const-string v9, "video/dolby-vision"

    .line 96
    .line 97
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    const/16 v9, 0x8

    .line 102
    .line 103
    const/4 v10, 0x2

    .line 104
    iget-object v11, v0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    sparse-switch v3, :sswitch_data_0

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :sswitch_0
    const-string v3, "video/avc"

    .line 121
    .line 122
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    move v4, v10

    .line 130
    goto :goto_1

    .line 131
    :sswitch_1
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_5

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    move v4, v7

    .line 139
    goto :goto_1

    .line 140
    :sswitch_2
    const-string v3, "video/av01"

    .line 141
    .line 142
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_6

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    move v4, v12

    .line 150
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :pswitch_0
    move v8, v9

    .line 155
    :goto_2
    move v2, v12

    .line 156
    goto :goto_3

    .line 157
    :pswitch_1
    move v8, v10

    .line 158
    goto :goto_2

    .line 159
    :cond_7
    :goto_3
    iget-boolean v3, v0, Ldefpackage/dk2;->i:Z

    .line 160
    .line 161
    const-string v4, "audio/ac4"

    .line 162
    .line 163
    if-nez v3, :cond_8

    .line 164
    .line 165
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_8

    .line 170
    .line 171
    const/16 v3, 0x2a

    .line 172
    .line 173
    if-eq v8, v3, :cond_8

    .line 174
    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_8
    iget-object v3, v0, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 178
    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    iget-object v13, v3, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 182
    .line 183
    if-nez v13, :cond_a

    .line 184
    .line 185
    :cond_9
    new-array v13, v12, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 186
    .line 187
    :cond_a
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_e

    .line 192
    .line 193
    array-length v4, v13

    .line 194
    if-nez v4, :cond_e

    .line 195
    .line 196
    if-eqz v3, :cond_b

    .line 197
    .line 198
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-eqz v3, :cond_b

    .line 203
    .line 204
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    goto :goto_4

    .line 209
    :cond_b
    move v3, v10

    .line 210
    :goto_4
    const/16 v4, 0x12

    .line 211
    .line 212
    if-le v3, v4, :cond_c

    .line 213
    .line 214
    const/16 v9, 0x10

    .line 215
    .line 216
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    const-string v4, "android.hardware.type.automotive"

    .line 221
    .line 222
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    const/16 v4, 0x402

    .line 227
    .line 228
    if-eqz v3, :cond_d

    .line 229
    .line 230
    invoke-static {v4, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    filled-new-array {v3}, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    :goto_5
    move-object v13, v3

    .line 239
    goto :goto_6

    .line 240
    :cond_d
    const/16 v3, 0x101

    .line 241
    .line 242
    invoke-static {v3, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    const/16 v13, 0x201

    .line 247
    .line 248
    invoke-static {v13, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    const/16 v14, 0x202

    .line 253
    .line 254
    invoke-static {v14, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    invoke-static {v4, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    const/16 v15, 0x404

    .line 263
    .line 264
    invoke-static {v15, v9}, Ldefpackage/jk2;->b(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    filled-new-array {v3, v13, v14, v4, v9}, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    goto :goto_5

    .line 273
    :cond_e
    :goto_6
    array-length v3, v13

    .line 274
    move v4, v12

    .line 275
    :goto_7
    if-ge v4, v3, :cond_12

    .line 276
    .line 277
    aget-object v9, v13, v4

    .line 278
    .line 279
    iget v14, v9, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 280
    .line 281
    if-ne v14, v8, :cond_11

    .line 282
    .line 283
    iget v9, v9, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 284
    .line 285
    if-ge v9, v2, :cond_f

    .line 286
    .line 287
    if-nez p3, :cond_11

    .line 288
    .line 289
    :cond_f
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-eqz v9, :cond_10

    .line 294
    .line 295
    if-ne v10, v8, :cond_10

    .line 296
    .line 297
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 298
    .line 299
    const-string v14, "sailfish"

    .line 300
    .line 301
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v14

    .line 305
    if-nez v14, :cond_11

    .line 306
    .line 307
    const-string v14, "marlin"

    .line 308
    .line 309
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    if-eqz v9, :cond_10

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_10
    :goto_8
    return v7

    .line 317
    :cond_11
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    const-string v3, "codec.profileLevel, "

    .line 323
    .line 324
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    iget-object v1, v1, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v1, ", "

    .line 333
    .line 334
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v0, v1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    return v12

    .line 348
    nop

    .line 349
    :sswitch_data_0
    .sparse-switch
        -0x631b55f6 -> :sswitch_2
        -0x63185e82 -> :sswitch_1
        0x4f62373a -> :sswitch_0
    .end sparse-switch

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ldefpackage/tb1;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/flac"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget p1, p1, Ldefpackage/tb1;->H:I

    .line 12
    .line 13
    const/16 v0, 0x16

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-ge p1, v0, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 24
    .line 25
    const-string p1, "c2.android.flac.decoder"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final e(Landroid/content/Context;Ldefpackage/tb1;)Z
    .locals 6

    .line 1
    iget-object v0, p2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {p2}, Ldefpackage/jk2;->c(Ldefpackage/tb1;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v2

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, p1, p2, v0}, Ldefpackage/dk2;->c(Landroid/content/Context;Ldefpackage/tb1;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0, p2}, Ldefpackage/dk2;->d(Ldefpackage/tb1;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    :goto_1
    return v2

    .line 39
    :cond_3
    iget-boolean p1, p0, Ldefpackage/dk2;->i:Z

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iget p1, p2, Ldefpackage/tb1;->u:I

    .line 44
    .line 45
    if-lez p1, :cond_10

    .line 46
    .line 47
    iget v1, p2, Ldefpackage/tb1;->v:I

    .line 48
    .line 49
    if-gtz v1, :cond_4

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_4
    iget p2, p2, Ldefpackage/tb1;->y:F

    .line 54
    .line 55
    float-to-double v2, p2

    .line 56
    invoke-virtual {p0, p1, v1, v2, v3}, Ldefpackage/dk2;->g(IID)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0

    .line 61
    :cond_5
    iget p1, p2, Ldefpackage/tb1;->G:I

    .line 62
    .line 63
    iget-object v3, p0, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 64
    .line 65
    const/4 v4, -0x1

    .line 66
    if-eq p1, v4, :cond_8

    .line 67
    .line 68
    if-nez v3, :cond_6

    .line 69
    .line 70
    const-string p1, "sampleRate.caps"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v2

    .line 76
    :cond_6
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-nez v5, :cond_7

    .line 81
    .line 82
    const-string p1, "sampleRate.aCaps"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return v2

    .line 88
    :cond_7
    invoke-virtual {v5, p1}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-nez v5, :cond_8

    .line 93
    .line 94
    new-instance p2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v0, "sampleRate.support, "

    .line 97
    .line 98
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return v2

    .line 112
    :cond_8
    iget p1, p2, Ldefpackage/tb1;->F:I

    .line 113
    .line 114
    if-eq p1, v4, :cond_10

    .line 115
    .line 116
    if-nez v3, :cond_9

    .line 117
    .line 118
    const-string p1, "channelCount.caps"

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return v2

    .line 124
    :cond_9
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-nez p2, :cond_a

    .line 129
    .line 130
    const-string p1, "channelCount.aCaps"

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return v2

    .line 136
    :cond_a
    invoke-virtual {p2}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-gt p2, v0, :cond_f

    .line 141
    .line 142
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 143
    .line 144
    const/16 v4, 0x1a

    .line 145
    .line 146
    if-lt v3, v4, :cond_b

    .line 147
    .line 148
    if-lez p2, :cond_b

    .line 149
    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :cond_b
    const-string v3, "audio/mpeg"

    .line 153
    .line 154
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_f

    .line 159
    .line 160
    const-string v3, "audio/3gpp"

    .line 161
    .line 162
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_f

    .line 167
    .line 168
    const-string v3, "audio/amr-wb"

    .line 169
    .line 170
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-nez v3, :cond_f

    .line 175
    .line 176
    const-string v3, "audio/mp4a-latm"

    .line 177
    .line 178
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_f

    .line 183
    .line 184
    const-string v3, "audio/vorbis"

    .line 185
    .line 186
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_f

    .line 191
    .line 192
    const-string v3, "audio/opus"

    .line 193
    .line 194
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_f

    .line 199
    .line 200
    const-string v3, "audio/raw"

    .line 201
    .line 202
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_f

    .line 207
    .line 208
    const-string v3, "audio/flac"

    .line 209
    .line 210
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_f

    .line 215
    .line 216
    const-string v3, "audio/g711-alaw"

    .line 217
    .line 218
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_f

    .line 223
    .line 224
    const-string v3, "audio/g711-mlaw"

    .line 225
    .line 226
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-nez v3, :cond_f

    .line 231
    .line 232
    const-string v3, "audio/gsm"

    .line 233
    .line 234
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_c

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_c
    const-string v3, "audio/ac3"

    .line 242
    .line 243
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_d

    .line 248
    .line 249
    const/4 v1, 0x6

    .line 250
    goto :goto_2

    .line 251
    :cond_d
    const-string v3, "audio/eac3"

    .line 252
    .line 253
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_e

    .line 258
    .line 259
    const/16 v1, 0x10

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_e
    const/16 v1, 0x1e

    .line 263
    .line 264
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v4, "AssumedMaxChannelAdjustment: "

    .line 267
    .line 268
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object v4, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v4, ", ["

    .line 277
    .line 278
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p2, " to "

    .line 285
    .line 286
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string p2, "]"

    .line 293
    .line 294
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    const-string v3, "MediaCodecInfo"

    .line 302
    .line 303
    invoke-static {v3, p2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    move p2, v1

    .line 307
    :cond_f
    :goto_3
    if-ge p2, p1, :cond_10

    .line 308
    .line 309
    new-instance p2, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v0, "channelCount.support, "

    .line 312
    .line 313
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return v2

    .line 327
    :cond_10
    :goto_4
    return v0
.end method

.method public final f(Ldefpackage/tb1;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/dk2;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/dk2;->e:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    invoke-static {p1}, Ldefpackage/i40;->b(Ldefpackage/tb1;)Landroid/util/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/16 p1, 0x2a

    .line 23
    .line 24
    if-ne p0, p1, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final g(IID)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ldefpackage/dk2;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-string p1, "sizeAndRate.caps"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string p1, "sizeAndRate.vCaps"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v3, 0x1d

    .line 27
    .line 28
    const-string v4, "@"

    .line 29
    .line 30
    const-string v5, "x"

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-lt v2, v3, :cond_e

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    if-lt v2, v3, :cond_b

    .line 37
    .line 38
    sget-object v3, Ldefpackage/uc5;->j:Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_2
    invoke-static {v1}, Ldefpackage/yj1;->e(Landroid/media/MediaCodecInfo$VideoCapabilities;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_b

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_3
    invoke-static {}, Ldefpackage/ek2;->m()V

    .line 64
    .line 65
    .line 66
    double-to-int v8, p3

    .line 67
    invoke-static {p1, p2, v8}, Ldefpackage/ek2;->h(III)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    move v9, v0

    .line 72
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-ge v9, v10, :cond_5

    .line 77
    .line 78
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-static {v10}, Ldefpackage/yj1;->c(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-static {v10, v8}, Ldefpackage/ek2;->t(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_4

    .line 91
    .line 92
    move v3, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    move v3, v6

    .line 98
    :goto_1
    if-ne v3, v6, :cond_c

    .line 99
    .line 100
    sget-object v8, Ldefpackage/uc5;->j:Ljava/lang/Boolean;

    .line 101
    .line 102
    if-nez v8, :cond_c

    .line 103
    .line 104
    const/16 v8, 0x23

    .line 105
    .line 106
    if-lt v2, v8, :cond_6

    .line 107
    .line 108
    move v2, v7

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    invoke-static {v0}, Ldefpackage/q05;->k(Z)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    :goto_2
    invoke-static {v6}, Ldefpackage/q05;->k(Z)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-nez v2, :cond_8

    .line 119
    .line 120
    :cond_7
    :goto_3
    move v2, v6

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    if-nez v8, :cond_a

    .line 123
    .line 124
    if-eq v2, v7, :cond_9

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_9
    move v2, v0

    .line 128
    goto :goto_4

    .line 129
    :cond_a
    if-ne v2, v7, :cond_7

    .line 130
    .line 131
    if-eq v8, v7, :cond_9

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    sput-object v8, Ldefpackage/uc5;->j:Ljava/lang/Boolean;

    .line 139
    .line 140
    if-eqz v2, :cond_c

    .line 141
    .line 142
    :cond_b
    :goto_5
    move v3, v0

    .line 143
    :cond_c
    if-ne v3, v7, :cond_d

    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :cond_d
    if-ne v3, v6, :cond_e

    .line 148
    .line 149
    const-string v1, "sizeAndRate.cover, "

    .line 150
    .line 151
    invoke-static {v1, v5, p1, p2, v4}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return v0

    .line 166
    :cond_e
    invoke-static {v1, p1, p2, p3, p4}, Ldefpackage/dk2;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_12

    .line 171
    .line 172
    if-ge p1, p2, :cond_11

    .line 173
    .line 174
    const-string v2, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 175
    .line 176
    iget-object v3, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_f

    .line 183
    .line 184
    const-string v2, "mcv5a"

    .line 185
    .line 186
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_f

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_f
    invoke-static {v1, p2, p1, p3, p4}, Ldefpackage/dk2;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_10

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_10
    const-string v0, "sizeAndRate.rotated, "

    .line 203
    .line 204
    invoke-static {v0, v5, p1, p2, v4}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const-string p2, ", "

    .line 216
    .line 217
    const-string p3, "AssumedSupport ["

    .line 218
    .line 219
    const-string p4, "] ["

    .line 220
    .line 221
    invoke-static {p3, p1, p4, v3, p2}, Ldefpackage/b11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object p0, p0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string p0, "]"

    .line 239
    .line 240
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    const-string p1, "MediaCodecInfo"

    .line 248
    .line 249
    invoke-static {p1, p0}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return v6

    .line 253
    :cond_11
    :goto_6
    const-string v1, "sizeAndRate.support, "

    .line 254
    .line 255
    invoke-static {v1, v5, p1, p2, v4}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p0, p1}, Ldefpackage/dk2;->h(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return v0

    .line 270
    :cond_12
    :goto_7
    return v6
.end method

.method public final h(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "NoSupport ["

    .line 2
    .line 3
    const-string v1, "] ["

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, ", "

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, "]"

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "MediaCodecInfo"

    .line 42
    .line 43
    invoke-static {p1, p0}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.class public abstract Luc5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lf01;

.field public static final b:Lf01;

.field public static final c:[B

.field public static final d:[F

.field public static final e:Ljava/lang/Object;

.field public static f:[I = null

.field public static final g:[I

.field public static final h:[I

.field public static volatile i:Z = true

.field public static j:Ljava/lang/Boolean;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lf01;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "UNDEFINED"

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lf01;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Luc5;->a:Lf01;

    .line 10
    .line 11
    new-instance v0, Lf01;

    .line 12
    .line 13
    const-string v2, "REUSABLE_CLAIMED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lf01;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Luc5;->b:Lf01;

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    new-array v0, v0, [B

    .line 22
    .line 23
    fill-array-data v0, :array_0

    .line 24
    .line 25
    .line 26
    sput-object v0, Luc5;->c:[B

    .line 27
    .line 28
    const/16 v0, 0x11

    .line 29
    .line 30
    new-array v0, v0, [F

    .line 31
    .line 32
    fill-array-data v0, :array_1

    .line 33
    .line 34
    .line 35
    sput-object v0, Luc5;->d:[F

    .line 36
    .line 37
    new-instance v0, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Luc5;->e:Ljava/lang/Object;

    .line 43
    .line 44
    const/16 v0, 0xa

    .line 45
    .line 46
    new-array v0, v0, [I

    .line 47
    .line 48
    sput-object v0, Luc5;->f:[I

    .line 49
    .line 50
    const v0, 0x7f04012d

    .line 51
    .line 52
    .line 53
    filled-new-array {v0}, [I

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Luc5;->g:[I

    .line 58
    .line 59
    const v0, 0x7f040134

    .line 60
    .line 61
    .line 62
    filled-new-array {v0}, [I

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Luc5;->h:[I

    .line 67
    .line 68
    return-void

    .line 69
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static A(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lud0;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lud0;->b:Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Lud0;->a(Landroid/content/res/Configuration;)V

    .line 19
    .line 20
    .line 21
    move-object p0, v0

    .line 22
    :cond_0
    invoke-static {p0, p1}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static B(Ljava/lang/Object;)Lzd3;
    .locals 2

    .line 1
    sget-object v0, Lrv2;->D:Lrv2;

    .line 2
    .line 3
    new-instance v1, Lzd3;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static C(Ltb1;)I
    .locals 1

    .line 1
    invoke-static {p0}, Luc5;->r(Ltb1;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "video/avc"

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const-string v0, "video/hevc"

    .line 16
    .line 17
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static varargs D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    .locals 0

    .line 1
    invoke-static {p0, p1, p3, p4}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p5}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static varargs E(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ljv3;
    .locals 0

    .line 1
    invoke-static {p0, p1, p3, p4}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p5}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 5
    .line 6
    .line 7
    new-instance p5, Ljv3;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p5, p0, p1}, Ljv3;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 14
    .line 15
    .line 16
    return-object p5
.end method

.method public static F(Lh00;)Lv2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh00;->s()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, Lh00;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lh00;->i(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-virtual {p0, v2}, Lh00;->i(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    add-int/lit8 p0, p0, -0x1

    .line 19
    .line 20
    new-instance v2, Lv2;

    .line 21
    .line 22
    invoke-direct {v2, v1, v0, p0}, Lv2;-><init>(III)V

    .line 23
    .line 24
    .line 25
    return-object v2
.end method

.method public static G(Lh00;ZILp13;)Lp13;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Lh00;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lh00;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, 0x5

    .line 25
    invoke-virtual {v0, v9}, Lh00;->i(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    move v10, v7

    .line 30
    move v11, v10

    .line 31
    :goto_0
    const/16 v12, 0x20

    .line 32
    .line 33
    if-ge v10, v12, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lh00;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_0

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    shl-int/2addr v12, v10

    .line 43
    or-int/2addr v11, v12

    .line 44
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v10, v7

    .line 48
    :goto_1
    if-ge v10, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lh00;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    aput v12, v4, v10

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v13, v2

    .line 60
    :goto_2
    move-object/from16 v17, v4

    .line 61
    .line 62
    move v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v11

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    iget v3, v2, Lp13;->a:I

    .line 70
    .line 71
    iget-boolean v8, v2, Lp13;->b:Z

    .line 72
    .line 73
    iget v9, v2, Lp13;->c:I

    .line 74
    .line 75
    iget v11, v2, Lp13;->d:I

    .line 76
    .line 77
    iget-object v4, v2, Lp13;->e:[I

    .line 78
    .line 79
    move v13, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object/from16 v17, v4

    .line 82
    .line 83
    move v13, v7

    .line 84
    move v14, v13

    .line 85
    move v15, v14

    .line 86
    move/from16 v16, v15

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v0, v6}, Lh00;->i(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    move v2, v7

    .line 93
    :goto_4
    if-ge v7, v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, Lh00;->h()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x58

    .line 102
    .line 103
    :cond_5
    invoke-virtual {v0}, Lh00;->h()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x8

    .line 110
    .line 111
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {v0, v2}, Lh00;->t(I)V

    .line 115
    .line 116
    .line 117
    if-lez v1, :cond_8

    .line 118
    .line 119
    sub-int/2addr v6, v1

    .line 120
    mul-int/2addr v6, v5

    .line 121
    invoke-virtual {v0, v6}, Lh00;->t(I)V

    .line 122
    .line 123
    .line 124
    :cond_8
    new-instance v12, Lp13;

    .line 125
    .line 126
    invoke-direct/range {v12 .. v18}, Lp13;-><init>(IZII[II)V

    .line 127
    .line 128
    .line 129
    return-object v12
.end method

.method public static H([BII)Lcx;
    .locals 8

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    :goto_0
    aget-byte v0, p0, p2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-le p2, p1, :cond_0

    .line 10
    .line 11
    add-int/lit8 p2, p2, -0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-eqz v0, :cond_e

    .line 15
    .line 16
    if-gt p2, p1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_1
    new-instance v0, Lh00;

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2}, Lh00;-><init>([BII)V

    .line 25
    .line 26
    .line 27
    :goto_1
    const/16 p0, 0x10

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lh00;->d(I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_e

    .line 34
    .line 35
    const/16 p0, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lh00;->i(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 p2, 0x0

    .line 42
    move v1, p2

    .line 43
    :goto_2
    const/16 v2, 0xff

    .line 44
    .line 45
    if-ne p1, v2, :cond_2

    .line 46
    .line 47
    add-int/lit16 v1, v1, 0xff

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lh00;->i(I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    add-int/2addr v1, p1

    .line 55
    invoke-virtual {v0, p0}, Lh00;->i(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move v3, p2

    .line 60
    :goto_3
    if-ne p1, v2, :cond_3

    .line 61
    .line 62
    add-int/lit16 v3, v3, 0xff

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Lh00;->i(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    add-int/2addr v3, p1

    .line 70
    if-eqz v3, :cond_e

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Lh00;->d(I)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    goto/16 :goto_8

    .line 79
    .line 80
    :cond_4
    const/16 p0, 0xb0

    .line 81
    .line 82
    if-ne v1, p0, :cond_d

    .line 83
    .line 84
    invoke-virtual {v0}, Lh00;->m()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {v0}, Lh00;->h()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0}, Lh00;->m()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_4

    .line 99
    :cond_5
    move v1, p2

    .line 100
    :goto_4
    invoke-virtual {v0}, Lh00;->m()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, -0x1

    .line 105
    move v4, p2

    .line 106
    :goto_5
    if-gt v4, v2, :cond_c

    .line 107
    .line 108
    invoke-virtual {v0}, Lh00;->m()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v0}, Lh00;->m()I

    .line 113
    .line 114
    .line 115
    const/4 v5, 0x6

    .line 116
    invoke-virtual {v0, v5}, Lh00;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    const/16 v7, 0x3f

    .line 121
    .line 122
    if-ne v6, v7, :cond_6

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :cond_6
    if-nez v6, :cond_7

    .line 126
    .line 127
    add-int/lit8 v6, p0, -0x1e

    .line 128
    .line 129
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    goto :goto_6

    .line 134
    :cond_7
    add-int/2addr v6, p0

    .line 135
    add-int/lit8 v6, v6, -0x1f

    .line 136
    .line 137
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    :goto_6
    invoke-virtual {v0, v6}, Lh00;->i(I)I

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_a

    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lh00;->i(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-ne v5, v7, :cond_8

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_8
    if-nez v5, :cond_9

    .line 154
    .line 155
    add-int/lit8 v5, v1, -0x1e

    .line 156
    .line 157
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    goto :goto_7

    .line 162
    :cond_9
    add-int/2addr v5, v1

    .line 163
    add-int/lit8 v5, v5, -0x1f

    .line 164
    .line 165
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    :goto_7
    invoke-virtual {v0, v5}, Lh00;->i(I)I

    .line 170
    .line 171
    .line 172
    :cond_a
    invoke-virtual {v0}, Lh00;->h()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eqz v5, :cond_b

    .line 177
    .line 178
    const/16 v5, 0xa

    .line 179
    .line 180
    invoke-virtual {v0, v5}, Lh00;->t(I)V

    .line 181
    .line 182
    .line 183
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_c
    new-instance p0, Lcx;

    .line 187
    .line 188
    invoke-direct {p0, v3}, Lcx;-><init>(I)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_d
    mul-int/lit8 v3, v3, 0x8

    .line 193
    .line 194
    invoke-virtual {v0, v3}, Lh00;->t(I)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_e
    :goto_8
    const/4 p0, 0x0

    .line 200
    return-object p0
.end method

.method public static I([BIILss0;)Lr13;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Lh00;

    .line 10
    .line 11
    invoke-direct {v4, v0, v1, v2}, Lh00;-><init>([BII)V

    .line 12
    .line 13
    .line 14
    invoke-static {v4}, Luc5;->F(Lh00;)Lv2;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x2

    .line 19
    add-int/2addr v1, v5

    .line 20
    new-instance v6, Lh00;

    .line 21
    .line 22
    invoke-direct {v6, v0, v1, v2}, Lh00;-><init>([BII)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-virtual {v6, v0}, Lh00;->t(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    invoke-virtual {v6, v1}, Lh00;->i(I)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget v2, v4, Lv2;->b:I

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    const/4 v9, 0x7

    .line 40
    if-ne v8, v9, :cond_0

    .line 41
    .line 42
    move v9, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v9, 0x0

    .line 45
    :goto_0
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object v10, v3, Lss0;->n:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, Lyw1;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-nez v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    sub-int/2addr v11, v4

    .line 62
    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lo13;

    .line 71
    .line 72
    iget v2, v2, Lo13;->a:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v2, 0x0

    .line 76
    :goto_1
    const/4 v10, 0x0

    .line 77
    if-nez v9, :cond_2

    .line 78
    .line 79
    invoke-virtual {v6}, Lh00;->s()V

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v4, v8, v10}, Luc5;->G(Lh00;ZILp13;)Lp13;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iget-object v11, v3, Lss0;->o:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v11, Lxc5;

    .line 92
    .line 93
    iget-object v12, v11, Lxc5;->p:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v12, [I

    .line 96
    .line 97
    iget-object v11, v11, Lxc5;->o:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v11, Lyw1;

    .line 100
    .line 101
    aget v12, v12, v2

    .line 102
    .line 103
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    if-le v13, v12, :cond_3

    .line 108
    .line 109
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    check-cast v10, Lp13;

    .line 114
    .line 115
    :cond_3
    :goto_2
    invoke-virtual {v6}, Lh00;->m()I

    .line 116
    .line 117
    .line 118
    const/16 v11, 0x8

    .line 119
    .line 120
    const/4 v12, -0x1

    .line 121
    if-eqz v9, :cond_7

    .line 122
    .line 123
    invoke-virtual {v6}, Lh00;->h()Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    if-eqz v13, :cond_4

    .line 128
    .line 129
    invoke-virtual {v6, v11}, Lh00;->i(I)I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move v13, v12

    .line 135
    :goto_3
    if-eqz v3, :cond_6

    .line 136
    .line 137
    iget-object v14, v3, Lss0;->p:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v14, Lhd5;

    .line 140
    .line 141
    if-eqz v14, :cond_6

    .line 142
    .line 143
    iget-object v15, v14, Lhd5;->o:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v15, Lyw1;

    .line 146
    .line 147
    if-ne v13, v12, :cond_5

    .line 148
    .line 149
    iget-object v13, v14, Lhd5;->p:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v13, [I

    .line 152
    .line 153
    aget v13, v13, v2

    .line 154
    .line 155
    :cond_5
    if-eq v13, v12, :cond_6

    .line 156
    .line 157
    invoke-virtual {v15}, Ljava/util/AbstractCollection;->size()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-le v14, v13, :cond_6

    .line 162
    .line 163
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    check-cast v13, Lq13;

    .line 168
    .line 169
    iget v14, v13, Lq13;->a:I

    .line 170
    .line 171
    iget v14, v13, Lq13;->d:I

    .line 172
    .line 173
    iget v15, v13, Lq13;->e:I

    .line 174
    .line 175
    iget v12, v13, Lq13;->b:I

    .line 176
    .line 177
    iget v13, v13, Lq13;->c:I

    .line 178
    .line 179
    move/from16 v16, v15

    .line 180
    .line 181
    move/from16 v17, v16

    .line 182
    .line 183
    move v15, v14

    .line 184
    goto/16 :goto_8

    .line 185
    .line 186
    :cond_6
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    const/16 v16, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_7
    invoke-virtual {v6}, Lh00;->m()I

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-ne v12, v1, :cond_8

    .line 200
    .line 201
    invoke-virtual {v6}, Lh00;->s()V

    .line 202
    .line 203
    .line 204
    :cond_8
    invoke-virtual {v6}, Lh00;->m()I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    invoke-virtual {v6}, Lh00;->m()I

    .line 209
    .line 210
    .line 211
    move-result v15

    .line 212
    invoke-virtual {v6}, Lh00;->h()Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-eqz v13, :cond_c

    .line 217
    .line 218
    invoke-virtual {v6}, Lh00;->m()I

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    invoke-virtual {v6}, Lh00;->m()I

    .line 223
    .line 224
    .line 225
    move-result v16

    .line 226
    invoke-virtual {v6}, Lh00;->m()I

    .line 227
    .line 228
    .line 229
    move-result v17

    .line 230
    invoke-virtual {v6}, Lh00;->m()I

    .line 231
    .line 232
    .line 233
    move-result v18

    .line 234
    if-eq v12, v4, :cond_a

    .line 235
    .line 236
    if-ne v12, v5, :cond_9

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    move/from16 v19, v4

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_a
    :goto_4
    move/from16 v19, v5

    .line 243
    .line 244
    :goto_5
    add-int v13, v13, v16

    .line 245
    .line 246
    mul-int v13, v13, v19

    .line 247
    .line 248
    sub-int v13, v14, v13

    .line 249
    .line 250
    if-ne v12, v4, :cond_b

    .line 251
    .line 252
    move v12, v5

    .line 253
    goto :goto_6

    .line 254
    :cond_b
    move v12, v4

    .line 255
    :goto_6
    add-int v17, v17, v18

    .line 256
    .line 257
    mul-int v17, v17, v12

    .line 258
    .line 259
    sub-int v12, v15, v17

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_c
    move v13, v14

    .line 263
    move v12, v15

    .line 264
    :goto_7
    invoke-virtual {v6}, Lh00;->m()I

    .line 265
    .line 266
    .line 267
    move-result v16

    .line 268
    invoke-virtual {v6}, Lh00;->m()I

    .line 269
    .line 270
    .line 271
    move-result v17

    .line 272
    move/from16 v31, v16

    .line 273
    .line 274
    move/from16 v16, v12

    .line 275
    .line 276
    move/from16 v12, v31

    .line 277
    .line 278
    move/from16 v31, v14

    .line 279
    .line 280
    move v14, v13

    .line 281
    move/from16 v13, v17

    .line 282
    .line 283
    move/from16 v17, v15

    .line 284
    .line 285
    move/from16 v15, v31

    .line 286
    .line 287
    :goto_8
    invoke-virtual {v6}, Lh00;->m()I

    .line 288
    .line 289
    .line 290
    move-result v18

    .line 291
    if-nez v9, :cond_e

    .line 292
    .line 293
    invoke-virtual {v6}, Lh00;->h()Z

    .line 294
    .line 295
    .line 296
    move-result v19

    .line 297
    if-eqz v19, :cond_d

    .line 298
    .line 299
    const/16 v19, 0x0

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_d
    move/from16 v19, v8

    .line 303
    .line 304
    :goto_9
    move/from16 v7, v19

    .line 305
    .line 306
    const/4 v11, -0x1

    .line 307
    :goto_a
    if-gt v7, v8, :cond_f

    .line 308
    .line 309
    invoke-virtual {v6}, Lh00;->m()I

    .line 310
    .line 311
    .line 312
    invoke-virtual {v6}, Lh00;->m()I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    invoke-virtual {v6}, Lh00;->m()I

    .line 321
    .line 322
    .line 323
    add-int/lit8 v7, v7, 0x1

    .line 324
    .line 325
    const/4 v5, 0x2

    .line 326
    goto :goto_a

    .line 327
    :cond_e
    const/4 v11, -0x1

    .line 328
    :cond_f
    invoke-virtual {v6}, Lh00;->m()I

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6}, Lh00;->m()I

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6}, Lh00;->m()I

    .line 335
    .line 336
    .line 337
    invoke-virtual {v6}, Lh00;->m()I

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6}, Lh00;->m()I

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6}, Lh00;->m()I

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6}, Lh00;->h()Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    if-eqz v5, :cond_11

    .line 351
    .line 352
    if-eqz v9, :cond_10

    .line 353
    .line 354
    invoke-virtual {v6}, Lh00;->h()Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    goto :goto_b

    .line 359
    :cond_10
    const/4 v5, 0x0

    .line 360
    :goto_b
    const/4 v7, 0x6

    .line 361
    if-eqz v5, :cond_12

    .line 362
    .line 363
    invoke-virtual {v6, v7}, Lh00;->t(I)V

    .line 364
    .line 365
    .line 366
    :cond_11
    const/4 v0, 0x2

    .line 367
    goto :goto_11

    .line 368
    :cond_12
    invoke-virtual {v6}, Lh00;->h()Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-eqz v5, :cond_11

    .line 373
    .line 374
    const/4 v5, 0x0

    .line 375
    :goto_c
    if-ge v5, v0, :cond_11

    .line 376
    .line 377
    const/4 v9, 0x0

    .line 378
    :goto_d
    if-ge v9, v7, :cond_17

    .line 379
    .line 380
    invoke-virtual {v6}, Lh00;->h()Z

    .line 381
    .line 382
    .line 383
    move-result v20

    .line 384
    if-nez v20, :cond_13

    .line 385
    .line 386
    invoke-virtual {v6}, Lh00;->m()I

    .line 387
    .line 388
    .line 389
    goto :goto_f

    .line 390
    :cond_13
    shl-int/lit8 v20, v5, 0x1

    .line 391
    .line 392
    add-int/lit8 v20, v20, 0x4

    .line 393
    .line 394
    shl-int v0, v4, v20

    .line 395
    .line 396
    const/16 v7, 0x40

    .line 397
    .line 398
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-le v5, v4, :cond_14

    .line 403
    .line 404
    invoke-virtual {v6}, Lh00;->n()I

    .line 405
    .line 406
    .line 407
    :cond_14
    const/4 v7, 0x0

    .line 408
    :goto_e
    if-ge v7, v0, :cond_15

    .line 409
    .line 410
    invoke-virtual {v6}, Lh00;->n()I

    .line 411
    .line 412
    .line 413
    add-int/lit8 v7, v7, 0x1

    .line 414
    .line 415
    goto :goto_e

    .line 416
    :cond_15
    :goto_f
    if-ne v5, v1, :cond_16

    .line 417
    .line 418
    move v0, v1

    .line 419
    goto :goto_10

    .line 420
    :cond_16
    move v0, v4

    .line 421
    :goto_10
    add-int/2addr v9, v0

    .line 422
    const/4 v0, 0x4

    .line 423
    const/4 v7, 0x6

    .line 424
    goto :goto_d

    .line 425
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 426
    .line 427
    const/4 v0, 0x4

    .line 428
    const/4 v7, 0x6

    .line 429
    goto :goto_c

    .line 430
    :goto_11
    invoke-virtual {v6, v0}, Lh00;->t(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6}, Lh00;->h()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_18

    .line 438
    .line 439
    const/16 v0, 0x8

    .line 440
    .line 441
    invoke-virtual {v6, v0}, Lh00;->t(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6}, Lh00;->m()I

    .line 445
    .line 446
    .line 447
    invoke-virtual {v6}, Lh00;->m()I

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6}, Lh00;->s()V

    .line 451
    .line 452
    .line 453
    :cond_18
    invoke-virtual {v6}, Lh00;->m()I

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    const/4 v5, 0x0

    .line 458
    new-array v7, v5, [I

    .line 459
    .line 460
    new-array v9, v5, [I

    .line 461
    .line 462
    move/from16 p1, v4

    .line 463
    .line 464
    move v4, v5

    .line 465
    const/4 v1, -0x1

    .line 466
    const/4 v5, -0x1

    .line 467
    :goto_12
    if-ge v4, v0, :cond_2a

    .line 468
    .line 469
    if-eqz v4, :cond_25

    .line 470
    .line 471
    invoke-virtual {v6}, Lh00;->h()Z

    .line 472
    .line 473
    .line 474
    move-result v21

    .line 475
    if-eqz v21, :cond_25

    .line 476
    .line 477
    move/from16 v21, v0

    .line 478
    .line 479
    add-int v0, v5, v1

    .line 480
    .line 481
    invoke-virtual {v6}, Lh00;->h()Z

    .line 482
    .line 483
    .line 484
    move-result v22

    .line 485
    invoke-virtual {v6}, Lh00;->m()I

    .line 486
    .line 487
    .line 488
    move-result v23

    .line 489
    add-int/lit8 v23, v23, 0x1

    .line 490
    .line 491
    const/16 v19, 0x2

    .line 492
    .line 493
    mul-int/lit8 v22, v22, 0x2

    .line 494
    .line 495
    rsub-int/lit8 v22, v22, 0x1

    .line 496
    .line 497
    mul-int v22, v22, v23

    .line 498
    .line 499
    move/from16 v23, v2

    .line 500
    .line 501
    add-int/lit8 v2, v0, 0x1

    .line 502
    .line 503
    move/from16 v24, v4

    .line 504
    .line 505
    new-array v4, v2, [Z

    .line 506
    .line 507
    move-object/from16 v25, v4

    .line 508
    .line 509
    const/4 v4, 0x0

    .line 510
    :goto_13
    if-gt v4, v0, :cond_1a

    .line 511
    .line 512
    invoke-virtual {v6}, Lh00;->h()Z

    .line 513
    .line 514
    .line 515
    move-result v26

    .line 516
    if-nez v26, :cond_19

    .line 517
    .line 518
    invoke-virtual {v6}, Lh00;->h()Z

    .line 519
    .line 520
    .line 521
    move-result v26

    .line 522
    aput-boolean v26, v25, v4

    .line 523
    .line 524
    goto :goto_14

    .line 525
    :cond_19
    aput-boolean p1, v25, v4

    .line 526
    .line 527
    :goto_14
    add-int/lit8 v4, v4, 0x1

    .line 528
    .line 529
    goto :goto_13

    .line 530
    :cond_1a
    new-array v4, v2, [I

    .line 531
    .line 532
    new-array v2, v2, [I

    .line 533
    .line 534
    add-int/lit8 v26, v1, -0x1

    .line 535
    .line 536
    const/16 v27, 0x0

    .line 537
    .line 538
    :goto_15
    if-ltz v26, :cond_1c

    .line 539
    .line 540
    aget v28, v9, v26

    .line 541
    .line 542
    add-int v28, v28, v22

    .line 543
    .line 544
    if-gez v28, :cond_1b

    .line 545
    .line 546
    add-int v29, v5, v26

    .line 547
    .line 548
    aget-boolean v29, v25, v29

    .line 549
    .line 550
    if-eqz v29, :cond_1b

    .line 551
    .line 552
    add-int/lit8 v29, v27, 0x1

    .line 553
    .line 554
    aput v28, v4, v27

    .line 555
    .line 556
    move/from16 v27, v29

    .line 557
    .line 558
    :cond_1b
    add-int/lit8 v26, v26, -0x1

    .line 559
    .line 560
    goto :goto_15

    .line 561
    :cond_1c
    if-gez v22, :cond_1d

    .line 562
    .line 563
    aget-boolean v26, v25, v0

    .line 564
    .line 565
    if-eqz v26, :cond_1d

    .line 566
    .line 567
    add-int/lit8 v26, v27, 0x1

    .line 568
    .line 569
    aput v22, v4, v27

    .line 570
    .line 571
    move/from16 v27, v26

    .line 572
    .line 573
    :cond_1d
    move/from16 v26, v0

    .line 574
    .line 575
    move/from16 v0, v27

    .line 576
    .line 577
    move-object/from16 v27, v7

    .line 578
    .line 579
    const/4 v7, 0x0

    .line 580
    :goto_16
    if-ge v7, v5, :cond_1f

    .line 581
    .line 582
    aget v28, v27, v7

    .line 583
    .line 584
    add-int v28, v28, v22

    .line 585
    .line 586
    if-gez v28, :cond_1e

    .line 587
    .line 588
    aget-boolean v29, v25, v7

    .line 589
    .line 590
    if-eqz v29, :cond_1e

    .line 591
    .line 592
    add-int/lit8 v29, v0, 0x1

    .line 593
    .line 594
    aput v28, v4, v0

    .line 595
    .line 596
    move/from16 v0, v29

    .line 597
    .line 598
    :cond_1e
    add-int/lit8 v7, v7, 0x1

    .line 599
    .line 600
    goto :goto_16

    .line 601
    :cond_1f
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    add-int/lit8 v7, v5, -0x1

    .line 606
    .line 607
    const/16 v28, 0x0

    .line 608
    .line 609
    :goto_17
    if-ltz v7, :cond_21

    .line 610
    .line 611
    aget v29, v27, v7

    .line 612
    .line 613
    add-int v29, v29, v22

    .line 614
    .line 615
    if-lez v29, :cond_20

    .line 616
    .line 617
    aget-boolean v30, v25, v7

    .line 618
    .line 619
    if-eqz v30, :cond_20

    .line 620
    .line 621
    add-int/lit8 v30, v28, 0x1

    .line 622
    .line 623
    aput v29, v2, v28

    .line 624
    .line 625
    move/from16 v28, v30

    .line 626
    .line 627
    :cond_20
    add-int/lit8 v7, v7, -0x1

    .line 628
    .line 629
    goto :goto_17

    .line 630
    :cond_21
    if-lez v22, :cond_22

    .line 631
    .line 632
    aget-boolean v7, v25, v26

    .line 633
    .line 634
    if-eqz v7, :cond_22

    .line 635
    .line 636
    add-int/lit8 v7, v28, 0x1

    .line 637
    .line 638
    aput v22, v2, v28

    .line 639
    .line 640
    move/from16 v28, v7

    .line 641
    .line 642
    :cond_22
    move/from16 v26, v0

    .line 643
    .line 644
    move/from16 v7, v28

    .line 645
    .line 646
    const/4 v0, 0x0

    .line 647
    :goto_18
    if-ge v0, v1, :cond_24

    .line 648
    .line 649
    aget v27, v9, v0

    .line 650
    .line 651
    add-int v27, v27, v22

    .line 652
    .line 653
    if-lez v27, :cond_23

    .line 654
    .line 655
    add-int v28, v5, v0

    .line 656
    .line 657
    aget-boolean v28, v25, v28

    .line 658
    .line 659
    if-eqz v28, :cond_23

    .line 660
    .line 661
    add-int/lit8 v28, v7, 0x1

    .line 662
    .line 663
    aput v27, v2, v7

    .line 664
    .line 665
    move/from16 v7, v28

    .line 666
    .line 667
    :cond_23
    add-int/lit8 v0, v0, 0x1

    .line 668
    .line 669
    goto :goto_18

    .line 670
    :cond_24
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    move-object v9, v0

    .line 675
    move v1, v7

    .line 676
    move/from16 v5, v26

    .line 677
    .line 678
    move-object v7, v4

    .line 679
    goto :goto_1d

    .line 680
    :cond_25
    move/from16 v21, v0

    .line 681
    .line 682
    move/from16 v23, v2

    .line 683
    .line 684
    move/from16 v24, v4

    .line 685
    .line 686
    invoke-virtual {v6}, Lh00;->m()I

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    invoke-virtual {v6}, Lh00;->m()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    new-array v2, v0, [I

    .line 695
    .line 696
    const/4 v4, 0x0

    .line 697
    :goto_19
    if-ge v4, v0, :cond_27

    .line 698
    .line 699
    if-lez v4, :cond_26

    .line 700
    .line 701
    add-int/lit8 v5, v4, -0x1

    .line 702
    .line 703
    aget v5, v2, v5

    .line 704
    .line 705
    goto :goto_1a

    .line 706
    :cond_26
    const/4 v5, 0x0

    .line 707
    :goto_1a
    invoke-virtual {v6}, Lh00;->m()I

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    add-int/lit8 v7, v7, 0x1

    .line 712
    .line 713
    sub-int/2addr v5, v7

    .line 714
    aput v5, v2, v4

    .line 715
    .line 716
    invoke-virtual {v6}, Lh00;->s()V

    .line 717
    .line 718
    .line 719
    add-int/lit8 v4, v4, 0x1

    .line 720
    .line 721
    goto :goto_19

    .line 722
    :cond_27
    new-array v4, v1, [I

    .line 723
    .line 724
    const/4 v5, 0x0

    .line 725
    :goto_1b
    if-ge v5, v1, :cond_29

    .line 726
    .line 727
    if-lez v5, :cond_28

    .line 728
    .line 729
    add-int/lit8 v7, v5, -0x1

    .line 730
    .line 731
    aget v7, v4, v7

    .line 732
    .line 733
    goto :goto_1c

    .line 734
    :cond_28
    const/4 v7, 0x0

    .line 735
    :goto_1c
    invoke-virtual {v6}, Lh00;->m()I

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    add-int/lit8 v9, v9, 0x1

    .line 740
    .line 741
    add-int/2addr v9, v7

    .line 742
    aput v9, v4, v5

    .line 743
    .line 744
    invoke-virtual {v6}, Lh00;->s()V

    .line 745
    .line 746
    .line 747
    add-int/lit8 v5, v5, 0x1

    .line 748
    .line 749
    goto :goto_1b

    .line 750
    :cond_29
    move v5, v0

    .line 751
    move-object v7, v2

    .line 752
    move-object v9, v4

    .line 753
    :goto_1d
    add-int/lit8 v4, v24, 0x1

    .line 754
    .line 755
    move/from16 v0, v21

    .line 756
    .line 757
    move/from16 v2, v23

    .line 758
    .line 759
    goto/16 :goto_12

    .line 760
    .line 761
    :cond_2a
    move/from16 v23, v2

    .line 762
    .line 763
    invoke-virtual {v6}, Lh00;->h()Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_2b

    .line 768
    .line 769
    invoke-virtual {v6}, Lh00;->m()I

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    const/4 v7, 0x0

    .line 774
    :goto_1e
    if-ge v7, v0, :cond_2b

    .line 775
    .line 776
    add-int/lit8 v1, v18, 0x5

    .line 777
    .line 778
    invoke-virtual {v6, v1}, Lh00;->t(I)V

    .line 779
    .line 780
    .line 781
    add-int/lit8 v7, v7, 0x1

    .line 782
    .line 783
    goto :goto_1e

    .line 784
    :cond_2b
    const/4 v0, 0x2

    .line 785
    invoke-virtual {v6, v0}, Lh00;->t(I)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v6}, Lh00;->h()Z

    .line 789
    .line 790
    .line 791
    move-result v1

    .line 792
    const/high16 v2, 0x3f800000    # 1.0f

    .line 793
    .line 794
    if-eqz v1, :cond_36

    .line 795
    .line 796
    invoke-virtual {v6}, Lh00;->h()Z

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    if-eqz v1, :cond_2e

    .line 801
    .line 802
    const/16 v1, 0x8

    .line 803
    .line 804
    invoke-virtual {v6, v1}, Lh00;->i(I)I

    .line 805
    .line 806
    .line 807
    move-result v4

    .line 808
    const/16 v1, 0xff

    .line 809
    .line 810
    if-ne v4, v1, :cond_2c

    .line 811
    .line 812
    const/16 v1, 0x10

    .line 813
    .line 814
    invoke-virtual {v6, v1}, Lh00;->i(I)I

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    invoke-virtual {v6, v1}, Lh00;->i(I)I

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    if-eqz v4, :cond_2e

    .line 823
    .line 824
    if-eqz v1, :cond_2e

    .line 825
    .line 826
    int-to-float v2, v4

    .line 827
    int-to-float v1, v1

    .line 828
    div-float/2addr v2, v1

    .line 829
    goto :goto_1f

    .line 830
    :cond_2c
    const/16 v1, 0x11

    .line 831
    .line 832
    if-ge v4, v1, :cond_2d

    .line 833
    .line 834
    sget-object v1, Luc5;->d:[F

    .line 835
    .line 836
    aget v2, v1, v4

    .line 837
    .line 838
    goto :goto_1f

    .line 839
    :cond_2d
    const-string v1, "NalUnitUtil"

    .line 840
    .line 841
    const-string v5, "Unexpected aspect_ratio_idc value: "

    .line 842
    .line 843
    invoke-static {v4, v5, v1}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    :cond_2e
    :goto_1f
    invoke-virtual {v6}, Lh00;->h()Z

    .line 847
    .line 848
    .line 849
    move-result v1

    .line 850
    if-eqz v1, :cond_2f

    .line 851
    .line 852
    invoke-virtual {v6}, Lh00;->s()V

    .line 853
    .line 854
    .line 855
    :cond_2f
    invoke-virtual {v6}, Lh00;->h()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    if-eqz v1, :cond_32

    .line 860
    .line 861
    const/4 v1, 0x3

    .line 862
    invoke-virtual {v6, v1}, Lh00;->t(I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v6}, Lh00;->h()Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-eqz v1, :cond_30

    .line 870
    .line 871
    move/from16 v5, p1

    .line 872
    .line 873
    goto :goto_20

    .line 874
    :cond_30
    move v5, v0

    .line 875
    :goto_20
    invoke-virtual {v6}, Lh00;->h()Z

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    if-eqz v0, :cond_31

    .line 880
    .line 881
    const/16 v0, 0x8

    .line 882
    .line 883
    invoke-virtual {v6, v0}, Lh00;->i(I)I

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    invoke-virtual {v6, v0}, Lh00;->i(I)I

    .line 888
    .line 889
    .line 890
    move-result v3

    .line 891
    invoke-virtual {v6, v0}, Lh00;->t(I)V

    .line 892
    .line 893
    .line 894
    invoke-static {v1}, Lc50;->f(I)I

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    invoke-static {v3}, Lc50;->g(I)I

    .line 899
    .line 900
    .line 901
    move-result v1

    .line 902
    goto :goto_21

    .line 903
    :cond_31
    const/4 v0, -0x1

    .line 904
    const/4 v1, -0x1

    .line 905
    goto :goto_21

    .line 906
    :cond_32
    if-eqz v3, :cond_33

    .line 907
    .line 908
    iget-object v0, v3, Lss0;->q:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, Lwo0;

    .line 911
    .line 912
    if-eqz v0, :cond_33

    .line 913
    .line 914
    iget-object v1, v0, Lwo0;->n:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v1, Lyw1;

    .line 917
    .line 918
    iget-object v0, v0, Lwo0;->o:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v0, [I

    .line 921
    .line 922
    aget v0, v0, v23

    .line 923
    .line 924
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 925
    .line 926
    .line 927
    move-result v3

    .line 928
    if-le v3, v0, :cond_33

    .line 929
    .line 930
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    check-cast v0, Ls13;

    .line 935
    .line 936
    iget v1, v0, Ls13;->a:I

    .line 937
    .line 938
    iget v3, v0, Ls13;->b:I

    .line 939
    .line 940
    iget v0, v0, Ls13;->c:I

    .line 941
    .line 942
    move v5, v1

    .line 943
    move v1, v0

    .line 944
    move v0, v5

    .line 945
    move v5, v3

    .line 946
    goto :goto_21

    .line 947
    :cond_33
    const/4 v0, -0x1

    .line 948
    const/4 v1, -0x1

    .line 949
    const/4 v5, -0x1

    .line 950
    :goto_21
    invoke-virtual {v6}, Lh00;->h()Z

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    if-eqz v3, :cond_34

    .line 955
    .line 956
    invoke-virtual {v6}, Lh00;->m()I

    .line 957
    .line 958
    .line 959
    invoke-virtual {v6}, Lh00;->m()I

    .line 960
    .line 961
    .line 962
    :cond_34
    invoke-virtual {v6}, Lh00;->s()V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v6}, Lh00;->h()Z

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    if-eqz v3, :cond_35

    .line 970
    .line 971
    mul-int/lit8 v16, v16, 0x2

    .line 972
    .line 973
    :cond_35
    move/from16 v18, v0

    .line 974
    .line 975
    move/from16 v20, v1

    .line 976
    .line 977
    move/from16 v19, v5

    .line 978
    .line 979
    move-object v9, v10

    .line 980
    move v10, v12

    .line 981
    move v12, v14

    .line 982
    move v14, v15

    .line 983
    move/from16 v15, v17

    .line 984
    .line 985
    :goto_22
    move/from16 v17, v11

    .line 986
    .line 987
    move v11, v13

    .line 988
    move/from16 v13, v16

    .line 989
    .line 990
    move/from16 v16, v2

    .line 991
    .line 992
    goto :goto_23

    .line 993
    :cond_36
    move-object v9, v10

    .line 994
    move v10, v12

    .line 995
    move v12, v14

    .line 996
    move v14, v15

    .line 997
    move/from16 v15, v17

    .line 998
    .line 999
    const/16 v18, -0x1

    .line 1000
    .line 1001
    const/16 v19, -0x1

    .line 1002
    .line 1003
    const/16 v20, -0x1

    .line 1004
    .line 1005
    goto :goto_22

    .line 1006
    :goto_23
    new-instance v7, Lr13;

    .line 1007
    .line 1008
    invoke-direct/range {v7 .. v20}, Lr13;-><init>(ILp13;IIIIIIFIIII)V

    .line 1009
    .line 1010
    .line 1011
    return-object v7
.end method

.method public static J([BII)Lss0;
    .locals 40

    .line 1
    new-instance v0, Lh00;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lh00;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Luc5;->F(Lh00;)Lv2;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {v0, v1}, Lh00;->t(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lh00;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0}, Lh00;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x6

    .line 28
    invoke-virtual {v0, v4}, Lh00;->i(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    add-int/lit8 v6, v5, 0x1

    .line 33
    .line 34
    const/4 v7, 0x3

    .line 35
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    const/16 v9, 0x11

    .line 40
    .line 41
    invoke-virtual {v0, v9}, Lh00;->t(I)V

    .line 42
    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-static {v0, v9, v8, v10}, Luc5;->G(Lh00;ZILp13;)Lp13;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    invoke-virtual {v0}, Lh00;->h()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    const/4 v13, 0x0

    .line 55
    if-eqz v12, :cond_0

    .line 56
    .line 57
    move v12, v13

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v12, v8

    .line 60
    :goto_0
    if-gt v12, v8, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Lh00;->m()I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lh00;->m()I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lh00;->m()I

    .line 69
    .line 70
    .line 71
    add-int/lit8 v12, v12, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0, v4}, Lh00;->i(I)I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    invoke-virtual {v0}, Lh00;->m()I

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    add-int/2addr v14, v9

    .line 83
    invoke-static {v11}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    move/from16 p0, v4

    .line 88
    .line 89
    new-instance v4, Lxc5;

    .line 90
    .line 91
    new-array v7, v9, [I

    .line 92
    .line 93
    invoke-direct {v4, v15, v7}, Lxc5;-><init>(Lgy3;[I)V

    .line 94
    .line 95
    .line 96
    const/4 v7, 0x2

    .line 97
    if-lt v6, v7, :cond_2

    .line 98
    .line 99
    if-lt v14, v7, :cond_2

    .line 100
    .line 101
    move v15, v9

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    move v15, v13

    .line 104
    :goto_1
    if-eqz v2, :cond_3

    .line 105
    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    move v2, v9

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move v2, v13

    .line 111
    :goto_2
    add-int/lit8 v3, v12, 0x1

    .line 112
    .line 113
    if-lt v3, v6, :cond_4

    .line 114
    .line 115
    move/from16 v16, v9

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move/from16 v16, v13

    .line 119
    .line 120
    :goto_3
    if-eqz v15, :cond_5

    .line 121
    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    if-nez v16, :cond_6

    .line 125
    .line 126
    :cond_5
    move-object v1, v10

    .line 127
    goto/16 :goto_5e

    .line 128
    .line 129
    :cond_6
    new-array v2, v7, [I

    .line 130
    .line 131
    aput v3, v2, v9

    .line 132
    .line 133
    aput v14, v2, v13

    .line 134
    .line 135
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-static {v15, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, [[I

    .line 142
    .line 143
    move/from16 p2, v9

    .line 144
    .line 145
    new-array v9, v14, [I

    .line 146
    .line 147
    new-array v7, v14, [I

    .line 148
    .line 149
    aget-object v17, v2, v13

    .line 150
    .line 151
    aput v13, v17, v13

    .line 152
    .line 153
    aput p2, v9, v13

    .line 154
    .line 155
    aput v13, v7, v13

    .line 156
    .line 157
    move/from16 v13, p2

    .line 158
    .line 159
    :goto_4
    if-ge v13, v14, :cond_9

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    :goto_5
    if-gt v10, v12, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0}, Lh00;->h()Z

    .line 167
    .line 168
    .line 169
    move-result v20

    .line 170
    if-eqz v20, :cond_7

    .line 171
    .line 172
    aget-object v20, v2, v13

    .line 173
    .line 174
    add-int/lit8 v21, v19, 0x1

    .line 175
    .line 176
    aput v10, v20, v19

    .line 177
    .line 178
    aput v10, v7, v13

    .line 179
    .line 180
    move/from16 v19, v21

    .line 181
    .line 182
    :cond_7
    aput v19, v9, v13

    .line 183
    .line 184
    add-int/lit8 v10, v10, 0x1

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    goto :goto_4

    .line 191
    :cond_9
    invoke-virtual {v0}, Lh00;->h()Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_18

    .line 196
    .line 197
    const/16 v10, 0x40

    .line 198
    .line 199
    invoke-virtual {v0, v10}, Lh00;->t(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Lh00;->h()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_a

    .line 207
    .line 208
    invoke-virtual {v0}, Lh00;->m()I

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-virtual {v0}, Lh00;->m()I

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    const/4 v1, 0x0

    .line 216
    :goto_6
    if-ge v1, v10, :cond_18

    .line 217
    .line 218
    invoke-virtual {v0}, Lh00;->m()I

    .line 219
    .line 220
    .line 221
    if-eqz v1, :cond_d

    .line 222
    .line 223
    invoke-virtual {v0}, Lh00;->h()Z

    .line 224
    .line 225
    .line 226
    move-result v20

    .line 227
    if-eqz v20, :cond_b

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_b
    const/16 v20, 0x0

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    :cond_c
    const/16 v22, 0x0

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_d
    :goto_7
    invoke-virtual {v0}, Lh00;->h()Z

    .line 238
    .line 239
    .line 240
    move-result v20

    .line 241
    invoke-virtual {v0}, Lh00;->h()Z

    .line 242
    .line 243
    .line 244
    move-result v21

    .line 245
    if-nez v20, :cond_e

    .line 246
    .line 247
    if-eqz v21, :cond_c

    .line 248
    .line 249
    :cond_e
    invoke-virtual {v0}, Lh00;->h()Z

    .line 250
    .line 251
    .line 252
    move-result v22

    .line 253
    if-eqz v22, :cond_f

    .line 254
    .line 255
    const/16 v13, 0x13

    .line 256
    .line 257
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 258
    .line 259
    .line 260
    :cond_f
    const/16 v13, 0x8

    .line 261
    .line 262
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 263
    .line 264
    .line 265
    if-eqz v22, :cond_10

    .line 266
    .line 267
    const/4 v13, 0x4

    .line 268
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 269
    .line 270
    .line 271
    :cond_10
    const/16 v13, 0xf

    .line 272
    .line 273
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 274
    .line 275
    .line 276
    :goto_8
    const/4 v13, 0x0

    .line 277
    :goto_9
    if-gt v13, v8, :cond_17

    .line 278
    .line 279
    invoke-virtual {v0}, Lh00;->h()Z

    .line 280
    .line 281
    .line 282
    move-result v24

    .line 283
    if-nez v24, :cond_11

    .line 284
    .line 285
    invoke-virtual {v0}, Lh00;->h()Z

    .line 286
    .line 287
    .line 288
    move-result v24

    .line 289
    :cond_11
    if-eqz v24, :cond_12

    .line 290
    .line 291
    invoke-virtual {v0}, Lh00;->m()I

    .line 292
    .line 293
    .line 294
    const/16 v24, 0x0

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_12
    invoke-virtual {v0}, Lh00;->h()Z

    .line 298
    .line 299
    .line 300
    move-result v24

    .line 301
    :goto_a
    if-nez v24, :cond_13

    .line 302
    .line 303
    invoke-virtual {v0}, Lh00;->m()I

    .line 304
    .line 305
    .line 306
    move-result v24

    .line 307
    move/from16 v25, v24

    .line 308
    .line 309
    move/from16 v24, v1

    .line 310
    .line 311
    move/from16 v1, v25

    .line 312
    .line 313
    :goto_b
    move-object/from16 v25, v2

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_13
    move/from16 v24, v1

    .line 317
    .line 318
    const/4 v1, 0x0

    .line 319
    goto :goto_b

    .line 320
    :goto_c
    add-int v2, v20, v21

    .line 321
    .line 322
    move-object/from16 v26, v7

    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    :goto_d
    if-ge v7, v2, :cond_16

    .line 326
    .line 327
    move/from16 v27, v2

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    :goto_e
    if-gt v2, v1, :cond_15

    .line 331
    .line 332
    invoke-virtual {v0}, Lh00;->m()I

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Lh00;->m()I

    .line 336
    .line 337
    .line 338
    if-eqz v22, :cond_14

    .line 339
    .line 340
    invoke-virtual {v0}, Lh00;->m()I

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lh00;->m()I

    .line 344
    .line 345
    .line 346
    :cond_14
    invoke-virtual {v0}, Lh00;->s()V

    .line 347
    .line 348
    .line 349
    add-int/lit8 v2, v2, 0x1

    .line 350
    .line 351
    goto :goto_e

    .line 352
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 353
    .line 354
    move/from16 v2, v27

    .line 355
    .line 356
    goto :goto_d

    .line 357
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 358
    .line 359
    move/from16 v1, v24

    .line 360
    .line 361
    move-object/from16 v2, v25

    .line 362
    .line 363
    move-object/from16 v7, v26

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_17
    move/from16 v24, v1

    .line 367
    .line 368
    move-object/from16 v25, v2

    .line 369
    .line 370
    move-object/from16 v26, v7

    .line 371
    .line 372
    add-int/lit8 v1, v24, 0x1

    .line 373
    .line 374
    goto/16 :goto_6

    .line 375
    .line 376
    :cond_18
    move-object/from16 v25, v2

    .line 377
    .line 378
    move-object/from16 v26, v7

    .line 379
    .line 380
    invoke-virtual {v0}, Lh00;->h()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_19

    .line 385
    .line 386
    new-instance v0, Lss0;

    .line 387
    .line 388
    const/4 v1, 0x0

    .line 389
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :cond_19
    iget v1, v0, Lh00;->e:I

    .line 394
    .line 395
    if-lez v1, :cond_1a

    .line 396
    .line 397
    const/16 v23, 0x8

    .line 398
    .line 399
    rsub-int/lit8 v13, v1, 0x8

    .line 400
    .line 401
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 402
    .line 403
    .line 404
    :cond_1a
    const/4 v1, 0x0

    .line 405
    invoke-static {v0, v1, v8, v11}, Luc5;->G(Lh00;ZILp13;)Lp13;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v0}, Lh00;->h()Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    const/16 v7, 0x10

    .line 414
    .line 415
    new-array v10, v7, [Z

    .line 416
    .line 417
    move/from16 v20, v1

    .line 418
    .line 419
    const/4 v1, 0x0

    .line 420
    const/4 v13, 0x0

    .line 421
    :goto_f
    if-ge v13, v7, :cond_1c

    .line 422
    .line 423
    invoke-virtual {v0}, Lh00;->h()Z

    .line 424
    .line 425
    .line 426
    move-result v21

    .line 427
    aput-boolean v21, v10, v13

    .line 428
    .line 429
    if-eqz v21, :cond_1b

    .line 430
    .line 431
    add-int/lit8 v1, v1, 0x1

    .line 432
    .line 433
    :cond_1b
    add-int/lit8 v13, v13, 0x1

    .line 434
    .line 435
    goto :goto_f

    .line 436
    :cond_1c
    if-eqz v1, :cond_1d

    .line 437
    .line 438
    aget-boolean v13, v10, p2

    .line 439
    .line 440
    if-nez v13, :cond_1e

    .line 441
    .line 442
    :cond_1d
    const/4 v1, 0x0

    .line 443
    goto/16 :goto_5d

    .line 444
    .line 445
    :cond_1e
    new-array v13, v1, [I

    .line 446
    .line 447
    move-object/from16 v22, v9

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    :goto_10
    sub-int v9, v1, v20

    .line 451
    .line 452
    if-ge v7, v9, :cond_1f

    .line 453
    .line 454
    const/4 v9, 0x3

    .line 455
    invoke-virtual {v0, v9}, Lh00;->i(I)I

    .line 456
    .line 457
    .line 458
    move-result v24

    .line 459
    aput v24, v13, v7

    .line 460
    .line 461
    add-int/lit8 v7, v7, 0x1

    .line 462
    .line 463
    goto :goto_10

    .line 464
    :cond_1f
    add-int/lit8 v7, v1, 0x1

    .line 465
    .line 466
    new-array v7, v7, [I

    .line 467
    .line 468
    if-eqz v20, :cond_22

    .line 469
    .line 470
    move/from16 v9, p2

    .line 471
    .line 472
    :goto_11
    if-ge v9, v1, :cond_21

    .line 473
    .line 474
    move-object/from16 v24, v7

    .line 475
    .line 476
    const/4 v7, 0x0

    .line 477
    :goto_12
    if-ge v7, v9, :cond_20

    .line 478
    .line 479
    aget v27, v24, v9

    .line 480
    .line 481
    aget v28, v13, v7

    .line 482
    .line 483
    add-int/lit8 v28, v28, 0x1

    .line 484
    .line 485
    add-int v28, v28, v27

    .line 486
    .line 487
    aput v28, v24, v9

    .line 488
    .line 489
    add-int/lit8 v7, v7, 0x1

    .line 490
    .line 491
    goto :goto_12

    .line 492
    :cond_20
    add-int/lit8 v9, v9, 0x1

    .line 493
    .line 494
    move-object/from16 v7, v24

    .line 495
    .line 496
    goto :goto_11

    .line 497
    :cond_21
    move-object/from16 v24, v7

    .line 498
    .line 499
    aput p0, v24, v1

    .line 500
    .line 501
    :goto_13
    const/4 v7, 0x2

    .line 502
    goto :goto_14

    .line 503
    :cond_22
    move-object/from16 v24, v7

    .line 504
    .line 505
    goto :goto_13

    .line 506
    :goto_14
    new-array v9, v7, [I

    .line 507
    .line 508
    aput v1, v9, p2

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    aput v6, v9, v17

    .line 513
    .line 514
    invoke-static {v15, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    check-cast v7, [[I

    .line 519
    .line 520
    new-array v9, v6, [I

    .line 521
    .line 522
    aput v17, v9, v17

    .line 523
    .line 524
    invoke-virtual {v0}, Lh00;->h()Z

    .line 525
    .line 526
    .line 527
    move-result v15

    .line 528
    move-object/from16 v27, v7

    .line 529
    .line 530
    move/from16 v7, p2

    .line 531
    .line 532
    :goto_15
    if-ge v7, v6, :cond_26

    .line 533
    .line 534
    if-eqz v15, :cond_23

    .line 535
    .line 536
    move/from16 v28, v7

    .line 537
    .line 538
    move/from16 v7, p0

    .line 539
    .line 540
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 541
    .line 542
    .line 543
    move-result v29

    .line 544
    aput v29, v9, v28

    .line 545
    .line 546
    goto :goto_16

    .line 547
    :cond_23
    move/from16 v28, v7

    .line 548
    .line 549
    move/from16 v7, p0

    .line 550
    .line 551
    aput v28, v9, v28

    .line 552
    .line 553
    :goto_16
    if-nez v20, :cond_24

    .line 554
    .line 555
    const/4 v7, 0x0

    .line 556
    :goto_17
    if-ge v7, v1, :cond_25

    .line 557
    .line 558
    aget-object v29, v27, v28

    .line 559
    .line 560
    aget v30, v13, v7

    .line 561
    .line 562
    move/from16 v31, v7

    .line 563
    .line 564
    add-int/lit8 v7, v30, 0x1

    .line 565
    .line 566
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    aput v7, v29, v31

    .line 571
    .line 572
    add-int/lit8 v7, v31, 0x1

    .line 573
    .line 574
    goto :goto_17

    .line 575
    :cond_24
    const/4 v7, 0x0

    .line 576
    :goto_18
    if-ge v7, v1, :cond_25

    .line 577
    .line 578
    aget-object v29, v27, v28

    .line 579
    .line 580
    aget v30, v9, v28

    .line 581
    .line 582
    add-int/lit8 v31, v7, 0x1

    .line 583
    .line 584
    aget v32, v24, v31

    .line 585
    .line 586
    shl-int v32, p2, v32

    .line 587
    .line 588
    add-int/lit8 v32, v32, -0x1

    .line 589
    .line 590
    and-int v30, v30, v32

    .line 591
    .line 592
    aget v32, v24, v7

    .line 593
    .line 594
    shr-int v30, v30, v32

    .line 595
    .line 596
    aput v30, v29, v7

    .line 597
    .line 598
    move/from16 v7, v31

    .line 599
    .line 600
    goto :goto_18

    .line 601
    :cond_25
    add-int/lit8 v7, v28, 0x1

    .line 602
    .line 603
    const/16 p0, 0x6

    .line 604
    .line 605
    goto :goto_15

    .line 606
    :cond_26
    new-array v1, v3, [I

    .line 607
    .line 608
    move/from16 v7, p2

    .line 609
    .line 610
    const/4 v13, 0x0

    .line 611
    :goto_19
    const/4 v15, -0x1

    .line 612
    if-ge v13, v6, :cond_2d

    .line 613
    .line 614
    aget v20, v9, v13

    .line 615
    .line 616
    aput v15, v1, v20

    .line 617
    .line 618
    move-object/from16 v24, v1

    .line 619
    .line 620
    const/4 v15, 0x0

    .line 621
    const/16 v20, 0x0

    .line 622
    .line 623
    :goto_1a
    const/16 v1, 0x10

    .line 624
    .line 625
    if-ge v15, v1, :cond_29

    .line 626
    .line 627
    aget-boolean v1, v10, v15

    .line 628
    .line 629
    if-eqz v1, :cond_28

    .line 630
    .line 631
    move/from16 v1, p2

    .line 632
    .line 633
    if-ne v15, v1, :cond_27

    .line 634
    .line 635
    aget v1, v9, v13

    .line 636
    .line 637
    aget-object v28, v27, v13

    .line 638
    .line 639
    aget v28, v28, v20

    .line 640
    .line 641
    aput v28, v24, v1

    .line 642
    .line 643
    :cond_27
    add-int/lit8 v20, v20, 0x1

    .line 644
    .line 645
    :cond_28
    add-int/lit8 v15, v15, 0x1

    .line 646
    .line 647
    const/16 p2, 0x1

    .line 648
    .line 649
    goto :goto_1a

    .line 650
    :cond_29
    if-lez v13, :cond_2c

    .line 651
    .line 652
    const/4 v1, 0x0

    .line 653
    :goto_1b
    if-ge v1, v13, :cond_2b

    .line 654
    .line 655
    aget v15, v9, v13

    .line 656
    .line 657
    aget v15, v24, v15

    .line 658
    .line 659
    aget v20, v9, v1

    .line 660
    .line 661
    move/from16 v28, v1

    .line 662
    .line 663
    aget v1, v24, v20

    .line 664
    .line 665
    if-ne v15, v1, :cond_2a

    .line 666
    .line 667
    goto :goto_1c

    .line 668
    :cond_2a
    add-int/lit8 v1, v28, 0x1

    .line 669
    .line 670
    goto :goto_1b

    .line 671
    :cond_2b
    add-int/lit8 v7, v7, 0x1

    .line 672
    .line 673
    :cond_2c
    :goto_1c
    add-int/lit8 v13, v13, 0x1

    .line 674
    .line 675
    move-object/from16 v1, v24

    .line 676
    .line 677
    const/16 p2, 0x1

    .line 678
    .line 679
    goto :goto_19

    .line 680
    :cond_2d
    move-object/from16 v24, v1

    .line 681
    .line 682
    const/4 v13, 0x4

    .line 683
    invoke-virtual {v0, v13}, Lh00;->i(I)I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    const/4 v10, 0x2

    .line 688
    if-lt v7, v10, :cond_88

    .line 689
    .line 690
    if-nez v1, :cond_2e

    .line 691
    .line 692
    goto/16 :goto_5c

    .line 693
    .line 694
    :cond_2e
    new-array v10, v7, [I

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    :goto_1d
    if-ge v13, v7, :cond_2f

    .line 698
    .line 699
    invoke-virtual {v0, v1}, Lh00;->i(I)I

    .line 700
    .line 701
    .line 702
    move-result v20

    .line 703
    aput v20, v10, v13

    .line 704
    .line 705
    add-int/lit8 v13, v13, 0x1

    .line 706
    .line 707
    goto :goto_1d

    .line 708
    :cond_2f
    new-array v1, v3, [I

    .line 709
    .line 710
    const/4 v13, 0x0

    .line 711
    :goto_1e
    if-ge v13, v6, :cond_30

    .line 712
    .line 713
    aget v15, v9, v13

    .line 714
    .line 715
    invoke-static {v15, v12}, Ljava/lang/Math;->min(II)I

    .line 716
    .line 717
    .line 718
    move-result v15

    .line 719
    aput v13, v1, v15

    .line 720
    .line 721
    add-int/lit8 v13, v13, 0x1

    .line 722
    .line 723
    const/4 v15, -0x1

    .line 724
    goto :goto_1e

    .line 725
    :cond_30
    invoke-static {}, Lyw1;->j()Luw1;

    .line 726
    .line 727
    .line 728
    move-result-object v13

    .line 729
    const/4 v15, 0x0

    .line 730
    :goto_1f
    if-gt v15, v12, :cond_32

    .line 731
    .line 732
    move-object/from16 v20, v1

    .line 733
    .line 734
    aget v1, v24, v15

    .line 735
    .line 736
    move/from16 v28, v7

    .line 737
    .line 738
    const/16 v27, 0x1

    .line 739
    .line 740
    add-int/lit8 v7, v28, -0x1

    .line 741
    .line 742
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    if-ltz v1, :cond_31

    .line 747
    .line 748
    aget v1, v10, v1

    .line 749
    .line 750
    goto :goto_20

    .line 751
    :cond_31
    const/4 v1, -0x1

    .line 752
    :goto_20
    new-instance v7, Lo13;

    .line 753
    .line 754
    move-object/from16 v27, v9

    .line 755
    .line 756
    aget v9, v20, v15

    .line 757
    .line 758
    invoke-direct {v7, v9, v1}, Lo13;-><init>(II)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v13, v7}, Lpw1;->c(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    add-int/lit8 v15, v15, 0x1

    .line 765
    .line 766
    move-object/from16 v1, v20

    .line 767
    .line 768
    move-object/from16 v9, v27

    .line 769
    .line 770
    move/from16 v7, v28

    .line 771
    .line 772
    goto :goto_1f

    .line 773
    :cond_32
    move-object/from16 v27, v9

    .line 774
    .line 775
    invoke-virtual {v13}, Luw1;->f()Lgy3;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    const/4 v7, 0x0

    .line 780
    invoke-virtual {v1, v7}, Lgy3;->get(I)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v9

    .line 784
    check-cast v9, Lo13;

    .line 785
    .line 786
    iget v7, v9, Lo13;->b:I

    .line 787
    .line 788
    const/4 v9, -0x1

    .line 789
    if-ne v7, v9, :cond_33

    .line 790
    .line 791
    new-instance v0, Lss0;

    .line 792
    .line 793
    const/4 v1, 0x0

    .line 794
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 795
    .line 796
    .line 797
    return-object v0

    .line 798
    :cond_33
    const/4 v7, 0x1

    .line 799
    :goto_21
    if-gt v7, v12, :cond_35

    .line 800
    .line 801
    invoke-virtual {v1, v7}, Lgy3;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v10

    .line 805
    check-cast v10, Lo13;

    .line 806
    .line 807
    iget v10, v10, Lo13;->b:I

    .line 808
    .line 809
    if-eq v10, v9, :cond_34

    .line 810
    .line 811
    goto :goto_22

    .line 812
    :cond_34
    add-int/lit8 v7, v7, 0x1

    .line 813
    .line 814
    goto :goto_21

    .line 815
    :cond_35
    move v7, v9

    .line 816
    :goto_22
    if-ne v7, v9, :cond_36

    .line 817
    .line 818
    new-instance v0, Lss0;

    .line 819
    .line 820
    const/4 v1, 0x0

    .line 821
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 822
    .line 823
    .line 824
    return-object v0

    .line 825
    :cond_36
    const/4 v10, 0x2

    .line 826
    new-array v9, v10, [I

    .line 827
    .line 828
    const/4 v12, 0x1

    .line 829
    aput v6, v9, v12

    .line 830
    .line 831
    const/16 v17, 0x0

    .line 832
    .line 833
    aput v6, v9, v17

    .line 834
    .line 835
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 836
    .line 837
    invoke-static {v13, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v9

    .line 841
    check-cast v9, [[Z

    .line 842
    .line 843
    new-array v15, v10, [I

    .line 844
    .line 845
    aput v6, v15, v12

    .line 846
    .line 847
    aput v6, v15, v17

    .line 848
    .line 849
    invoke-static {v13, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v10

    .line 853
    check-cast v10, [[Z

    .line 854
    .line 855
    const/4 v12, 0x1

    .line 856
    :goto_23
    if-ge v12, v6, :cond_38

    .line 857
    .line 858
    const/4 v15, 0x0

    .line 859
    :goto_24
    if-ge v15, v12, :cond_37

    .line 860
    .line 861
    aget-object v20, v9, v12

    .line 862
    .line 863
    aget-object v24, v10, v12

    .line 864
    .line 865
    invoke-virtual {v0}, Lh00;->h()Z

    .line 866
    .line 867
    .line 868
    move-result v28

    .line 869
    aput-boolean v28, v24, v15

    .line 870
    .line 871
    aput-boolean v28, v20, v15

    .line 872
    .line 873
    add-int/lit8 v15, v15, 0x1

    .line 874
    .line 875
    goto :goto_24

    .line 876
    :cond_37
    add-int/lit8 v12, v12, 0x1

    .line 877
    .line 878
    goto :goto_23

    .line 879
    :cond_38
    const/4 v12, 0x1

    .line 880
    :goto_25
    if-ge v12, v6, :cond_3c

    .line 881
    .line 882
    const/4 v15, 0x0

    .line 883
    :goto_26
    if-ge v15, v5, :cond_3b

    .line 884
    .line 885
    move-object/from16 p0, v9

    .line 886
    .line 887
    const/4 v9, 0x0

    .line 888
    :goto_27
    if-ge v9, v12, :cond_3a

    .line 889
    .line 890
    aget-object v20, v10, v12

    .line 891
    .line 892
    aget-boolean v24, v20, v9

    .line 893
    .line 894
    if-eqz v24, :cond_39

    .line 895
    .line 896
    aget-object v24, v10, v9

    .line 897
    .line 898
    aget-boolean v24, v24, v15

    .line 899
    .line 900
    if-eqz v24, :cond_39

    .line 901
    .line 902
    const/16 v24, 0x1

    .line 903
    .line 904
    aput-boolean v24, v20, v15

    .line 905
    .line 906
    goto :goto_28

    .line 907
    :cond_39
    add-int/lit8 v9, v9, 0x1

    .line 908
    .line 909
    goto :goto_27

    .line 910
    :cond_3a
    :goto_28
    add-int/lit8 v15, v15, 0x1

    .line 911
    .line 912
    move-object/from16 v9, p0

    .line 913
    .line 914
    goto :goto_26

    .line 915
    :cond_3b
    move-object/from16 p0, v9

    .line 916
    .line 917
    add-int/lit8 v12, v12, 0x1

    .line 918
    .line 919
    goto :goto_25

    .line 920
    :cond_3c
    move-object/from16 p0, v9

    .line 921
    .line 922
    new-array v9, v3, [I

    .line 923
    .line 924
    const/4 v12, 0x0

    .line 925
    :goto_29
    if-ge v12, v6, :cond_3e

    .line 926
    .line 927
    const/4 v15, 0x0

    .line 928
    const/16 v20, 0x0

    .line 929
    .line 930
    :goto_2a
    if-ge v15, v12, :cond_3d

    .line 931
    .line 932
    aget-object v24, p0, v12

    .line 933
    .line 934
    aget-boolean v24, v24, v15

    .line 935
    .line 936
    add-int v20, v20, v24

    .line 937
    .line 938
    add-int/lit8 v15, v15, 0x1

    .line 939
    .line 940
    goto :goto_2a

    .line 941
    :cond_3d
    aget v15, v27, v12

    .line 942
    .line 943
    aput v20, v9, v15

    .line 944
    .line 945
    add-int/lit8 v12, v12, 0x1

    .line 946
    .line 947
    goto :goto_29

    .line 948
    :cond_3e
    const/4 v12, 0x0

    .line 949
    const/4 v15, 0x0

    .line 950
    :goto_2b
    if-ge v12, v6, :cond_40

    .line 951
    .line 952
    aget v20, v27, v12

    .line 953
    .line 954
    aget v20, v9, v20

    .line 955
    .line 956
    if-nez v20, :cond_3f

    .line 957
    .line 958
    add-int/lit8 v15, v15, 0x1

    .line 959
    .line 960
    :cond_3f
    add-int/lit8 v12, v12, 0x1

    .line 961
    .line 962
    goto :goto_2b

    .line 963
    :cond_40
    const/4 v12, 0x1

    .line 964
    if-le v15, v12, :cond_41

    .line 965
    .line 966
    new-instance v0, Lss0;

    .line 967
    .line 968
    const/4 v1, 0x0

    .line 969
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 970
    .line 971
    .line 972
    return-object v0

    .line 973
    :cond_41
    new-array v12, v6, [I

    .line 974
    .line 975
    new-array v15, v14, [I

    .line 976
    .line 977
    invoke-virtual {v0}, Lh00;->h()Z

    .line 978
    .line 979
    .line 980
    move-result v20

    .line 981
    if-eqz v20, :cond_42

    .line 982
    .line 983
    move-object/from16 v20, v9

    .line 984
    .line 985
    const/4 v9, 0x0

    .line 986
    :goto_2c
    if-ge v9, v6, :cond_43

    .line 987
    .line 988
    move/from16 v24, v9

    .line 989
    .line 990
    const/4 v9, 0x3

    .line 991
    invoke-virtual {v0, v9}, Lh00;->i(I)I

    .line 992
    .line 993
    .line 994
    move-result v28

    .line 995
    aput v28, v12, v24

    .line 996
    .line 997
    add-int/lit8 v9, v24, 0x1

    .line 998
    .line 999
    goto :goto_2c

    .line 1000
    :cond_42
    move-object/from16 v20, v9

    .line 1001
    .line 1002
    const/4 v9, 0x0

    .line 1003
    invoke-static {v12, v9, v6, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 1004
    .line 1005
    .line 1006
    :cond_43
    const/4 v9, 0x0

    .line 1007
    :goto_2d
    if-ge v9, v14, :cond_45

    .line 1008
    .line 1009
    move/from16 v24, v9

    .line 1010
    .line 1011
    move-object/from16 v28, v10

    .line 1012
    .line 1013
    move-object/from16 v29, v12

    .line 1014
    .line 1015
    const/4 v9, 0x0

    .line 1016
    const/4 v10, 0x0

    .line 1017
    :goto_2e
    aget v12, v22, v24

    .line 1018
    .line 1019
    if-ge v9, v12, :cond_44

    .line 1020
    .line 1021
    aget-object v12, v25, v24

    .line 1022
    .line 1023
    aget v12, v12, v9

    .line 1024
    .line 1025
    invoke-virtual {v1, v12}, Lgy3;->get(I)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v12

    .line 1029
    check-cast v12, Lo13;

    .line 1030
    .line 1031
    iget v12, v12, Lo13;->a:I

    .line 1032
    .line 1033
    aget v12, v29, v12

    .line 1034
    .line 1035
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    .line 1036
    .line 1037
    .line 1038
    move-result v10

    .line 1039
    add-int/lit8 v9, v9, 0x1

    .line 1040
    .line 1041
    goto :goto_2e

    .line 1042
    :cond_44
    add-int/lit8 v10, v10, 0x1

    .line 1043
    .line 1044
    aput v10, v15, v24

    .line 1045
    .line 1046
    add-int/lit8 v9, v24, 0x1

    .line 1047
    .line 1048
    move-object/from16 v10, v28

    .line 1049
    .line 1050
    move-object/from16 v12, v29

    .line 1051
    .line 1052
    goto :goto_2d

    .line 1053
    :cond_45
    move-object/from16 v28, v10

    .line 1054
    .line 1055
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v9

    .line 1059
    if-eqz v9, :cond_48

    .line 1060
    .line 1061
    const/4 v9, 0x0

    .line 1062
    :goto_2f
    if-ge v9, v5, :cond_48

    .line 1063
    .line 1064
    add-int/lit8 v10, v9, 0x1

    .line 1065
    .line 1066
    move v12, v10

    .line 1067
    :goto_30
    if-ge v12, v6, :cond_47

    .line 1068
    .line 1069
    aget-object v24, p0, v12

    .line 1070
    .line 1071
    aget-boolean v24, v24, v9

    .line 1072
    .line 1073
    if-eqz v24, :cond_46

    .line 1074
    .line 1075
    move/from16 v24, v5

    .line 1076
    .line 1077
    const/4 v5, 0x3

    .line 1078
    invoke-virtual {v0, v5}, Lh00;->t(I)V

    .line 1079
    .line 1080
    .line 1081
    goto :goto_31

    .line 1082
    :cond_46
    move/from16 v24, v5

    .line 1083
    .line 1084
    :goto_31
    add-int/lit8 v12, v12, 0x1

    .line 1085
    .line 1086
    move/from16 v5, v24

    .line 1087
    .line 1088
    goto :goto_30

    .line 1089
    :cond_47
    move v9, v10

    .line 1090
    goto :goto_2f

    .line 1091
    :cond_48
    invoke-virtual {v0}, Lh00;->s()V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v0}, Lh00;->m()I

    .line 1095
    .line 1096
    .line 1097
    move-result v5

    .line 1098
    const/4 v12, 0x1

    .line 1099
    add-int/2addr v5, v12

    .line 1100
    invoke-static {}, Lyw1;->j()Luw1;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v9

    .line 1104
    invoke-virtual {v9, v11}, Lpw1;->c(Ljava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    if-le v5, v12, :cond_49

    .line 1108
    .line 1109
    invoke-virtual {v9, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    const/4 v10, 0x2

    .line 1113
    :goto_32
    if-ge v10, v5, :cond_49

    .line 1114
    .line 1115
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v11

    .line 1119
    invoke-static {v0, v11, v8, v2}, Luc5;->G(Lh00;ZILp13;)Lp13;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    invoke-virtual {v9, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    add-int/lit8 v10, v10, 0x1

    .line 1127
    .line 1128
    goto :goto_32

    .line 1129
    :cond_49
    invoke-virtual {v9}, Luw1;->f()Lgy3;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    invoke-virtual {v0}, Lh00;->m()I

    .line 1134
    .line 1135
    .line 1136
    move-result v8

    .line 1137
    add-int/2addr v8, v14

    .line 1138
    if-le v8, v14, :cond_4a

    .line 1139
    .line 1140
    new-instance v0, Lss0;

    .line 1141
    .line 1142
    const/4 v1, 0x0

    .line 1143
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 1144
    .line 1145
    .line 1146
    return-object v0

    .line 1147
    :cond_4a
    const/4 v10, 0x2

    .line 1148
    invoke-virtual {v0, v10}, Lh00;->i(I)I

    .line 1149
    .line 1150
    .line 1151
    move-result v9

    .line 1152
    new-array v11, v10, [I

    .line 1153
    .line 1154
    const/4 v12, 0x1

    .line 1155
    aput v3, v11, v12

    .line 1156
    .line 1157
    const/4 v10, 0x0

    .line 1158
    aput v8, v11, v10

    .line 1159
    .line 1160
    invoke-static {v13, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v11

    .line 1164
    check-cast v11, [[Z

    .line 1165
    .line 1166
    new-array v12, v8, [I

    .line 1167
    .line 1168
    move/from16 v17, v10

    .line 1169
    .line 1170
    new-array v10, v8, [I

    .line 1171
    .line 1172
    move-object/from16 v24, v10

    .line 1173
    .line 1174
    move/from16 v10, v17

    .line 1175
    .line 1176
    :goto_33
    if-ge v10, v14, :cond_4f

    .line 1177
    .line 1178
    aput v17, v12, v10

    .line 1179
    .line 1180
    aget v29, v26, v10

    .line 1181
    .line 1182
    aput v29, v24, v10

    .line 1183
    .line 1184
    if-nez v9, :cond_4b

    .line 1185
    .line 1186
    move/from16 v29, v10

    .line 1187
    .line 1188
    aget-object v10, v11, v29

    .line 1189
    .line 1190
    move-object/from16 v30, v11

    .line 1191
    .line 1192
    aget v11, v22, v29

    .line 1193
    .line 1194
    move-object/from16 v31, v12

    .line 1195
    .line 1196
    move-object/from16 v32, v15

    .line 1197
    .line 1198
    move/from16 v12, v17

    .line 1199
    .line 1200
    const/4 v15, 0x1

    .line 1201
    invoke-static {v10, v12, v11, v15}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1202
    .line 1203
    .line 1204
    aget v10, v22, v29

    .line 1205
    .line 1206
    aput v10, v31, v29

    .line 1207
    .line 1208
    move v12, v15

    .line 1209
    :goto_34
    const/16 v17, 0x0

    .line 1210
    .line 1211
    goto :goto_37

    .line 1212
    :cond_4b
    move/from16 v29, v10

    .line 1213
    .line 1214
    move-object/from16 v30, v11

    .line 1215
    .line 1216
    move-object/from16 v31, v12

    .line 1217
    .line 1218
    move-object/from16 v32, v15

    .line 1219
    .line 1220
    const/4 v15, 0x1

    .line 1221
    if-ne v9, v15, :cond_4e

    .line 1222
    .line 1223
    aget v10, v26, v29

    .line 1224
    .line 1225
    const/4 v11, 0x0

    .line 1226
    :goto_35
    aget v12, v22, v29

    .line 1227
    .line 1228
    if-ge v11, v12, :cond_4d

    .line 1229
    .line 1230
    aget-object v12, v30, v29

    .line 1231
    .line 1232
    aget-object v15, v25, v29

    .line 1233
    .line 1234
    aget v15, v15, v11

    .line 1235
    .line 1236
    if-ne v15, v10, :cond_4c

    .line 1237
    .line 1238
    const/4 v15, 0x1

    .line 1239
    goto :goto_36

    .line 1240
    :cond_4c
    const/4 v15, 0x0

    .line 1241
    :goto_36
    aput-boolean v15, v12, v11

    .line 1242
    .line 1243
    add-int/lit8 v11, v11, 0x1

    .line 1244
    .line 1245
    goto :goto_35

    .line 1246
    :cond_4d
    const/4 v12, 0x1

    .line 1247
    aput v12, v31, v29

    .line 1248
    .line 1249
    goto :goto_34

    .line 1250
    :cond_4e
    move v12, v15

    .line 1251
    const/16 v17, 0x0

    .line 1252
    .line 1253
    aget-object v10, v30, v17

    .line 1254
    .line 1255
    aput-boolean v12, v10, v17

    .line 1256
    .line 1257
    aput v12, v31, v17

    .line 1258
    .line 1259
    :goto_37
    add-int/lit8 v10, v29, 0x1

    .line 1260
    .line 1261
    move-object/from16 v11, v30

    .line 1262
    .line 1263
    move-object/from16 v12, v31

    .line 1264
    .line 1265
    move-object/from16 v15, v32

    .line 1266
    .line 1267
    goto :goto_33

    .line 1268
    :cond_4f
    move-object/from16 v30, v11

    .line 1269
    .line 1270
    move-object/from16 v31, v12

    .line 1271
    .line 1272
    move-object/from16 v32, v15

    .line 1273
    .line 1274
    const/4 v12, 0x1

    .line 1275
    new-array v10, v3, [I

    .line 1276
    .line 1277
    const/4 v11, 0x2

    .line 1278
    new-array v15, v11, [I

    .line 1279
    .line 1280
    aput v3, v15, v12

    .line 1281
    .line 1282
    aput v8, v15, v17

    .line 1283
    .line 1284
    invoke-static {v13, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v3

    .line 1288
    check-cast v3, [[Z

    .line 1289
    .line 1290
    const/4 v12, 0x1

    .line 1291
    const/4 v13, 0x0

    .line 1292
    :goto_38
    if-ge v12, v8, :cond_5c

    .line 1293
    .line 1294
    if-ne v9, v11, :cond_51

    .line 1295
    .line 1296
    const/4 v11, 0x0

    .line 1297
    :goto_39
    aget v15, v22, v12

    .line 1298
    .line 1299
    if-ge v11, v15, :cond_51

    .line 1300
    .line 1301
    aget-object v15, v30, v12

    .line 1302
    .line 1303
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1304
    .line 1305
    .line 1306
    move-result v26

    .line 1307
    aput-boolean v26, v15, v11

    .line 1308
    .line 1309
    aget v15, v31, v12

    .line 1310
    .line 1311
    aget-object v26, v30, v12

    .line 1312
    .line 1313
    aget-boolean v26, v26, v11

    .line 1314
    .line 1315
    add-int v15, v15, v26

    .line 1316
    .line 1317
    aput v15, v31, v12

    .line 1318
    .line 1319
    if-eqz v26, :cond_50

    .line 1320
    .line 1321
    aget-object v15, v25, v12

    .line 1322
    .line 1323
    aget v15, v15, v11

    .line 1324
    .line 1325
    aput v15, v24, v12

    .line 1326
    .line 1327
    :cond_50
    add-int/lit8 v11, v11, 0x1

    .line 1328
    .line 1329
    goto :goto_39

    .line 1330
    :cond_51
    if-nez v13, :cond_53

    .line 1331
    .line 1332
    aget-object v11, v25, v12

    .line 1333
    .line 1334
    const/16 v17, 0x0

    .line 1335
    .line 1336
    aget v11, v11, v17

    .line 1337
    .line 1338
    if-nez v11, :cond_54

    .line 1339
    .line 1340
    aget-object v11, v30, v12

    .line 1341
    .line 1342
    aget-boolean v11, v11, v17

    .line 1343
    .line 1344
    if-eqz v11, :cond_54

    .line 1345
    .line 1346
    const/4 v11, 0x1

    .line 1347
    :goto_3a
    aget v15, v22, v12

    .line 1348
    .line 1349
    if-ge v11, v15, :cond_54

    .line 1350
    .line 1351
    aget-object v15, v25, v12

    .line 1352
    .line 1353
    aget v15, v15, v11

    .line 1354
    .line 1355
    if-ne v15, v7, :cond_52

    .line 1356
    .line 1357
    aget-object v15, v30, v12

    .line 1358
    .line 1359
    aget-boolean v15, v15, v7

    .line 1360
    .line 1361
    if-eqz v15, :cond_52

    .line 1362
    .line 1363
    move v13, v12

    .line 1364
    :cond_52
    add-int/lit8 v11, v11, 0x1

    .line 1365
    .line 1366
    goto :goto_3a

    .line 1367
    :cond_53
    const/16 v17, 0x0

    .line 1368
    .line 1369
    :cond_54
    move/from16 v11, v17

    .line 1370
    .line 1371
    :goto_3b
    aget v15, v22, v12

    .line 1372
    .line 1373
    if-ge v11, v15, :cond_5a

    .line 1374
    .line 1375
    const/4 v15, 0x1

    .line 1376
    if-le v5, v15, :cond_58

    .line 1377
    .line 1378
    aget-object v15, v3, v12

    .line 1379
    .line 1380
    aget-object v26, v30, v12

    .line 1381
    .line 1382
    aget-boolean v26, v26, v11

    .line 1383
    .line 1384
    aput-boolean v26, v15, v11

    .line 1385
    .line 1386
    move-object v15, v2

    .line 1387
    move-object/from16 v26, v3

    .line 1388
    .line 1389
    int-to-double v2, v5

    .line 1390
    sget-object v29, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1391
    .line 1392
    invoke-static {v2, v3}, Lms0;->c(D)I

    .line 1393
    .line 1394
    .line 1395
    move-result v2

    .line 1396
    aget-object v3, v26, v12

    .line 1397
    .line 1398
    aget-boolean v3, v3, v11

    .line 1399
    .line 1400
    if-nez v3, :cond_56

    .line 1401
    .line 1402
    aget-object v3, v25, v12

    .line 1403
    .line 1404
    aget v3, v3, v11

    .line 1405
    .line 1406
    invoke-virtual {v1, v3}, Lgy3;->get(I)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v3

    .line 1410
    check-cast v3, Lo13;

    .line 1411
    .line 1412
    iget v3, v3, Lo13;->a:I

    .line 1413
    .line 1414
    move/from16 v29, v3

    .line 1415
    .line 1416
    move/from16 v3, v17

    .line 1417
    .line 1418
    :goto_3c
    if-ge v3, v11, :cond_56

    .line 1419
    .line 1420
    aget-object v33, v25, v12

    .line 1421
    .line 1422
    move/from16 v34, v3

    .line 1423
    .line 1424
    aget v3, v33, v34

    .line 1425
    .line 1426
    invoke-virtual {v1, v3}, Lgy3;->get(I)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v3

    .line 1430
    check-cast v3, Lo13;

    .line 1431
    .line 1432
    iget v3, v3, Lo13;->a:I

    .line 1433
    .line 1434
    aget-object v33, v28, v29

    .line 1435
    .line 1436
    aget-boolean v3, v33, v3

    .line 1437
    .line 1438
    if-eqz v3, :cond_55

    .line 1439
    .line 1440
    aget-object v3, v26, v12

    .line 1441
    .line 1442
    const/16 v29, 0x1

    .line 1443
    .line 1444
    aput-boolean v29, v3, v11

    .line 1445
    .line 1446
    goto :goto_3d

    .line 1447
    :cond_55
    add-int/lit8 v3, v34, 0x1

    .line 1448
    .line 1449
    goto :goto_3c

    .line 1450
    :cond_56
    :goto_3d
    aget-object v3, v26, v12

    .line 1451
    .line 1452
    aget-boolean v3, v3, v11

    .line 1453
    .line 1454
    if-eqz v3, :cond_59

    .line 1455
    .line 1456
    if-lez v13, :cond_57

    .line 1457
    .line 1458
    if-ne v12, v13, :cond_57

    .line 1459
    .line 1460
    invoke-virtual {v0, v2}, Lh00;->i(I)I

    .line 1461
    .line 1462
    .line 1463
    move-result v2

    .line 1464
    aput v2, v10, v11

    .line 1465
    .line 1466
    goto :goto_3e

    .line 1467
    :cond_57
    invoke-virtual {v0, v2}, Lh00;->t(I)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_3e

    .line 1471
    :cond_58
    move-object v15, v2

    .line 1472
    move-object/from16 v26, v3

    .line 1473
    .line 1474
    :cond_59
    :goto_3e
    add-int/lit8 v11, v11, 0x1

    .line 1475
    .line 1476
    move-object v2, v15

    .line 1477
    move-object/from16 v3, v26

    .line 1478
    .line 1479
    goto :goto_3b

    .line 1480
    :cond_5a
    move-object v15, v2

    .line 1481
    move-object/from16 v26, v3

    .line 1482
    .line 1483
    aget v2, v31, v12

    .line 1484
    .line 1485
    const/4 v3, 0x1

    .line 1486
    if-ne v2, v3, :cond_5b

    .line 1487
    .line 1488
    aget v2, v24, v12

    .line 1489
    .line 1490
    aget v2, v20, v2

    .line 1491
    .line 1492
    if-lez v2, :cond_5b

    .line 1493
    .line 1494
    invoke-virtual {v0}, Lh00;->s()V

    .line 1495
    .line 1496
    .line 1497
    :cond_5b
    add-int/lit8 v12, v12, 0x1

    .line 1498
    .line 1499
    move-object v2, v15

    .line 1500
    move-object/from16 v3, v26

    .line 1501
    .line 1502
    const/4 v11, 0x2

    .line 1503
    goto/16 :goto_38

    .line 1504
    .line 1505
    :cond_5c
    move-object v15, v2

    .line 1506
    move-object/from16 v26, v3

    .line 1507
    .line 1508
    const/16 v17, 0x0

    .line 1509
    .line 1510
    if-nez v13, :cond_5d

    .line 1511
    .line 1512
    new-instance v0, Lss0;

    .line 1513
    .line 1514
    const/4 v1, 0x0

    .line 1515
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 1516
    .line 1517
    .line 1518
    return-object v0

    .line 1519
    :cond_5d
    invoke-virtual {v0}, Lh00;->m()I

    .line 1520
    .line 1521
    .line 1522
    move-result v2

    .line 1523
    add-int/lit8 v3, v2, 0x1

    .line 1524
    .line 1525
    const-string v4, "expectedSize"

    .line 1526
    .line 1527
    invoke-static {v3, v4}, Luc5;->f(ILjava/lang/String;)V

    .line 1528
    .line 1529
    .line 1530
    const-string v5, "initialCapacity"

    .line 1531
    .line 1532
    invoke-static {v3, v5}, Luc5;->f(ILjava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    new-array v7, v3, [Ljava/lang/Object;

    .line 1536
    .line 1537
    new-array v9, v6, [I

    .line 1538
    .line 1539
    move-object v13, v7

    .line 1540
    move/from16 v7, v17

    .line 1541
    .line 1542
    move v11, v7

    .line 1543
    move v12, v11

    .line 1544
    :goto_3f
    if-ge v7, v3, :cond_66

    .line 1545
    .line 1546
    move/from16 v24, v7

    .line 1547
    .line 1548
    const/16 v7, 0x10

    .line 1549
    .line 1550
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 1551
    .line 1552
    .line 1553
    move-result v21

    .line 1554
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v25

    .line 1558
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1559
    .line 1560
    .line 1561
    move-result v28

    .line 1562
    move/from16 v29, v12

    .line 1563
    .line 1564
    if-eqz v28, :cond_5f

    .line 1565
    .line 1566
    const/4 v7, 0x2

    .line 1567
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 1568
    .line 1569
    .line 1570
    move-result v12

    .line 1571
    const/4 v7, 0x3

    .line 1572
    if-ne v12, v7, :cond_5e

    .line 1573
    .line 1574
    invoke-virtual {v0}, Lh00;->s()V

    .line 1575
    .line 1576
    .line 1577
    :cond_5e
    const/4 v7, 0x4

    .line 1578
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v30

    .line 1582
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 1583
    .line 1584
    .line 1585
    move-result v31

    .line 1586
    move/from16 v35, v30

    .line 1587
    .line 1588
    move/from16 v36, v31

    .line 1589
    .line 1590
    goto :goto_40

    .line 1591
    :cond_5f
    move/from16 v12, v17

    .line 1592
    .line 1593
    move/from16 v35, v12

    .line 1594
    .line 1595
    move/from16 v36, v35

    .line 1596
    .line 1597
    :goto_40
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1598
    .line 1599
    .line 1600
    move-result v7

    .line 1601
    if-eqz v7, :cond_63

    .line 1602
    .line 1603
    invoke-virtual {v0}, Lh00;->m()I

    .line 1604
    .line 1605
    .line 1606
    move-result v7

    .line 1607
    invoke-virtual {v0}, Lh00;->m()I

    .line 1608
    .line 1609
    .line 1610
    move-result v30

    .line 1611
    invoke-virtual {v0}, Lh00;->m()I

    .line 1612
    .line 1613
    .line 1614
    move-result v31

    .line 1615
    invoke-virtual {v0}, Lh00;->m()I

    .line 1616
    .line 1617
    .line 1618
    move-result v33

    .line 1619
    move/from16 v34, v7

    .line 1620
    .line 1621
    const/4 v7, 0x1

    .line 1622
    if-eq v12, v7, :cond_61

    .line 1623
    .line 1624
    const/4 v7, 0x2

    .line 1625
    if-ne v12, v7, :cond_60

    .line 1626
    .line 1627
    goto :goto_41

    .line 1628
    :cond_60
    const/4 v7, 0x1

    .line 1629
    goto :goto_42

    .line 1630
    :cond_61
    :goto_41
    const/4 v7, 0x2

    .line 1631
    :goto_42
    add-int v30, v34, v30

    .line 1632
    .line 1633
    mul-int v30, v30, v7

    .line 1634
    .line 1635
    sub-int v21, v21, v30

    .line 1636
    .line 1637
    const/4 v7, 0x1

    .line 1638
    if-ne v12, v7, :cond_62

    .line 1639
    .line 1640
    const/4 v7, 0x2

    .line 1641
    goto :goto_43

    .line 1642
    :cond_62
    const/4 v7, 0x1

    .line 1643
    :goto_43
    add-int v31, v31, v33

    .line 1644
    .line 1645
    mul-int v31, v31, v7

    .line 1646
    .line 1647
    sub-int v25, v25, v31

    .line 1648
    .line 1649
    :cond_63
    move/from16 v37, v21

    .line 1650
    .line 1651
    move/from16 v38, v25

    .line 1652
    .line 1653
    new-instance v33, Lq13;

    .line 1654
    .line 1655
    move/from16 v34, v12

    .line 1656
    .line 1657
    invoke-direct/range {v33 .. v38}, Lq13;-><init>(IIIII)V

    .line 1658
    .line 1659
    .line 1660
    array-length v7, v13

    .line 1661
    add-int/lit8 v12, v11, 0x1

    .line 1662
    .line 1663
    invoke-static {v7, v12}, Lqw1;->b(II)I

    .line 1664
    .line 1665
    .line 1666
    move-result v7

    .line 1667
    array-length v12, v13

    .line 1668
    if-gt v7, v12, :cond_65

    .line 1669
    .line 1670
    if-eqz v29, :cond_64

    .line 1671
    .line 1672
    goto :goto_44

    .line 1673
    :cond_64
    move/from16 v12, v29

    .line 1674
    .line 1675
    goto :goto_45

    .line 1676
    :cond_65
    :goto_44
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v7

    .line 1680
    move-object v13, v7

    .line 1681
    move/from16 v12, v17

    .line 1682
    .line 1683
    :goto_45
    add-int/lit8 v7, v11, 0x1

    .line 1684
    .line 1685
    aput-object v33, v13, v11

    .line 1686
    .line 1687
    add-int/lit8 v11, v24, 0x1

    .line 1688
    .line 1689
    move/from16 v39, v11

    .line 1690
    .line 1691
    move v11, v7

    .line 1692
    move/from16 v7, v39

    .line 1693
    .line 1694
    goto/16 :goto_3f

    .line 1695
    .line 1696
    :cond_66
    const/4 v12, 0x1

    .line 1697
    if-le v3, v12, :cond_67

    .line 1698
    .line 1699
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1700
    .line 1701
    .line 1702
    move-result v7

    .line 1703
    if-eqz v7, :cond_67

    .line 1704
    .line 1705
    int-to-double v2, v3

    .line 1706
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1707
    .line 1708
    invoke-static {v2, v3}, Lms0;->c(D)I

    .line 1709
    .line 1710
    .line 1711
    move-result v2

    .line 1712
    const/4 v3, 0x1

    .line 1713
    :goto_46
    if-ge v3, v6, :cond_68

    .line 1714
    .line 1715
    invoke-virtual {v0, v2}, Lh00;->i(I)I

    .line 1716
    .line 1717
    .line 1718
    move-result v7

    .line 1719
    aput v7, v9, v3

    .line 1720
    .line 1721
    add-int/lit8 v3, v3, 0x1

    .line 1722
    .line 1723
    goto :goto_46

    .line 1724
    :cond_67
    const/4 v3, 0x1

    .line 1725
    :goto_47
    if-ge v3, v6, :cond_68

    .line 1726
    .line 1727
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1728
    .line 1729
    .line 1730
    move-result v7

    .line 1731
    aput v7, v9, v3

    .line 1732
    .line 1733
    add-int/lit8 v3, v3, 0x1

    .line 1734
    .line 1735
    goto :goto_47

    .line 1736
    :cond_68
    new-instance v2, Lhd5;

    .line 1737
    .line 1738
    invoke-static {v11, v13}, Lyw1;->i(I[Ljava/lang/Object;)Lgy3;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v3

    .line 1742
    invoke-direct {v2, v3, v9}, Lhd5;-><init>(Lgy3;[I)V

    .line 1743
    .line 1744
    .line 1745
    const/4 v7, 0x2

    .line 1746
    invoke-virtual {v0, v7}, Lh00;->t(I)V

    .line 1747
    .line 1748
    .line 1749
    const/4 v3, 0x1

    .line 1750
    :goto_48
    if-ge v3, v6, :cond_6a

    .line 1751
    .line 1752
    aget v7, v27, v3

    .line 1753
    .line 1754
    aget v7, v20, v7

    .line 1755
    .line 1756
    if-nez v7, :cond_69

    .line 1757
    .line 1758
    invoke-virtual {v0}, Lh00;->s()V

    .line 1759
    .line 1760
    .line 1761
    :cond_69
    add-int/lit8 v3, v3, 0x1

    .line 1762
    .line 1763
    goto :goto_48

    .line 1764
    :cond_6a
    const/4 v3, 0x1

    .line 1765
    :goto_49
    if-ge v3, v8, :cond_71

    .line 1766
    .line 1767
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1768
    .line 1769
    .line 1770
    move-result v7

    .line 1771
    move/from16 v9, v17

    .line 1772
    .line 1773
    :goto_4a
    aget v11, v32, v3

    .line 1774
    .line 1775
    if-ge v9, v11, :cond_70

    .line 1776
    .line 1777
    if-lez v9, :cond_6b

    .line 1778
    .line 1779
    if-eqz v7, :cond_6b

    .line 1780
    .line 1781
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1782
    .line 1783
    .line 1784
    move-result v11

    .line 1785
    goto :goto_4b

    .line 1786
    :cond_6b
    if-nez v9, :cond_6c

    .line 1787
    .line 1788
    const/4 v11, 0x1

    .line 1789
    goto :goto_4b

    .line 1790
    :cond_6c
    move/from16 v11, v17

    .line 1791
    .line 1792
    :goto_4b
    if-eqz v11, :cond_6f

    .line 1793
    .line 1794
    move/from16 v11, v17

    .line 1795
    .line 1796
    :goto_4c
    aget v12, v22, v3

    .line 1797
    .line 1798
    if-ge v11, v12, :cond_6e

    .line 1799
    .line 1800
    aget-object v12, v26, v3

    .line 1801
    .line 1802
    aget-boolean v12, v12, v11

    .line 1803
    .line 1804
    if-eqz v12, :cond_6d

    .line 1805
    .line 1806
    invoke-virtual {v0}, Lh00;->m()I

    .line 1807
    .line 1808
    .line 1809
    :cond_6d
    add-int/lit8 v11, v11, 0x1

    .line 1810
    .line 1811
    goto :goto_4c

    .line 1812
    :cond_6e
    invoke-virtual {v0}, Lh00;->m()I

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v0}, Lh00;->m()I

    .line 1816
    .line 1817
    .line 1818
    :cond_6f
    add-int/lit8 v9, v9, 0x1

    .line 1819
    .line 1820
    goto :goto_4a

    .line 1821
    :cond_70
    add-int/lit8 v3, v3, 0x1

    .line 1822
    .line 1823
    goto :goto_49

    .line 1824
    :cond_71
    invoke-virtual {v0}, Lh00;->m()I

    .line 1825
    .line 1826
    .line 1827
    move-result v3

    .line 1828
    const/16 v16, 0x2

    .line 1829
    .line 1830
    add-int/lit8 v3, v3, 0x2

    .line 1831
    .line 1832
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1833
    .line 1834
    .line 1835
    move-result v7

    .line 1836
    if-eqz v7, :cond_72

    .line 1837
    .line 1838
    invoke-virtual {v0, v3}, Lh00;->t(I)V

    .line 1839
    .line 1840
    .line 1841
    goto :goto_4f

    .line 1842
    :cond_72
    const/4 v7, 0x1

    .line 1843
    :goto_4d
    if-ge v7, v6, :cond_75

    .line 1844
    .line 1845
    move/from16 v8, v17

    .line 1846
    .line 1847
    :goto_4e
    if-ge v8, v7, :cond_74

    .line 1848
    .line 1849
    aget-object v9, p0, v7

    .line 1850
    .line 1851
    aget-boolean v9, v9, v8

    .line 1852
    .line 1853
    if-eqz v9, :cond_73

    .line 1854
    .line 1855
    invoke-virtual {v0, v3}, Lh00;->t(I)V

    .line 1856
    .line 1857
    .line 1858
    :cond_73
    add-int/lit8 v8, v8, 0x1

    .line 1859
    .line 1860
    goto :goto_4e

    .line 1861
    :cond_74
    add-int/lit8 v7, v7, 0x1

    .line 1862
    .line 1863
    goto :goto_4d

    .line 1864
    :cond_75
    :goto_4f
    invoke-virtual {v0}, Lh00;->m()I

    .line 1865
    .line 1866
    .line 1867
    move-result v3

    .line 1868
    const/4 v7, 0x1

    .line 1869
    :goto_50
    if-gt v7, v3, :cond_76

    .line 1870
    .line 1871
    const/16 v13, 0x8

    .line 1872
    .line 1873
    invoke-virtual {v0, v13}, Lh00;->t(I)V

    .line 1874
    .line 1875
    .line 1876
    add-int/lit8 v7, v7, 0x1

    .line 1877
    .line 1878
    goto :goto_50

    .line 1879
    :cond_76
    const/16 v13, 0x8

    .line 1880
    .line 1881
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1882
    .line 1883
    .line 1884
    move-result v3

    .line 1885
    if-eqz v3, :cond_87

    .line 1886
    .line 1887
    iget v3, v0, Lh00;->e:I

    .line 1888
    .line 1889
    if-lez v3, :cond_77

    .line 1890
    .line 1891
    rsub-int/lit8 v3, v3, 0x8

    .line 1892
    .line 1893
    invoke-virtual {v0, v3}, Lh00;->t(I)V

    .line 1894
    .line 1895
    .line 1896
    :cond_77
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1897
    .line 1898
    .line 1899
    move-result v3

    .line 1900
    if-nez v3, :cond_78

    .line 1901
    .line 1902
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1903
    .line 1904
    .line 1905
    move-result v3

    .line 1906
    goto :goto_51

    .line 1907
    :cond_78
    const/4 v3, 0x1

    .line 1908
    :goto_51
    if-eqz v3, :cond_79

    .line 1909
    .line 1910
    invoke-virtual {v0}, Lh00;->s()V

    .line 1911
    .line 1912
    .line 1913
    :cond_79
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1914
    .line 1915
    .line 1916
    move-result v3

    .line 1917
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1918
    .line 1919
    .line 1920
    move-result v7

    .line 1921
    if-nez v3, :cond_7a

    .line 1922
    .line 1923
    if-eqz v7, :cond_80

    .line 1924
    .line 1925
    :cond_7a
    move/from16 v8, v17

    .line 1926
    .line 1927
    :goto_52
    if-ge v8, v14, :cond_80

    .line 1928
    .line 1929
    move/from16 v9, v17

    .line 1930
    .line 1931
    :goto_53
    aget v11, v32, v8

    .line 1932
    .line 1933
    if-ge v9, v11, :cond_7f

    .line 1934
    .line 1935
    if-eqz v3, :cond_7b

    .line 1936
    .line 1937
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1938
    .line 1939
    .line 1940
    move-result v11

    .line 1941
    goto :goto_54

    .line 1942
    :cond_7b
    move/from16 v11, v17

    .line 1943
    .line 1944
    :goto_54
    if-eqz v7, :cond_7c

    .line 1945
    .line 1946
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1947
    .line 1948
    .line 1949
    move-result v12

    .line 1950
    goto :goto_55

    .line 1951
    :cond_7c
    move/from16 v12, v17

    .line 1952
    .line 1953
    :goto_55
    if-eqz v11, :cond_7d

    .line 1954
    .line 1955
    const/16 v11, 0x20

    .line 1956
    .line 1957
    invoke-virtual {v0, v11}, Lh00;->t(I)V

    .line 1958
    .line 1959
    .line 1960
    :cond_7d
    if-eqz v12, :cond_7e

    .line 1961
    .line 1962
    const/16 v11, 0x12

    .line 1963
    .line 1964
    invoke-virtual {v0, v11}, Lh00;->t(I)V

    .line 1965
    .line 1966
    .line 1967
    :cond_7e
    add-int/lit8 v9, v9, 0x1

    .line 1968
    .line 1969
    goto :goto_53

    .line 1970
    :cond_7f
    add-int/lit8 v8, v8, 0x1

    .line 1971
    .line 1972
    goto :goto_52

    .line 1973
    :cond_80
    invoke-virtual {v0}, Lh00;->h()Z

    .line 1974
    .line 1975
    .line 1976
    move-result v3

    .line 1977
    if-eqz v3, :cond_81

    .line 1978
    .line 1979
    const/4 v13, 0x4

    .line 1980
    invoke-virtual {v0, v13}, Lh00;->i(I)I

    .line 1981
    .line 1982
    .line 1983
    move-result v7

    .line 1984
    const/4 v12, 0x1

    .line 1985
    add-int/2addr v7, v12

    .line 1986
    goto :goto_56

    .line 1987
    :cond_81
    move v7, v6

    .line 1988
    :goto_56
    invoke-static {v7, v4}, Luc5;->f(ILjava/lang/String;)V

    .line 1989
    .line 1990
    .line 1991
    invoke-static {v7, v5}, Luc5;->f(ILjava/lang/String;)V

    .line 1992
    .line 1993
    .line 1994
    new-array v4, v7, [Ljava/lang/Object;

    .line 1995
    .line 1996
    new-array v5, v6, [I

    .line 1997
    .line 1998
    move-object v11, v4

    .line 1999
    move/from16 v4, v17

    .line 2000
    .line 2001
    move v8, v4

    .line 2002
    move v9, v8

    .line 2003
    :goto_57
    if-ge v4, v7, :cond_85

    .line 2004
    .line 2005
    const/4 v12, 0x3

    .line 2006
    invoke-virtual {v0, v12}, Lh00;->t(I)V

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v0}, Lh00;->h()Z

    .line 2010
    .line 2011
    .line 2012
    move-result v13

    .line 2013
    if-eqz v13, :cond_82

    .line 2014
    .line 2015
    const/4 v13, 0x1

    .line 2016
    :goto_58
    const/16 v14, 0x8

    .line 2017
    .line 2018
    goto :goto_59

    .line 2019
    :cond_82
    move/from16 v13, v16

    .line 2020
    .line 2021
    goto :goto_58

    .line 2022
    :goto_59
    invoke-virtual {v0, v14}, Lh00;->i(I)I

    .line 2023
    .line 2024
    .line 2025
    move-result v18

    .line 2026
    invoke-static/range {v18 .. v18}, Lc50;->f(I)I

    .line 2027
    .line 2028
    .line 2029
    move-result v12

    .line 2030
    invoke-virtual {v0, v14}, Lh00;->i(I)I

    .line 2031
    .line 2032
    .line 2033
    move-result v18

    .line 2034
    move/from16 p0, v3

    .line 2035
    .line 2036
    invoke-static/range {v18 .. v18}, Lc50;->g(I)I

    .line 2037
    .line 2038
    .line 2039
    move-result v3

    .line 2040
    invoke-virtual {v0, v14}, Lh00;->t(I)V

    .line 2041
    .line 2042
    .line 2043
    new-instance v14, Ls13;

    .line 2044
    .line 2045
    invoke-direct {v14, v12, v13, v3}, Ls13;-><init>(III)V

    .line 2046
    .line 2047
    .line 2048
    array-length v3, v11

    .line 2049
    add-int/lit8 v12, v8, 0x1

    .line 2050
    .line 2051
    invoke-static {v3, v12}, Lqw1;->b(II)I

    .line 2052
    .line 2053
    .line 2054
    move-result v3

    .line 2055
    array-length v12, v11

    .line 2056
    if-gt v3, v12, :cond_83

    .line 2057
    .line 2058
    if-eqz v9, :cond_84

    .line 2059
    .line 2060
    :cond_83
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v3

    .line 2064
    move-object v11, v3

    .line 2065
    move/from16 v9, v17

    .line 2066
    .line 2067
    :cond_84
    add-int/lit8 v3, v8, 0x1

    .line 2068
    .line 2069
    aput-object v14, v11, v8

    .line 2070
    .line 2071
    add-int/lit8 v4, v4, 0x1

    .line 2072
    .line 2073
    move v8, v3

    .line 2074
    move/from16 v3, p0

    .line 2075
    .line 2076
    goto :goto_57

    .line 2077
    :cond_85
    move/from16 p0, v3

    .line 2078
    .line 2079
    if-eqz p0, :cond_86

    .line 2080
    .line 2081
    const/4 v12, 0x1

    .line 2082
    if-le v7, v12, :cond_86

    .line 2083
    .line 2084
    move/from16 v13, v17

    .line 2085
    .line 2086
    :goto_5a
    if-ge v13, v6, :cond_86

    .line 2087
    .line 2088
    const/4 v7, 0x4

    .line 2089
    invoke-virtual {v0, v7}, Lh00;->i(I)I

    .line 2090
    .line 2091
    .line 2092
    move-result v3

    .line 2093
    aput v3, v5, v13

    .line 2094
    .line 2095
    add-int/lit8 v13, v13, 0x1

    .line 2096
    .line 2097
    goto :goto_5a

    .line 2098
    :cond_86
    new-instance v0, Lwo0;

    .line 2099
    .line 2100
    invoke-static {v8, v11}, Lyw1;->i(I[Ljava/lang/Object;)Lgy3;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v3

    .line 2104
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2105
    .line 2106
    .line 2107
    invoke-static {v3}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v3

    .line 2111
    iput-object v3, v0, Lwo0;->n:Ljava/lang/Object;

    .line 2112
    .line 2113
    iput-object v5, v0, Lwo0;->o:Ljava/lang/Object;

    .line 2114
    .line 2115
    goto :goto_5b

    .line 2116
    :cond_87
    const/4 v0, 0x0

    .line 2117
    :goto_5b
    new-instance v3, Lss0;

    .line 2118
    .line 2119
    new-instance v4, Lxc5;

    .line 2120
    .line 2121
    invoke-direct {v4, v15, v10}, Lxc5;-><init>(Lgy3;[I)V

    .line 2122
    .line 2123
    .line 2124
    invoke-direct {v3, v1, v4, v2, v0}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 2125
    .line 2126
    .line 2127
    return-object v3

    .line 2128
    :cond_88
    :goto_5c
    new-instance v0, Lss0;

    .line 2129
    .line 2130
    const/4 v1, 0x0

    .line 2131
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 2132
    .line 2133
    .line 2134
    return-object v0

    .line 2135
    :goto_5d
    new-instance v0, Lss0;

    .line 2136
    .line 2137
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 2138
    .line 2139
    .line 2140
    return-object v0

    .line 2141
    :goto_5e
    new-instance v0, Lss0;

    .line 2142
    .line 2143
    invoke-direct {v0, v1, v4, v1, v1}, Lss0;-><init>(Lgy3;Lxc5;Lhd5;Lwo0;)V

    .line 2144
    .line 2145
    .line 2146
    return-object v0
.end method

.method public static K(Lbe3;)Ljava/util/ArrayList;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lbe3;->A()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    :cond_0
    :goto_0
    move-object/from16 v20, v2

    .line 11
    .line 12
    goto/16 :goto_d

    .line 13
    .line 14
    :cond_1
    const/4 v1, 0x7

    .line 15
    invoke-virtual {v0, v1}, Lbe3;->O(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lbe3;->m()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const v4, 0x64666c38

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-ne v3, v4, :cond_3

    .line 27
    .line 28
    new-instance v3, Lbe3;

    .line 29
    .line 30
    invoke-direct {v3}, Lbe3;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v4, Ljava/util/zip/Inflater;

    .line 34
    .line 35
    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v0, v3, v4}, Lf35;->K(Lbe3;Lbe3;Ljava/util/zip/Inflater;)Z

    .line 39
    .line 40
    .line 41
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_2
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 49
    .line 50
    .line 51
    move-object v0, v3

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_3
    const v4, 0x72617720

    .line 59
    .line 60
    .line 61
    if-eq v3, v4, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iget v4, v0, Lbe3;->b:I

    .line 70
    .line 71
    iget v6, v0, Lbe3;->c:I

    .line 72
    .line 73
    :goto_2
    if-ge v4, v6, :cond_14

    .line 74
    .line 75
    invoke-virtual {v0}, Lbe3;->m()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    add-int/2addr v7, v4

    .line 80
    if-le v7, v4, :cond_0

    .line 81
    .line 82
    if-le v7, v6, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    invoke-virtual {v0}, Lbe3;->m()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    const v8, 0x6d657368

    .line 90
    .line 91
    .line 92
    if-ne v4, v8, :cond_13

    .line 93
    .line 94
    invoke-virtual {v0}, Lbe3;->m()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/16 v8, 0x2710

    .line 99
    .line 100
    if-le v4, v8, :cond_6

    .line 101
    .line 102
    :goto_3
    move/from16 v16, v1

    .line 103
    .line 104
    move-object v1, v2

    .line 105
    move-object/from16 v20, v1

    .line 106
    .line 107
    move/from16 v17, v5

    .line 108
    .line 109
    move/from16 v24, v6

    .line 110
    .line 111
    goto/16 :goto_b

    .line 112
    .line 113
    :cond_6
    new-array v8, v4, [F

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    :goto_4
    if-ge v10, v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {v0}, Lbe3;->m()I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    aput v11, v8, v10

    .line 127
    .line 128
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    invoke-virtual {v0}, Lbe3;->m()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    const/16 v11, 0x7d00

    .line 136
    .line 137
    if-le v10, v11, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 141
    .line 142
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v13

    .line 146
    move/from16 v16, v1

    .line 147
    .line 148
    move-object v15, v2

    .line 149
    int-to-double v1, v4

    .line 150
    mul-double/2addr v1, v11

    .line 151
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    div-double/2addr v1, v13

    .line 156
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    double-to-int v1, v1

    .line 161
    new-instance v2, Lh00;

    .line 162
    .line 163
    move/from16 v17, v5

    .line 164
    .line 165
    iget-object v5, v0, Lbe3;->a:[B

    .line 166
    .line 167
    array-length v9, v5

    .line 168
    invoke-direct {v2, v9, v5}, Lh00;-><init>(I[B)V

    .line 169
    .line 170
    .line 171
    iget v5, v0, Lbe3;->b:I

    .line 172
    .line 173
    const/16 v9, 0x8

    .line 174
    .line 175
    mul-int/2addr v5, v9

    .line 176
    invoke-virtual {v2, v5}, Lh00;->q(I)V

    .line 177
    .line 178
    .line 179
    mul-int/lit8 v5, v10, 0x5

    .line 180
    .line 181
    new-array v5, v5, [F

    .line 182
    .line 183
    move-wide/from16 v18, v11

    .line 184
    .line 185
    const/4 v11, 0x5

    .line 186
    new-array v12, v11, [I

    .line 187
    .line 188
    move-object/from16 v20, v15

    .line 189
    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    :goto_5
    if-ge v15, v10, :cond_d

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    :goto_6
    if-ge v9, v11, :cond_c

    .line 197
    .line 198
    aget v22, v12, v9

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 201
    .line 202
    .line 203
    move-result v23

    .line 204
    shr-int/lit8 v24, v23, 0x1

    .line 205
    .line 206
    and-int/lit8 v11, v23, 0x1

    .line 207
    .line 208
    neg-int v11, v11

    .line 209
    xor-int v11, v24, v11

    .line 210
    .line 211
    add-int v11, v11, v22

    .line 212
    .line 213
    if-ge v11, v4, :cond_a

    .line 214
    .line 215
    if-gez v11, :cond_9

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_9
    add-int/lit8 v22, v21, 0x1

    .line 219
    .line 220
    aget v23, v8, v11

    .line 221
    .line 222
    aput v23, v5, v21

    .line 223
    .line 224
    aput v11, v12, v9

    .line 225
    .line 226
    add-int/lit8 v9, v9, 0x1

    .line 227
    .line 228
    move/from16 v21, v22

    .line 229
    .line 230
    const/4 v11, 0x5

    .line 231
    goto :goto_6

    .line 232
    :cond_a
    :goto_7
    move/from16 v24, v6

    .line 233
    .line 234
    :cond_b
    :goto_8
    move-object/from16 v1, v20

    .line 235
    .line 236
    goto/16 :goto_b

    .line 237
    .line 238
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 239
    .line 240
    const/16 v9, 0x8

    .line 241
    .line 242
    const/4 v11, 0x5

    .line 243
    goto :goto_5

    .line 244
    :cond_d
    invoke-virtual {v2}, Lh00;->g()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    add-int/lit8 v1, v1, 0x7

    .line 249
    .line 250
    and-int/lit8 v1, v1, -0x8

    .line 251
    .line 252
    invoke-virtual {v2, v1}, Lh00;->q(I)V

    .line 253
    .line 254
    .line 255
    const/16 v1, 0x20

    .line 256
    .line 257
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    new-array v8, v4, [Ltu;

    .line 262
    .line 263
    const/4 v9, 0x0

    .line 264
    :goto_9
    if-ge v9, v4, :cond_11

    .line 265
    .line 266
    const/16 v11, 0x8

    .line 267
    .line 268
    invoke-virtual {v2, v11}, Lh00;->i(I)I

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    invoke-virtual {v2, v11}, Lh00;->i(I)I

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    const v1, 0x1f400

    .line 281
    .line 282
    .line 283
    if-le v11, v1, :cond_e

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_e
    move/from16 v22, v4

    .line 287
    .line 288
    move-object v1, v5

    .line 289
    int-to-double v4, v10

    .line 290
    mul-double v4, v4, v18

    .line 291
    .line 292
    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    div-double/2addr v4, v13

    .line 297
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 298
    .line 299
    .line 300
    move-result-wide v4

    .line 301
    double-to-int v4, v4

    .line 302
    mul-int/lit8 v5, v11, 0x3

    .line 303
    .line 304
    new-array v5, v5, [F

    .line 305
    .line 306
    move-object/from16 v23, v1

    .line 307
    .line 308
    mul-int/lit8 v1, v11, 0x2

    .line 309
    .line 310
    new-array v1, v1, [F

    .line 311
    .line 312
    move/from16 v24, v6

    .line 313
    .line 314
    const/4 v6, 0x0

    .line 315
    const/16 v25, 0x0

    .line 316
    .line 317
    :goto_a
    if-ge v6, v11, :cond_10

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Lh00;->i(I)I

    .line 320
    .line 321
    .line 322
    move-result v26

    .line 323
    shr-int/lit8 v27, v26, 0x1

    .line 324
    .line 325
    move-object/from16 v28, v2

    .line 326
    .line 327
    and-int/lit8 v2, v26, 0x1

    .line 328
    .line 329
    neg-int v2, v2

    .line 330
    xor-int v2, v27, v2

    .line 331
    .line 332
    add-int v2, v2, v25

    .line 333
    .line 334
    if-ltz v2, :cond_b

    .line 335
    .line 336
    if-lt v2, v10, :cond_f

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_f
    mul-int/lit8 v25, v6, 0x3

    .line 340
    .line 341
    mul-int/lit8 v26, v2, 0x5

    .line 342
    .line 343
    aget v27, v23, v26

    .line 344
    .line 345
    aput v27, v5, v25

    .line 346
    .line 347
    add-int/lit8 v27, v25, 0x1

    .line 348
    .line 349
    add-int/lit8 v29, v26, 0x1

    .line 350
    .line 351
    aget v29, v23, v29

    .line 352
    .line 353
    aput v29, v5, v27

    .line 354
    .line 355
    add-int/lit8 v25, v25, 0x2

    .line 356
    .line 357
    add-int/lit8 v27, v26, 0x2

    .line 358
    .line 359
    aget v27, v23, v27

    .line 360
    .line 361
    aput v27, v5, v25

    .line 362
    .line 363
    mul-int/lit8 v25, v6, 0x2

    .line 364
    .line 365
    add-int/lit8 v27, v26, 0x3

    .line 366
    .line 367
    aget v27, v23, v27

    .line 368
    .line 369
    aput v27, v1, v25

    .line 370
    .line 371
    add-int/lit8 v25, v25, 0x1

    .line 372
    .line 373
    add-int/lit8 v26, v26, 0x4

    .line 374
    .line 375
    aget v26, v23, v26

    .line 376
    .line 377
    aput v26, v1, v25

    .line 378
    .line 379
    add-int/lit8 v6, v6, 0x1

    .line 380
    .line 381
    move/from16 v25, v2

    .line 382
    .line 383
    move-object/from16 v2, v28

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_10
    move-object/from16 v28, v2

    .line 387
    .line 388
    new-instance v2, Ltu;

    .line 389
    .line 390
    invoke-direct {v2, v12, v15, v5, v1}, Ltu;-><init>(II[F[F)V

    .line 391
    .line 392
    .line 393
    aput-object v2, v8, v9

    .line 394
    .line 395
    add-int/lit8 v9, v9, 0x1

    .line 396
    .line 397
    move/from16 v4, v22

    .line 398
    .line 399
    move-object/from16 v5, v23

    .line 400
    .line 401
    move/from16 v6, v24

    .line 402
    .line 403
    move-object/from16 v2, v28

    .line 404
    .line 405
    const/16 v1, 0x20

    .line 406
    .line 407
    goto/16 :goto_9

    .line 408
    .line 409
    :cond_11
    move/from16 v24, v6

    .line 410
    .line 411
    new-instance v1, Llr3;

    .line 412
    .line 413
    invoke-direct {v1, v8}, Llr3;-><init>([Ltu;)V

    .line 414
    .line 415
    .line 416
    :goto_b
    if-nez v1, :cond_12

    .line 417
    .line 418
    goto :goto_d

    .line 419
    :cond_12
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_13
    move/from16 v16, v1

    .line 424
    .line 425
    move-object/from16 v20, v2

    .line 426
    .line 427
    move/from16 v17, v5

    .line 428
    .line 429
    move/from16 v24, v6

    .line 430
    .line 431
    :goto_c
    invoke-virtual {v0, v7}, Lbe3;->N(I)V

    .line 432
    .line 433
    .line 434
    move v4, v7

    .line 435
    move/from16 v1, v16

    .line 436
    .line 437
    move/from16 v5, v17

    .line 438
    .line 439
    move-object/from16 v2, v20

    .line 440
    .line 441
    move/from16 v6, v24

    .line 442
    .line 443
    goto/16 :goto_2

    .line 444
    .line 445
    :goto_d
    return-object v20

    .line 446
    :cond_14
    return-object v3
.end method

.method public static L([BII)Lu13;
    .locals 30

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p1, 0x1

    .line 3
    .line 4
    new-instance v2, Lh00;

    .line 5
    .line 6
    move-object/from16 v3, p0

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v2, v3, v1, v4}, Lh00;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v2}, Lh00;->m()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/16 v3, 0x56

    .line 32
    .line 33
    const/16 v8, 0x2c

    .line 34
    .line 35
    const/16 v9, 0xf4

    .line 36
    .line 37
    const/16 v10, 0x7a

    .line 38
    .line 39
    const/16 v11, 0x6e

    .line 40
    .line 41
    const/4 v12, 0x3

    .line 42
    const/16 v15, 0x64

    .line 43
    .line 44
    if-eq v4, v15, :cond_1

    .line 45
    .line 46
    if-eq v4, v11, :cond_1

    .line 47
    .line 48
    if-eq v4, v10, :cond_1

    .line 49
    .line 50
    if-eq v4, v9, :cond_1

    .line 51
    .line 52
    if-eq v4, v8, :cond_1

    .line 53
    .line 54
    const/16 v14, 0x53

    .line 55
    .line 56
    if-eq v4, v14, :cond_1

    .line 57
    .line 58
    if-eq v4, v3, :cond_1

    .line 59
    .line 60
    const/16 v14, 0x76

    .line 61
    .line 62
    if-eq v4, v14, :cond_1

    .line 63
    .line 64
    const/16 v14, 0x80

    .line 65
    .line 66
    if-eq v4, v14, :cond_1

    .line 67
    .line 68
    const/16 v14, 0x8a

    .line 69
    .line 70
    if-ne v4, v14, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v14, v0

    .line 74
    const/16 p1, 0x10

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v13, 0x0

    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lh00;->m()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-ne v14, v12, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lh00;->h()Z

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/16 v16, 0x0

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v2}, Lh00;->m()I

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    invoke-virtual {v2}, Lh00;->m()I

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    invoke-virtual {v2}, Lh00;->s()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lh00;->h()Z

    .line 107
    .line 108
    .line 109
    move-result v19

    .line 110
    if-eqz v19, :cond_8

    .line 111
    .line 112
    if-eq v14, v12, :cond_3

    .line 113
    .line 114
    move v13, v1

    .line 115
    :goto_2
    const/16 p1, 0x10

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    const/16 v19, 0xc

    .line 119
    .line 120
    move/from16 v13, v19

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    const/4 v1, 0x0

    .line 124
    :goto_4
    if-ge v1, v13, :cond_9

    .line 125
    .line 126
    invoke-virtual {v2}, Lh00;->h()Z

    .line 127
    .line 128
    .line 129
    move-result v19

    .line 130
    if-eqz v19, :cond_7

    .line 131
    .line 132
    const/4 v9, 0x6

    .line 133
    if-ge v1, v9, :cond_4

    .line 134
    .line 135
    move/from16 v9, p1

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    const/16 v9, 0x40

    .line 139
    .line 140
    :goto_5
    const/4 v10, 0x0

    .line 141
    const/16 v20, 0x8

    .line 142
    .line 143
    const/16 v21, 0x8

    .line 144
    .line 145
    :goto_6
    if-ge v10, v9, :cond_7

    .line 146
    .line 147
    if-eqz v20, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2}, Lh00;->n()I

    .line 150
    .line 151
    .line 152
    move-result v20

    .line 153
    add-int v11, v20, v21

    .line 154
    .line 155
    add-int/lit16 v11, v11, 0x100

    .line 156
    .line 157
    rem-int/lit16 v11, v11, 0x100

    .line 158
    .line 159
    move/from16 v20, v11

    .line 160
    .line 161
    :cond_5
    if-nez v20, :cond_6

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_6
    move/from16 v21, v20

    .line 165
    .line 166
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    const/16 v11, 0x6e

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    const/16 v9, 0xf4

    .line 174
    .line 175
    const/16 v10, 0x7a

    .line 176
    .line 177
    const/16 v11, 0x6e

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_8
    const/16 p1, 0x10

    .line 181
    .line 182
    :cond_9
    move/from16 v13, v16

    .line 183
    .line 184
    move/from16 v11, v17

    .line 185
    .line 186
    :goto_8
    invoke-virtual {v2}, Lh00;->m()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    add-int/lit8 v1, v1, 0x4

    .line 191
    .line 192
    invoke-virtual {v2}, Lh00;->m()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-nez v9, :cond_a

    .line 197
    .line 198
    invoke-virtual {v2}, Lh00;->m()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    add-int/lit8 v10, v10, 0x4

    .line 203
    .line 204
    move/from16 v17, v4

    .line 205
    .line 206
    move/from16 v23, v9

    .line 207
    .line 208
    move/from16 v3, v18

    .line 209
    .line 210
    :goto_9
    const/16 v18, 0x0

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_a
    if-ne v9, v0, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Lh00;->h()Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual {v2}, Lh00;->n()I

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lh00;->n()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Lh00;->m()I

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    move/from16 v17, v4

    .line 230
    .line 231
    int-to-long v3, v15

    .line 232
    move/from16 v23, v9

    .line 233
    .line 234
    const/4 v15, 0x0

    .line 235
    :goto_a
    int-to-long v8, v15

    .line 236
    cmp-long v8, v8, v3

    .line 237
    .line 238
    if-gez v8, :cond_b

    .line 239
    .line 240
    invoke-virtual {v2}, Lh00;->m()I

    .line 241
    .line 242
    .line 243
    add-int/lit8 v15, v15, 0x1

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_b
    move/from16 v3, v18

    .line 247
    .line 248
    move/from16 v18, v10

    .line 249
    .line 250
    const/4 v10, 0x0

    .line 251
    goto :goto_b

    .line 252
    :cond_c
    move/from16 v17, v4

    .line 253
    .line 254
    move/from16 v23, v9

    .line 255
    .line 256
    move/from16 v3, v18

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    goto :goto_9

    .line 260
    :goto_b
    invoke-virtual {v2}, Lh00;->m()I

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Lh00;->s()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Lh00;->m()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    add-int/2addr v4, v0

    .line 271
    invoke-virtual {v2}, Lh00;->m()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    add-int/2addr v8, v0

    .line 276
    invoke-virtual {v2}, Lh00;->h()Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    rsub-int/lit8 v15, v9, 0x2

    .line 281
    .line 282
    mul-int/2addr v8, v15

    .line 283
    if-nez v9, :cond_d

    .line 284
    .line 285
    invoke-virtual {v2}, Lh00;->s()V

    .line 286
    .line 287
    .line 288
    :cond_d
    invoke-virtual {v2}, Lh00;->s()V

    .line 289
    .line 290
    .line 291
    mul-int/lit8 v4, v4, 0x10

    .line 292
    .line 293
    mul-int/lit8 v8, v8, 0x10

    .line 294
    .line 295
    invoke-virtual {v2}, Lh00;->h()Z

    .line 296
    .line 297
    .line 298
    move-result v24

    .line 299
    const/16 v25, 0x2

    .line 300
    .line 301
    if-eqz v24, :cond_11

    .line 302
    .line 303
    invoke-virtual {v2}, Lh00;->m()I

    .line 304
    .line 305
    .line 306
    move-result v24

    .line 307
    invoke-virtual {v2}, Lh00;->m()I

    .line 308
    .line 309
    .line 310
    move-result v26

    .line 311
    invoke-virtual {v2}, Lh00;->m()I

    .line 312
    .line 313
    .line 314
    move-result v27

    .line 315
    invoke-virtual {v2}, Lh00;->m()I

    .line 316
    .line 317
    .line 318
    move-result v28

    .line 319
    if-nez v14, :cond_e

    .line 320
    .line 321
    move/from16 v29, v0

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_e
    if-ne v14, v12, :cond_f

    .line 325
    .line 326
    move/from16 v29, v0

    .line 327
    .line 328
    goto :goto_c

    .line 329
    :cond_f
    move/from16 v29, v25

    .line 330
    .line 331
    :goto_c
    if-ne v14, v0, :cond_10

    .line 332
    .line 333
    move/from16 v14, v25

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_10
    move v14, v0

    .line 337
    :goto_d
    mul-int/2addr v15, v14

    .line 338
    :goto_e
    add-int v24, v24, v26

    .line 339
    .line 340
    mul-int v24, v24, v29

    .line 341
    .line 342
    sub-int v4, v4, v24

    .line 343
    .line 344
    add-int v27, v27, v28

    .line 345
    .line 346
    mul-int v27, v27, v15

    .line 347
    .line 348
    sub-int v8, v8, v27

    .line 349
    .line 350
    :cond_11
    move v14, v9

    .line 351
    const/16 v15, 0x2c

    .line 352
    .line 353
    move v9, v8

    .line 354
    move v8, v4

    .line 355
    move/from16 v4, v17

    .line 356
    .line 357
    if-eq v4, v15, :cond_12

    .line 358
    .line 359
    const/16 v15, 0x56

    .line 360
    .line 361
    if-eq v4, v15, :cond_12

    .line 362
    .line 363
    const/16 v15, 0x64

    .line 364
    .line 365
    if-eq v4, v15, :cond_12

    .line 366
    .line 367
    const/16 v15, 0x6e

    .line 368
    .line 369
    if-eq v4, v15, :cond_12

    .line 370
    .line 371
    const/16 v15, 0x7a

    .line 372
    .line 373
    if-eq v4, v15, :cond_12

    .line 374
    .line 375
    const/16 v15, 0xf4

    .line 376
    .line 377
    if-ne v4, v15, :cond_13

    .line 378
    .line 379
    :cond_12
    and-int/lit8 v15, v5, 0x10

    .line 380
    .line 381
    if-eqz v15, :cond_13

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    goto :goto_f

    .line 385
    :cond_13
    move/from16 v15, p1

    .line 386
    .line 387
    :goto_f
    invoke-virtual {v2}, Lh00;->h()Z

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    const/16 v17, -0x1

    .line 392
    .line 393
    const/high16 v19, 0x3f800000    # 1.0f

    .line 394
    .line 395
    if-eqz v16, :cond_22

    .line 396
    .line 397
    invoke-virtual {v2}, Lh00;->h()Z

    .line 398
    .line 399
    .line 400
    move-result v16

    .line 401
    if-eqz v16, :cond_14

    .line 402
    .line 403
    const/16 v0, 0x8

    .line 404
    .line 405
    invoke-virtual {v2, v0}, Lh00;->i(I)I

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    const/16 v0, 0xff

    .line 410
    .line 411
    if-ne v12, v0, :cond_15

    .line 412
    .line 413
    move/from16 v0, p1

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Lh00;->i(I)I

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    invoke-virtual {v2, v0}, Lh00;->i(I)I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v12, :cond_14

    .line 424
    .line 425
    if-eqz v0, :cond_14

    .line 426
    .line 427
    int-to-float v12, v12

    .line 428
    int-to-float v0, v0

    .line 429
    div-float v19, v12, v0

    .line 430
    .line 431
    :cond_14
    :goto_10
    move/from16 p1, v1

    .line 432
    .line 433
    goto :goto_11

    .line 434
    :cond_15
    const/16 v0, 0x11

    .line 435
    .line 436
    if-ge v12, v0, :cond_16

    .line 437
    .line 438
    sget-object v0, Luc5;->d:[F

    .line 439
    .line 440
    aget v19, v0, v12

    .line 441
    .line 442
    goto :goto_10

    .line 443
    :cond_16
    const-string v0, "NalUnitUtil"

    .line 444
    .line 445
    move/from16 p1, v1

    .line 446
    .line 447
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 448
    .line 449
    invoke-static {v12, v1, v0}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :goto_11
    invoke-virtual {v2}, Lh00;->h()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_17

    .line 457
    .line 458
    invoke-virtual {v2}, Lh00;->s()V

    .line 459
    .line 460
    .line 461
    :cond_17
    invoke-virtual {v2}, Lh00;->h()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_1a

    .line 466
    .line 467
    const/4 v0, 0x3

    .line 468
    invoke-virtual {v2, v0}, Lh00;->t(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Lh00;->h()Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_18

    .line 476
    .line 477
    const/4 v0, 0x1

    .line 478
    goto :goto_12

    .line 479
    :cond_18
    move/from16 v0, v25

    .line 480
    .line 481
    :goto_12
    invoke-virtual {v2}, Lh00;->h()Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_19

    .line 486
    .line 487
    const/16 v1, 0x8

    .line 488
    .line 489
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    invoke-virtual {v2, v1}, Lh00;->i(I)I

    .line 494
    .line 495
    .line 496
    move-result v16

    .line 497
    invoke-virtual {v2, v1}, Lh00;->t(I)V

    .line 498
    .line 499
    .line 500
    invoke-static {v12}, Lc50;->f(I)I

    .line 501
    .line 502
    .line 503
    move-result v17

    .line 504
    invoke-static/range {v16 .. v16}, Lc50;->g(I)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    goto :goto_13

    .line 509
    :cond_19
    move/from16 v1, v17

    .line 510
    .line 511
    goto :goto_13

    .line 512
    :cond_1a
    move/from16 v0, v17

    .line 513
    .line 514
    move v1, v0

    .line 515
    :goto_13
    invoke-virtual {v2}, Lh00;->h()Z

    .line 516
    .line 517
    .line 518
    move-result v12

    .line 519
    if-eqz v12, :cond_1b

    .line 520
    .line 521
    invoke-virtual {v2}, Lh00;->m()I

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Lh00;->m()I

    .line 525
    .line 526
    .line 527
    :cond_1b
    invoke-virtual {v2}, Lh00;->h()Z

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    if-eqz v12, :cond_1c

    .line 532
    .line 533
    const/16 v12, 0x41

    .line 534
    .line 535
    invoke-virtual {v2, v12}, Lh00;->t(I)V

    .line 536
    .line 537
    .line 538
    :cond_1c
    invoke-virtual {v2}, Lh00;->h()Z

    .line 539
    .line 540
    .line 541
    move-result v12

    .line 542
    if-eqz v12, :cond_1d

    .line 543
    .line 544
    invoke-static {v2}, Luc5;->W(Lh00;)V

    .line 545
    .line 546
    .line 547
    :cond_1d
    invoke-virtual {v2}, Lh00;->h()Z

    .line 548
    .line 549
    .line 550
    move-result v16

    .line 551
    if-eqz v16, :cond_1e

    .line 552
    .line 553
    invoke-static {v2}, Luc5;->W(Lh00;)V

    .line 554
    .line 555
    .line 556
    :cond_1e
    if-nez v12, :cond_1f

    .line 557
    .line 558
    if-eqz v16, :cond_20

    .line 559
    .line 560
    :cond_1f
    invoke-virtual {v2}, Lh00;->s()V

    .line 561
    .line 562
    .line 563
    :cond_20
    invoke-virtual {v2}, Lh00;->s()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Lh00;->h()Z

    .line 567
    .line 568
    .line 569
    move-result v12

    .line 570
    if-eqz v12, :cond_21

    .line 571
    .line 572
    invoke-virtual {v2}, Lh00;->s()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2}, Lh00;->m()I

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2}, Lh00;->m()I

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2}, Lh00;->m()I

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Lh00;->m()I

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Lh00;->m()I

    .line 588
    .line 589
    .line 590
    move-result v15

    .line 591
    invoke-virtual {v2}, Lh00;->m()I

    .line 592
    .line 593
    .line 594
    :cond_21
    move/from16 v12, v17

    .line 595
    .line 596
    move/from16 v17, v10

    .line 597
    .line 598
    move/from16 v10, v19

    .line 599
    .line 600
    move/from16 v19, v12

    .line 601
    .line 602
    move/from16 v20, v0

    .line 603
    .line 604
    move/from16 v21, v1

    .line 605
    .line 606
    move v12, v3

    .line 607
    move/from16 v22, v15

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :cond_22
    move/from16 p1, v1

    .line 611
    .line 612
    move v12, v3

    .line 613
    move/from16 v22, v15

    .line 614
    .line 615
    move/from16 v20, v17

    .line 616
    .line 617
    move/from16 v21, v20

    .line 618
    .line 619
    move/from16 v17, v10

    .line 620
    .line 621
    move/from16 v10, v19

    .line 622
    .line 623
    move/from16 v19, v21

    .line 624
    .line 625
    :goto_14
    new-instance v3, Lu13;

    .line 626
    .line 627
    move/from16 v15, p1

    .line 628
    .line 629
    move/from16 v16, v23

    .line 630
    .line 631
    invoke-direct/range {v3 .. v22}, Lu13;-><init>(IIIIIIFIIZZIIIZIIII)V

    .line 632
    .line 633
    .line 634
    return-object v3
.end method

.method public static final M(Lba1;)Lug0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lug0;->n:Lug0;

    .line 10
    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sget-object v3, Lug0;->o:Lug0;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    if-eq v0, p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x3

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_1
    return-object v3

    .line 31
    :cond_2
    invoke-static {p0}, Lte5;->s(Lba1;)Lba1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_8

    .line 36
    .line 37
    invoke-static {v0}, Luc5;->M(Lba1;)Lug0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne v0, v1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move-object v2, v0

    .line 45
    :goto_0
    if-nez v2, :cond_7

    .line 46
    .line 47
    iget-boolean v0, p0, Lba1;->C:Z

    .line 48
    .line 49
    if-nez v0, :cond_6

    .line 50
    .line 51
    iput-boolean v4, p0, Lba1;->C:Z

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    :try_start_0
    invoke-virtual {p0}, Lba1;->s0()Lx91;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lra;

    .line 63
    .line 64
    invoke-virtual {v4}, Lra;->getFocusOwner()Lu91;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ley;

    .line 69
    .line 70
    invoke-virtual {v4}, Ley;->f()Lba1;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iget-object v2, v2, Lx91;->k:Lk2;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ley;->f()Lba1;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eq v5, v2, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    sget-object v1, Ly91;->d:Ly91;

    .line 88
    .line 89
    sget-object v2, Ly91;->c:Ly91;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    if-ne v1, v2, :cond_4

    .line 92
    .line 93
    iput-boolean v0, p0, Lba1;->C:Z

    .line 94
    .line 95
    return-object v3

    .line 96
    :cond_4
    :try_start_1
    sget-object v1, Lug0;->p:Lug0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    iput-boolean v0, p0, Lba1;->C:Z

    .line 99
    .line 100
    return-object v1

    .line 101
    :catchall_0
    move-exception v1

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    iput-boolean v0, p0, Lba1;->C:Z

    .line 104
    .line 105
    return-object v1

    .line 106
    :goto_1
    iput-boolean v0, p0, Lba1;->C:Z

    .line 107
    .line 108
    throw v1

    .line 109
    :cond_6
    return-object v1

    .line 110
    :cond_7
    return-object v2

    .line 111
    :cond_8
    const-string p0, "ActiveParent with no focused child"

    .line 112
    .line 113
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_9
    :goto_2
    return-object v1
.end method

.method public static final N(Lba1;)Lug0;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lba1;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lba1;->D:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p0}, Lba1;->s0()Lx91;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lra;

    .line 18
    .line 19
    invoke-virtual {v2}, Lra;->getFocusOwner()Lu91;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ley;

    .line 24
    .line 25
    invoke-virtual {v2}, Ley;->f()Lba1;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v1, v1, Lx91;->j:Lk2;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ley;->f()Lba1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eq v3, v1, :cond_1

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    sget-object v1, Ly91;->d:Ly91;

    .line 43
    .line 44
    sget-object v2, Ly91;->c:Ly91;

    .line 45
    .line 46
    if-ne v1, v2, :cond_0

    .line 47
    .line 48
    sget-object v1, Lug0;->o:Lug0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    iput-boolean v0, p0, Lba1;->D:Z

    .line 51
    .line 52
    return-object v1

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    :try_start_1
    sget-object v1, Lug0;->p:Lug0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    iput-boolean v0, p0, Lba1;->D:Z

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_1
    iput-boolean v0, p0, Lba1;->D:Z

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_0
    iput-boolean v0, p0, Lba1;->D:Z

    .line 64
    .line 65
    throw v1

    .line 66
    :cond_2
    :goto_1
    sget-object p0, Lug0;->n:Lug0;

    .line 67
    .line 68
    return-object p0
.end method

.method public static final O(Lba1;)Lug0;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lug0;->n:Lug0;

    .line 10
    .line 11
    if-eqz v0, :cond_16

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v3, :cond_14

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    if-eq v0, v4, :cond_16

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    if-ne v0, v5, :cond_13

    .line 22
    .line 23
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 24
    .line 25
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-string v0, "visitAncestors called on an unattached node"

    .line 30
    .line 31
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 35
    .line 36
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 37
    .line 38
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_0
    if-eqz p0, :cond_b

    .line 43
    .line 44
    iget-object v6, p0, Lc72;->Q:Lw12;

    .line 45
    .line 46
    iget-object v6, v6, Lw12;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lcx2;

    .line 49
    .line 50
    iget v6, v6, Lcx2;->q:I

    .line 51
    .line 52
    and-int/lit16 v6, v6, 0x400

    .line 53
    .line 54
    if-eqz v6, :cond_9

    .line 55
    .line 56
    :goto_1
    if-eqz v0, :cond_9

    .line 57
    .line 58
    iget v6, v0, Lcx2;->p:I

    .line 59
    .line 60
    and-int/lit16 v6, v6, 0x400

    .line 61
    .line 62
    if-eqz v6, :cond_8

    .line 63
    .line 64
    move-object v6, v0

    .line 65
    move-object v7, v2

    .line 66
    :goto_2
    if-eqz v6, :cond_8

    .line 67
    .line 68
    instance-of v8, v6, Lba1;

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_1
    iget v8, v6, Lcx2;->p:I

    .line 74
    .line 75
    and-int/lit16 v8, v8, 0x400

    .line 76
    .line 77
    if-eqz v8, :cond_7

    .line 78
    .line 79
    instance-of v8, v6, Lfo0;

    .line 80
    .line 81
    if-eqz v8, :cond_7

    .line 82
    .line 83
    move-object v8, v6

    .line 84
    check-cast v8, Lfo0;

    .line 85
    .line 86
    iget-object v8, v8, Lfo0;->C:Lcx2;

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    :goto_3
    if-eqz v8, :cond_6

    .line 90
    .line 91
    iget v10, v8, Lcx2;->p:I

    .line 92
    .line 93
    and-int/lit16 v10, v10, 0x400

    .line 94
    .line 95
    if-eqz v10, :cond_5

    .line 96
    .line 97
    add-int/lit8 v9, v9, 0x1

    .line 98
    .line 99
    if-ne v9, v3, :cond_2

    .line 100
    .line 101
    move-object v6, v8

    .line 102
    goto :goto_4

    .line 103
    :cond_2
    if-nez v7, :cond_3

    .line 104
    .line 105
    new-instance v7, Lf13;

    .line 106
    .line 107
    const/16 v10, 0x10

    .line 108
    .line 109
    new-array v10, v10, [Lcx2;

    .line 110
    .line 111
    invoke-direct {v7, v10}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    if-eqz v6, :cond_4

    .line 115
    .line 116
    invoke-virtual {v7, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v6, v2

    .line 120
    :cond_4
    invoke-virtual {v7, v8}, Lf13;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    :goto_4
    iget-object v8, v8, Lcx2;->s:Lcx2;

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    if-ne v9, v3, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    invoke-static {v7}, Lj51;->c(Lf13;)Lcx2;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    goto :goto_2

    .line 134
    :cond_8
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_9
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_a

    .line 142
    .line 143
    iget-object v0, p0, Lc72;->Q:Lw12;

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    iget-object v0, v0, Lw12;->f:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lsq4;

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    move-object v0, v2

    .line 153
    goto :goto_0

    .line 154
    :cond_b
    move-object v6, v2

    .line 155
    :goto_5
    check-cast v6, Lba1;

    .line 156
    .line 157
    if-nez v6, :cond_c

    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_c
    invoke-virtual {v6}, Lba1;->v0()Lz91;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_12

    .line 169
    .line 170
    if-eq p0, v3, :cond_11

    .line 171
    .line 172
    if-eq p0, v4, :cond_10

    .line 173
    .line 174
    if-ne p0, v5, :cond_f

    .line 175
    .line 176
    invoke-static {v6}, Luc5;->O(Lba1;)Lug0;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, v1, :cond_d

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_d
    move-object v2, p0

    .line 184
    :goto_6
    if-nez v2, :cond_e

    .line 185
    .line 186
    invoke-static {v6}, Luc5;->N(Lba1;)Lug0;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :cond_e
    return-object v2

    .line 192
    :cond_f
    invoke-static {}, Ler1;->n()V

    .line 193
    .line 194
    .line 195
    return-object v2

    .line 196
    :cond_10
    sget-object p0, Lug0;->o:Lug0;

    .line 197
    .line 198
    return-object p0

    .line 199
    :cond_11
    invoke-static {v6}, Luc5;->O(Lba1;)Lug0;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_12
    invoke-static {v6}, Luc5;->N(Lba1;)Lug0;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :cond_13
    invoke-static {}, Ler1;->n()V

    .line 210
    .line 211
    .line 212
    return-object v2

    .line 213
    :cond_14
    invoke-static {p0}, Lte5;->s(Lba1;)Lba1;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-eqz p0, :cond_15

    .line 218
    .line 219
    invoke-static {p0}, Luc5;->M(Lba1;)Lug0;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    return-object p0

    .line 224
    :cond_15
    const-string p0, "ActiveParent with no focused child"

    .line 225
    .line 226
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v2

    .line 230
    :cond_16
    return-object v1
.end method

.method public static final P(Lba1;Z)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 p0, 0x2

    .line 16
    if-eq v0, p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    return p1

    .line 27
    :cond_2
    invoke-static {p0}, Lte5;->s(Lba1;)Lba1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-static {v0, p1}, Luc5;->P(Lba1;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move p1, v1

    .line 39
    :goto_0
    if-eqz p1, :cond_4

    .line 40
    .line 41
    sget-object p1, Lz91;->o:Lz91;

    .line 42
    .line 43
    sget-object v0, Lz91;->p:Lz91;

    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lba1;->r0(Lz91;Lz91;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_4
    return v2

    .line 50
    :cond_5
    :goto_1
    return v1
.end method

.method public static final Q(Lz34;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "seq"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "from"

    .line 14
    .line 15
    invoke-static {p0, v2}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "to"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {}, Lgb;->r()Lqb2;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :goto_0
    invoke-interface {p0}, Lz34;->O()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    new-instance v5, Lob1;

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lz34;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    long-to-int v6, v6

    .line 42
    invoke-interface {p0, v1}, Lz34;->getLong(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    long-to-int v7, v7

    .line 47
    invoke-interface {p0, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-interface {p0, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-direct {v5, v6, v7, v8, v9}, Lob1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lqb2;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {v4}, Lgb;->f(Lqb2;)Lqb2;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lq40;->J0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static final R(Lx34;Ljava/lang/String;Z)Lqq4;
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PRAGMA index_xinfo(`"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "`)"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :try_start_0
    const-string v0, "seqno"

    .line 25
    .line 26
    invoke-static {p0, v0}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v1, "cid"

    .line 31
    .line 32
    invoke-static {p0, v1}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v2, "name"

    .line 37
    .line 38
    invoke-static {p0, v2}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "desc"

    .line 43
    .line 44
    invoke-static {p0, v3}, Lrr2;->y(Lz34;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, -0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-eq v0, v4, :cond_6

    .line 51
    .line 52
    if-eq v1, v4, :cond_6

    .line 53
    .line 54
    if-eq v2, v4, :cond_6

    .line 55
    .line 56
    if-ne v3, v4, :cond_0

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-interface {p0}, Lz34;->O()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-interface {p0, v1}, Lz34;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    long-to-int v7, v7

    .line 81
    if-gez v7, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-interface {p0, v0}, Lz34;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    long-to-int v7, v7

    .line 89
    invoke-interface {p0, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {p0, v3}, Lz34;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    cmp-long v9, v9, v11

    .line 100
    .line 101
    if-lez v9, :cond_2

    .line 102
    .line 103
    const-string v9, "DESC"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_2
    const-string v9, "ASC"

    .line 110
    .line 111
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/Iterable;

    .line 131
    .line 132
    new-instance v1, Ljb2;

    .line 133
    .line 134
    const/4 v2, 0x4

    .line 135
    invoke-direct {v1, v2}, Ljb2;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    .line 143
    .line 144
    const/16 v2, 0xa

    .line 145
    .line 146
    invoke-static {v0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_4

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Ljava/util/Map$Entry;

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    invoke-static {v1}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/lang/Iterable;

    .line 188
    .line 189
    new-instance v3, Ljb2;

    .line 190
    .line 191
    const/4 v4, 0x5

    .line 192
    invoke-direct {v3, v4}, Ljb2;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v3}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v3, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-static {v1, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Ljava/util/Map$Entry;

    .line 223
    .line 224
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_5
    invoke-static {v3}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Lqq4;

    .line 239
    .line 240
    invoke-direct {v2, p1, p2, v0, v1}, Lqq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    .line 243
    invoke-static {p0, v5}, Lud3;->e(Lz34;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    return-object v2

    .line 247
    :cond_6
    :goto_4
    invoke-static {p0, v5}, Lud3;->e(Lz34;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    return-object v5

    .line 251
    :goto_5
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 252
    :catchall_1
    move-exception p2

    .line 253
    invoke-static {p0, p1}, Lud3;->e(Lz34;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    throw p2
.end method

.method public static final S(Ljava/lang/Object;Lrg1;)Lb13;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lrg1;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lj80;->a:Li80;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    check-cast v0, Lb13;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final T(Lvd0;Ljava/lang/Object;)V
    .locals 9

    .line 1
    instance-of v0, p0, Lmr0;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    check-cast p0, Lmr0;

    .line 6
    .line 7
    iget-object v0, p0, Lmr0;->q:Lpe0;

    .line 8
    .line 9
    iget-object v1, p0, Lmr0;->r:Lwd0;

    .line 10
    .line 11
    invoke-static {p1}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, La70;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v2, v4}, La70;-><init>(Ljava/lang/Throwable;Z)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {v1}, Lvd0;->getContext()Lne0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lpe0;->Y(Lne0;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iput-object v3, p0, Lmr0;->s:Ljava/lang/Object;

    .line 37
    .line 38
    iput v4, p0, Lor0;->p:I

    .line 39
    .line 40
    invoke-interface {v1}, Lvd0;->getContext()Lne0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1, p0}, Lpe0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {}, Lit4;->a()Lg21;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v5, v0, Lg21;->p:J

    .line 53
    .line 54
    const-wide v7, 0x100000000L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v2, v5, v7

    .line 60
    .line 61
    if-ltz v2, :cond_2

    .line 62
    .line 63
    iput-object v3, p0, Lmr0;->s:Ljava/lang/Object;

    .line 64
    .line 65
    iput v4, p0, Lor0;->p:I

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Lg21;->b0(Lor0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_2
    invoke-virtual {v0, v4}, Lg21;->c0(Z)V

    .line 72
    .line 73
    .line 74
    :try_start_0
    invoke-interface {v1}, Lvd0;->getContext()Lne0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v3, Lfz0;->h0:Lfz0;

    .line 79
    .line 80
    invoke-interface {v2, v3}, Lne0;->K(Lme0;)Lle0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ls22;

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-interface {v2}, Ls22;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    invoke-interface {v2}, Ls22;->q()Ljava/util/concurrent/CancellationException;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Lkb4;->o(Ljava/lang/Throwable;)Ls14;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0, p1}, Lmr0;->resumeWith(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    iget-object v2, p0, Lmr0;->t:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-interface {v1}, Lvd0;->getContext()Lne0;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3, v2}, Lte5;->R(Lne0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    sget-object v5, Lte5;->b:Lf01;

    .line 119
    .line 120
    if-eq v2, v5, :cond_4

    .line 121
    .line 122
    invoke-static {v1, v3, v2}, Ljz4;->Q(Lvd0;Lne0;Ljava/lang/Object;)Lf15;

    .line 123
    .line 124
    .line 125
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/4 v5, 0x0

    .line 128
    :goto_1
    :try_start_1
    invoke-interface {v1, p1}, Lvd0;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    :try_start_2
    invoke-virtual {v5}, Lf15;->m0()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    :cond_5
    invoke-static {v3, v2}, Lte5;->K(Lne0;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_2
    invoke-virtual {v0}, Lg21;->e0()Z

    .line 143
    .line 144
    .line 145
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    :goto_3
    invoke-virtual {v0, v4}, Lg21;->a0(Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :catchall_1
    move-exception p1

    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    :try_start_3
    invoke-virtual {v5}, Lf15;->m0()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_8

    .line 160
    .line 161
    :cond_7
    invoke-static {v3, v2}, Lte5;->K(Lne0;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    :goto_4
    :try_start_4
    invoke-virtual {p0, p1}, Lor0;->g(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :goto_5
    return-void

    .line 170
    :catchall_2
    move-exception p0

    .line 171
    invoke-virtual {v0, v4}, Lg21;->a0(Z)V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :cond_9
    invoke-interface {p0, p1}, Lvd0;->resumeWith(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public static final U(Lba1;ILif1;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 13
    .line 14
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 15
    .line 16
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_b

    .line 24
    .line 25
    iget-object v5, v1, Lc72;->Q:Lw12;

    .line 26
    .line 27
    iget-object v5, v5, Lw12;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lcx2;

    .line 30
    .line 31
    iget v5, v5, Lcx2;->q:I

    .line 32
    .line 33
    and-int/lit16 v5, v5, 0x400

    .line 34
    .line 35
    if-eqz v5, :cond_9

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_9

    .line 38
    .line 39
    iget v5, v0, Lcx2;->p:I

    .line 40
    .line 41
    and-int/lit16 v5, v5, 0x400

    .line 42
    .line 43
    if-eqz v5, :cond_8

    .line 44
    .line 45
    move-object v5, v0

    .line 46
    move-object v6, v4

    .line 47
    :goto_2
    if-eqz v5, :cond_8

    .line 48
    .line 49
    instance-of v7, v5, Lba1;

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_1
    iget v7, v5, Lcx2;->p:I

    .line 55
    .line 56
    and-int/lit16 v7, v7, 0x400

    .line 57
    .line 58
    if-eqz v7, :cond_7

    .line 59
    .line 60
    instance-of v7, v5, Lfo0;

    .line 61
    .line 62
    if-eqz v7, :cond_7

    .line 63
    .line 64
    move-object v7, v5

    .line 65
    check-cast v7, Lfo0;

    .line 66
    .line 67
    iget-object v7, v7, Lfo0;->C:Lcx2;

    .line 68
    .line 69
    move v8, v2

    .line 70
    :goto_3
    if-eqz v7, :cond_6

    .line 71
    .line 72
    iget v9, v7, Lcx2;->p:I

    .line 73
    .line 74
    and-int/lit16 v9, v9, 0x400

    .line 75
    .line 76
    if-eqz v9, :cond_5

    .line 77
    .line 78
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    if-ne v8, v3, :cond_2

    .line 81
    .line 82
    move-object v5, v7

    .line 83
    goto :goto_4

    .line 84
    :cond_2
    if-nez v6, :cond_3

    .line 85
    .line 86
    new-instance v6, Lf13;

    .line 87
    .line 88
    const/16 v9, 0x10

    .line 89
    .line 90
    new-array v9, v9, [Lcx2;

    .line 91
    .line 92
    invoke-direct {v6, v9}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz v5, :cond_4

    .line 96
    .line 97
    invoke-virtual {v6, v5}, Lf13;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v5, v4

    .line 101
    :cond_4
    invoke-virtual {v6, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_4
    iget-object v7, v7, Lcx2;->s:Lcx2;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    if-ne v8, v3, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    invoke-static {v6}, Lj51;->c(Lf13;)Lcx2;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    goto :goto_2

    .line 115
    :cond_8
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_9
    invoke-virtual {v1}, Lc72;->t()Lc72;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    iget-object v0, v1, Lc72;->Q:Lw12;

    .line 125
    .line 126
    if-eqz v0, :cond_a

    .line 127
    .line 128
    iget-object v0, v0, Lw12;->f:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lsq4;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_a
    move-object v0, v4

    .line 134
    goto :goto_0

    .line 135
    :cond_b
    move-object v5, v4

    .line 136
    :goto_5
    check-cast v5, Lba1;

    .line 137
    .line 138
    if-eqz v5, :cond_c

    .line 139
    .line 140
    invoke-virtual {v5}, Lba1;->u0()Lz72;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {p0}, Lba1;->u0()Lz72;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_c

    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_c
    invoke-virtual {p0}, Lba1;->u0()Lz72;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-eqz p0, :cond_1c

    .line 161
    .line 162
    const/4 v0, 0x5

    .line 163
    const/4 v1, 0x2

    .line 164
    if-ne p1, v0, :cond_d

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_d
    const/4 v0, 0x6

    .line 168
    if-ne p1, v0, :cond_e

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_e
    const/4 v0, 0x3

    .line 172
    if-ne p1, v0, :cond_f

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_f
    const/4 v0, 0x4

    .line 176
    if-ne p1, v0, :cond_10

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_10
    if-ne p1, v3, :cond_11

    .line 180
    .line 181
    move v0, v1

    .line 182
    goto :goto_6

    .line 183
    :cond_11
    if-ne p1, v1, :cond_1b

    .line 184
    .line 185
    move v0, v3

    .line 186
    :goto_6
    iget-object p1, p0, Lz72;->B:Ldc3;

    .line 187
    .line 188
    iget-object p1, p1, Ldc3;->a:Llm0;

    .line 189
    .line 190
    invoke-virtual {p1}, Llm0;->n()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-lez p1, :cond_1a

    .line 195
    .line 196
    iget-object p1, p0, Lz72;->B:Ldc3;

    .line 197
    .line 198
    iget-object p1, p1, Ldc3;->a:Llm0;

    .line 199
    .line 200
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-object p1, p1, Lqc3;->a:Ljava/util/List;

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-nez p1, :cond_1a

    .line 211
    .line 212
    iget-boolean p1, p0, Lcx2;->A:Z

    .line 213
    .line 214
    if-nez p1, :cond_12

    .line 215
    .line 216
    goto/16 :goto_b

    .line 217
    .line 218
    :cond_12
    invoke-virtual {p0, v0}, Lz72;->r0(I)Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iget-object v5, p0, Lz72;->B:Ldc3;

    .line 223
    .line 224
    if-eqz p1, :cond_13

    .line 225
    .line 226
    iget-object p1, v5, Ldc3;->a:Llm0;

    .line 227
    .line 228
    invoke-virtual {p1}, Llm0;->n()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    sub-int/2addr v5, v3

    .line 233
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget-object p1, p1, Lqc3;->a:Ljava/util/List;

    .line 238
    .line 239
    invoke-static {p1}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    check-cast p1, Lxi2;

    .line 244
    .line 245
    iget p1, p1, Lxi2;->a:I

    .line 246
    .line 247
    invoke-static {v5, p1}, Ljava/lang/Math;->min(II)I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    goto :goto_7

    .line 252
    :cond_13
    iget-object p1, v5, Ldc3;->a:Llm0;

    .line 253
    .line 254
    iget p1, p1, Lad3;->e:I

    .line 255
    .line 256
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    :goto_7
    new-instance v5, Ljx3;

    .line 261
    .line 262
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    iget-object v6, p0, Lz72;->C:Lhg3;

    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v7, Lv72;

    .line 271
    .line 272
    invoke-direct {v7, p1, p1}, Lv72;-><init>(II)V

    .line 273
    .line 274
    .line 275
    iget-object p1, v6, Lhg3;->o:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast p1, Lf13;

    .line 278
    .line 279
    invoke-virtual {p1, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iput-object v7, v5, Ljx3;->n:Ljava/lang/Object;

    .line 283
    .line 284
    iget-object p1, p0, Lz72;->B:Ldc3;

    .line 285
    .line 286
    iget-object p1, p1, Ldc3;->a:Llm0;

    .line 287
    .line 288
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    iget-object v6, v6, Lqc3;->a:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-nez v6, :cond_14

    .line 299
    .line 300
    move v3, v2

    .line 301
    goto :goto_8

    .line 302
    :cond_14
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-static {v6}, Lte5;->x(Lqc3;)I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    iget v7, v7, Lqc3;->b:I

    .line 315
    .line 316
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    iget p1, p1, Lqc3;->c:I

    .line 321
    .line 322
    add-int/2addr v7, p1

    .line 323
    if-nez v7, :cond_15

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_15
    div-int/2addr v6, v7

    .line 327
    if-ge v6, v3, :cond_16

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_16
    move v3, v6

    .line 331
    :goto_8
    mul-int/2addr v3, v1

    .line 332
    iget-object p1, p0, Lz72;->B:Ldc3;

    .line 333
    .line 334
    iget-object p1, p1, Ldc3;->a:Llm0;

    .line 335
    .line 336
    invoke-virtual {p1}, Llm0;->n()I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-le v3, p1, :cond_17

    .line 341
    .line 342
    move v3, p1

    .line 343
    :cond_17
    :goto_9
    if-nez v4, :cond_19

    .line 344
    .line 345
    iget-object p1, v5, Ljx3;->n:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p1, Lv72;

    .line 348
    .line 349
    invoke-virtual {p0, p1, v0}, Lz72;->q0(Lv72;I)Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    if-eqz p1, :cond_19

    .line 354
    .line 355
    if-ge v2, v3, :cond_19

    .line 356
    .line 357
    iget-object p1, v5, Ljx3;->n:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast p1, Lv72;

    .line 360
    .line 361
    iget v1, p1, Lv72;->a:I

    .line 362
    .line 363
    iget p1, p1, Lv72;->b:I

    .line 364
    .line 365
    invoke-virtual {p0, v0}, Lz72;->r0(I)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_18

    .line 370
    .line 371
    add-int/lit8 p1, p1, 0x1

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_18
    add-int/lit8 v1, v1, -0x1

    .line 375
    .line 376
    :goto_a
    iget-object v4, p0, Lz72;->C:Lhg3;

    .line 377
    .line 378
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v6, Lv72;

    .line 382
    .line 383
    invoke-direct {v6, v1, p1}, Lv72;-><init>(II)V

    .line 384
    .line 385
    .line 386
    iget-object p1, v4, Lhg3;->o:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p1, Lf13;

    .line 389
    .line 390
    invoke-virtual {p1, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object p1, p0, Lz72;->C:Lhg3;

    .line 394
    .line 395
    iget-object v1, v5, Ljx3;->n:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v1, Lv72;

    .line 398
    .line 399
    iget-object p1, p1, Lhg3;->o:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast p1, Lf13;

    .line 402
    .line 403
    invoke-virtual {p1, v1}, Lf13;->j(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    iput-object v6, v5, Ljx3;->n:Ljava/lang/Object;

    .line 407
    .line 408
    add-int/lit8 v2, v2, 0x1

    .line 409
    .line 410
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {p1}, Lc72;->l()V

    .line 415
    .line 416
    .line 417
    new-instance p1, Ly72;

    .line 418
    .line 419
    invoke-direct {p1, p0, v5, v0}, Ly72;-><init>(Lz72;Ljx3;I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {p2, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    goto :goto_9

    .line 427
    :cond_19
    iget-object p1, p0, Lz72;->C:Lhg3;

    .line 428
    .line 429
    iget-object p2, v5, Ljx3;->n:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast p2, Lv72;

    .line 432
    .line 433
    iget-object p1, p1, Lhg3;->o:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast p1, Lf13;

    .line 436
    .line 437
    invoke-virtual {p1, p2}, Lf13;->j(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    invoke-virtual {p0}, Lc72;->l()V

    .line 445
    .line 446
    .line 447
    return-object v4

    .line 448
    :cond_1a
    :goto_b
    sget-object p0, Lz72;->E:Lx72;

    .line 449
    .line 450
    invoke-interface {p2, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    return-object p0

    .line 455
    :cond_1b
    const-string p0, "Unsupported direction for beyond bounds layout"

    .line 456
    .line 457
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :cond_1c
    :goto_c
    return-object v4
.end method

.method public static V(Landroid/content/Context;J)Ljava/lang/String;
    .locals 2

    .line 1
    const-wide/32 v0, 0x40000000

    .line 2
    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    long-to-double p1, p1

    .line 9
    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    .line 10
    .line 11
    div-double/2addr p1, v0

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p2, 0x7f130232

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    long-to-double p1, p1

    .line 32
    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    .line 33
    .line 34
    div-double/2addr p1, v0

    .line 35
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const p2, 0x7f130233

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    return-object p0
.end method

.method public static W(Lh00;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh00;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lh00;->t(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh00;->m()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lh00;->m()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lh00;->s()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lh00;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final X(I)I
    .locals 1

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-static {p0}, Lxa3;->w(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x5

    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    return v0

    .line 31
    :cond_2
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_3
    const/4 p0, 0x0

    .line 34
    throw p0
.end method

.method public static final Y(Landroid/content/Context;I)Lly4;
    .locals 6

    .line 1
    sget-object v0, Llp1;->a:Llp1;

    .line 2
    .line 3
    const-string v0, "play"

    .line 4
    .line 5
    invoke-static {p1, v0}, Llp1;->a(ILjava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-string v2, "preload"

    .line 10
    .line 11
    invoke-static {p1, v2}, Llp1;->a(ILjava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    new-instance p1, Lly4;

    .line 16
    .line 17
    add-long v4, v0, v2

    .line 18
    .line 19
    invoke-static {p0, v4, v5}, Luc5;->V(Landroid/content/Context;J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {p0, v0, v1}, Luc5;->V(Landroid/content/Context;J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v2, v3}, Luc5;->V(Landroid/content/Context;J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {p1, v4, v0, p0}, Lly4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static final Z(J)J
    .locals 5

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    long-to-int v2, v0

    .line 5
    const/16 v3, 0xf

    .line 6
    .line 7
    if-gt v2, v3, :cond_0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    sget-object v3, Ls50;->u:Lk24;

    .line 11
    .line 12
    iget v3, v3, Lp50;->c:I

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    invoke-static {p0, p1}, Le35;->U(J)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long p0, p0

    .line 21
    return-wide p0

    .line 22
    :cond_1
    sget-object v3, Ls50;->v:Lk24;

    .line 23
    .line 24
    iget v3, v3, Lp50;->c:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_2

    .line 27
    .line 28
    sget-object v3, Ls50;->w:Lk24;

    .line 29
    .line 30
    iget v3, v3, Lp50;->c:I

    .line 31
    .line 32
    if-ne v2, v3, :cond_3

    .line 33
    .line 34
    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v4, 0x22

    .line 37
    .line 38
    if-ge v3, v4, :cond_3

    .line 39
    .line 40
    invoke-static {p0, p1}, Le35;->U(J)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    int-to-long p0, p0

    .line 45
    return-wide p0

    .line 46
    :cond_3
    sget-object v3, Ls50;->x:Lq83;

    .line 47
    .line 48
    iget v3, v3, Lp50;->c:I

    .line 49
    .line 50
    if-ne v2, v3, :cond_4

    .line 51
    .line 52
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v3, 0x24

    .line 55
    .line 56
    if-ge v2, v3, :cond_4

    .line 57
    .line 58
    invoke-static {p0, p1}, Le35;->U(J)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    int-to-long p0, p0

    .line 63
    return-wide p0

    .line 64
    :cond_4
    const-wide/16 v2, -0x40

    .line 65
    .line 66
    and-long/2addr p0, v2

    .line 67
    const-wide/16 v2, 0x1

    .line 68
    .line 69
    sub-long/2addr v0, v2

    .line 70
    or-long/2addr p0, v0

    .line 71
    return-wide p0
.end method

.method public static final a(Llm0;Ldx2;Lac3;Lrv2;FLgs;Lwg4;ZLif1;Ly43;Lrv2;Ltb;Lr70;Lrg1;I)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v13, p13

    const v0, 0x6eeaae29

    .line 1
    invoke-virtual {v13, v0}, Lrg1;->S(I)Lrg1;

    invoke-virtual {v13, v1}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p14, v0

    const v4, 0x586c00

    or-int/2addr v0, v4

    move/from16 v4, p7

    invoke-virtual {v13, v4}, Lrg1;->f(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/high16 v5, 0x4000000

    goto :goto_1

    :cond_1
    const/high16 v5, 0x2000000

    :goto_1
    or-int/2addr v0, v5

    const/high16 v5, 0x30000000

    or-int/2addr v0, v5

    move-object/from16 v9, p8

    invoke-virtual {v13, v9}, Lrg1;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v3

    goto :goto_2

    :cond_2
    const/4 v5, 0x2

    :goto_2
    or-int/lit16 v5, v5, 0x6590

    const v6, 0x12492493

    and-int/2addr v6, v0

    const v7, 0x12492492

    const/4 v10, 0x0

    if-ne v6, v7, :cond_4

    and-int/lit16 v6, v5, 0x2493

    const/16 v7, 0x2492

    if-eq v6, v7, :cond_3

    goto :goto_3

    :cond_3
    move v6, v10

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v6, 0x1

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v13, v7, v6}, Lrg1;->K(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    const/16 v6, -0x7f

    const/4 v7, 0x0

    .line 2
    invoke-virtual {v13, v6, v7, v10, v7}, Lrg1;->O(ILk93;ILjava/lang/Object;)V

    and-int/lit8 v6, p14, 0x1

    const v11, -0x1c00001

    if-eqz v6, :cond_6

    .line 3
    invoke-virtual {v13}, Lrg1;->w()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-boolean v6, v13, Lrg1;->w:Z

    if-nez v6, :cond_6

    invoke-virtual {v13}, Lrg1;->u()Llv3;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 4
    iget v6, v6, Llv3;->b:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_5

    goto :goto_5

    .line 5
    :cond_5
    invoke-virtual {v13}, Lrg1;->N()V

    and-int/2addr v0, v11

    and-int/lit16 v3, v5, -0x1c71

    move-object/from16 v7, p3

    move-object/from16 v11, p10

    move-object/from16 v5, p11

    move v2, v0

    move v4, v3

    move v8, v10

    const/16 v16, 0x2

    move-object/from16 v10, p5

    move-object/from16 v3, p6

    move-object/from16 v0, p9

    goto/16 :goto_9

    .line 6
    :cond_6
    :goto_5
    sget-object v6, Lrv2;->x:Lrv2;

    .line 7
    sget-object v12, Lfz0;->x:Lgs;

    and-int/lit8 v14, v0, 0xe

    const/high16 v15, 0x30000

    or-int/2addr v14, v15

    .line 8
    new-instance v15, Lsc3;

    .line 9
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 10
    sget v16, Lxj4;->a:F

    const/16 v16, 0x2

    .line 11
    sget-object v2, Lg90;->h:Lwl4;

    .line 12
    invoke-virtual {v13, v2}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    move-result-object v17

    .line 13
    move-object/from16 v7, v17

    check-cast v7, Loo0;

    const/16 v17, 0x1

    .line 14
    invoke-interface {v7}, Loo0;->g()F

    move-result v8

    invoke-virtual {v13, v8}, Lrg1;->c(F)Z

    move-result v8

    move/from16 v19, v11

    .line 15
    invoke-virtual {v13}, Lrg1;->H()Ljava/lang/Object;

    move-result-object v11

    .line 16
    sget-object v10, Lj80;->a:Li80;

    if-nez v8, :cond_7

    if-ne v11, v10, :cond_8

    .line 17
    :cond_7
    new-instance v8, Lrm2;

    invoke-direct {v8, v7}, Lrm2;-><init>(Loo0;)V

    .line 18
    new-instance v11, Lui0;

    invoke-direct {v11, v8}, Lui0;-><init>(Lrm2;)V

    .line 19
    invoke-virtual {v13, v11}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 20
    :cond_8
    check-cast v11, Lui0;

    .line 21
    sget v7, Ln85;->a:I

    .line 22
    invoke-static/range {v17 .. v17}, Lau0;->S(I)Lck4;

    move-result-object v7

    .line 23
    invoke-virtual {v13, v2}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    move-result-object v2

    .line 24
    check-cast v2, Loo0;

    .line 25
    sget-object v8, Lg90;->n:Lwl4;

    .line 26
    invoke-virtual {v13, v8}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    move-result-object v20

    .line 27
    move-object/from16 v3, v20

    check-cast v3, Lr62;

    and-int/lit8 v20, v14, 0xe

    move/from16 v22, v0

    xor-int/lit8 v0, v20, 0x6

    const/4 v4, 0x4

    if-le v0, v4, :cond_9

    .line 28
    invoke-virtual {v13, v1}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    and-int/lit8 v0, v14, 0x6

    if-ne v0, v4, :cond_b

    :cond_a
    move/from16 v0, v17

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    .line 29
    :goto_6
    invoke-virtual {v13, v11}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    .line 30
    invoke-virtual {v13, v7}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    .line 31
    invoke-virtual {v13, v15}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    .line 32
    invoke-virtual {v13, v2}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 33
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v13, v2}, Lrg1;->d(I)Z

    move-result v2

    or-int/2addr v0, v2

    .line 34
    invoke-virtual {v13}, Lrg1;->H()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_c

    if-ne v2, v10, :cond_d

    .line 35
    :cond_c
    new-instance v0, Lgc3;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v3}, Lgc3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    new-instance v2, Lrf2;

    .line 37
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object v1, v2, Lrf2;->n:Ljava/lang/Object;

    iput-object v0, v2, Lrf2;->o:Ljava/lang/Object;

    .line 39
    new-instance v0, Lwg4;

    invoke-direct {v0, v2, v11, v7}, Lwg4;-><init>(Lrf2;Lui0;Lck4;)V

    .line 40
    invoke-virtual {v13, v0}, Lrg1;->b0(Ljava/lang/Object;)V

    move-object v2, v0

    .line 41
    :cond_d
    move-object v0, v2

    check-cast v0, Lwg4;

    and-int v2, v22, v19

    and-int/lit8 v3, v22, 0xe

    or-int/lit16 v3, v3, 0x1b0

    .line 42
    invoke-virtual {v13, v8}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    move-result-object v4

    .line 43
    check-cast v4, Lr62;

    and-int/lit8 v7, v3, 0xe

    xor-int/lit8 v7, v7, 0x6

    const/4 v8, 0x4

    if-le v7, v8, :cond_e

    .line 44
    invoke-virtual {v13, v1}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_e
    and-int/lit8 v3, v3, 0x6

    if-ne v3, v8, :cond_10

    :cond_f
    move/from16 v8, v17

    goto :goto_7

    :cond_10
    const/4 v8, 0x0

    :goto_7
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v13, v3}, Lrg1;->d(I)Z

    move-result v3

    or-int/2addr v3, v8

    .line 45
    invoke-virtual {v13}, Lrg1;->H()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_11

    if-ne v7, v10, :cond_12

    .line 46
    :cond_11
    new-instance v7, Ljm0;

    invoke-direct {v7, v1, v4}, Ljm0;-><init>(Llm0;Lr62;)V

    .line 47
    invoke-virtual {v13, v7}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 48
    :cond_12
    move-object v3, v7

    check-cast v3, Ljm0;

    .line 49
    sget-object v4, Lrv2;->C:Lrv2;

    .line 50
    sget-object v7, Lsb3;->a:Ll90;

    const v7, 0x10dd5ab0

    .line 51
    invoke-virtual {v13, v7}, Lrg1;->R(I)V

    .line 52
    sget-object v7, Lsb3;->a:Ll90;

    .line 53
    invoke-virtual {v13, v7}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    move-result-object v7

    .line 54
    check-cast v7, Lub;

    if-nez v7, :cond_13

    const/4 v8, 0x0

    .line 55
    invoke-virtual {v13, v8}, Lrg1;->o(Z)V

    const/16 v18, 0x0

    goto :goto_8

    .line 56
    :cond_13
    invoke-virtual {v13, v7}, Lrg1;->e(Ljava/lang/Object;)Z

    move-result v8

    .line 57
    invoke-virtual {v13}, Lrg1;->H()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_14

    if-ne v11, v10, :cond_15

    .line 58
    :cond_14
    new-instance v20, Ltb;

    iget-object v8, v7, Lub;->a:Landroid/content/Context;

    iget-object v10, v7, Lub;->b:Loo0;

    iget-wide v14, v7, Lub;->c:J

    iget-object v7, v7, Lub;->d:Lac3;

    move-object/from16 v25, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v10

    move-wide/from16 v23, v14

    invoke-direct/range {v20 .. v25}, Ltb;-><init>(Landroid/content/Context;Loo0;JLac3;)V

    move-object/from16 v11, v20

    .line 59
    invoke-virtual {v13, v11}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 60
    :cond_15
    check-cast v11, Ltb;

    const/4 v8, 0x0

    .line 61
    invoke-virtual {v13, v8}, Lrg1;->o(Z)V

    move-object/from16 v18, v11

    :goto_8
    and-int/lit16 v5, v5, -0x1c71

    move-object v7, v3

    move-object v3, v0

    move-object v0, v7

    move-object v11, v4

    move v4, v5

    move-object v7, v6

    move-object v10, v12

    move-object/from16 v5, v18

    .line 62
    :goto_9
    invoke-virtual {v13, v8}, Lrg1;->o(Z)V

    .line 63
    invoke-virtual {v13}, Lrg1;->u()Llv3;

    move-result-object v6

    if-eqz v6, :cond_16

    .line 64
    iget v8, v6, Llv3;->b:I

    and-int/lit8 v12, v8, 0x1

    if-eqz v12, :cond_16

    or-int/lit8 v8, v8, 0x2

    .line 65
    iput v8, v6, Llv3;->b:I

    :cond_16
    shl-int/lit8 v6, v2, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/lit16 v6, v6, 0x6d86

    shr-int/lit8 v2, v2, 0x6

    const/high16 v8, 0x380000

    and-int/2addr v2, v8

    or-int/2addr v2, v6

    const/high16 v6, 0x36000000

    or-int v14, v2, v6

    shl-int/lit8 v2, v4, 0x6

    and-int/lit16 v2, v2, 0x380

    const v4, 0x1b6c06

    or-int v15, v2, v4

    move-object/from16 v2, p2

    move/from16 v6, p4

    move/from16 v4, p7

    move-object/from16 v12, p12

    move-object v8, v0

    move-object/from16 v0, p1

    .line 66
    invoke-static/range {v0 .. v15}, Lya4;->b(Ldx2;Llm0;Lac3;Lwg4;ZLtb;FLrv2;Ly43;Lif1;Lgs;Lrv2;Lr70;Lrg1;II)V

    move-object v12, v5

    move-object v4, v7

    move-object v6, v10

    move-object v7, v3

    move-object v10, v8

    goto :goto_a

    .line 67
    :cond_17
    invoke-virtual/range {p13 .. p13}, Lrg1;->N()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    .line 68
    :goto_a
    invoke-virtual/range {p13 .. p13}, Lrg1;->p()Llv3;

    move-result-object v15

    if-eqz v15, :cond_18

    new-instance v0, Lhc3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v13, p12

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lhc3;-><init>(Llm0;Ldx2;Lac3;Lrv2;FLgs;Lwg4;ZLif1;Ly43;Lrv2;Ltb;Lr70;I)V

    .line 69
    iput-object v0, v15, Llv3;->d:Lwf1;

    :cond_18
    return-void
.end method

.method public static final a0([B)Lo53;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_3

    .line 9
    .line 10
    array-length v0, p0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_4

    .line 14
    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    new-instance p0, Ljava/io/ObjectInputStream;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    new-array v2, v1, [I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :goto_0
    if-ge v4, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    aput v5, v2, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    new-array v4, v1, [I

    .line 50
    .line 51
    :goto_1
    if-ge v3, v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    aput v5, v4, v3

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-static {v4, v2}, Lfu;->n([I[I)Lo53;

    .line 63
    .line 64
    .line 65
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :catchall_1
    move-exception p0

    .line 74
    goto :goto_3

    .line 75
    :goto_2
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 76
    :catchall_2
    move-exception v2

    .line 77
    :try_start_4
    invoke-static {p0, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 81
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 82
    :catchall_3
    move-exception v1

    .line 83
    invoke-static {v0, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_3
    :goto_4
    new-instance p0, Lo53;

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, v0}, Lo53;-><init>(Landroid/net/NetworkRequest;)V

    .line 91
    .line 92
    .line 93
    return-object p0
.end method

.method public static final b([B)Ljava/util/LinkedHashSet;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length v1, p0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    new-instance p0, Ljava/io/ObjectInputStream;

    .line 19
    .line 20
    invoke-direct {p0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readBoolean()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    new-instance v6, Llc0;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-direct {v6, v5, v4}, Llc0;-><init>(ZLandroid/net/Uri;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    goto :goto_4

    .line 64
    :catch_0
    move-exception p0

    .line 65
    goto :goto_2

    .line 66
    :goto_1
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    :catchall_2
    move-exception v3

    .line 68
    :try_start_4
    invoke-static {p0, v2}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 72
    :goto_2
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 73
    .line 74
    .line 75
    :goto_3
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :goto_4
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 80
    :catchall_3
    move-exception v0

    .line 81
    invoke-static {v1, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method

.method public static b0(I[B)I
    .locals 8

    .line 1
    sget-object v0, Luc5;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p0, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p0, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p1, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p1, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p1, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p0

    .line 35
    :goto_2
    if-ge v2, p0, :cond_0

    .line 36
    .line 37
    sget-object v4, Luc5;->f:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Luc5;->f:[I

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_5

    .line 54
    :cond_3
    :goto_3
    sget-object v4, Luc5;->f:[I

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x1

    .line 57
    .line 58
    aput v2, v4, v3

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr p0, v3

    .line 65
    move v2, v1

    .line 66
    move v4, v2

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v2, v3, :cond_5

    .line 69
    .line 70
    sget-object v6, Luc5;->f:[I

    .line 71
    .line 72
    aget v6, v6, v2

    .line 73
    .line 74
    sub-int/2addr v6, v5

    .line 75
    invoke-static {p1, v5, p1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    add-int/2addr v4, v6

    .line 79
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    aput-byte v1, p1, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x2

    .line 84
    .line 85
    aput-byte v1, p1, v7

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x3

    .line 88
    .line 89
    add-int/2addr v5, v6

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-int v1, p0, v4

    .line 94
    .line 95
    invoke-static {p1, v5, p1, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return p0

    .line 100
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0
.end method

.method public static c(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 1
    sget-object v0, Lht3;->Y:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    const/4 p3, 0x1

    .line 9
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    new-instance p1, Landroid/util/TypedValue;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const v0, 0x7f040299

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0, p1, p3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    iget p2, p1, Landroid/util/TypedValue;->type:I

    .line 37
    .line 38
    const/16 p3, 0x12

    .line 39
    .line 40
    if-ne p2, p3, :cond_1

    .line 41
    .line 42
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    :cond_0
    sget-object p1, Luc5;->h:[I

    .line 47
    .line 48
    const-string p2, "Theme.MaterialComponents"

    .line 49
    .line 50
    invoke-static {p0, p1, p2}, Luc5;->h(Landroid/content/Context;[ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    sget-object p1, Luc5;->g:[I

    .line 54
    .line 55
    const-string p2, "Theme.AppCompat"

    .line 56
    .line 57
    invoke-static {p0, p1, p2}, Luc5;->h(Landroid/content/Context;[ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "null value in entry: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, "=null"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, "null key in entry: null="

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static e(Landroid/util/TypedValue;Lh33;Lh33;Ljava/lang/String;Ljava/lang/String;)Lh33;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 7
    .line 8
    const-string p2, " but found "

    .line 9
    .line 10
    const-string v0, ": "

    .line 11
    .line 12
    const-string v1, "Type is "

    .line 13
    .line 14
    invoke-static {v1, p3, p2, p4, v0}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {p1, p0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_2
    return-object p1
.end method

.method public static f(ILjava/lang/String;)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " cannot be negative but was: "

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public static varargs g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V
    .locals 5

    .line 1
    sget-object v0, Lht3;->Y:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    array-length v1, p5

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, -0x1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eq p0, v4, :cond_4

    .line 29
    .line 30
    :goto_0
    move v2, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    array-length p1, p5

    .line 37
    move p2, v2

    .line 38
    :goto_1
    if-ge p2, p1, :cond_3

    .line 39
    .line 40
    aget p3, p5, p2

    .line 41
    .line 42
    invoke-virtual {p0, p3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-ne p3, v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    const-string p0, "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."

    .line 66
    .line 67
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static h(Landroid/content/Context;[ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    array-length v1, p1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    const-string p0, "The style on this component requires your app theme to be "

    .line 22
    .line 23
    const-string p1, " (or a descendant)."

    .line 24
    .line 25
    invoke-static {p0, p2, p1}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static i([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

    .line 9
    .line 10
    return-void
.end method

.method public static j(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    invoke-interface {p0, v0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/os/Parcelable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static k(Ljava/util/List;Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroid/os/Parcelable;

    .line 22
    .line 23
    invoke-static {v2, p1}, Luc5;->j(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v0
.end method

.method public static final l(Landroid/content/Context;Lr90;)Lsc5;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v3, Lbq4;

    .line 5
    .line 6
    iget-object v0, p1, Lr90;->c:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-direct {v3, v0}, Lbq4;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v3, Lbq4;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lia4;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p1, Lr90;->d:Lxi4;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const v5, 0x7f050008

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    const-class v5, Landroidx/work/impl/WorkDatabase;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    new-instance v4, Lq24;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v4, v0, v5, v6}, Lq24;-><init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v7, v4, Lq24;->i:Z

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const-string v4, "androidx.work.workdb"

    .line 56
    .line 57
    invoke-static {v0, v5, v4}, Lvr1;->i(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lq24;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    new-instance v5, Lss2;

    .line 62
    .line 63
    const/16 v6, 0x19

    .line 64
    .line 65
    invoke-direct {v5, v6, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object v5, v4, Lq24;->h:Lss2;

    .line 69
    .line 70
    :goto_0
    iput-object v1, v4, Lq24;->f:Ljava/util/concurrent/Executor;

    .line 71
    .line 72
    new-instance v1, Lm30;

    .line 73
    .line 74
    invoke-direct {v1, v2}, Lm30;-><init>(Lxi4;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v4, Lq24;->d:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    new-array v1, v7, [Ljw2;

    .line 83
    .line 84
    sget-object v2, Lkw2;->h:Lkw2;

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    aput-object v2, v1, v8

    .line 88
    .line 89
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Lk04;

    .line 93
    .line 94
    const/4 v2, 0x3

    .line 95
    const/4 v9, 0x2

    .line 96
    invoke-direct {v1, v0, v9, v2}, Lk04;-><init>(Landroid/content/Context;II)V

    .line 97
    .line 98
    .line 99
    new-array v2, v7, [Ljw2;

    .line 100
    .line 101
    aput-object v1, v2, v8

    .line 102
    .line 103
    invoke-virtual {v4, v2}, Lq24;->a([Ljw2;)V

    .line 104
    .line 105
    .line 106
    new-array v1, v7, [Ljw2;

    .line 107
    .line 108
    sget-object v2, Lkw2;->i:Lkw2;

    .line 109
    .line 110
    aput-object v2, v1, v8

    .line 111
    .line 112
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 113
    .line 114
    .line 115
    new-array v1, v7, [Ljw2;

    .line 116
    .line 117
    sget-object v2, Lkw2;->j:Lkw2;

    .line 118
    .line 119
    aput-object v2, v1, v8

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lk04;

    .line 125
    .line 126
    const/4 v2, 0x5

    .line 127
    const/4 v5, 0x6

    .line 128
    invoke-direct {v1, v0, v2, v5}, Lk04;-><init>(Landroid/content/Context;II)V

    .line 129
    .line 130
    .line 131
    new-array v2, v7, [Ljw2;

    .line 132
    .line 133
    aput-object v1, v2, v8

    .line 134
    .line 135
    invoke-virtual {v4, v2}, Lq24;->a([Ljw2;)V

    .line 136
    .line 137
    .line 138
    new-array v1, v7, [Ljw2;

    .line 139
    .line 140
    sget-object v2, Lkw2;->k:Lkw2;

    .line 141
    .line 142
    aput-object v2, v1, v8

    .line 143
    .line 144
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 145
    .line 146
    .line 147
    new-array v1, v7, [Ljw2;

    .line 148
    .line 149
    sget-object v2, Lkw2;->l:Lkw2;

    .line 150
    .line 151
    aput-object v2, v1, v8

    .line 152
    .line 153
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 154
    .line 155
    .line 156
    new-array v1, v7, [Ljw2;

    .line 157
    .line 158
    sget-object v2, Lkw2;->m:Lkw2;

    .line 159
    .line 160
    aput-object v2, v1, v8

    .line 161
    .line 162
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 163
    .line 164
    .line 165
    new-instance v1, Lk04;

    .line 166
    .line 167
    invoke-direct {v1, v0}, Lk04;-><init>(Landroid/content/Context;)V

    .line 168
    .line 169
    .line 170
    new-array v2, v7, [Ljw2;

    .line 171
    .line 172
    aput-object v1, v2, v8

    .line 173
    .line 174
    invoke-virtual {v4, v2}, Lq24;->a([Ljw2;)V

    .line 175
    .line 176
    .line 177
    new-instance v1, Lk04;

    .line 178
    .line 179
    const/16 v2, 0xa

    .line 180
    .line 181
    const/16 v5, 0xb

    .line 182
    .line 183
    invoke-direct {v1, v0, v2, v5}, Lk04;-><init>(Landroid/content/Context;II)V

    .line 184
    .line 185
    .line 186
    new-array v2, v7, [Ljw2;

    .line 187
    .line 188
    aput-object v1, v2, v8

    .line 189
    .line 190
    invoke-virtual {v4, v2}, Lq24;->a([Ljw2;)V

    .line 191
    .line 192
    .line 193
    new-array v1, v7, [Ljw2;

    .line 194
    .line 195
    sget-object v2, Lkw2;->d:Lkw2;

    .line 196
    .line 197
    aput-object v2, v1, v8

    .line 198
    .line 199
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 200
    .line 201
    .line 202
    new-array v1, v7, [Ljw2;

    .line 203
    .line 204
    sget-object v2, Lkw2;->e:Lkw2;

    .line 205
    .line 206
    aput-object v2, v1, v8

    .line 207
    .line 208
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 209
    .line 210
    .line 211
    new-array v1, v7, [Ljw2;

    .line 212
    .line 213
    sget-object v2, Lkw2;->f:Lkw2;

    .line 214
    .line 215
    aput-object v2, v1, v8

    .line 216
    .line 217
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 218
    .line 219
    .line 220
    new-array v1, v7, [Ljw2;

    .line 221
    .line 222
    sget-object v2, Lkw2;->g:Lkw2;

    .line 223
    .line 224
    aput-object v2, v1, v8

    .line 225
    .line 226
    invoke-virtual {v4, v1}, Lq24;->a([Ljw2;)V

    .line 227
    .line 228
    .line 229
    new-instance v1, Lk04;

    .line 230
    .line 231
    const/16 v2, 0x15

    .line 232
    .line 233
    const/16 v5, 0x16

    .line 234
    .line 235
    invoke-direct {v1, v0, v2, v5}, Lk04;-><init>(Landroid/content/Context;II)V

    .line 236
    .line 237
    .line 238
    new-array v0, v7, [Ljw2;

    .line 239
    .line 240
    aput-object v1, v0, v8

    .line 241
    .line 242
    invoke-virtual {v4, v0}, Lq24;->a([Ljw2;)V

    .line 243
    .line 244
    .line 245
    iput-boolean v8, v4, Lq24;->p:Z

    .line 246
    .line 247
    iput-boolean v7, v4, Lq24;->q:Z

    .line 248
    .line 249
    invoke-virtual {v4}, Lq24;->b()Ls24;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    move-object v10, v0

    .line 254
    check-cast v10, Landroidx/work/impl/WorkDatabase;

    .line 255
    .line 256
    move-object v6, v3

    .line 257
    new-instance v3, Lz40;

    .line 258
    .line 259
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-direct {v3, v6, v0}, Lz40;-><init>(Lbq4;Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    new-instance v4, Lpq3;

    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-direct {v4, v0, p1, v6, v10}, Lpq3;-><init>(Landroid/content/Context;Lr90;Lbq4;Landroidx/work/impl/WorkDatabase;)V

    .line 276
    .line 277
    .line 278
    sget v0, Ltc5;->n:I

    .line 279
    .line 280
    sget-object v0, Lc64;->a:Ljava/lang/String;

    .line 281
    .line 282
    new-instance v11, Ldq4;

    .line 283
    .line 284
    invoke-direct {v11, p0, v10, p1}, Ldq4;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lr90;)V

    .line 285
    .line 286
    .line 287
    const-class v0, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 288
    .line 289
    invoke-static {p0, v0, v7}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 290
    .line 291
    .line 292
    invoke-static {}, Lcx;->f()Lcx;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    sget-object v1, Lc64;->a:Ljava/lang/String;

    .line 297
    .line 298
    const-string v2, "Created SystemJobScheduler and enabled SystemJobService"

    .line 299
    .line 300
    invoke-virtual {v0, v1, v2}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    new-instance v0, Ldk1;

    .line 304
    .line 305
    new-instance v5, Lrm3;

    .line 306
    .line 307
    invoke-direct {v5, v4, v6}, Lrm3;-><init>(Lpq3;Lbq4;)V

    .line 308
    .line 309
    .line 310
    move-object v1, p0

    .line 311
    move-object v2, p1

    .line 312
    invoke-direct/range {v0 .. v6}, Ldk1;-><init>(Landroid/content/Context;Lr90;Lz40;Lpq3;Lrm3;Lbq4;)V

    .line 313
    .line 314
    .line 315
    new-array p0, v9, [La64;

    .line 316
    .line 317
    aput-object v11, p0, v8

    .line 318
    .line 319
    aput-object v0, p0, v7

    .line 320
    .line 321
    invoke-static {p0}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    new-instance v0, Lsc5;

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    move-object v7, v3

    .line 332
    move-object v3, v6

    .line 333
    move-object v6, v4

    .line 334
    move-object v4, v10

    .line 335
    invoke-direct/range {v0 .. v7}, Lsc5;-><init>(Landroid/content/Context;Lr90;Lbq4;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lpq3;Lz40;)V

    .line 336
    .line 337
    .line 338
    return-object v0
.end method

.method public static final m()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final n()Lf13;
    .locals 3

    .line 1
    sget-object v0, Lph4;->b:Lz05;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz05;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lf13;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lf13;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [Lqg1;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lz05;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static o([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Luc5;->i([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, Luc5;->i([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, Luc5;->i([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, Luc5;->i([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    move p1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    move p1, v2

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    move p1, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    move v1, v2

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
.end method

.method public static p(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    :try_start_0
    sget-boolean v0, Luc5;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1, p2, p3}, Luc5;->A(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p3

    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    throw p3

    .line 31
    :catch_1
    const/4 p0, 0x0

    .line 32
    sput-boolean p0, Luc5;->i:Z

    .line 33
    .line 34
    :catch_2
    :cond_1
    if-eqz p3, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p1, Lg14;->a:Ljava/lang/ThreadLocal;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static q(Ljava/util/List;)Ljava/lang/String;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v1, v2, :cond_4

    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, [B

    .line 15
    .line 16
    array-length v4, v2

    .line 17
    const/4 v5, 0x3

    .line 18
    if-le v4, v5, :cond_3

    .line 19
    .line 20
    new-array v6, v5, [Z

    .line 21
    .line 22
    invoke-static {}, Lyw1;->j()Luw1;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move v8, v0

    .line 27
    :goto_1
    array-length v9, v2

    .line 28
    if-ge v8, v9, :cond_1

    .line 29
    .line 30
    array-length v9, v2

    .line 31
    invoke-static {v2, v8, v9, v6}, Luc5;->o([BII[Z)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    array-length v9, v2

    .line 36
    if-eq v8, v9, :cond_0

    .line 37
    .line 38
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v7, v9}, Lpw1;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v8, v8, 0x3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v7}, Luw1;->f()Lgy3;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    move v7, v0

    .line 53
    :goto_2
    iget v8, v6, Lgy3;->q:I

    .line 54
    .line 55
    if-ge v7, v8, :cond_3

    .line 56
    .line 57
    invoke-virtual {v6, v7}, Lgy3;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    add-int/2addr v8, v5

    .line 68
    if-ge v8, v4, :cond_2

    .line 69
    .line 70
    new-instance v8, Lh00;

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Lgy3;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    add-int/2addr v9, v5

    .line 83
    invoke-direct {v8, v2, v9, v4}, Lh00;-><init>([BII)V

    .line 84
    .line 85
    .line 86
    invoke-static {v8}, Luc5;->F(Lh00;)Lv2;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iget v10, v9, Lv2;->a:I

    .line 91
    .line 92
    const/16 v11, 0x21

    .line 93
    .line 94
    if-ne v10, v11, :cond_2

    .line 95
    .line 96
    iget v9, v9, Lv2;->b:I

    .line 97
    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    const/4 p0, 0x4

    .line 101
    invoke-virtual {v8, p0}, Lh00;->t(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v5}, Lh00;->i(I)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-virtual {v8}, Lh00;->s()V

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    invoke-static {v8, v0, p0, v3}, Luc5;->G(Lh00;ZILp13;)Lp13;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget v0, p0, Lp13;->a:I

    .line 117
    .line 118
    iget-boolean v1, p0, Lp13;->b:Z

    .line 119
    .line 120
    iget v2, p0, Lp13;->c:I

    .line 121
    .line 122
    iget v3, p0, Lp13;->d:I

    .line 123
    .line 124
    iget-object v4, p0, Lp13;->e:[I

    .line 125
    .line 126
    iget v5, p0, Lp13;->f:I

    .line 127
    .line 128
    invoke-static/range {v0 .. v5}, Li40;->a(IZII[II)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_4
    return-object v3
.end method

.method public static r(Ltb1;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ltb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ltb1;->k:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "video/dolby-vision"

    .line 6
    .line 7
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    const-string v0, "dva1"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    const-string v0, "dvav"

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "dvh1"

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const-string v0, "dvhe"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    :cond_1
    const-string p0, "video/hevc"

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    :goto_0
    const-string p0, "video/avc"

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    iget-object p0, p0, Ltb1;->n:Ljava/lang/String;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final s(Lne0;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lfz0;->S:Lfz0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lne0;->K(Lme0;)Lle0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqe0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, Lqe0;->n(Lne0;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Lq05;->o(Lne0;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Lq05;->o(Lne0;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final t(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final u(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    return p0

    .line 8
    :cond_0
    const-string v0, "Could not convert "

    .line 9
    .line 10
    const-string v1, " to BackoffPolicy"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    return v0
.end method

.method public static final v(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1e

    .line 19
    .line 20
    if-lt v1, v2, :cond_0

    .line 21
    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x6

    .line 25
    return p0

    .line 26
    :cond_0
    const-string v0, "Could not convert "

    .line 27
    .line 28
    const-string v1, " to NetworkType"

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_1
    return v0

    .line 40
    :cond_2
    return v1

    .line 41
    :cond_3
    return v0

    .line 42
    :cond_4
    return v1

    .line 43
    :cond_5
    return v0
.end method

.method public static final w(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    return p0

    .line 8
    :cond_0
    const-string v0, "Could not convert "

    .line 9
    .line 10
    const-string v1, " to OutOfQuotaPolicy"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    return v0
.end method

.method public static final x(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x6

    .line 19
    return p0

    .line 20
    :cond_0
    const-string v0, "Could not convert "

    .line 21
    .line 22
    const-string v1, " to State"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    return v0

    .line 34
    :cond_2
    return v1

    .line 35
    :cond_3
    return v0

    .line 36
    :cond_4
    return v1

    .line 37
    :cond_5
    return v0
.end method

.method public static y([BILtb1;)Z
    .locals 5

    .line 1
    iget-object v0, p2, Ltb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x4

    .line 10
    const/16 v2, 0xe

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    aget-byte p0, p0, v1

    .line 16
    .line 17
    and-int/lit8 p1, p0, 0x60

    .line 18
    .line 19
    shr-int/lit8 p1, p1, 0x5

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 p0, p0, 0x1f

    .line 25
    .line 26
    if-ne p0, v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/16 p1, 0x9

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-ne p0, v2, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    iget-object v0, p2, Ltb1;->n:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, "video/hevc"

    .line 40
    .line 41
    invoke-static {v0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    new-instance v0, Lh00;

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    invoke-direct {v0, p0, v1, p1}, Lh00;-><init>([BII)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Luc5;->F(Lh00;)Lv2;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget p1, p0, Lv2;->a:I

    .line 58
    .line 59
    const/16 v0, 0x23

    .line 60
    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    if-gt p1, v2, :cond_5

    .line 65
    .line 66
    rem-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    iget p0, p0, Lv2;->c:I

    .line 71
    .line 72
    iget p1, p2, Ltb1;->E:I

    .line 73
    .line 74
    sub-int/2addr p1, v3

    .line 75
    if-ne p0, p1, :cond_5

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_5
    :goto_1
    return v3
.end method

.method public static final z(Ltv;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    new-instance v2, Ltv;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide v3, p0, Ltv;->o:J

    .line 11
    .line 12
    const-wide/16 v5, 0x40

    .line 13
    .line 14
    cmp-long v1, v3, v5

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-wide v5, v3

    .line 20
    :goto_0
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    invoke-virtual/range {v1 .. v6}, Ltv;->n(Ltv;JJ)V

    .line 24
    .line 25
    .line 26
    move p0, v0

    .line 27
    :goto_1
    const/16 v1, 0x10

    .line 28
    .line 29
    if-ge p0, v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2}, Ltv;->l()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-virtual {v2}, Ltv;->R()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 49
    .line 50
    .line 51
    move-result v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_2
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :catch_0
    :goto_3
    return v0
.end method

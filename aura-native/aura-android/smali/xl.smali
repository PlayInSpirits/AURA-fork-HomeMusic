.class public abstract Lxl;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Landroid/media/AudioManager;

.field public static final b:[I

.field public static final c:[I

.field public static final d:[Ljava/lang/String;

.field public static final e:Lf01;

.field public static final f:Lf01;

.field public static final g:[I

.field public static h:J

.field public static i:Ljava/lang/reflect/Method;

.field public static j:Ljava/lang/reflect/Method;

.field public static k:Ljava/lang/reflect/Method;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxl;->b:[I

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, Lxl;->c:[I

    .line 18
    .line 19
    const-string v0, "decelerate"

    .line 20
    .line 21
    const-string v1, "linear"

    .line 22
    .line 23
    const-string v2, "standard"

    .line 24
    .line 25
    const-string v3, "accelerate"

    .line 26
    .line 27
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lxl;->d:[Ljava/lang/String;

    .line 32
    .line 33
    new-instance v0, Lf01;

    .line 34
    .line 35
    const-string v1, "NULL"

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v0, v2, v1}, Lf01;-><init>(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lxl;->e:Lf01;

    .line 42
    .line 43
    new-instance v0, Lf01;

    .line 44
    .line 45
    const-string v1, "UNINITIALIZED"

    .line 46
    .line 47
    invoke-direct {v0, v2, v1}, Lf01;-><init>(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lxl;->f:Lf01;

    .line 51
    .line 52
    const v0, 0x1010448

    .line 53
    .line 54
    .line 55
    filled-new-array {v0}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lxl;->g:[I

    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :array_0
    .array-data 4
        0x17700
        0x15888
        0xfa00
        0xbb80
        0xac44
        0x7d00
        0x5dc0
        0x5622
        0x3e80
        0x2ee0
        0x2b11
        0x1f40
        0x1cb6
    .end array-data

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        0x7
        0x8
        -0x1
        0x8
        -0x1
    .end array-data
.end method

.method public static final A(Lad3;F)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lad3;->m()Lqc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lad3;->r()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    neg-float p0, p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0}, Lxl;->k(Lad3;)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    :goto_0
    const/4 p1, 0x0

    .line 21
    cmpl-float p0, p0, p1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    const/4 v0, 0x1

    .line 25
    if-lez p0, :cond_1

    .line 26
    .line 27
    move p0, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move p0, p1

    .line 30
    :goto_1
    if-nez p0, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    return p1
.end method

.method public static final B(Li94;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Li94;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x4

    .line 10
    invoke-static {v0, p0}, Li94;->j(ILi94;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Li94;

    .line 26
    .line 27
    invoke-static {v4}, Lfh0;->p(Li94;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    :goto_1
    return v1

    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object p0, p0, Li94;->c:Lc72;

    .line 38
    .line 39
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_2
    const/4 v0, 0x1

    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, Lc72;->v()Le94;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-boolean v2, v2, Le94;->p:Z

    .line 53
    .line 54
    if-ne v2, v0, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/4 p0, 0x0

    .line 63
    :goto_3
    if-eqz p0, :cond_5

    .line 64
    .line 65
    move v1, v0

    .line 66
    :cond_5
    xor-int/lit8 p0, v1, 0x1

    .line 67
    .line 68
    return p0
.end method

.method public static C(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lty0;->c(Landroid/widget/EdgeEffect;FF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 13
    .line 14
    .line 15
    return p1
.end method

.method public static D(Lh00;Z)Lg;
    .locals 11

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lh00;->i(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x6

    .line 7
    const/16 v3, 0x1f

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lh00;->i(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, 0x20

    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lxl;->u(Lh00;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x4

    .line 22
    invoke-virtual {p0, v5}, Lh00;->i(I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-string v7, "mp4a.40."

    .line 27
    .line 28
    invoke-static {v1, v7}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const/16 v8, 0x16

    .line 33
    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    const/16 v9, 0x1d

    .line 37
    .line 38
    if-ne v1, v9, :cond_3

    .line 39
    .line 40
    :cond_1
    invoke-static {p0}, Lxl;->u(Lh00;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {p0, v0}, Lh00;->i(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ne v0, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lh00;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/lit8 v0, v0, 0x20

    .line 55
    .line 56
    :cond_2
    move v1, v0

    .line 57
    if-ne v1, v8, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, v5}, Lh00;->i(I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    :cond_3
    if-eqz p1, :cond_f

    .line 64
    .line 65
    const/16 p1, 0x11

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    const/4 v3, 0x3

    .line 69
    const/4 v9, 0x2

    .line 70
    if-eq v1, v0, :cond_4

    .line 71
    .line 72
    if-eq v1, v9, :cond_4

    .line 73
    .line 74
    if-eq v1, v3, :cond_4

    .line 75
    .line 76
    if-eq v1, v5, :cond_4

    .line 77
    .line 78
    if-eq v1, v2, :cond_4

    .line 79
    .line 80
    const/4 v5, 0x7

    .line 81
    if-eq v1, v5, :cond_4

    .line 82
    .line 83
    if-eq v1, p1, :cond_4

    .line 84
    .line 85
    packed-switch v1, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string p1, "Unsupported audio object type: "

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    throw p0

    .line 107
    :cond_4
    :pswitch_0
    invoke-virtual {p0}, Lh00;->h()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_5

    .line 112
    .line 113
    const-string v5, "AacUtil"

    .line 114
    .line 115
    const-string v10, "Unexpected frameLengthFlag = 1"

    .line 116
    .line 117
    invoke-static {v5, v10}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {p0}, Lh00;->h()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    const/16 v5, 0xe

    .line 127
    .line 128
    invoke-virtual {p0, v5}, Lh00;->t(I)V

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-virtual {p0}, Lh00;->h()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v6, :cond_e

    .line 136
    .line 137
    const/16 v10, 0x14

    .line 138
    .line 139
    if-eq v1, v2, :cond_7

    .line 140
    .line 141
    if-ne v1, v10, :cond_8

    .line 142
    .line 143
    :cond_7
    invoke-virtual {p0, v3}, Lh00;->t(I)V

    .line 144
    .line 145
    .line 146
    :cond_8
    if-eqz v5, :cond_c

    .line 147
    .line 148
    if-ne v1, v8, :cond_9

    .line 149
    .line 150
    const/16 v2, 0x10

    .line 151
    .line 152
    invoke-virtual {p0, v2}, Lh00;->t(I)V

    .line 153
    .line 154
    .line 155
    :cond_9
    if-eq v1, p1, :cond_a

    .line 156
    .line 157
    const/16 p1, 0x13

    .line 158
    .line 159
    if-eq v1, p1, :cond_a

    .line 160
    .line 161
    if-eq v1, v10, :cond_a

    .line 162
    .line 163
    const/16 p1, 0x17

    .line 164
    .line 165
    if-ne v1, p1, :cond_b

    .line 166
    .line 167
    :cond_a
    invoke-virtual {p0, v3}, Lh00;->t(I)V

    .line 168
    .line 169
    .line 170
    :cond_b
    invoke-virtual {p0, v0}, Lh00;->t(I)V

    .line 171
    .line 172
    .line 173
    :cond_c
    packed-switch v1, :pswitch_data_1

    .line 174
    .line 175
    .line 176
    :pswitch_1
    goto :goto_0

    .line 177
    :pswitch_2
    invoke-virtual {p0, v9}, Lh00;->i(I)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eq p0, v9, :cond_d

    .line 182
    .line 183
    if-eq p0, v3, :cond_d

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v0, "Unsupported epConfig: "

    .line 189
    .line 190
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    throw p0

    .line 205
    :cond_e
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 206
    .line 207
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 208
    .line 209
    .line 210
    throw p0

    .line 211
    :cond_f
    :goto_0
    sget-object p0, Lxl;->c:[I

    .line 212
    .line 213
    aget p0, p0, v6

    .line 214
    .line 215
    const/4 p1, -0x1

    .line 216
    if-eq p0, p1, :cond_10

    .line 217
    .line 218
    new-instance p1, Lg;

    .line 219
    .line 220
    invoke-direct {p1, v7, v4, p0}, Lg;-><init>(Ljava/lang/String;II)V

    .line 221
    .line 222
    .line 223
    return-object p1

    .line 224
    :cond_10
    const/4 p0, 0x0

    .line 225
    invoke-static {p0, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    throw p0

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static final E(Ls24;ZZLif1;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ls24;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ls24;->b()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljh0;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move-object v3, p0

    .line 14
    move v4, p1

    .line 15
    move v5, p2

    .line 16
    move-object v2, p3

    .line 17
    invoke-direct/range {v0 .. v5}, Ljh0;-><init>(Lvd0;Lif1;Ls24;ZZ)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lg12;->Q(Lwf1;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final F(Ls24;ZLif1;Lwd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Llh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Llh0;

    .line 7
    .line 8
    iget v1, v0, Llh0;->r:I

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
    iput v1, v0, Llh0;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llh0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lwd0;-><init>(Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Llh0;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Llh0;->r:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    sget-object v6, Lxe0;->n:Lxe0;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v5, :cond_3

    .line 38
    .line 39
    if-eq v1, v4, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    iget-boolean p1, v0, Llh0;->p:Z

    .line 54
    .line 55
    iget-object p2, v0, Llh0;->o:Lif1;

    .line 56
    .line 57
    iget-object p0, v0, Llh0;->n:Ls24;

    .line 58
    .line 59
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object p3

    .line 67
    :cond_4
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ls24;->m()Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p0}, Ls24;->q()Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    if-eqz p3, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0}, Ls24;->n()Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_6

    .line 87
    .line 88
    new-instance p3, Lmh0;

    .line 89
    .line 90
    invoke-direct {p3, v2, p2, p0, p1}, Lmh0;-><init>(Lvd0;Lif1;Ls24;Z)V

    .line 91
    .line 92
    .line 93
    iput v5, v0, Llh0;->r:I

    .line 94
    .line 95
    invoke-virtual {p0, p1, p3, v0}, Ls24;->u(ZLwf1;Lwd0;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v6, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    return-object p0

    .line 103
    :cond_6
    iput-object p0, v0, Llh0;->n:Ls24;

    .line 104
    .line 105
    iput-object p2, v0, Llh0;->o:Lif1;

    .line 106
    .line 107
    iput-boolean p1, v0, Llh0;->p:Z

    .line 108
    .line 109
    iput v4, v0, Llh0;->r:I

    .line 110
    .line 111
    invoke-static {p0, v0}, Lxl;->o(Ls24;Lwd0;)Lne0;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-ne p3, v6, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    :goto_1
    check-cast p3, Lne0;

    .line 119
    .line 120
    new-instance v1, Lkh0;

    .line 121
    .line 122
    invoke-direct {v1, v2, p2, p0, p1}, Lkh0;-><init>(Lvd0;Lif1;Ls24;Z)V

    .line 123
    .line 124
    .line 125
    iput-object v2, v0, Llh0;->n:Ls24;

    .line 126
    .line 127
    iput-object v2, v0, Llh0;->o:Lif1;

    .line 128
    .line 129
    iput v3, v0, Llh0;->r:I

    .line 130
    .line 131
    invoke-static {p3, v1, v0}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v6, :cond_8

    .line 136
    .line 137
    :goto_2
    return-object v6

    .line 138
    :cond_8
    return-object p0
.end method

.method public static final G([F[FI[F)V
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "At least one point must be provided"

    .line 6
    .line 7
    invoke-static {v1}, Lcz1;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    if-lt v1, v0, :cond_1

    .line 12
    .line 13
    add-int/lit8 v1, v0, -0x1

    .line 14
    .line 15
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    new-array v3, v2, [[F

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v5, v2, :cond_2

    .line 22
    .line 23
    new-array v6, v0, [F

    .line 24
    .line 25
    aput-object v6, v3, v5

    .line 26
    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v5, v4

    .line 31
    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 32
    .line 33
    if-ge v5, v0, :cond_4

    .line 34
    .line 35
    aget-object v7, v3, v4

    .line 36
    .line 37
    aput v6, v7, v5

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    :goto_2
    if-ge v6, v2, :cond_3

    .line 41
    .line 42
    add-int/lit8 v7, v6, -0x1

    .line 43
    .line 44
    aget-object v7, v3, v7

    .line 45
    .line 46
    aget v7, v7, v5

    .line 47
    .line 48
    aget v8, p0, v5

    .line 49
    .line 50
    mul-float/2addr v7, v8

    .line 51
    aget-object v8, v3, v6

    .line 52
    .line 53
    aput v7, v8, v5

    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    new-array v5, v2, [[F

    .line 62
    .line 63
    move v7, v4

    .line 64
    :goto_3
    if-ge v7, v2, :cond_5

    .line 65
    .line 66
    new-array v8, v0, [F

    .line 67
    .line 68
    aput-object v8, v5, v7

    .line 69
    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    new-array v7, v2, [[F

    .line 74
    .line 75
    move v8, v4

    .line 76
    :goto_4
    if-ge v8, v2, :cond_6

    .line 77
    .line 78
    new-array v9, v2, [F

    .line 79
    .line 80
    aput-object v9, v7, v8

    .line 81
    .line 82
    add-int/lit8 v8, v8, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move v8, v4

    .line 86
    :goto_5
    if-ge v8, v2, :cond_d

    .line 87
    .line 88
    aget-object v9, v5, v8

    .line 89
    .line 90
    aget-object v10, v3, v8

    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v10, v4, v9, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    move v10, v4

    .line 102
    :goto_6
    if-ge v10, v8, :cond_8

    .line 103
    .line 104
    aget-object v11, v5, v10

    .line 105
    .line 106
    invoke-static {v9, v11}, Lxl;->j([F[F)F

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    move v13, v4

    .line 111
    :goto_7
    if-ge v13, v0, :cond_7

    .line 112
    .line 113
    aget v14, v9, v13

    .line 114
    .line 115
    aget v15, v11, v13

    .line 116
    .line 117
    mul-float/2addr v15, v12

    .line 118
    sub-float/2addr v14, v15

    .line 119
    aput v14, v9, v13

    .line 120
    .line 121
    add-int/lit8 v13, v13, 0x1

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    invoke-static {v9, v9}, Lxl;->j([F[F)F

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    float-to-double v10, v10

    .line 132
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    double-to-float v10, v10

    .line 137
    const v11, 0x358637bd    # 1.0E-6f

    .line 138
    .line 139
    .line 140
    cmpg-float v12, v10, v11

    .line 141
    .line 142
    if-gez v12, :cond_9

    .line 143
    .line 144
    move v10, v11

    .line 145
    :cond_9
    div-float v10, v6, v10

    .line 146
    .line 147
    move v11, v4

    .line 148
    :goto_8
    if-ge v11, v0, :cond_a

    .line 149
    .line 150
    aget v12, v9, v11

    .line 151
    .line 152
    mul-float/2addr v12, v10

    .line 153
    aput v12, v9, v11

    .line 154
    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_a
    aget-object v10, v7, v8

    .line 159
    .line 160
    move v11, v4

    .line 161
    :goto_9
    if-ge v11, v2, :cond_c

    .line 162
    .line 163
    if-ge v11, v8, :cond_b

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    goto :goto_a

    .line 167
    :cond_b
    aget-object v12, v3, v11

    .line 168
    .line 169
    invoke-static {v9, v12}, Lxl;->j([F[F)F

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    :goto_a
    aput v12, v10, v11

    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_d
    move v0, v1

    .line 182
    :goto_b
    const/4 v2, -0x1

    .line 183
    if-ge v2, v0, :cond_f

    .line 184
    .line 185
    aget-object v2, v5, v0

    .line 186
    .line 187
    move-object/from16 v3, p1

    .line 188
    .line 189
    invoke-static {v2, v3}, Lxl;->j([F[F)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    aget-object v4, v7, v0

    .line 194
    .line 195
    add-int/lit8 v6, v0, 0x1

    .line 196
    .line 197
    if-gt v6, v1, :cond_e

    .line 198
    .line 199
    move v8, v1

    .line 200
    :goto_c
    aget v9, v4, v8

    .line 201
    .line 202
    aget v10, p3, v8

    .line 203
    .line 204
    mul-float/2addr v9, v10

    .line 205
    sub-float/2addr v2, v9

    .line 206
    if-eq v8, v6, :cond_e

    .line 207
    .line 208
    add-int/lit8 v8, v8, -0x1

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_e
    aget v4, v4, v0

    .line 212
    .line 213
    div-float/2addr v2, v4

    .line 214
    aput v2, p3, v0

    .line 215
    .line 216
    add-int/lit8 v0, v0, -0x1

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_f
    return-void
.end method

.method public static final H(Ls24;Lwo4;)Landroid/database/Cursor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ls24;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ls24;->b()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ls24;->j()Lso4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Lso4;->z()Lwe1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, p1}, Lwe1;->F(Lwo4;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final I([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p1, p2, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aput-object v0, p0, p1

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void
.end method

.method public static J(Ljava/lang/String;)Ljava/lang/String;
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
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x6

    .line 7
    const/16 v2, 0x23

    .line 8
    .line 9
    invoke-static {p0, v2, v0, v1}, Lqm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    :goto_0
    const-string p0, "/"

    .line 29
    .line 30
    :cond_2
    return-object p0
.end method

.method public static K(Lcom/google/android/material/appbar/AppBarLayout;F)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0b0002

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Landroid/animation/StateListAnimator;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/animation/StateListAnimator;-><init>()V

    .line 15
    .line 16
    .line 17
    const v2, 0x7f0404ca

    .line 18
    .line 19
    .line 20
    neg-int v2, v2

    .line 21
    const v3, 0x101009e

    .line 22
    .line 23
    .line 24
    const v4, 0x7f0404c9

    .line 25
    .line 26
    .line 27
    filled-new-array {v3, v4, v2}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/4 v4, 0x1

    .line 32
    new-array v5, v4, [F

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    aput v7, v5, v6

    .line 37
    .line 38
    const-string v8, "elevation"

    .line 39
    .line 40
    invoke-static {p0, v8, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    int-to-long v9, v0

    .line 45
    invoke-virtual {v5, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v1, v2, v0}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v3}, [I

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-array v2, v4, [F

    .line 57
    .line 58
    aput p1, v2, v6

    .line 59
    .line 60
    invoke-static {p0, v8, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v1, v0, p1}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V

    .line 69
    .line 70
    .line 71
    new-array p1, v6, [I

    .line 72
    .line 73
    new-array v0, v4, [F

    .line 74
    .line 75
    aput v7, v0, v6

    .line 76
    .line 77
    invoke-static {p0, v8, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-wide/16 v2, 0x0

    .line 82
    .line 83
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v1, p1, v0}, Landroid/animation/StateListAnimator;->addState([ILandroid/animation/Animator;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static final L(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v1, "%07x"

    .line 46
    .line 47
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v1, "@"

    .line 52
    .line 53
    invoke-static {v0, v1, p0}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static final M(Lk14;)Lk14;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk14;->f()Lj14;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lr15;

    .line 9
    .line 10
    iget-object p0, p0, Lk14;->t:Ln14;

    .line 11
    .line 12
    invoke-virtual {p0}, Ln14;->contentType()Lhu2;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Ln14;->contentLength()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-direct {v1, v2, v3, v4}, Lr15;-><init>(Lhu2;J)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lj14;->g:Ln14;

    .line 24
    .line 25
    invoke-virtual {v0}, Lj14;->a()Lk14;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static N(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final O(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final a(Landroid/window/BackEvent;)Lt33;
    .locals 7

    .line 1
    invoke-static {p0}, Lv22;->a(Landroid/window/BackEvent;)F

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-static {p0}, Lv22;->g(Landroid/window/BackEvent;)F

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-static {p0}, Lv22;->h(Landroid/window/BackEvent;)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p0}, Lv22;->c(Landroid/window/BackEvent;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v5, 0x24

    .line 20
    .line 21
    if-lt v0, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Lno;->d(Landroid/window/BackEvent;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    :goto_0
    new-instance v0, Lt33;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v6}, Lt33;-><init>(IFFFJ)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static final b(Li94;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li94;->k()Le94;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ln94;->j:Lp94;

    .line 6
    .line 7
    iget-object p0, p0, Le94;->n:Lw03;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lw03;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0
.end method

.method public static final c([Ljava/lang/Object;IILv1;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    const/16 v3, 0x21

    .line 12
    .line 13
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v2

    .line 16
    .line 17
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ne v5, p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ne v5, p3, :cond_0

    .line 28
    .line 29
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-ne v5, v3, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {p0, p1, p2, p3, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final e(Lrm2;Lon3;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lqf2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lqf2;->b:Lm45;

    .line 13
    .line 14
    iget-object v3, v0, Lqf2;->a:Lm45;

    .line 15
    .line 16
    invoke-static {v1}, Lgi1;->g(Lon3;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    iget-wide v5, v1, Lon3;->b:J

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    iget-object v4, v3, Lm45;->d:[Lvh0;

    .line 29
    .line 30
    invoke-static {v4, v7}, Lti;->h0([Ljava/lang/Object;Lf01;)V

    .line 31
    .line 32
    .line 33
    iput v8, v3, Lm45;->e:I

    .line 34
    .line 35
    iget-object v4, v2, Lm45;->d:[Lvh0;

    .line 36
    .line 37
    invoke-static {v4, v7}, Lti;->h0([Ljava/lang/Object;Lf01;)V

    .line 38
    .line 39
    .line 40
    iput v8, v2, Lm45;->e:I

    .line 41
    .line 42
    iput-wide v9, v0, Lqf2;->c:J

    .line 43
    .line 44
    :cond_0
    invoke-static {v1}, Lgi1;->i(Lon3;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Lon3;->b()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    move v12, v8

    .line 59
    :goto_0
    if-ge v12, v11, :cond_1

    .line 60
    .line 61
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    check-cast v13, Lbm1;

    .line 66
    .line 67
    iget-wide v14, v13, Lbm1;->a:J

    .line 68
    .line 69
    iget-wide v7, v13, Lbm1;->e:J

    .line 70
    .line 71
    invoke-static {v7, v8, v9, v10}, Lg83;->e(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    invoke-virtual {v0, v14, v15, v7, v8}, Lqf2;->a(JJ)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v12, v12, 0x1

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-wide v7, v1, Lon3;->n:J

    .line 84
    .line 85
    invoke-static {v7, v8, v9, v10}, Lg83;->e(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    invoke-virtual {v0, v5, v6, v7, v8}, Lqf2;->a(JJ)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-static {v1}, Lgi1;->i(Lon3;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    iget-wide v7, v0, Lqf2;->c:J

    .line 99
    .line 100
    sub-long v7, v5, v7

    .line 101
    .line 102
    const-wide/16 v11, 0x28

    .line 103
    .line 104
    cmp-long v1, v7, v11

    .line 105
    .line 106
    if-lez v1, :cond_3

    .line 107
    .line 108
    iget-object v1, v3, Lm45;->d:[Lvh0;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-static {v1, v4}, Lti;->h0([Ljava/lang/Object;Lf01;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    iput v1, v3, Lm45;->e:I

    .line 116
    .line 117
    iget-object v3, v2, Lm45;->d:[Lvh0;

    .line 118
    .line 119
    invoke-static {v3, v4}, Lti;->h0([Ljava/lang/Object;Lf01;)V

    .line 120
    .line 121
    .line 122
    iput v1, v2, Lm45;->e:I

    .line 123
    .line 124
    iput-wide v9, v0, Lqf2;->c:J

    .line 125
    .line 126
    :cond_3
    iput-wide v5, v0, Lqf2;->c:J

    .line 127
    .line 128
    return-void
.end method

.method public static final f(Lhp4;Lln3;Ljp;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Ljb1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ljb1;

    .line 7
    .line 8
    iget v1, v0, Ljb1;->q:I

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
    iput v1, v0, Ljb1;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljb1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lwd0;-><init>(Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ljb1;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ljb1;->q:I

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
    iget-object p0, v0, Ljb1;->o:Lln3;

    .line 36
    .line 37
    iget-object p1, v0, Ljb1;->n:Lhp4;

    .line 38
    .line 39
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v6, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v6

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lhp4;->s:Lip4;

    .line 57
    .line 58
    iget-object p2, p2, Lip4;->F:Lkn3;

    .line 59
    .line 60
    iget-object p2, p2, Lkn3;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    move v4, v2

    .line 67
    :goto_1
    if-ge v4, v1, :cond_6

    .line 68
    .line 69
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lon3;

    .line 74
    .line 75
    iget-boolean v5, v5, Lon3;->d:Z

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    :goto_2
    iput-object p0, v0, Ljb1;->n:Lhp4;

    .line 80
    .line 81
    iput-object p1, v0, Ljb1;->o:Lln3;

    .line 82
    .line 83
    iput v3, v0, Ljb1;->q:I

    .line 84
    .line 85
    invoke-virtual {p0, p1, v0}, Lhp4;->a(Lln3;Ljp;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    sget-object v1, Lxe0;->n:Lxe0;

    .line 90
    .line 91
    if-ne p2, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_3
    check-cast p2, Lkn3;

    .line 95
    .line 96
    iget-object p2, p2, Lkn3;->a:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    move v4, v2

    .line 103
    :goto_4
    if-ge v4, v1, :cond_6

    .line 104
    .line 105
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Lon3;

    .line 110
    .line 111
    iget-boolean v5, v5, Lon3;->d:Z

    .line 112
    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    sget-object p0, Lj15;->a:Lj15;

    .line 123
    .line 124
    return-object p0
.end method

.method public static final g(Lsn3;Lwf1;Lvd0;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Lvd0;->getContext()Lne0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lkb1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, p1, v2}, Lkb1;-><init>(Lne0;Lwf1;Lvd0;)V

    .line 9
    .line 10
    .line 11
    check-cast p0, Lip4;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p1, Lcz;

    .line 17
    .line 18
    invoke-static {p2}, Lya4;->x(Lvd0;)Lvd0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p1, v0, p2}, Lcz;-><init>(ILvd0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcz;->u()V

    .line 27
    .line 28
    .line 29
    new-instance p2, Lhp4;

    .line 30
    .line 31
    invoke-direct {p2, p0, p1}, Lhp4;-><init>(Lip4;Lcz;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lip4;->H:Lf13;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_0
    iget-object p0, p0, Lip4;->G:Lf13;

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lf13;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Ld44;

    .line 43
    .line 44
    invoke-static {p2, p2, v1}, Lya4;->i(Lvd0;Lvd0;Lwf1;)Lvd0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lya4;->x(Lvd0;)Lvd0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lxe0;->n:Lxe0;

    .line 53
    .line 54
    invoke-direct {p0, v1}, Ld44;-><init>(Lvd0;)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lj15;->a:Lj15;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ld44;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    new-instance p0, Lkv;

    .line 64
    .line 65
    const/4 v0, 0x3

    .line 66
    invoke-direct {p0, v0, p2}, Lkv;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lcz;->w(Lif1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcz;->q()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v2, :cond_0

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_0
    return-object v1

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    monitor-exit v0

    .line 82
    throw p0
.end method

.method public static final h(Leo0;Ljo;Lep4;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcx2;

    .line 3
    .line 4
    iget-object v0, v0, Lcx2;->n:Lcx2;

    .line 5
    .line 6
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Lcx2;

    .line 14
    .line 15
    iget-object v1, v0, Lcx2;->n:Lcx2;

    .line 16
    .line 17
    iget-boolean v1, v1, Lcx2;->A:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "visitAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Lcx2;->n:Lcx2;

    .line 27
    .line 28
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 29
    .line 30
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_c

    .line 36
    .line 37
    iget-object v3, v1, Lc72;->Q:Lw12;

    .line 38
    .line 39
    iget-object v3, v3, Lw12;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lcx2;

    .line 42
    .line 43
    iget v3, v3, Lcx2;->q:I

    .line 44
    .line 45
    const/high16 v4, 0x80000

    .line 46
    .line 47
    and-int/2addr v3, v4

    .line 48
    if-eqz v3, :cond_a

    .line 49
    .line 50
    :goto_1
    if-eqz v0, :cond_a

    .line 51
    .line 52
    iget v3, v0, Lcx2;->p:I

    .line 53
    .line 54
    and-int/2addr v3, v4

    .line 55
    if-eqz v3, :cond_9

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    move-object v5, v2

    .line 59
    :goto_2
    if-eqz v3, :cond_9

    .line 60
    .line 61
    instance-of v6, v3, Lzu;

    .line 62
    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    move-object v2, v3

    .line 66
    goto :goto_5

    .line 67
    :cond_2
    iget v6, v3, Lcx2;->p:I

    .line 68
    .line 69
    and-int/2addr v6, v4

    .line 70
    if-eqz v6, :cond_8

    .line 71
    .line 72
    instance-of v6, v3, Lfo0;

    .line 73
    .line 74
    if-eqz v6, :cond_8

    .line 75
    .line 76
    move-object v6, v3

    .line 77
    check-cast v6, Lfo0;

    .line 78
    .line 79
    iget-object v6, v6, Lfo0;->C:Lcx2;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    :goto_3
    const/4 v8, 0x1

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    iget v9, v6, Lcx2;->p:I

    .line 86
    .line 87
    and-int/2addr v9, v4

    .line 88
    if-eqz v9, :cond_6

    .line 89
    .line 90
    add-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    if-ne v7, v8, :cond_3

    .line 93
    .line 94
    move-object v3, v6

    .line 95
    goto :goto_4

    .line 96
    :cond_3
    if-nez v5, :cond_4

    .line 97
    .line 98
    new-instance v5, Lf13;

    .line 99
    .line 100
    const/16 v8, 0x10

    .line 101
    .line 102
    new-array v8, v8, [Lcx2;

    .line 103
    .line 104
    invoke-direct {v5, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    if-eqz v3, :cond_5

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move-object v3, v2

    .line 113
    :cond_5
    invoke-virtual {v5, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_4
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    if-ne v7, v8, :cond_8

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_8
    invoke-static {v5}, Lj51;->c(Lf13;)Lcx2;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    goto :goto_2

    .line 127
    :cond_9
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_a
    invoke-virtual {v1}, Lc72;->t()Lc72;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_b

    .line 135
    .line 136
    iget-object v0, v1, Lc72;->Q:Lw12;

    .line 137
    .line 138
    if-eqz v0, :cond_b

    .line 139
    .line 140
    iget-object v0, v0, Lw12;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lsq4;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_b
    move-object v0, v2

    .line 146
    goto :goto_0

    .line 147
    :cond_c
    :goto_5
    check-cast v2, Lzu;

    .line 148
    .line 149
    if-nez v2, :cond_d

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_d
    invoke-static {p0}, Lj51;->N(Leo0;)Lf63;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v0, Lfa;

    .line 157
    .line 158
    const/4 v1, 0x3

    .line 159
    invoke-direct {v0, v1, p1, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v2, p0, v0, p2}, Lzu;->k(Lf63;Lfa;Lep4;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    sget-object p1, Lxe0;->n:Lxe0;

    .line 167
    .line 168
    if-ne p0, p1, :cond_e

    .line 169
    .line 170
    return-object p0

    .line 171
    :cond_e
    :goto_6
    sget-object p0, Lj15;->a:Lj15;

    .line 172
    .line 173
    return-object p0
.end method

.method public static final i(Ljava/lang/String;Lk14;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p1, Lk14;->u:Lk14;

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p1, Lk14;->v:Lk14;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, Lk14;->w:Lk14;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ".priorResponse != null"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, ".cacheResponse != null"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p1, ".networkResponse != null"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method

.method public static final j([F[F)F
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    mul-float/2addr v3, v4

    .line 11
    add-float/2addr v1, v3

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1
.end method

.method public static final k(Lad3;)F
    .locals 4

    .line 1
    invoke-virtual {p0}, Lad3;->m()Lqc3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lqc3;->e:Lhb3;

    .line 6
    .line 7
    sget-object v1, Lhb3;->o:Lhb3;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lad3;->q()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const/16 p0, 0x20

    .line 16
    .line 17
    shr-long/2addr v0, p0

    .line 18
    long-to-int p0, v0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lad3;->q()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide v2, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    long-to-int p0, v0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static final l(Lx34;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lgb;->r()Lqb2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "SELECT name FROM sqlite_master WHERE type = \'trigger\'"

    .line 9
    .line 10
    invoke-interface {p0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    :try_start_0
    invoke-interface {v1}, Lz34;->O()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Lqb2;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v2}, Lud3;->e(Lz34;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lgb;->f(Lqb2;)Lqb2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v3}, Lqb2;->listIterator(I)Ljava/util/ListIterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    :goto_1
    move-object v1, v0

    .line 44
    check-cast v1, Ldm1;

    .line 45
    .line 46
    invoke-virtual {v1}, Ldm1;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ldm1;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    const-string v2, "room_fts_content_sync_"

    .line 59
    .line 60
    invoke-static {v1, v2, v3}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    const-string v2, "DROP TRIGGER IF EXISTS "

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p0, v1}, Lh12;->n(Lx34;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    return-void

    .line 77
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    invoke-static {v1, p0}, Lud3;->e(Lz34;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method public static final m(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static declared-synchronized n(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 5

    .line 1
    const-class v0, Lxl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    sput-object v1, Lxl;->a:Landroid/media/AudioManager;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :goto_0
    sget-object v1, Lxl;->a:Landroid/media/AudioManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance v1, Lq90;

    .line 36
    .line 37
    invoke-direct {v1}, Lq90;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Luo;->t()Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lk6;

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    invoke-direct {v3, v4, p0, v1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lq90;->b()V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lxl;->a:Landroid/media/AudioManager;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v0

    .line 62
    return-object p0

    .line 63
    :cond_3
    :goto_1
    :try_start_2
    const-string v1, "audio"

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroid/media/AudioManager;

    .line 70
    .line 71
    sput-object p0, Lxl;->a:Landroid/media/AudioManager;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit v0

    .line 77
    return-object p0

    .line 78
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    throw p0
.end method

.method public static final o(Ls24;Lwd0;)Lne0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls24;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-interface {p1}, Lvd0;->getContext()Lne0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lkw4;->n:Lxi4;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lne0;->K(Lme0;)Lle0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Ls24;->a:Ltd0;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Ltd0;->n:Lne0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "coroutineScope"

    .line 28
    .line 29
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    invoke-virtual {p0}, Ls24;->h()Lwe0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ltd0;

    .line 42
    .line 43
    iget-object p0, p0, Ltd0;->n:Lne0;

    .line 44
    .line 45
    return-object p0
.end method

.method public static p(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    new-instance v2, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const v1, 0x7f070514

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const v1, 0x7f070513

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {p0, v1, v2, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 38
    .line 39
    .line 40
    iget p0, v2, Landroid/util/TypedValue;->type:I

    .line 41
    .line 42
    const/4 v1, 0x5

    .line 43
    if-ne p0, v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    :goto_2
    float-to-int p0, p0

    .line 50
    return p0

    .line 51
    :cond_2
    const/4 v1, 0x6

    .line 52
    if-ne p0, v1, :cond_3

    .line 53
    .line 54
    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 55
    .line 56
    int-to-float v0, p0

    .line 57
    int-to-float p0, p0

    .line 58
    invoke-virtual {v2, v0, p0}, Landroid/util/TypedValue;->getFraction(FF)F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/4 p0, -0x2

    .line 64
    return p0
.end method

.method public static q(Landroid/widget/EdgeEffect;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lty0;->b(Landroid/widget/EdgeEffect;)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final r(Li94;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Li94;->d:Le94;

    .line 2
    .line 3
    sget-object v1, Ln94;->H:Lp94;

    .line 4
    .line 5
    iget-object v0, v0, Le94;->n:Lw03;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    check-cast v0, Lqu4;

    .line 16
    .line 17
    iget-object p0, p0, Li94;->d:Le94;

    .line 18
    .line 19
    iget-object p0, p0, Le94;->n:Lw03;

    .line 20
    .line 21
    sget-object v2, Ln94;->w:Lp94;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    :cond_1
    check-cast v2, Lm24;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    :goto_0
    sget-object v3, Ln94;->G:Lp94;

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move-object v1, p0

    .line 48
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    return v0
.end method

.method public static final s(Li94;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Li94;->d:Le94;

    .line 2
    .line 3
    iget-object v1, p0, Li94;->d:Le94;

    .line 4
    .line 5
    sget-object v2, Ln94;->b:Lp94;

    .line 6
    .line 7
    iget-object v0, v0, Le94;->n:Lw03;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    iget-object v3, v1, Le94;->n:Lw03;

    .line 18
    .line 19
    sget-object v4, Ln94;->H:Lp94;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    move-object v4, v2

    .line 28
    :cond_1
    check-cast v4, Lqu4;

    .line 29
    .line 30
    sget-object v5, Ln94;->w:Lp94;

    .line 31
    .line 32
    invoke-virtual {v3, v5}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    move-object v5, v2

    .line 39
    :cond_2
    check-cast v5, Lm24;

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    if-eq v4, v5, :cond_4

    .line 51
    .line 52
    const/4 v6, 0x2

    .line 53
    if-ne v4, v6, :cond_3

    .line 54
    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    const v0, 0x7f130267

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {}, Ler1;->n()V

    .line 66
    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_4
    :goto_0
    sget-object v4, Ln94;->G:Lp94;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v4, :cond_5

    .line 76
    .line 77
    move-object v4, v2

    .line 78
    :cond_5
    check-cast v4, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v4, :cond_7

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v0, :cond_7

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    const v0, 0x7f130457

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_1

    .line 98
    :cond_6
    const v0, 0x7f1303b6

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_7
    :goto_1
    sget-object v4, Ln94;->c:Lp94;

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    if-nez v4, :cond_8

    .line 112
    .line 113
    move-object v4, v2

    .line 114
    :cond_8
    check-cast v4, Lxq3;

    .line 115
    .line 116
    if-eqz v4, :cond_a

    .line 117
    .line 118
    sget-object v6, Lxq3;->b:Lxq3;

    .line 119
    .line 120
    if-eq v4, v6, :cond_9

    .line 121
    .line 122
    if-nez v0, :cond_a

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const v4, 0x7f130564

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    goto :goto_2

    .line 141
    :cond_9
    if-nez v0, :cond_a

    .line 142
    .line 143
    const v0, 0x7f130266

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_a
    :goto_2
    sget-object v4, Ln94;->D:Lp94;

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Lw03;->c(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_12

    .line 157
    .line 158
    new-instance v0, Li94;

    .line 159
    .line 160
    iget-object v3, p0, Li94;->a:Lcx2;

    .line 161
    .line 162
    iget-object p0, p0, Li94;->c:Lc72;

    .line 163
    .line 164
    invoke-direct {v0, v3, v5, p0, v1}, Li94;-><init>(Lcx2;ZLc72;Le94;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Li94;->k()Le94;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    iget-object p0, p0, Le94;->n:Lw03;

    .line 172
    .line 173
    sget-object v0, Ln94;->a:Lp94;

    .line 174
    .line 175
    invoke-virtual {p0, v0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-nez v0, :cond_b

    .line 180
    .line 181
    move-object v0, v2

    .line 182
    :cond_b
    check-cast v0, Ljava/util/Collection;

    .line 183
    .line 184
    if-eqz v0, :cond_c

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_11

    .line 191
    .line 192
    :cond_c
    sget-object v0, Ln94;->z:Lp94;

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-nez v0, :cond_d

    .line 199
    .line 200
    move-object v0, v2

    .line 201
    :cond_d
    check-cast v0, Ljava/util/Collection;

    .line 202
    .line 203
    if-eqz v0, :cond_e

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_11

    .line 210
    .line 211
    :cond_e
    invoke-virtual {p0, v4}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-nez p0, :cond_f

    .line 216
    .line 217
    move-object p0, v2

    .line 218
    :cond_f
    check-cast p0, Ljava/lang/CharSequence;

    .line 219
    .line 220
    if-eqz p0, :cond_10

    .line 221
    .line 222
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-nez p0, :cond_11

    .line 227
    .line 228
    :cond_10
    const p0, 0x7f130557

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    :cond_11
    move-object v0, v2

    .line 236
    :cond_12
    check-cast v0, Ljava/lang/String;

    .line 237
    .line 238
    return-object v0
.end method

.method public static final t(Li94;)Lhe;
    .locals 3

    .line 1
    iget-object v0, p0, Li94;->d:Le94;

    .line 2
    .line 3
    sget-object v1, Ln94;->D:Lp94;

    .line 4
    .line 5
    iget-object v0, v0, Le94;->n:Lw03;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    check-cast v0, Lhe;

    .line 16
    .line 17
    iget-object p0, p0, Li94;->d:Le94;

    .line 18
    .line 19
    sget-object v2, Ln94;->z:Lp94;

    .line 20
    .line 21
    iget-object p0, p0, Le94;->n:Lw03;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    move-object p0, v1

    .line 30
    :cond_1
    check-cast p0, Ljava/util/List;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    move-object v1, p0

    .line 39
    check-cast v1, Lhe;

    .line 40
    .line 41
    :cond_2
    if-nez v0, :cond_3

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_3
    return-object v0
.end method

.method public static u(Lh00;)I
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lh00;->i(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lh00;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lh00;->i(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const-string p0, "AAC header insufficient data"

    .line 25
    .line 26
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0

    .line 31
    :cond_1
    const/16 p0, 0xd

    .line 32
    .line 33
    if-ge v0, p0, :cond_2

    .line 34
    .line 35
    sget-object p0, Lxl;->b:[I

    .line 36
    .line 37
    aget p0, p0, v0

    .line 38
    .line 39
    return p0

    .line 40
    :cond_2
    const-string p0, "AAC header wrong Sampling Frequency Index"

    .line 41
    .line 42
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    throw p0
.end method

.method public static final v(Ljava/lang/Object;)Lu84;
    .locals 1

    .line 1
    sget-object v0, Lud3;->a:Lf01;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lu84;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Does not contain segment"

    .line 9
    .line 10
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    throw p0

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "Unable to call "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, " via reflection"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "Trace"

    .line 40
    .line 41
    invoke-static {v0, p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final x(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Lud3;->a:Lf01;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static y()Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lnv4;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const-string v0, "isTagEnabled"

    .line 13
    .line 14
    const-class v1, Landroid/os/Trace;

    .line 15
    .line 16
    :try_start_0
    sget-object v2, Lxl;->i:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    const-string v2, "TRACE_TAG_APP"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    sput-wide v4, Lxl;->h:J

    .line 32
    .line 33
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lxl;->i:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    sget-object v1, Lxl;->i:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    sget-wide v4, Lxl;->h:J

    .line 51
    .line 52
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    return v0

    .line 71
    :goto_1
    invoke-static {v0, v1}, Lxl;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return v0
.end method

.method public static final z(Li94;Landroid/content/res/Resources;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lwr1;->H(Li94;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Li94;->d:Le94;

    .line 9
    .line 10
    iget-boolean v1, v0, Le94;->p:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object v1, Ln94;->a:Lp94;

    .line 16
    .line 17
    iget-object v0, v0, Le94;->n:Lw03;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-static {v0}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    :cond_3
    if-nez v1, :cond_4

    .line 39
    .line 40
    invoke-static {p0}, Lxl;->t(Li94;)Lhe;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    invoke-static {p0, p1}, Lxl;->s(Li94;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    invoke-static {p0}, Lxl;->r(Li94;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    :cond_4
    invoke-static {p0}, Lxl;->B(Li94;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 67
    return p0
.end method

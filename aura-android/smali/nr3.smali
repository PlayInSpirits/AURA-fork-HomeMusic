.class public final Lnr3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final i:[F

.field public static final j:[F

.field public static final k:[F


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lnr3;->i:[F

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v1, Lnr3;->j:[F

    .line 16
    .line 17
    new-array v0, v0, [F

    .line 18
    .line 19
    fill-array-data v0, :array_2

    .line 20
    .line 21
    .line 22
    sput-object v0, Lnr3;->k:[F

    .line 23
    .line 24
    return-void

    .line 25
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 26
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnr3;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnr3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static b(III)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    if-nez p0, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public static c(Lmr3;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lmr3;->a:Llr3;

    .line 2
    .line 3
    iget-object p0, p0, Lmr3;->b:Llr3;

    .line 4
    .line 5
    iget-object v0, v0, Llr3;->a:[Ltu;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    aget-object v0, v0, v2

    .line 13
    .line 14
    iget v0, v0, Ltu;->a:I

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Llr3;->a:[Ltu;

    .line 19
    .line 20
    array-length v0, p0

    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    aget-object p0, p0, v2

    .line 24
    .line 25
    iget p0, p0, Ltu;->a:I

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    return v3

    .line 30
    :cond_0
    return v2
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lew4;

    .line 2
    .line 3
    invoke-direct {v0}, Lew4;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lnr3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "uMvpMatrix"

    .line 9
    .line 10
    iget v0, v0, Lew4;->o:I

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lnr3;->b:I

    .line 17
    .line 18
    iget-object v0, p0, Lnr3;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lew4;

    .line 21
    .line 22
    const-string v1, "uTexMatrix"

    .line 23
    .line 24
    iget v0, v0, Lew4;->o:I

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lnr3;->c:I

    .line 31
    .line 32
    iget-object v0, p0, Lnr3;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lew4;

    .line 35
    .line 36
    const-string v1, "aPosition"

    .line 37
    .line 38
    iget v0, v0, Lew4;->o:I

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lj51;->l()V

    .line 48
    .line 49
    .line 50
    iput v0, p0, Lnr3;->d:I

    .line 51
    .line 52
    iget-object v0, p0, Lnr3;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lew4;

    .line 55
    .line 56
    const-string v1, "aTexCoords"

    .line 57
    .line 58
    iget v0, v0, Lew4;->o:I

    .line 59
    .line 60
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lj51;->l()V

    .line 68
    .line 69
    .line 70
    iput v0, p0, Lnr3;->e:I

    .line 71
    .line 72
    iget-object v0, p0, Lnr3;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lew4;

    .line 75
    .line 76
    const-string v1, "uTexture"

    .line 77
    .line 78
    iget v0, v0, Lew4;->o:I

    .line 79
    .line 80
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, Lnr3;->f:I
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p0

    .line 88
    const-string v0, "ProjectionRenderer"

    .line 89
    .line 90
    const-string v1, "Failed to initialize the program"

    .line 91
    .line 92
    invoke-static {v0, v1, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public d(Ljc0;Lkr;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lnr3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    iget-object v4, v1, Ljc0;->J:Lhb0;

    .line 12
    .line 13
    iget-object v5, v1, Ljc0;->H:Lhb0;

    .line 14
    .line 15
    iget v6, v1, Ljc0;->f0:I

    .line 16
    .line 17
    const/16 v7, 0x8

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    if-ne v6, v7, :cond_0

    .line 21
    .line 22
    iput v8, v2, Lkr;->e:I

    .line 23
    .line 24
    iput v8, v2, Lkr;->f:I

    .line 25
    .line 26
    iput v8, v2, Lkr;->g:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v6, v1, Ljc0;->S:Ljc0;

    .line 30
    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    goto/16 :goto_12

    .line 34
    .line 35
    :cond_1
    sget-object v6, Landroidx/constraintlayout/widget/ConstraintLayout;->C:Lfd4;

    .line 36
    .line 37
    iget v6, v2, Lkr;->a:I

    .line 38
    .line 39
    iget v7, v2, Lkr;->b:I

    .line 40
    .line 41
    iget v9, v2, Lkr;->c:I

    .line 42
    .line 43
    iget v10, v2, Lkr;->d:I

    .line 44
    .line 45
    iget v11, v0, Lnr3;->a:I

    .line 46
    .line 47
    iget v12, v0, Lnr3;->b:I

    .line 48
    .line 49
    add-int/2addr v11, v12

    .line 50
    iget v12, v0, Lnr3;->c:I

    .line 51
    .line 52
    iget-object v13, v1, Ljc0;->e0:Landroid/view/View;

    .line 53
    .line 54
    invoke-static {v6}, Lxa3;->w(I)I

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    const/4 v15, 0x1

    .line 59
    const/4 v8, 0x2

    .line 60
    if-eqz v14, :cond_d

    .line 61
    .line 62
    if-eq v14, v15, :cond_c

    .line 63
    .line 64
    if-eq v14, v8, :cond_5

    .line 65
    .line 66
    const/4 v9, 0x3

    .line 67
    if-eq v14, v9, :cond_2

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_2
    iget v9, v0, Lnr3;->e:I

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    iget v14, v5, Lhb0;->g:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const/4 v14, 0x0

    .line 80
    :goto_0
    if-eqz v4, :cond_4

    .line 81
    .line 82
    iget v8, v4, Lhb0;->g:I

    .line 83
    .line 84
    add-int/2addr v14, v8

    .line 85
    :cond_4
    add-int/2addr v12, v14

    .line 86
    const/4 v8, -0x1

    .line 87
    invoke-static {v9, v12, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    iget v8, v0, Lnr3;->e:I

    .line 93
    .line 94
    const/4 v9, -0x2

    .line 95
    invoke-static {v8, v12, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    iget v9, v1, Ljc0;->r:I

    .line 100
    .line 101
    if-ne v9, v15, :cond_6

    .line 102
    .line 103
    move v9, v15

    .line 104
    goto :goto_1

    .line 105
    :cond_6
    const/4 v9, 0x0

    .line 106
    :goto_1
    iget v12, v2, Lkr;->j:I

    .line 107
    .line 108
    const/4 v14, 0x2

    .line 109
    if-eq v12, v15, :cond_7

    .line 110
    .line 111
    if-ne v12, v14, :cond_a

    .line 112
    .line 113
    :cond_7
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    invoke-virtual {v1}, Ljc0;->i()I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-ne v12, v15, :cond_8

    .line 122
    .line 123
    const/4 v12, 0x1

    .line 124
    goto :goto_2

    .line 125
    :cond_8
    const/4 v12, 0x0

    .line 126
    :goto_2
    iget v15, v2, Lkr;->j:I

    .line 127
    .line 128
    if-eq v15, v14, :cond_b

    .line 129
    .line 130
    if-eqz v9, :cond_b

    .line 131
    .line 132
    if-eqz v9, :cond_9

    .line 133
    .line 134
    if-nez v12, :cond_b

    .line 135
    .line 136
    :cond_9
    invoke-virtual {v1}, Ljc0;->y()Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_a

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_a
    :goto_3
    move v9, v8

    .line 144
    goto :goto_5

    .line 145
    :cond_b
    :goto_4
    invoke-virtual {v1}, Ljc0;->o()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    const/high16 v14, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-static {v8, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    goto :goto_3

    .line 156
    :cond_c
    const/high16 v14, 0x40000000    # 2.0f

    .line 157
    .line 158
    iget v8, v0, Lnr3;->e:I

    .line 159
    .line 160
    const/4 v9, -0x2

    .line 161
    invoke-static {v8, v12, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    goto :goto_3

    .line 166
    :cond_d
    const/high16 v14, 0x40000000    # 2.0f

    .line 167
    .line 168
    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    goto :goto_3

    .line 173
    :goto_5
    invoke-static {v7}, Lxa3;->w(I)I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_18

    .line 178
    .line 179
    const/4 v12, 0x1

    .line 180
    if-eq v8, v12, :cond_17

    .line 181
    .line 182
    const/4 v14, 0x2

    .line 183
    if-eq v8, v14, :cond_11

    .line 184
    .line 185
    const/4 v10, 0x3

    .line 186
    if-eq v8, v10, :cond_e

    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    goto/16 :goto_9

    .line 190
    .line 191
    :cond_e
    iget v0, v0, Lnr3;->f:I

    .line 192
    .line 193
    if-eqz v5, :cond_f

    .line 194
    .line 195
    iget-object v5, v1, Ljc0;->I:Lhb0;

    .line 196
    .line 197
    iget v5, v5, Lhb0;->g:I

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_f
    const/4 v5, 0x0

    .line 201
    :goto_6
    if-eqz v4, :cond_10

    .line 202
    .line 203
    iget-object v4, v1, Ljc0;->K:Lhb0;

    .line 204
    .line 205
    iget v4, v4, Lhb0;->g:I

    .line 206
    .line 207
    add-int/2addr v5, v4

    .line 208
    :cond_10
    add-int/2addr v11, v5

    .line 209
    const/4 v8, -0x1

    .line 210
    invoke-static {v0, v11, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    goto :goto_9

    .line 215
    :cond_11
    iget v0, v0, Lnr3;->f:I

    .line 216
    .line 217
    const/4 v4, -0x2

    .line 218
    invoke-static {v0, v11, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iget v4, v1, Ljc0;->s:I

    .line 223
    .line 224
    const/4 v12, 0x1

    .line 225
    if-ne v4, v12, :cond_12

    .line 226
    .line 227
    move v4, v12

    .line 228
    goto :goto_7

    .line 229
    :cond_12
    const/4 v4, 0x0

    .line 230
    :goto_7
    iget v5, v2, Lkr;->j:I

    .line 231
    .line 232
    const/4 v14, 0x2

    .line 233
    if-eq v5, v12, :cond_13

    .line 234
    .line 235
    if-ne v5, v14, :cond_19

    .line 236
    .line 237
    :cond_13
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    invoke-virtual {v1}, Ljc0;->o()I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-ne v5, v8, :cond_14

    .line 246
    .line 247
    const/4 v5, 0x1

    .line 248
    goto :goto_8

    .line 249
    :cond_14
    const/4 v5, 0x0

    .line 250
    :goto_8
    iget v8, v2, Lkr;->j:I

    .line 251
    .line 252
    if-eq v8, v14, :cond_16

    .line 253
    .line 254
    if-eqz v4, :cond_16

    .line 255
    .line 256
    if-eqz v4, :cond_15

    .line 257
    .line 258
    if-nez v5, :cond_16

    .line 259
    .line 260
    :cond_15
    invoke-virtual {v1}, Ljc0;->z()Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_19

    .line 265
    .line 266
    :cond_16
    invoke-virtual {v1}, Ljc0;->i()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    const/high16 v14, 0x40000000    # 2.0f

    .line 271
    .line 272
    invoke-static {v0, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    goto :goto_9

    .line 277
    :cond_17
    const/high16 v14, 0x40000000    # 2.0f

    .line 278
    .line 279
    iget v0, v0, Lnr3;->f:I

    .line 280
    .line 281
    const/4 v4, -0x2

    .line 282
    invoke-static {v0, v11, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    goto :goto_9

    .line 287
    :cond_18
    const/high16 v14, 0x40000000    # 2.0f

    .line 288
    .line 289
    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    :cond_19
    :goto_9
    iget-object v4, v1, Ljc0;->S:Ljc0;

    .line 294
    .line 295
    check-cast v4, Lkc0;

    .line 296
    .line 297
    if-eqz v4, :cond_1a

    .line 298
    .line 299
    iget v5, v3, Landroidx/constraintlayout/widget/ConstraintLayout;->v:I

    .line 300
    .line 301
    const/16 v8, 0x100

    .line 302
    .line 303
    invoke-static {v5, v8}, Luo;->q(II)Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-eqz v5, :cond_1a

    .line 308
    .line 309
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    invoke-virtual {v1}, Ljc0;->o()I

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    if-ne v5, v8, :cond_1a

    .line 318
    .line 319
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    invoke-virtual {v4}, Ljc0;->o()I

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-ge v5, v8, :cond_1a

    .line 328
    .line 329
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    invoke-virtual {v1}, Ljc0;->i()I

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-ne v5, v8, :cond_1a

    .line 338
    .line 339
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    invoke-virtual {v4}, Ljc0;->i()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-ge v5, v4, :cond_1a

    .line 348
    .line 349
    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    iget v5, v1, Ljc0;->Z:I

    .line 354
    .line 355
    if-ne v4, v5, :cond_1a

    .line 356
    .line 357
    invoke-virtual {v1}, Ljc0;->x()Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-nez v4, :cond_1a

    .line 362
    .line 363
    iget v4, v1, Ljc0;->F:I

    .line 364
    .line 365
    invoke-virtual {v1}, Ljc0;->o()I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    invoke-static {v4, v9, v5}, Lnr3;->b(III)Z

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    if-eqz v4, :cond_1a

    .line 374
    .line 375
    iget v4, v1, Ljc0;->G:I

    .line 376
    .line 377
    invoke-virtual {v1}, Ljc0;->i()I

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    invoke-static {v4, v0, v5}, Lnr3;->b(III)Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_1a

    .line 386
    .line 387
    invoke-virtual {v1}, Ljc0;->o()I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    iput v0, v2, Lkr;->e:I

    .line 392
    .line 393
    invoke-virtual {v1}, Ljc0;->i()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    iput v0, v2, Lkr;->f:I

    .line 398
    .line 399
    iget v0, v1, Ljc0;->Z:I

    .line 400
    .line 401
    iput v0, v2, Lkr;->g:I

    .line 402
    .line 403
    return-void

    .line 404
    :cond_1a
    const/4 v10, 0x3

    .line 405
    if-ne v6, v10, :cond_1b

    .line 406
    .line 407
    const/4 v4, 0x1

    .line 408
    goto :goto_a

    .line 409
    :cond_1b
    const/4 v4, 0x0

    .line 410
    :goto_a
    if-ne v7, v10, :cond_1c

    .line 411
    .line 412
    const/4 v5, 0x1

    .line 413
    goto :goto_b

    .line 414
    :cond_1c
    const/4 v5, 0x0

    .line 415
    :goto_b
    const/4 v8, 0x4

    .line 416
    const/4 v12, 0x1

    .line 417
    if-eq v7, v8, :cond_1e

    .line 418
    .line 419
    if-ne v7, v12, :cond_1d

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_1d
    const/4 v7, 0x0

    .line 423
    goto :goto_d

    .line 424
    :cond_1e
    :goto_c
    move v7, v12

    .line 425
    :goto_d
    if-eq v6, v8, :cond_20

    .line 426
    .line 427
    if-ne v6, v12, :cond_1f

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :cond_1f
    const/4 v12, 0x0

    .line 431
    goto :goto_f

    .line 432
    :cond_20
    :goto_e
    const/4 v12, 0x1

    .line 433
    :goto_f
    const/4 v6, 0x0

    .line 434
    if-eqz v4, :cond_21

    .line 435
    .line 436
    iget v8, v1, Ljc0;->V:F

    .line 437
    .line 438
    cmpl-float v8, v8, v6

    .line 439
    .line 440
    if-lez v8, :cond_21

    .line 441
    .line 442
    const/4 v8, 0x1

    .line 443
    goto :goto_10

    .line 444
    :cond_21
    const/4 v8, 0x0

    .line 445
    :goto_10
    if-eqz v5, :cond_22

    .line 446
    .line 447
    iget v10, v1, Ljc0;->V:F

    .line 448
    .line 449
    cmpl-float v6, v10, v6

    .line 450
    .line 451
    if-lez v6, :cond_22

    .line 452
    .line 453
    const/4 v6, 0x1

    .line 454
    goto :goto_11

    .line 455
    :cond_22
    const/4 v6, 0x0

    .line 456
    :goto_11
    if-nez v13, :cond_23

    .line 457
    .line 458
    :goto_12
    return-void

    .line 459
    :cond_23
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    check-cast v10, Lmb0;

    .line 464
    .line 465
    iget v11, v2, Lkr;->j:I

    .line 466
    .line 467
    const/4 v14, 0x1

    .line 468
    if-eq v11, v14, :cond_25

    .line 469
    .line 470
    const/4 v14, 0x2

    .line 471
    if-eq v11, v14, :cond_25

    .line 472
    .line 473
    if-eqz v4, :cond_25

    .line 474
    .line 475
    iget v4, v1, Ljc0;->r:I

    .line 476
    .line 477
    if-nez v4, :cond_25

    .line 478
    .line 479
    if-eqz v5, :cond_25

    .line 480
    .line 481
    iget v4, v1, Ljc0;->s:I

    .line 482
    .line 483
    if-eqz v4, :cond_24

    .line 484
    .line 485
    goto :goto_13

    .line 486
    :cond_24
    const/4 v4, 0x0

    .line 487
    const/4 v5, 0x0

    .line 488
    const/4 v8, -0x1

    .line 489
    const/4 v14, 0x0

    .line 490
    const/4 v15, 0x0

    .line 491
    goto/16 :goto_1b

    .line 492
    .line 493
    :cond_25
    :goto_13
    invoke-virtual {v13, v9, v0}, Landroid/view/View;->measure(II)V

    .line 494
    .line 495
    .line 496
    iput v9, v1, Ljc0;->F:I

    .line 497
    .line 498
    iput v0, v1, Ljc0;->G:I

    .line 499
    .line 500
    const/4 v4, 0x0

    .line 501
    iput-boolean v4, v1, Ljc0;->g:Z

    .line 502
    .line 503
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    iget v14, v1, Ljc0;->u:I

    .line 516
    .line 517
    if-lez v14, :cond_26

    .line 518
    .line 519
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    goto :goto_14

    .line 524
    :cond_26
    move v14, v4

    .line 525
    :goto_14
    iget v15, v1, Ljc0;->v:I

    .line 526
    .line 527
    if-lez v15, :cond_27

    .line 528
    .line 529
    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    .line 530
    .line 531
    .line 532
    move-result v14

    .line 533
    :cond_27
    iget v15, v1, Ljc0;->x:I

    .line 534
    .line 535
    if-lez v15, :cond_28

    .line 536
    .line 537
    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    .line 538
    .line 539
    .line 540
    move-result v15

    .line 541
    :goto_15
    move/from16 v16, v0

    .line 542
    .line 543
    goto :goto_16

    .line 544
    :cond_28
    move v15, v5

    .line 545
    goto :goto_15

    .line 546
    :goto_16
    iget v0, v1, Ljc0;->y:I

    .line 547
    .line 548
    if-lez v0, :cond_29

    .line 549
    .line 550
    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    .line 551
    .line 552
    .line 553
    move-result v15

    .line 554
    :cond_29
    iget v0, v3, Landroidx/constraintlayout/widget/ConstraintLayout;->v:I

    .line 555
    .line 556
    const/4 v3, 0x1

    .line 557
    invoke-static {v0, v3}, Luo;->q(II)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-nez v0, :cond_2b

    .line 562
    .line 563
    const/high16 v0, 0x3f000000    # 0.5f

    .line 564
    .line 565
    if-eqz v8, :cond_2a

    .line 566
    .line 567
    if-eqz v7, :cond_2a

    .line 568
    .line 569
    iget v3, v1, Ljc0;->V:F

    .line 570
    .line 571
    int-to-float v6, v15

    .line 572
    mul-float/2addr v6, v3

    .line 573
    add-float/2addr v6, v0

    .line 574
    float-to-int v0, v6

    .line 575
    move v14, v0

    .line 576
    goto :goto_17

    .line 577
    :cond_2a
    if-eqz v6, :cond_2b

    .line 578
    .line 579
    if-eqz v12, :cond_2b

    .line 580
    .line 581
    iget v3, v1, Ljc0;->V:F

    .line 582
    .line 583
    int-to-float v6, v14

    .line 584
    div-float/2addr v6, v3

    .line 585
    add-float/2addr v6, v0

    .line 586
    float-to-int v0, v6

    .line 587
    move v15, v0

    .line 588
    :cond_2b
    :goto_17
    if-ne v4, v14, :cond_2d

    .line 589
    .line 590
    if-eq v5, v15, :cond_2c

    .line 591
    .line 592
    goto :goto_19

    .line 593
    :cond_2c
    move v5, v11

    .line 594
    const/4 v4, 0x0

    .line 595
    :goto_18
    const/4 v8, -0x1

    .line 596
    goto :goto_1b

    .line 597
    :cond_2d
    :goto_19
    const/high16 v0, 0x40000000    # 2.0f

    .line 598
    .line 599
    if-eq v4, v14, :cond_2e

    .line 600
    .line 601
    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    :cond_2e
    if-eq v5, v15, :cond_2f

    .line 606
    .line 607
    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    goto :goto_1a

    .line 612
    :cond_2f
    move/from16 v0, v16

    .line 613
    .line 614
    :goto_1a
    invoke-virtual {v13, v9, v0}, Landroid/view/View;->measure(II)V

    .line 615
    .line 616
    .line 617
    iput v9, v1, Ljc0;->F:I

    .line 618
    .line 619
    iput v0, v1, Ljc0;->G:I

    .line 620
    .line 621
    const/4 v4, 0x0

    .line 622
    iput-boolean v4, v1, Ljc0;->g:Z

    .line 623
    .line 624
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    move v14, v0

    .line 637
    move v15, v3

    .line 638
    goto :goto_18

    .line 639
    :goto_1b
    if-eq v5, v8, :cond_30

    .line 640
    .line 641
    const/4 v12, 0x1

    .line 642
    goto :goto_1c

    .line 643
    :cond_30
    move v12, v4

    .line 644
    :goto_1c
    iget v0, v2, Lkr;->c:I

    .line 645
    .line 646
    if-ne v14, v0, :cond_32

    .line 647
    .line 648
    iget v0, v2, Lkr;->d:I

    .line 649
    .line 650
    if-eq v15, v0, :cond_31

    .line 651
    .line 652
    goto :goto_1d

    .line 653
    :cond_31
    move v8, v4

    .line 654
    goto :goto_1e

    .line 655
    :cond_32
    :goto_1d
    const/4 v8, 0x1

    .line 656
    :goto_1e
    iput-boolean v8, v2, Lkr;->i:Z

    .line 657
    .line 658
    iget-boolean v0, v10, Lmb0;->c0:Z

    .line 659
    .line 660
    if-eqz v0, :cond_33

    .line 661
    .line 662
    const/4 v12, 0x1

    .line 663
    :cond_33
    if-eqz v12, :cond_34

    .line 664
    .line 665
    const/4 v8, -0x1

    .line 666
    if-eq v5, v8, :cond_34

    .line 667
    .line 668
    iget v0, v1, Ljc0;->Z:I

    .line 669
    .line 670
    if-eq v0, v5, :cond_34

    .line 671
    .line 672
    const/4 v3, 0x1

    .line 673
    iput-boolean v3, v2, Lkr;->i:Z

    .line 674
    .line 675
    :cond_34
    iput v14, v2, Lkr;->e:I

    .line 676
    .line 677
    iput v15, v2, Lkr;->f:I

    .line 678
    .line 679
    iput-boolean v12, v2, Lkr;->h:Z

    .line 680
    .line 681
    iput v5, v2, Lkr;->g:I

    .line 682
    .line 683
    return-void
.end method

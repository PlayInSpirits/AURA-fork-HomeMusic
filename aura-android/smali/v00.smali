.class public final Lv00;
.super Ldx4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final K:[Ljava/lang/String;

.field public static final L:Lr00;

.field public static final M:Lr00;

.field public static final N:Lr00;

.field public static final O:Lr00;

.field public static final P:Lr00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:windowX"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:windowY"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:clip"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:parent"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lv00;->K:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lcq;

    .line 18
    .line 19
    const-string v1, "boundsOrigin"

    .line 20
    .line 21
    const-class v2, Landroid/graphics/PointF;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lcq;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lcq;->b:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Lr00;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-string v3, "topLeft"

    .line 37
    .line 38
    invoke-direct {v0, v2, v3, v1}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lv00;->L:Lr00;

    .line 42
    .line 43
    new-instance v0, Lr00;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    const-string v4, "bottomRight"

    .line 47
    .line 48
    invoke-direct {v0, v2, v4, v1}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lv00;->M:Lr00;

    .line 52
    .line 53
    new-instance v0, Lr00;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, v2, v4, v1}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lv00;->N:Lr00;

    .line 60
    .line 61
    new-instance v0, Lr00;

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    invoke-direct {v0, v2, v3, v1}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lv00;->O:Lr00;

    .line 68
    .line 69
    new-instance v0, Lr00;

    .line 70
    .line 71
    const-string v1, "position"

    .line 72
    .line 73
    const/4 v3, 0x4

    .line 74
    invoke-direct {v0, v2, v1, v3}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lv00;->P:Lr00;

    .line 78
    .line 79
    return-void
.end method

.method public static F(Lmx4;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lmx4;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object p0, p0, Lmx4;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    new-instance v1, Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 46
    .line 47
    .line 48
    const-string v2, "android:changeBounds:bounds"

    .line 49
    .line 50
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const-string v1, "android:changeBounds:parent"

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final c(Lmx4;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lv00;->F(Lmx4;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f(Lmx4;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lv00;->F(Lmx4;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j(Landroid/view/ViewGroup;Lmx4;Lmx4;)Landroid/animation/Animator;
    .locals 18

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lmx4;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_1
    iget-object v4, v2, Lmx4;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    const-string v5, "android:changeBounds:parent"

    .line 17
    .line 18
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v2, v2, Lmx4;->b:Landroid/view/View;

    .line 36
    .line 37
    const-string v5, "android:changeBounds:bounds"

    .line 38
    .line 39
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Landroid/graphics/Rect;

    .line 50
    .line 51
    iget v7, v6, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    iget v8, v5, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iget v9, v6, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v10, v5, Landroid/graphics/Rect;->top:I

    .line 58
    .line 59
    iget v11, v6, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    iget v12, v5, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 64
    .line 65
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 66
    .line 67
    sub-int v13, v11, v7

    .line 68
    .line 69
    sub-int v14, v6, v9

    .line 70
    .line 71
    sub-int v15, v12, v8

    .line 72
    .line 73
    sub-int v3, v5, v10

    .line 74
    .line 75
    const-string v0, "android:changeBounds:clip"

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/graphics/Rect;

    .line 88
    .line 89
    const/16 p2, 0x0

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    if-eqz v13, :cond_3

    .line 93
    .line 94
    if-nez v14, :cond_4

    .line 95
    .line 96
    :cond_3
    if-eqz v15, :cond_8

    .line 97
    .line 98
    if-eqz v3, :cond_8

    .line 99
    .line 100
    :cond_4
    if-ne v7, v8, :cond_6

    .line 101
    .line 102
    if-eq v9, v10, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    move/from16 v16, p2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    :goto_1
    move/from16 v16, v4

    .line 109
    .line 110
    :goto_2
    if-ne v11, v12, :cond_7

    .line 111
    .line 112
    if-eq v6, v5, :cond_9

    .line 113
    .line 114
    :cond_7
    add-int/lit8 v16, v16, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_8
    move/from16 v16, p2

    .line 118
    .line 119
    :cond_9
    :goto_3
    if-eqz v1, :cond_a

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v17

    .line 125
    if-eqz v17, :cond_b

    .line 126
    .line 127
    :cond_a
    if-nez v1, :cond_c

    .line 128
    .line 129
    if-eqz v0, :cond_c

    .line 130
    .line 131
    :cond_b
    add-int/lit8 v16, v16, 0x1

    .line 132
    .line 133
    :cond_c
    move/from16 v0, v16

    .line 134
    .line 135
    if-lez v0, :cond_0

    .line 136
    .line 137
    invoke-static {v2, v7, v9, v11, v6}, Ld85;->a(Landroid/view/View;IIII)V

    .line 138
    .line 139
    .line 140
    const/4 v1, 0x2

    .line 141
    if-ne v0, v1, :cond_e

    .line 142
    .line 143
    if-ne v13, v15, :cond_d

    .line 144
    .line 145
    if-ne v14, v3, :cond_d

    .line 146
    .line 147
    move-object/from16 v0, p0

    .line 148
    .line 149
    iget-object v1, v0, Ldx4;->G:Lxi4;

    .line 150
    .line 151
    int-to-float v3, v7

    .line 152
    int-to-float v5, v9

    .line 153
    int-to-float v6, v8

    .line 154
    int-to-float v7, v10

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v3, v5, v6, v7}, Lxi4;->p(FFFF)Landroid/graphics/Path;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    sget-object v3, Lv00;->P:Lr00;

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    invoke-static {v2, v3, v5, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_d
    move-object/from16 v0, p0

    .line 172
    .line 173
    new-instance v3, Lu00;

    .line 174
    .line 175
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object v2, v3, Lu00;->e:Landroid/view/View;

    .line 179
    .line 180
    iget-object v13, v0, Ldx4;->G:Lxi4;

    .line 181
    .line 182
    int-to-float v7, v7

    .line 183
    int-to-float v9, v9

    .line 184
    int-to-float v8, v8

    .line 185
    int-to-float v10, v10

    .line 186
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v7, v9, v8, v10}, Lxi4;->p(FFFF)Landroid/graphics/Path;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    sget-object v8, Lv00;->L:Lr00;

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    invoke-static {v3, v8, v9, v7}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    iget-object v8, v0, Ldx4;->G:Lxi4;

    .line 201
    .line 202
    int-to-float v10, v11

    .line 203
    int-to-float v6, v6

    .line 204
    int-to-float v11, v12

    .line 205
    int-to-float v5, v5

    .line 206
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {v10, v6, v11, v5}, Lxi4;->p(FFFF)Landroid/graphics/Path;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    sget-object v6, Lv00;->M:Lr00;

    .line 214
    .line 215
    invoke-static {v3, v6, v9, v5}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 220
    .line 221
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 222
    .line 223
    .line 224
    new-array v1, v1, [Landroid/animation/Animator;

    .line 225
    .line 226
    aput-object v7, v1, p2

    .line 227
    .line 228
    aput-object v5, v1, v4

    .line 229
    .line 230
    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Ls00;

    .line 234
    .line 235
    invoke-direct {v1, v3}, Ls00;-><init>(Lu00;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 239
    .line 240
    .line 241
    move-object v1, v6

    .line 242
    goto :goto_5

    .line 243
    :cond_e
    move-object/from16 v0, p0

    .line 244
    .line 245
    if-ne v7, v8, :cond_f

    .line 246
    .line 247
    if-eq v9, v10, :cond_10

    .line 248
    .line 249
    :cond_f
    const/4 v5, 0x0

    .line 250
    goto :goto_4

    .line 251
    :cond_10
    iget-object v1, v0, Ldx4;->G:Lxi4;

    .line 252
    .line 253
    int-to-float v3, v11

    .line 254
    int-to-float v6, v6

    .line 255
    int-to-float v7, v12

    .line 256
    int-to-float v5, v5

    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v6, v7, v5}, Lxi4;->p(FFFF)Landroid/graphics/Path;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    sget-object v3, Lv00;->N:Lr00;

    .line 265
    .line 266
    const/4 v5, 0x0

    .line 267
    invoke-static {v2, v3, v5, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    goto :goto_5

    .line 272
    :goto_4
    iget-object v1, v0, Ldx4;->G:Lxi4;

    .line 273
    .line 274
    int-to-float v3, v7

    .line 275
    int-to-float v6, v9

    .line 276
    int-to-float v7, v8

    .line 277
    int-to-float v8, v10

    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v3, v6, v7, v8}, Lxi4;->p(FFFF)Landroid/graphics/Path;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    sget-object v3, Lv00;->O:Lr00;

    .line 286
    .line 287
    invoke-static {v2, v3, v5, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    :goto_5
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    instance-of v3, v3, Landroid/view/ViewGroup;

    .line 296
    .line 297
    if-eqz v3, :cond_11

    .line 298
    .line 299
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    check-cast v2, Landroid/view/ViewGroup;

    .line 304
    .line 305
    invoke-static {v2, v4}, Lfh0;->y(Landroid/view/ViewGroup;Z)V

    .line 306
    .line 307
    .line 308
    new-instance v3, Lt00;

    .line 309
    .line 310
    invoke-direct {v3, v2}, Lt00;-><init>(Landroid/view/ViewGroup;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v3}, Ldx4;->a(Lbx4;)V

    .line 314
    .line 315
    .line 316
    :cond_11
    return-object v1

    .line 317
    :goto_6
    return-object v5
.end method

.method public final o()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lv00;->K:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

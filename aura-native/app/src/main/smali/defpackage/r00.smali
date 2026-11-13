.class public final Ldefpackage/r00;
.super Landroid/util/Property;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/r00;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/r00;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 17
    .line 18
    sget-object p0, Ldefpackage/d85;->a:Ldefpackage/f85;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ldefpackage/wr1;->D(Landroid/view/View;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 30
    .line 31
    iget p0, p1, Landroidx/appcompat/widget/SwitchCompat;->M:F

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    check-cast p1, Ldefpackage/xa2;

    .line 39
    .line 40
    iget p0, p1, Ldefpackage/xa2;->j:F

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_3
    check-cast p1, Ldefpackage/va2;

    .line 48
    .line 49
    iget p0, p1, Ldefpackage/va2;->i:F

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 57
    .line 58
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    int-to-float p0, p0

    .line 65
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    int-to-float p0, p0

    .line 79
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 91
    .line 92
    int-to-float p0, p0

    .line 93
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 105
    .line 106
    int-to-float p0, p0

    .line 107
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_8
    check-cast p1, Ldefpackage/cw0;

    .line 113
    .line 114
    invoke-virtual {p1}, Ldefpackage/cw0;->b()F

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_9
    check-cast p1, Ldefpackage/a30;

    .line 124
    .line 125
    iget p0, p1, Ldefpackage/a30;->j:F

    .line 126
    .line 127
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_a
    check-cast p1, Ldefpackage/a30;

    .line 133
    .line 134
    iget p0, p1, Ldefpackage/a30;->i:F

    .line 135
    .line 136
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_b
    check-cast p1, Landroid/view/View;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_c
    check-cast p1, Landroid/view/View;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_d
    check-cast p1, Landroid/view/View;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_e
    check-cast p1, Ldefpackage/u00;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_f
    check-cast p1, Ldefpackage/u00;

    .line 154
    .line 155
    return-object v0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 15

    .line 1
    iget v0, p0, Ldefpackage/r00;->a:I

    .line 2
    .line 3
    const v1, 0x4426c000    # 667.0f

    .line 4
    .line 5
    .line 6
    const v2, 0x43a68000    # 333.0f

    .line 7
    .line 8
    .line 9
    const/high16 v3, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x4

    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Landroid/graphics/Rect;

    .line 25
    .line 26
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, Landroid/view/View;

    .line 35
    .line 36
    move-object/from16 v1, p2

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    sget-object v2, Ldefpackage/d85;->a:Ldefpackage/f85;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Ldefpackage/wr1;->R(Landroid/view/View;F)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    move-object/from16 v0, p1

    .line 67
    .line 68
    check-cast v0, Ldefpackage/xa2;

    .line 69
    .line 70
    move-object/from16 v1, p2

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Float;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iput v1, v0, Ldefpackage/xa2;->j:F

    .line 79
    .line 80
    const/high16 v2, 0x44e10000    # 1800.0f

    .line 81
    .line 82
    mul-float/2addr v1, v2

    .line 83
    float-to-int v1, v1

    .line 84
    move v2, v7

    .line 85
    :goto_0
    if-ge v2, v5, :cond_0

    .line 86
    .line 87
    sget-object v6, Ldefpackage/xa2;->m:[I

    .line 88
    .line 89
    aget v6, v6, v2

    .line 90
    .line 91
    sget-object v8, Ldefpackage/xa2;->l:[I

    .line 92
    .line 93
    aget v8, v8, v2

    .line 94
    .line 95
    sub-int v6, v1, v6

    .line 96
    .line 97
    int-to-float v6, v6

    .line 98
    int-to-float v8, v8

    .line 99
    div-float/2addr v6, v8

    .line 100
    iget-object v8, v0, Ldefpackage/xa2;->f:[Landroid/view/animation/Interpolator;

    .line 101
    .line 102
    aget-object v8, v8, v2

    .line 103
    .line 104
    invoke-interface {v8, v6}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    iget-object v8, v0, Ldefpackage/rx1;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, [F

    .line 111
    .line 112
    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    aput v6, v8, v2

    .line 121
    .line 122
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    iget-boolean v1, v0, Ldefpackage/xa2;->i:Z

    .line 126
    .line 127
    if-eqz v1, :cond_1

    .line 128
    .line 129
    iget-object v1, v0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 130
    .line 131
    check-cast v1, [I

    .line 132
    .line 133
    iget-object v2, v0, Ldefpackage/xa2;->g:Ldefpackage/cb2;

    .line 134
    .line 135
    iget-object v2, v2, Ldefpackage/jq;->c:[I

    .line 136
    .line 137
    iget v3, v0, Ldefpackage/xa2;->h:I

    .line 138
    .line 139
    aget v2, v2, v3

    .line 140
    .line 141
    iget-object v3, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v3, Ldefpackage/sx1;

    .line 144
    .line 145
    iget v3, v3, Ldefpackage/cw0;->w:I

    .line 146
    .line 147
    invoke-static {v2, v3}, Ldefpackage/g12;->l(II)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 152
    .line 153
    .line 154
    iput-boolean v7, v0, Ldefpackage/xa2;->i:Z

    .line 155
    .line 156
    :cond_1
    iget-object v0, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ldefpackage/sx1;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_3
    move-object/from16 v0, p1

    .line 165
    .line 166
    check-cast v0, Ldefpackage/va2;

    .line 167
    .line 168
    move-object/from16 v8, p2

    .line 169
    .line 170
    check-cast v8, Ljava/lang/Float;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    iput v8, v0, Ldefpackage/va2;->i:F

    .line 177
    .line 178
    mul-float/2addr v8, v2

    .line 179
    float-to-int v2, v8

    .line 180
    iget-object v8, v0, Ldefpackage/rx1;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v8, [F

    .line 183
    .line 184
    aput v4, v8, v7

    .line 185
    .line 186
    int-to-float v2, v2

    .line 187
    div-float/2addr v2, v1

    .line 188
    iget-object v1, v0, Ldefpackage/va2;->e:Ldefpackage/a61;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ldefpackage/a61;->getInterpolation(F)F

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const/4 v9, 0x2

    .line 195
    aput v4, v8, v9

    .line 196
    .line 197
    aput v4, v8, v6

    .line 198
    .line 199
    const v4, 0x3eff9dbf

    .line 200
    .line 201
    .line 202
    add-float/2addr v2, v4

    .line 203
    invoke-virtual {v1, v2}, Ldefpackage/a61;->getInterpolation(F)F

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    aput v1, v8, v5

    .line 208
    .line 209
    const/4 v2, 0x3

    .line 210
    aput v1, v8, v2

    .line 211
    .line 212
    const/4 v2, 0x5

    .line 213
    aput v3, v8, v2

    .line 214
    .line 215
    iget-boolean v2, v0, Ldefpackage/va2;->h:Z

    .line 216
    .line 217
    if-eqz v2, :cond_2

    .line 218
    .line 219
    cmpg-float v1, v1, v3

    .line 220
    .line 221
    if-gez v1, :cond_2

    .line 222
    .line 223
    iget-object v1, v0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 224
    .line 225
    check-cast v1, [I

    .line 226
    .line 227
    aget v2, v1, v6

    .line 228
    .line 229
    aput v2, v1, v9

    .line 230
    .line 231
    aget v2, v1, v7

    .line 232
    .line 233
    aput v2, v1, v6

    .line 234
    .line 235
    iget-object v2, v0, Ldefpackage/va2;->f:Ldefpackage/cb2;

    .line 236
    .line 237
    iget-object v2, v2, Ldefpackage/jq;->c:[I

    .line 238
    .line 239
    iget v3, v0, Ldefpackage/va2;->g:I

    .line 240
    .line 241
    aget v2, v2, v3

    .line 242
    .line 243
    iget-object v3, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Ldefpackage/sx1;

    .line 246
    .line 247
    iget v3, v3, Ldefpackage/cw0;->w:I

    .line 248
    .line 249
    invoke-static {v2, v3}, Ldefpackage/g12;->l(II)I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    aput v2, v1, v7

    .line 254
    .line 255
    iput-boolean v7, v0, Ldefpackage/va2;->h:Z

    .line 256
    .line 257
    :cond_2
    iget-object v0, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Ldefpackage/sx1;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_4
    move-object/from16 v0, p1

    .line 266
    .line 267
    check-cast v0, Landroid/view/View;

    .line 268
    .line 269
    move-object/from16 v1, p2

    .line 270
    .line 271
    check-cast v1, Ljava/lang/Float;

    .line 272
    .line 273
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_5
    move-object/from16 v0, p1

    .line 296
    .line 297
    check-cast v0, Landroid/view/View;

    .line 298
    .line 299
    move-object/from16 v1, p2

    .line 300
    .line 301
    check-cast v1, Ljava/lang/Float;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 312
    .line 313
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_6
    move-object/from16 v0, p1

    .line 326
    .line 327
    check-cast v0, Landroid/view/View;

    .line 328
    .line 329
    move-object/from16 v1, p2

    .line 330
    .line 331
    check-cast v1, Ljava/lang/Float;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 342
    .line 343
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_7
    move-object/from16 v0, p1

    .line 348
    .line 349
    check-cast v0, Landroid/view/View;

    .line 350
    .line 351
    move-object/from16 v1, p2

    .line 352
    .line 353
    check-cast v1, Ljava/lang/Float;

    .line 354
    .line 355
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 364
    .line 365
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_8
    move-object/from16 v0, p1

    .line 370
    .line 371
    check-cast v0, Ldefpackage/cw0;

    .line 372
    .line 373
    move-object/from16 v1, p2

    .line 374
    .line 375
    check-cast v1, Ljava/lang/Float;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    iget v2, v0, Ldefpackage/cw0;->u:F

    .line 382
    .line 383
    cmpl-float v2, v2, v1

    .line 384
    .line 385
    if-eqz v2, :cond_3

    .line 386
    .line 387
    iput v1, v0, Ldefpackage/cw0;->u:F

    .line 388
    .line 389
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 390
    .line 391
    .line 392
    :cond_3
    return-void

    .line 393
    :pswitch_9
    move-object/from16 v0, p1

    .line 394
    .line 395
    check-cast v0, Ldefpackage/a30;

    .line 396
    .line 397
    move-object/from16 v1, p2

    .line 398
    .line 399
    check-cast v1, Ljava/lang/Float;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    iput v1, v0, Ldefpackage/a30;->j:F

    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_a
    move-object/from16 v0, p1

    .line 409
    .line 410
    check-cast v0, Ldefpackage/a30;

    .line 411
    .line 412
    move-object/from16 v8, p2

    .line 413
    .line 414
    check-cast v8, Ljava/lang/Float;

    .line 415
    .line 416
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 417
    .line 418
    .line 419
    move-result v8

    .line 420
    iput v8, v0, Ldefpackage/a30;->i:F

    .line 421
    .line 422
    const v9, 0x45a8c000    # 5400.0f

    .line 423
    .line 424
    .line 425
    mul-float/2addr v9, v8

    .line 426
    float-to-int v9, v9

    .line 427
    iget-object v10, v0, Ldefpackage/a30;->f:Ldefpackage/a61;

    .line 428
    .line 429
    iget-object v11, v0, Ldefpackage/rx1;->b:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v11, [F

    .line 432
    .line 433
    const/high16 v12, 0x44be0000    # 1520.0f

    .line 434
    .line 435
    mul-float/2addr v8, v12

    .line 436
    const/high16 v12, -0x3e600000    # -20.0f

    .line 437
    .line 438
    add-float/2addr v12, v8

    .line 439
    aput v12, v11, v7

    .line 440
    .line 441
    aput v8, v11, v6

    .line 442
    .line 443
    move v8, v7

    .line 444
    :goto_1
    if-ge v8, v5, :cond_4

    .line 445
    .line 446
    sget-object v12, Ldefpackage/a30;->l:[I

    .line 447
    .line 448
    aget v12, v12, v8

    .line 449
    .line 450
    sub-int v12, v9, v12

    .line 451
    .line 452
    int-to-float v12, v12

    .line 453
    div-float/2addr v12, v1

    .line 454
    aget v13, v11, v6

    .line 455
    .line 456
    invoke-virtual {v10, v12}, Ldefpackage/a61;->getInterpolation(F)F

    .line 457
    .line 458
    .line 459
    move-result v12

    .line 460
    const/high16 v14, 0x437a0000    # 250.0f

    .line 461
    .line 462
    mul-float/2addr v12, v14

    .line 463
    add-float/2addr v12, v13

    .line 464
    aput v12, v11, v6

    .line 465
    .line 466
    sget-object v12, Ldefpackage/a30;->m:[I

    .line 467
    .line 468
    aget v12, v12, v8

    .line 469
    .line 470
    sub-int v12, v9, v12

    .line 471
    .line 472
    int-to-float v12, v12

    .line 473
    div-float/2addr v12, v1

    .line 474
    aget v13, v11, v7

    .line 475
    .line 476
    invoke-virtual {v10, v12}, Ldefpackage/a61;->getInterpolation(F)F

    .line 477
    .line 478
    .line 479
    move-result v12

    .line 480
    mul-float/2addr v12, v14

    .line 481
    add-float/2addr v12, v13

    .line 482
    aput v12, v11, v7

    .line 483
    .line 484
    add-int/lit8 v8, v8, 0x1

    .line 485
    .line 486
    goto :goto_1

    .line 487
    :cond_4
    aget v1, v11, v7

    .line 488
    .line 489
    aget v8, v11, v6

    .line 490
    .line 491
    sub-float v12, v8, v1

    .line 492
    .line 493
    iget v13, v0, Ldefpackage/a30;->j:F

    .line 494
    .line 495
    mul-float/2addr v12, v13

    .line 496
    add-float/2addr v12, v1

    .line 497
    aput v12, v11, v7

    .line 498
    .line 499
    const/high16 v1, 0x43b40000    # 360.0f

    .line 500
    .line 501
    div-float/2addr v12, v1

    .line 502
    aput v12, v11, v7

    .line 503
    .line 504
    div-float/2addr v8, v1

    .line 505
    aput v8, v11, v6

    .line 506
    .line 507
    iget-object v1, v0, Ldefpackage/a30;->g:Ldefpackage/g30;

    .line 508
    .line 509
    move v6, v7

    .line 510
    :goto_2
    if-ge v6, v5, :cond_6

    .line 511
    .line 512
    sget-object v8, Ldefpackage/a30;->n:[I

    .line 513
    .line 514
    aget v8, v8, v6

    .line 515
    .line 516
    sub-int v8, v9, v8

    .line 517
    .line 518
    int-to-float v8, v8

    .line 519
    div-float/2addr v8, v2

    .line 520
    cmpl-float v11, v8, v4

    .line 521
    .line 522
    if-ltz v11, :cond_5

    .line 523
    .line 524
    cmpg-float v11, v8, v3

    .line 525
    .line 526
    if-gtz v11, :cond_5

    .line 527
    .line 528
    iget v2, v0, Ldefpackage/a30;->h:I

    .line 529
    .line 530
    add-int/2addr v6, v2

    .line 531
    iget-object v2, v1, Ldefpackage/jq;->c:[I

    .line 532
    .line 533
    array-length v3, v2

    .line 534
    rem-int/2addr v6, v3

    .line 535
    add-int/lit8 v3, v6, 0x1

    .line 536
    .line 537
    array-length v4, v2

    .line 538
    rem-int/2addr v3, v4

    .line 539
    aget v2, v2, v6

    .line 540
    .line 541
    iget-object v4, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v4, Ldefpackage/sx1;

    .line 544
    .line 545
    iget v4, v4, Ldefpackage/cw0;->w:I

    .line 546
    .line 547
    invoke-static {v2, v4}, Ldefpackage/g12;->l(II)I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    iget-object v1, v1, Ldefpackage/jq;->c:[I

    .line 552
    .line 553
    aget v1, v1, v3

    .line 554
    .line 555
    iget-object v3, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v3, Ldefpackage/sx1;

    .line 558
    .line 559
    iget v3, v3, Ldefpackage/cw0;->w:I

    .line 560
    .line 561
    invoke-static {v1, v3}, Ldefpackage/g12;->l(II)I

    .line 562
    .line 563
    .line 564
    move-result v1

    .line 565
    invoke-virtual {v10, v8}, Ldefpackage/a61;->getInterpolation(F)F

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    iget-object v4, v0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 570
    .line 571
    check-cast v4, [I

    .line 572
    .line 573
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    shr-int/lit8 v5, v2, 0x18

    .line 586
    .line 587
    and-int/lit16 v5, v5, 0xff

    .line 588
    .line 589
    int-to-float v5, v5

    .line 590
    const/high16 v6, 0x437f0000    # 255.0f

    .line 591
    .line 592
    div-float/2addr v5, v6

    .line 593
    shr-int/lit8 v8, v2, 0x10

    .line 594
    .line 595
    and-int/lit16 v8, v8, 0xff

    .line 596
    .line 597
    int-to-float v8, v8

    .line 598
    div-float/2addr v8, v6

    .line 599
    shr-int/lit8 v9, v2, 0x8

    .line 600
    .line 601
    and-int/lit16 v9, v9, 0xff

    .line 602
    .line 603
    int-to-float v9, v9

    .line 604
    div-float/2addr v9, v6

    .line 605
    and-int/lit16 v2, v2, 0xff

    .line 606
    .line 607
    int-to-float v2, v2

    .line 608
    div-float/2addr v2, v6

    .line 609
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    shr-int/lit8 v10, v1, 0x18

    .line 614
    .line 615
    and-int/lit16 v10, v10, 0xff

    .line 616
    .line 617
    int-to-float v10, v10

    .line 618
    div-float/2addr v10, v6

    .line 619
    shr-int/lit8 v11, v1, 0x10

    .line 620
    .line 621
    and-int/lit16 v11, v11, 0xff

    .line 622
    .line 623
    int-to-float v11, v11

    .line 624
    div-float/2addr v11, v6

    .line 625
    shr-int/lit8 v12, v1, 0x8

    .line 626
    .line 627
    and-int/lit16 v12, v12, 0xff

    .line 628
    .line 629
    int-to-float v12, v12

    .line 630
    div-float/2addr v12, v6

    .line 631
    and-int/lit16 v1, v1, 0xff

    .line 632
    .line 633
    int-to-float v1, v1

    .line 634
    div-float/2addr v1, v6

    .line 635
    float-to-double v13, v8

    .line 636
    move/from16 p1, v6

    .line 637
    .line 638
    move p0, v7

    .line 639
    const-wide v6, 0x400199999999999aL    # 2.2

    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 645
    .line 646
    .line 647
    move-result-wide v13

    .line 648
    double-to-float v8, v13

    .line 649
    float-to-double v13, v9

    .line 650
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 651
    .line 652
    .line 653
    move-result-wide v13

    .line 654
    double-to-float v9, v13

    .line 655
    float-to-double v13, v2

    .line 656
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 657
    .line 658
    .line 659
    move-result-wide v13

    .line 660
    double-to-float v2, v13

    .line 661
    float-to-double v13, v11

    .line 662
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 663
    .line 664
    .line 665
    move-result-wide v13

    .line 666
    double-to-float v11, v13

    .line 667
    float-to-double v12, v12

    .line 668
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 669
    .line 670
    .line 671
    move-result-wide v12

    .line 672
    double-to-float v12, v12

    .line 673
    float-to-double v13, v1

    .line 674
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 675
    .line 676
    .line 677
    move-result-wide v6

    .line 678
    double-to-float v1, v6

    .line 679
    invoke-static {v10, v5, v3, v5}, Ldefpackage/xa3;->a(FFFF)F

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    invoke-static {v11, v8, v3, v8}, Ldefpackage/xa3;->a(FFFF)F

    .line 684
    .line 685
    .line 686
    move-result v6

    .line 687
    invoke-static {v12, v9, v3, v9}, Ldefpackage/xa3;->a(FFFF)F

    .line 688
    .line 689
    .line 690
    move-result v7

    .line 691
    invoke-static {v1, v2, v3, v2}, Ldefpackage/xa3;->a(FFFF)F

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    mul-float v5, v5, p1

    .line 696
    .line 697
    float-to-double v2, v6

    .line 698
    const-wide v8, 0x3fdd1745d1745d17L    # 0.45454545454545453

    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 704
    .line 705
    .line 706
    move-result-wide v2

    .line 707
    double-to-float v2, v2

    .line 708
    mul-float v2, v2, p1

    .line 709
    .line 710
    float-to-double v6, v7

    .line 711
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 712
    .line 713
    .line 714
    move-result-wide v6

    .line 715
    double-to-float v3, v6

    .line 716
    mul-float v3, v3, p1

    .line 717
    .line 718
    float-to-double v6, v1

    .line 719
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 720
    .line 721
    .line 722
    move-result-wide v6

    .line 723
    double-to-float v1, v6

    .line 724
    mul-float v1, v1, p1

    .line 725
    .line 726
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 727
    .line 728
    .line 729
    move-result v5

    .line 730
    shl-int/lit8 v5, v5, 0x18

    .line 731
    .line 732
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    shl-int/lit8 v2, v2, 0x10

    .line 737
    .line 738
    or-int/2addr v2, v5

    .line 739
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    shl-int/lit8 v3, v3, 0x8

    .line 744
    .line 745
    or-int/2addr v2, v3

    .line 746
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    or-int/2addr v1, v2

    .line 751
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 756
    .line 757
    .line 758
    move-result v1

    .line 759
    aput v1, v4, p0

    .line 760
    .line 761
    goto :goto_3

    .line 762
    :cond_5
    move p0, v7

    .line 763
    add-int/lit8 v6, v6, 0x1

    .line 764
    .line 765
    move v7, p0

    .line 766
    goto/16 :goto_2

    .line 767
    .line 768
    :cond_6
    :goto_3
    iget-object v0, v0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v0, Ldefpackage/sx1;

    .line 771
    .line 772
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 773
    .line 774
    .line 775
    return-void

    .line 776
    :pswitch_b
    move-object/from16 v0, p1

    .line 777
    .line 778
    check-cast v0, Landroid/view/View;

    .line 779
    .line 780
    move-object/from16 v1, p2

    .line 781
    .line 782
    check-cast v1, Landroid/graphics/PointF;

    .line 783
    .line 784
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 785
    .line 786
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 791
    .line 792
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    add-int/2addr v3, v2

    .line 801
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 802
    .line 803
    .line 804
    move-result v4

    .line 805
    add-int/2addr v4, v1

    .line 806
    invoke-static {v0, v2, v1, v3, v4}, Ldefpackage/d85;->a(Landroid/view/View;IIII)V

    .line 807
    .line 808
    .line 809
    return-void

    .line 810
    :pswitch_c
    move-object/from16 v0, p1

    .line 811
    .line 812
    check-cast v0, Landroid/view/View;

    .line 813
    .line 814
    move-object/from16 v1, p2

    .line 815
    .line 816
    check-cast v1, Landroid/graphics/PointF;

    .line 817
    .line 818
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 819
    .line 820
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 825
    .line 826
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    invoke-static {v0, v2, v1, v3, v4}, Ldefpackage/d85;->a(Landroid/view/View;IIII)V

    .line 839
    .line 840
    .line 841
    return-void

    .line 842
    :pswitch_d
    move-object/from16 v0, p1

    .line 843
    .line 844
    check-cast v0, Landroid/view/View;

    .line 845
    .line 846
    move-object/from16 v1, p2

    .line 847
    .line 848
    check-cast v1, Landroid/graphics/PointF;

    .line 849
    .line 850
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 851
    .line 852
    .line 853
    move-result v2

    .line 854
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    iget v4, v1, Landroid/graphics/PointF;->x:F

    .line 859
    .line 860
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 861
    .line 862
    .line 863
    move-result v4

    .line 864
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 865
    .line 866
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    invoke-static {v0, v2, v3, v4, v1}, Ldefpackage/d85;->a(Landroid/view/View;IIII)V

    .line 871
    .line 872
    .line 873
    return-void

    .line 874
    :pswitch_e
    move p0, v7

    .line 875
    move-object/from16 v0, p1

    .line 876
    .line 877
    check-cast v0, Ldefpackage/u00;

    .line 878
    .line 879
    move-object/from16 v1, p2

    .line 880
    .line 881
    check-cast v1, Landroid/graphics/PointF;

    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 887
    .line 888
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    iput v2, v0, Ldefpackage/u00;->c:I

    .line 893
    .line 894
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 895
    .line 896
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    iput v1, v0, Ldefpackage/u00;->d:I

    .line 901
    .line 902
    iget v2, v0, Ldefpackage/u00;->g:I

    .line 903
    .line 904
    add-int/2addr v2, v6

    .line 905
    iput v2, v0, Ldefpackage/u00;->g:I

    .line 906
    .line 907
    iget v3, v0, Ldefpackage/u00;->f:I

    .line 908
    .line 909
    if-ne v3, v2, :cond_7

    .line 910
    .line 911
    iget-object v2, v0, Ldefpackage/u00;->e:Landroid/view/View;

    .line 912
    .line 913
    iget v3, v0, Ldefpackage/u00;->a:I

    .line 914
    .line 915
    iget v4, v0, Ldefpackage/u00;->b:I

    .line 916
    .line 917
    iget v5, v0, Ldefpackage/u00;->c:I

    .line 918
    .line 919
    invoke-static {v2, v3, v4, v5, v1}, Ldefpackage/d85;->a(Landroid/view/View;IIII)V

    .line 920
    .line 921
    .line 922
    move v1, p0

    .line 923
    iput v1, v0, Ldefpackage/u00;->f:I

    .line 924
    .line 925
    iput v1, v0, Ldefpackage/u00;->g:I

    .line 926
    .line 927
    :cond_7
    return-void

    .line 928
    :pswitch_f
    move-object/from16 v0, p1

    .line 929
    .line 930
    check-cast v0, Ldefpackage/u00;

    .line 931
    .line 932
    move-object/from16 v1, p2

    .line 933
    .line 934
    check-cast v1, Landroid/graphics/PointF;

    .line 935
    .line 936
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 940
    .line 941
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    iput v2, v0, Ldefpackage/u00;->a:I

    .line 946
    .line 947
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 948
    .line 949
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    iput v1, v0, Ldefpackage/u00;->b:I

    .line 954
    .line 955
    iget v2, v0, Ldefpackage/u00;->f:I

    .line 956
    .line 957
    add-int/2addr v2, v6

    .line 958
    iput v2, v0, Ldefpackage/u00;->f:I

    .line 959
    .line 960
    iget v3, v0, Ldefpackage/u00;->g:I

    .line 961
    .line 962
    if-ne v2, v3, :cond_8

    .line 963
    .line 964
    iget-object v2, v0, Ldefpackage/u00;->e:Landroid/view/View;

    .line 965
    .line 966
    iget v3, v0, Ldefpackage/u00;->a:I

    .line 967
    .line 968
    iget v4, v0, Ldefpackage/u00;->c:I

    .line 969
    .line 970
    iget v5, v0, Ldefpackage/u00;->d:I

    .line 971
    .line 972
    invoke-static {v2, v3, v1, v4, v5}, Ldefpackage/d85;->a(Landroid/view/View;IIII)V

    .line 973
    .line 974
    .line 975
    const/4 v1, 0x0

    .line 976
    iput v1, v0, Ldefpackage/u00;->f:I

    .line 977
    .line 978
    iput v1, v0, Ldefpackage/u00;->g:I

    .line 979
    .line 980
    :cond_8
    return-void

    .line 981
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

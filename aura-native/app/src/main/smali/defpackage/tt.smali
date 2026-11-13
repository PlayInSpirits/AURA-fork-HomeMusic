.class public final Ldefpackage/tt;
.super Ldefpackage/hw;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ldefpackage/de0;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/de0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;II)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->D:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p3, 0x0

    .line 22
    :goto_0
    if-eqz p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v1, v0, v2, p1}, Ldefpackage/wr1;->U(Landroid/view/ViewGroup$MarginLayoutParams;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->I:Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Ldefpackage/wr1;->f(I)F

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    throw p0

    .line 77
    :cond_3
    :goto_1
    return-void

    .line 78
    :pswitch_0
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 79
    .line 80
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A(I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final B(Landroid/view/View;FF)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x5

    .line 7
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ldefpackage/wr1;->G(F)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Ldefpackage/wr1;->S(Landroid/view/View;F)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 32
    .line 33
    invoke-virtual {v0, p2, p3}, Ldefpackage/wr1;->L(FF)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_3

    .line 38
    .line 39
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ldefpackage/wr1;->J(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    cmpl-float v0, p2, v2

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    cmpl-float p2, p2, p3

    .line 61
    .line 62
    if-lez p2, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 70
    .line 71
    invoke-virtual {p3}, Ldefpackage/wr1;->t()I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    sub-int p3, p2, p3

    .line 76
    .line 77
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 82
    .line 83
    invoke-virtual {v0}, Ldefpackage/wr1;->u()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    sub-int/2addr p2, v0

    .line 88
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-ge p3, p2, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    :goto_0
    move v3, v4

    .line 96
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, v3, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_0
    cmpg-float v0, p3, v2

    .line 101
    .line 102
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 103
    .line 104
    const/4 v5, 0x6

    .line 105
    if-gez v0, :cond_6

    .line 106
    .line 107
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 108
    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:I

    .line 121
    .line 122
    if-le p2, p3, :cond_13

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:Z

    .line 126
    .line 127
    if-eqz v0, :cond_c

    .line 128
    .line 129
    invoke-virtual {p0, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Landroid/view/View;F)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_c

    .line 134
    .line 135
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    cmpg-float p2, p2, v0

    .line 144
    .line 145
    if-gez p2, :cond_7

    .line 146
    .line 147
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I

    .line 148
    .line 149
    int-to-float p2, p2

    .line 150
    cmpl-float p2, p3, p2

    .line 151
    .line 152
    if-gtz p2, :cond_8

    .line 153
    .line 154
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g0:I

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    add-int/2addr v0, p3

    .line 165
    div-int/lit8 v0, v0, 0x2

    .line 166
    .line 167
    if-le p2, v0, :cond_9

    .line 168
    .line 169
    :cond_8
    move v3, v4

    .line 170
    goto/16 :goto_4

    .line 171
    .line 172
    :cond_9
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 173
    .line 174
    if-eqz p2, :cond_a

    .line 175
    .line 176
    goto/16 :goto_4

    .line 177
    .line 178
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E()I

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    sub-int/2addr p2, p3

    .line 187
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:I

    .line 196
    .line 197
    sub-int/2addr p3, v0

    .line 198
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 199
    .line 200
    .line 201
    move-result p3

    .line 202
    if-ge p2, p3, :cond_b

    .line 203
    .line 204
    goto/16 :goto_4

    .line 205
    .line 206
    :cond_b
    :goto_2
    move v3, v5

    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :cond_c
    cmpl-float v0, p3, v2

    .line 210
    .line 211
    const/4 v2, 0x4

    .line 212
    if-eqz v0, :cond_10

    .line 213
    .line 214
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 219
    .line 220
    .line 221
    move-result p3

    .line 222
    cmpl-float p2, p2, p3

    .line 223
    .line 224
    if-lez p2, :cond_d

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_d
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 228
    .line 229
    if-eqz p2, :cond_f

    .line 230
    .line 231
    :cond_e
    move v3, v2

    .line 232
    goto :goto_4

    .line 233
    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:I

    .line 238
    .line 239
    sub-int p3, p2, p3

    .line 240
    .line 241
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 242
    .line 243
    .line 244
    move-result p3

    .line 245
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 246
    .line 247
    sub-int/2addr p2, v0

    .line 248
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    if-ge p3, p2, :cond_e

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_10
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 260
    .line 261
    if-eqz p3, :cond_11

    .line 262
    .line 263
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:I

    .line 264
    .line 265
    sub-int p3, p2, p3

    .line 266
    .line 267
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 272
    .line 273
    sub-int/2addr p2, v0

    .line 274
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    if-ge p3, p2, :cond_e

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_11
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:I

    .line 282
    .line 283
    if-ge p2, p3, :cond_12

    .line 284
    .line 285
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 286
    .line 287
    sub-int p3, p2, p3

    .line 288
    .line 289
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 290
    .line 291
    .line 292
    move-result p3

    .line 293
    if-ge p2, p3, :cond_b

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_12
    sub-int p3, p2, p3

    .line 297
    .line 298
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 299
    .line 300
    .line 301
    move-result p3

    .line 302
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 303
    .line 304
    sub-int/2addr p2, v0

    .line 305
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 306
    .line 307
    .line 308
    move-result p2

    .line 309
    if-ge p3, p2, :cond_e

    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_13
    :goto_4
    invoke-virtual {p0, p1, v3, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(Landroid/view/View;IZ)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(Landroid/view/View;I)Z
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 11
    .line 12
    iget p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:I

    .line 13
    .line 14
    if-ne p2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-ne p0, p1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v1, v2

    .line 29
    :goto_1
    return v1

    .line 30
    :pswitch_0
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 31
    .line 32
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o0:Z

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    const/4 v3, 0x3

    .line 43
    if-ne v0, v3, :cond_5

    .line 44
    .line 45
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:I

    .line 46
    .line 47
    if-ne v0, p2, :cond_5

    .line 48
    .line 49
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i0:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Landroid/view/View;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/4 p2, 0x0

    .line 61
    :goto_2
    if-eqz p2, :cond_5

    .line 62
    .line 63
    const/4 v0, -0x1

    .line 64
    invoke-virtual {p2, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    if-eqz p0, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p1, :cond_6

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    :goto_3
    move v1, v2

    .line 86
    :goto_4
    return v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/wr1;->x()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Ldefpackage/wr1;

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/wr1;->v()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p2, p1, p0}, Ldefpackage/su3;->l(III)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p1, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 12
    .line 13
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Ldefpackage/tt;->p()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p2, p1, p0}, Ldefpackage/su3;->l(III)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public o(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldefpackage/hw;->o(Landroid/view/View;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 14
    .line 15
    iget p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->y:I

    .line 16
    .line 17
    iget p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->B:I

    .line 18
    .line 19
    add-int/2addr p1, p0

    .line 20
    return p1

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ldefpackage/hw;->p()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g0:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 23
    .line 24
    :goto_0
    return p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final z(I)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/tt;->j:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/tt;->k:Ldefpackage/de0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    if-ne p1, v1, :cond_1

    .line 22
    .line 23
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

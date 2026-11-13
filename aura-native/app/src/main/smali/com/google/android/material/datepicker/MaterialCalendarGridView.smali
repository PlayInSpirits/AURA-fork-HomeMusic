.class public final Lcom/google/android/material/datepicker/MaterialCalendarGridView;
.super Landroid/widget/GridView;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Ljava/util/Calendar;

.field public final o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Ldefpackage/a35;->e(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->n:Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const p2, 0x101020d

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Ldefpackage/xh2;->q0(Landroid/content/Context;I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const p1, 0x7f0a013d

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 28
    .line 29
    .line 30
    const p1, 0x7f0a0164

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const p2, 0x7f0403c2

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Ldefpackage/xh2;->q0(Landroid/content/Context;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput-boolean p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->o:Z

    .line 48
    .line 49
    new-instance p1, Ldefpackage/fw0;

    .line 50
    .line 51
    const/4 p2, 0x3

    .line 52
    invoke-direct {p1, p2}, Ldefpackage/fw0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/jx2;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/jx2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final b(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getAdapter()Landroid/widget/Adapter;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/jx2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getAdapter()Landroid/widget/ListAdapter;
    .locals 0

    .line 8
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p0

    check-cast p0, Ldefpackage/jx2;

    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ldefpackage/jx2;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-super {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ldefpackage/jx2;

    .line 11
    .line 12
    iget-object v2, v1, Ldefpackage/jx2;->o:Ldefpackage/ze4;

    .line 13
    .line 14
    iget-object v3, v1, Ldefpackage/jx2;->n:Ldefpackage/ix2;

    .line 15
    .line 16
    iget-object v4, v1, Ldefpackage/jx2;->q:Ldefpackage/ey;

    .line 17
    .line 18
    invoke-virtual {v1}, Ldefpackage/jx2;->a()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Ldefpackage/jx2;->c()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v1, v5}, Ldefpackage/jx2;->b(I)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v1, v6}, Ldefpackage/jx2;->b(I)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    const/4 v11, 0x0

    .line 63
    :goto_0
    if-ge v11, v9, :cond_10

    .line 64
    .line 65
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    add-int/lit8 v11, v11, 0x1

    .line 70
    .line 71
    check-cast v12, Ldefpackage/ld3;

    .line 72
    .line 73
    iget-object v13, v12, Ldefpackage/ld3;->a:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v12, v12, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 76
    .line 77
    if-eqz v13, :cond_f

    .line 78
    .line 79
    if-nez v12, :cond_0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    check-cast v13, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v14

    .line 88
    check-cast v12, Ljava/lang/Long;

    .line 89
    .line 90
    move/from16 v16, v11

    .line 91
    .line 92
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    if-eqz v7, :cond_1

    .line 97
    .line 98
    if-eqz v8, :cond_1

    .line 99
    .line 100
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v17

    .line 104
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v19

    .line 108
    cmp-long v13, v17, v19

    .line 109
    .line 110
    if-gtz v13, :cond_1

    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v17

    .line 120
    cmp-long v12, v12, v17

    .line 121
    .line 122
    if-gez v12, :cond_2

    .line 123
    .line 124
    :cond_1
    move-object/from16 v19, v1

    .line 125
    .line 126
    move-object/from16 v17, v2

    .line 127
    .line 128
    move-object v11, v3

    .line 129
    goto/16 :goto_b

    .line 130
    .line 131
    :cond_2
    invoke-static {v0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v17

    .line 139
    cmp-long v13, v14, v17

    .line 140
    .line 141
    move-object/from16 v17, v2

    .line 142
    .line 143
    iget-object v2, v0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->n:Ljava/util/Calendar;

    .line 144
    .line 145
    if-gez v13, :cond_5

    .line 146
    .line 147
    iget v13, v3, Ldefpackage/ix2;->q:I

    .line 148
    .line 149
    rem-int v13, v5, v13

    .line 150
    .line 151
    if-nez v13, :cond_3

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    goto :goto_1

    .line 155
    :cond_3
    if-nez v12, :cond_4

    .line 156
    .line 157
    add-int/lit8 v13, v5, -0x1

    .line 158
    .line 159
    invoke-virtual {v0, v13}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    invoke-virtual {v13}, Landroid/view/View;->getRight()I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    goto :goto_1

    .line 168
    :cond_4
    add-int/lit8 v13, v5, -0x1

    .line 169
    .line 170
    invoke-virtual {v0, v13}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    invoke-virtual {v13}, Landroid/view/View;->getLeft()I

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    :goto_1
    move v14, v13

    .line 179
    move v13, v5

    .line 180
    goto :goto_2

    .line 181
    :cond_5
    invoke-virtual {v2, v14, v15}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x5

    .line 185
    invoke-virtual {v2, v13}, Ljava/util/Calendar;->get(I)I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    add-int/lit8 v14, v14, -0x1

    .line 190
    .line 191
    invoke-virtual {v1}, Ldefpackage/jx2;->a()I

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    add-int/2addr v13, v14

    .line 196
    invoke-virtual {v0, v13}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    div-int/lit8 v14, v14, 0x2

    .line 209
    .line 210
    add-int/2addr v14, v15

    .line 211
    :goto_2
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v19

    .line 215
    cmp-long v15, v10, v19

    .line 216
    .line 217
    if-lez v15, :cond_8

    .line 218
    .line 219
    add-int/lit8 v2, v6, 0x1

    .line 220
    .line 221
    iget v10, v3, Ldefpackage/ix2;->q:I

    .line 222
    .line 223
    rem-int/2addr v2, v10

    .line 224
    if-nez v2, :cond_6

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    goto :goto_3

    .line 231
    :cond_6
    if-nez v12, :cond_7

    .line 232
    .line 233
    invoke-virtual {v0, v6}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    goto :goto_3

    .line 242
    :cond_7
    invoke-virtual {v0, v6}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    :goto_3
    move v10, v6

    .line 251
    :goto_4
    move v15, v2

    .line 252
    move-object v11, v3

    .line 253
    goto :goto_5

    .line 254
    :cond_8
    invoke-virtual {v2, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 255
    .line 256
    .line 257
    const/4 v10, 0x5

    .line 258
    invoke-virtual {v2, v10}, Ljava/util/Calendar;->get(I)I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    add-int/lit8 v2, v2, -0x1

    .line 263
    .line 264
    invoke-virtual {v1}, Ldefpackage/jx2;->a()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    add-int/2addr v10, v2

    .line 269
    invoke-virtual {v0, v10}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    div-int/lit8 v2, v2, 0x2

    .line 282
    .line 283
    add-int/2addr v2, v11

    .line 284
    goto :goto_4

    .line 285
    :goto_5
    invoke-virtual {v1, v13}, Ldefpackage/jx2;->getItemId(I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v2

    .line 289
    long-to-int v2, v2

    .line 290
    move/from16 v18, v2

    .line 291
    .line 292
    invoke-virtual {v1, v10}, Ldefpackage/jx2;->getItemId(I)J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    long-to-int v2, v2

    .line 297
    move/from16 v3, v18

    .line 298
    .line 299
    :goto_6
    if-gt v3, v2, :cond_e

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 302
    .line 303
    .line 304
    move-result v18

    .line 305
    move-object/from16 v19, v1

    .line 306
    .line 307
    mul-int v1, v18, v3

    .line 308
    .line 309
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 310
    .line 311
    .line 312
    move-result v18

    .line 313
    add-int v18, v18, v1

    .line 314
    .line 315
    move/from16 v20, v2

    .line 316
    .line 317
    add-int/lit8 v2, v18, -0x1

    .line 318
    .line 319
    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 320
    .line 321
    .line 322
    move-result-object v18

    .line 323
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getTop()I

    .line 324
    .line 325
    .line 326
    move-result v21

    .line 327
    iget-object v0, v4, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Ldefpackage/c6;

    .line 330
    .line 331
    iget-object v0, v0, Ldefpackage/c6;->b:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Landroid/graphics/Rect;

    .line 334
    .line 335
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 336
    .line 337
    add-int v0, v21, v0

    .line 338
    .line 339
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getBottom()I

    .line 340
    .line 341
    .line 342
    move-result v18

    .line 343
    move/from16 v21, v3

    .line 344
    .line 345
    iget-object v3, v4, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v3, Ldefpackage/c6;

    .line 348
    .line 349
    iget-object v3, v3, Ldefpackage/c6;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v3, Landroid/graphics/Rect;

    .line 352
    .line 353
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 354
    .line 355
    sub-int v3, v18, v3

    .line 356
    .line 357
    if-nez v12, :cond_b

    .line 358
    .line 359
    if-le v1, v13, :cond_9

    .line 360
    .line 361
    const/4 v1, 0x0

    .line 362
    goto :goto_7

    .line 363
    :cond_9
    move v1, v14

    .line 364
    :goto_7
    if-le v10, v2, :cond_a

    .line 365
    .line 366
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    goto :goto_a

    .line 371
    :cond_a
    move v2, v15

    .line 372
    goto :goto_a

    .line 373
    :cond_b
    if-le v10, v2, :cond_c

    .line 374
    .line 375
    const/4 v2, 0x0

    .line 376
    goto :goto_8

    .line 377
    :cond_c
    move v2, v15

    .line 378
    :goto_8
    if-le v1, v13, :cond_d

    .line 379
    .line 380
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    goto :goto_9

    .line 385
    :cond_d
    move v1, v14

    .line 386
    :goto_9
    move/from16 v28, v2

    .line 387
    .line 388
    move v2, v1

    .line 389
    move/from16 v1, v28

    .line 390
    .line 391
    :goto_a
    int-to-float v1, v1

    .line 392
    int-to-float v0, v0

    .line 393
    int-to-float v2, v2

    .line 394
    int-to-float v3, v3

    .line 395
    move/from16 v24, v0

    .line 396
    .line 397
    iget-object v0, v4, Ldefpackage/ey;->h:Ljava/lang/Object;

    .line 398
    .line 399
    move-object/from16 v27, v0

    .line 400
    .line 401
    check-cast v27, Landroid/graphics/Paint;

    .line 402
    .line 403
    move-object/from16 v22, p1

    .line 404
    .line 405
    move/from16 v23, v1

    .line 406
    .line 407
    move/from16 v25, v2

    .line 408
    .line 409
    move/from16 v26, v3

    .line 410
    .line 411
    invoke-virtual/range {v22 .. v27}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 412
    .line 413
    .line 414
    add-int/lit8 v3, v21, 0x1

    .line 415
    .line 416
    move-object/from16 v0, p0

    .line 417
    .line 418
    move-object/from16 v1, v19

    .line 419
    .line 420
    move/from16 v2, v20

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_e
    move-object/from16 v0, p0

    .line 424
    .line 425
    move-object v3, v11

    .line 426
    move/from16 v11, v16

    .line 427
    .line 428
    move-object/from16 v2, v17

    .line 429
    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :goto_b
    move-object/from16 v0, p0

    .line 433
    .line 434
    move-object v3, v11

    .line 435
    move/from16 v11, v16

    .line 436
    .line 437
    move-object/from16 v2, v17

    .line 438
    .line 439
    move-object/from16 v1, v19

    .line 440
    .line 441
    goto/16 :goto_0

    .line 442
    .line 443
    :cond_f
    move/from16 v16, v11

    .line 444
    .line 445
    move-object/from16 v0, p0

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_10
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/16 p1, 0x21

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ldefpackage/jx2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/jx2;->c()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/16 p1, 0x82

    .line 22
    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ldefpackage/jx2;

    .line 30
    .line 31
    invoke-virtual {p1}, Ldefpackage/jx2;->a()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 p1, 0x1

    .line 40
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p2, v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ldefpackage/jx2;

    .line 26
    .line 27
    invoke-virtual {v1}, Ldefpackage/jx2;->a()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p2, v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/16 p2, 0x13

    .line 35
    .line 36
    if-ne p2, p1, :cond_2

    .line 37
    .line 38
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ldefpackage/jx2;

    .line 43
    .line 44
    invoke-virtual {p1}, Ldefpackage/jx2;->a()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    return v0

    .line 53
    :cond_3
    :goto_0
    return v2
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const p2, 0xffffff

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iput p0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 37
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/jx2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-class p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-class v0, Ldefpackage/jx2;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "%1$s must have its Adapter set to a %2$s"

    .line 28
    .line 29
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public final setSelection(I)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldefpackage/jx2;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/jx2;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ldefpackage/jx2;

    .line 18
    .line 19
    invoke-virtual {p1}, Ldefpackage/jx2;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

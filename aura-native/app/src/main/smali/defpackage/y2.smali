.class public final Ldefpackage/y2;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/z2;


# direct methods
.method public constructor <init>(Ldefpackage/z2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/z2;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/z2;->b(Landroid/view/View;)Ldefpackage/zh0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/z2;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 13

    .line 1
    new-instance v0, Ldefpackage/v3;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ldefpackage/v3;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-class v3, Ljava/lang/Boolean;

    .line 12
    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    if-lt v1, v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ldefpackage/e65;->c(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v1, 0x7f0a05ec

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v2

    .line 41
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    move v1, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v1, v5

    .line 56
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    if-lt v7, v4, :cond_3

    .line 59
    .line 60
    invoke-static {p2, v1}, Ldefpackage/i3;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-virtual {v0, v6, v1}, Ldefpackage/v3;->h(IZ)V

    .line 65
    .line 66
    .line 67
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    if-lt v1, v4, :cond_4

    .line 70
    .line 71
    invoke-static {p1}, Ldefpackage/e65;->b(Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    const v1, 0x7f0a05e5

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move-object v1, v2

    .line 95
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    move v6, v5

    .line 107
    :goto_4
    if-lt v7, v4, :cond_7

    .line 108
    .line 109
    invoke-static {p2, v6}, Ldefpackage/i3;->C(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    const/4 v1, 0x2

    .line 114
    invoke-virtual {v0, v1, v6}, Ldefpackage/v3;->h(IZ)V

    .line 115
    .line 116
    .line 117
    :goto_5
    invoke-static {p1}, Ldefpackage/j65;->e(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-lt v7, v4, :cond_8

    .line 122
    .line 123
    invoke-static {p2, v1}, Ldefpackage/i3;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 132
    .line 133
    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :goto_6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 137
    .line 138
    const/16 v3, 0x1e

    .line 139
    .line 140
    if-lt v1, v3, :cond_9

    .line 141
    .line 142
    invoke-static {p1}, Ldefpackage/g65;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    goto :goto_7

    .line 147
    :cond_9
    const v1, 0x7f0a05ed

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-class v4, Ljava/lang/CharSequence;

    .line 155
    .line 156
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_a
    move-object v1, v2

    .line 164
    :goto_7
    check-cast v1, Ljava/lang/CharSequence;

    .line 165
    .line 166
    if-lt v7, v3, :cond_b

    .line 167
    .line 168
    invoke-static {p2, v1}, Ldefpackage/p3;->i(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_b
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 177
    .line 178
    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    :goto_8
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 182
    .line 183
    invoke-virtual {p0, p1, v0}, Ldefpackage/z2;->d(Landroid/view/View;Ldefpackage/v3;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    const/16 v1, 0x1a

    .line 191
    .line 192
    if-ge v7, v1, :cond_13

    .line 193
    .line 194
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 208
    .line 209
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 217
    .line 218
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 226
    .line 227
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const v1, 0x7f0a05e4

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    check-cast v8, Landroid/util/SparseArray;

    .line 238
    .line 239
    if-eqz v8, :cond_e

    .line 240
    .line 241
    new-instance v9, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    move v10, v5

    .line 247
    :goto_9
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-ge v10, v11, :cond_d

    .line 252
    .line 253
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    check-cast v11, Ljava/lang/ref/WeakReference;

    .line 258
    .line 259
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    if-nez v11, :cond_c

    .line 264
    .line 265
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_d
    move v10, v5

    .line 276
    :goto_a
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    if-ge v10, v11, :cond_e

    .line 281
    .line 282
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    check-cast v11, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    invoke-virtual {v8, v11}, Landroid/util/SparseArray;->remove(I)V

    .line 293
    .line 294
    .line 295
    add-int/lit8 v10, v10, 0x1

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_e
    instance-of v8, p0, Landroid/text/Spanned;

    .line 299
    .line 300
    if-eqz v8, :cond_f

    .line 301
    .line 302
    move-object v2, p0

    .line 303
    check-cast v2, Landroid/text/Spanned;

    .line 304
    .line 305
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    const-class v9, Landroid/text/style/ClickableSpan;

    .line 310
    .line 311
    invoke-interface {v2, v5, v8, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    check-cast v2, [Landroid/text/style/ClickableSpan;

    .line 316
    .line 317
    :cond_f
    if-eqz v2, :cond_13

    .line 318
    .line 319
    array-length v8, v2

    .line 320
    if-lez v8, :cond_13

    .line 321
    .line 322
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 327
    .line 328
    const v9, 0x7f0a0010

    .line 329
    .line 330
    .line 331
    invoke-virtual {p2, v8, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    check-cast p2, Landroid/util/SparseArray;

    .line 339
    .line 340
    if-nez p2, :cond_10

    .line 341
    .line 342
    new-instance p2, Landroid/util/SparseArray;

    .line 343
    .line 344
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1, v1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_10
    move v1, v5

    .line 351
    :goto_b
    array-length v8, v2

    .line 352
    if-ge v1, v8, :cond_13

    .line 353
    .line 354
    aget-object v8, v2, v1

    .line 355
    .line 356
    move v9, v5

    .line 357
    :goto_c
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-ge v9, v10, :cond_12

    .line 362
    .line 363
    invoke-virtual {p2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    check-cast v10, Ljava/lang/ref/WeakReference;

    .line 368
    .line 369
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    check-cast v10, Landroid/text/style/ClickableSpan;

    .line 374
    .line 375
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    if-eqz v10, :cond_11

    .line 380
    .line 381
    invoke-virtual {p2, v9}, Landroid/util/SparseArray;->keyAt(I)I

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    goto :goto_d

    .line 386
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 387
    .line 388
    goto :goto_c

    .line 389
    :cond_12
    sget v8, Ldefpackage/v3;->d:I

    .line 390
    .line 391
    add-int/lit8 v9, v8, 0x1

    .line 392
    .line 393
    sput v9, Ldefpackage/v3;->d:I

    .line 394
    .line 395
    :goto_d
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 396
    .line 397
    aget-object v10, v2, v1

    .line 398
    .line 399
    invoke-direct {v9, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p2, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    aget-object v9, v2, v1

    .line 406
    .line 407
    move-object v10, p0

    .line 408
    check-cast v10, Landroid/text/Spanned;

    .line 409
    .line 410
    invoke-virtual {v0, v3}, Ldefpackage/v3;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 415
    .line 416
    .line 417
    move-result v12

    .line 418
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v4}, Ldefpackage/v3;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 426
    .line 427
    .line 428
    move-result-object v11

    .line 429
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v12

    .line 437
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v6}, Ldefpackage/v3;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 445
    .line 446
    .line 447
    move-result v9

    .line 448
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v9

    .line 452
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v7}, Ldefpackage/v3;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    add-int/lit8 v1, v1, 0x1

    .line 467
    .line 468
    goto :goto_b

    .line 469
    :cond_13
    const p0, 0x7f0a05e3

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    check-cast p0, Ljava/util/List;

    .line 477
    .line 478
    if-nez p0, :cond_14

    .line 479
    .line 480
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 481
    .line 482
    :cond_14
    :goto_e
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    if-ge v5, p1, :cond_15

    .line 487
    .line 488
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    check-cast p1, Ldefpackage/o3;

    .line 493
    .line 494
    invoke-virtual {v0, p1}, Ldefpackage/v3;->b(Ldefpackage/o3;)V

    .line 495
    .line 496
    .line 497
    add-int/lit8 v5, v5, 0x1

    .line 498
    .line 499
    goto :goto_e

    .line 500
    :cond_15
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/z2;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/z2;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/z2;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/z2;->h(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/y2;->a:Ldefpackage/z2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/z2;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

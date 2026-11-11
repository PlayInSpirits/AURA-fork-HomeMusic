.class public final Lah0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lah0;->n:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lah0;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbh0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lah0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lah0;->o:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lx75;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lah0;->n:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lah0;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 10

    .line 1
    iget v0, p0, Lah0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, -0x80000000

    .line 5
    .line 6
    const-string v3, "OnGlobalLayoutListener called attachStateListener="

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, p0, Lah0;->o:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    invoke-virtual {v7, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(I)V

    .line 19
    .line 20
    .line 21
    return v5

    .line 22
    :pswitch_0
    const-string v0, "ViewTarget"

    .line 23
    .line 24
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lx75;

    .line 52
    .line 53
    if-eqz p0, :cond_8

    .line 54
    .line 55
    iget-object v0, p0, Lx75;->b:Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v3, p0, Lx75;->a:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    add-int/2addr v7, v4

    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    move v4, v6

    .line 85
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    invoke-virtual {p0, v8, v4, v7}, Lx75;->a(III)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    add-int/2addr v8, v7

    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    if-eqz v7, :cond_3

    .line 107
    .line 108
    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    move v7, v6

    .line 112
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-virtual {p0, v9, v7, v8}, Lx75;->a(III)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-gtz v4, :cond_4

    .line 121
    .line 122
    if-ne v4, v2, :cond_8

    .line 123
    .line 124
    :cond_4
    if-gtz v7, :cond_5

    .line 125
    .line 126
    if-ne v7, v2, :cond_8

    .line 127
    .line 128
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    :goto_2
    if-ge v6, v8, :cond_6

    .line 138
    .line 139
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    add-int/lit8 v6, v6, 0x1

    .line 144
    .line 145
    check-cast v9, Lcf4;

    .line 146
    .line 147
    invoke-virtual {v9, v4, v7}, Lcf4;->m(II)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    iget-object v3, p0, Lx75;->c:Lah0;

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iput-object v1, p0, Lx75;->c:Lah0;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 169
    .line 170
    .line 171
    :cond_8
    :goto_3
    return v5

    .line 172
    :pswitch_1
    const-string v0, "CustomViewTarget"

    .line 173
    .line 174
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_9

    .line 179
    .line 180
    new-instance v4, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    :cond_9
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 196
    .line 197
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Lbh0;

    .line 202
    .line 203
    if-eqz p0, :cond_11

    .line 204
    .line 205
    iget-object v0, p0, Lbh0;->b:Ljava/util/ArrayList;

    .line 206
    .line 207
    iget-object v3, p0, Lbh0;->a:Landroid/view/View;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_a
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    add-int/2addr v7, v4

    .line 225
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-eqz v4, :cond_b

    .line 230
    .line 231
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_b
    move v4, v6

    .line 235
    :goto_4
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    invoke-virtual {p0, v8, v4, v7}, Lbh0;->a(III)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    add-int/2addr v8, v7

    .line 252
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_c

    .line 257
    .line 258
    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_c
    move v7, v6

    .line 262
    :goto_5
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    invoke-virtual {p0, v9, v7, v8}, Lbh0;->a(III)I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-gtz v4, :cond_d

    .line 271
    .line 272
    if-ne v4, v2, :cond_11

    .line 273
    .line 274
    :cond_d
    if-gtz v7, :cond_e

    .line 275
    .line 276
    if-ne v7, v2, :cond_11

    .line 277
    .line 278
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    :goto_6
    if-ge v6, v8, :cond_f

    .line 288
    .line 289
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 294
    .line 295
    check-cast v9, Lcf4;

    .line 296
    .line 297
    invoke-virtual {v9, v4, v7}, Lcf4;->m(II)V

    .line 298
    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_10

    .line 310
    .line 311
    iget-object v3, p0, Lbh0;->c:Lah0;

    .line 312
    .line 313
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 314
    .line 315
    .line 316
    :cond_10
    iput-object v1, p0, Lbh0;->c:Lah0;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 319
    .line 320
    .line 321
    :cond_11
    :goto_7
    return v5

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

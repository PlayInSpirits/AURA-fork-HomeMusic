.class public final Lma;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lzu;
.implements Lg94;
.implements Lj42;
.implements Lu62;
.implements Lrx4;


# instance fields
.field public final B:Lx;

.field public final synthetic C:Lra;


# direct methods
.method public constructor <init>(Lra;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lma;->C:Lra;

    .line 2
    .line 3
    invoke-direct {p0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lx;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-direct {p1, v0, p0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lma;->B:Lx;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c0(Lq94;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.ui.layout.WindowInsetsRulers"

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lf63;Lfa;Lep4;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lf63;->K0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p2}, Lfa;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lwv3;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Lwv3;->f(J)Lwv3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p2, Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p3, p1, Lwv3;->a:F

    .line 26
    .line 27
    float-to-int p3, p3

    .line 28
    iget v0, p1, Lwv3;->b:F

    .line 29
    .line 30
    float-to-int v0, v0

    .line 31
    iget v1, p1, Lwv3;->c:F

    .line 32
    .line 33
    float-to-int v1, v1

    .line 34
    iget p1, p1, Lwv3;->d:F

    .line 35
    .line 36
    float-to-int p1, p1

    .line 37
    invoke-direct {p2, p3, v0, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iget-object p0, p0, Lma;->C:Lra;

    .line 42
    .line 43
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p0, Lj15;->a:Lj15;

    .line 47
    .line 48
    return-object p0
.end method

.method public final q(Landroid/view/KeyEvent;)Z
    .locals 9

    .line 1
    sget-object v0, Lr91;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lfh0;->a(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-wide v2, Lg42;->b:J

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Lg42;->a(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x3

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v0, Lo91;

    .line 23
    .line 24
    invoke-direct {v0, v5}, Lo91;-><init>(I)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    sget-wide v6, Lg42;->c:J

    .line 30
    .line 31
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    new-instance v0, Lo91;

    .line 38
    .line 39
    invoke-direct {v0, v4}, Lo91;-><init>(I)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    sget-wide v6, Lg42;->i:J

    .line 45
    .line 46
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    move v0, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v0, v4

    .line 61
    :goto_0
    new-instance v1, Lo91;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lo91;-><init>(I)V

    .line 64
    .line 65
    .line 66
    move-object v0, v1

    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_3
    sget-wide v6, Lg42;->g:J

    .line 70
    .line 71
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    new-instance v0, Lo91;

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    invoke-direct {v0, v1}, Lo91;-><init>(I)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_5

    .line 84
    .line 85
    :cond_4
    sget-wide v6, Lg42;->f:J

    .line 86
    .line 87
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    new-instance v0, Lo91;

    .line 94
    .line 95
    invoke-direct {v0, v3}, Lo91;-><init>(I)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_5

    .line 99
    .line 100
    :cond_5
    sget-wide v6, Lg42;->d:J

    .line 101
    .line 102
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_d

    .line 107
    .line 108
    sget-wide v6, Lg42;->m:J

    .line 109
    .line 110
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    sget-wide v6, Lg42;->e:J

    .line 118
    .line 119
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_c

    .line 124
    .line 125
    sget-wide v6, Lg42;->n:J

    .line 126
    .line 127
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    sget-wide v6, Lg42;->h:J

    .line 135
    .line 136
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_b

    .line 141
    .line 142
    sget-wide v6, Lg42;->k:J

    .line 143
    .line 144
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_b

    .line 149
    .line 150
    sget-wide v6, Lg42;->o:J

    .line 151
    .line 152
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_8

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_8
    sget-wide v6, Lg42;->a:J

    .line 160
    .line 161
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-nez v2, :cond_a

    .line 166
    .line 167
    sget-wide v6, Lg42;->l:J

    .line 168
    .line 169
    invoke-static {v0, v1, v6, v7}, Lg42;->a(JJ)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_9
    const/4 v0, 0x0

    .line 177
    goto :goto_5

    .line 178
    :cond_a
    :goto_1
    new-instance v0, Lo91;

    .line 179
    .line 180
    const/16 v1, 0x8

    .line 181
    .line 182
    invoke-direct {v0, v1}, Lo91;-><init>(I)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_b
    :goto_2
    new-instance v0, Lo91;

    .line 187
    .line 188
    const/4 v1, 0x7

    .line 189
    invoke-direct {v0, v1}, Lo91;-><init>(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_c
    :goto_3
    new-instance v0, Lo91;

    .line 194
    .line 195
    const/4 v1, 0x6

    .line 196
    invoke-direct {v0, v1}, Lo91;-><init>(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_d
    :goto_4
    new-instance v0, Lo91;

    .line 201
    .line 202
    const/4 v1, 0x5

    .line 203
    invoke-direct {v0, v1}, Lo91;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_5
    const/4 v1, 0x0

    .line 207
    if-eqz v0, :cond_15

    .line 208
    .line 209
    iget v2, v0, Lo91;->a:I

    .line 210
    .line 211
    invoke-static {p1}, Lhw;->n(Landroid/view/KeyEvent;)I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-ne v6, v5, :cond_15

    .line 216
    .line 217
    iget-object p0, p0, Lma;->C:Lra;

    .line 218
    .line 219
    invoke-virtual {p0}, Lra;->getFocusOwner()Lu91;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Ley;

    .line 224
    .line 225
    invoke-virtual {v6}, Ley;->f()Lba1;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lra;->getEmbeddedViewFocusRect()Lwv3;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {p0}, Lra;->getFocusOwner()Lu91;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    new-instance v8, Lx;

    .line 237
    .line 238
    invoke-direct {v8, v3, v0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    check-cast v7, Ley;

    .line 242
    .line 243
    invoke-virtual {v7, v2, v6, v8}, Ley;->e(ILwv3;Lif1;)Ljava/lang/Boolean;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    if-eqz v3, :cond_14

    .line 248
    .line 249
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_f

    .line 254
    .line 255
    invoke-virtual {p0}, Lra;->getPlayNavigationSoundEffect$ui()Lwf1;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-lez p1, :cond_e

    .line 264
    .line 265
    move v1, v4

    .line 266
    :cond_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p0, v0, p1}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    return v4

    .line 274
    :cond_f
    if-ne v2, v4, :cond_10

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_10
    if-ne v2, v5, :cond_13

    .line 278
    .line 279
    :goto_6
    invoke-static {v2}, Lr91;->b(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-eqz p1, :cond_11

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    :cond_11
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    check-cast v0, Landroid/view/ViewGroup;

    .line 301
    .line 302
    invoke-virtual {p0}, Lra;->getView()Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {p1, v0, v3, v5}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    if-eqz p1, :cond_12

    .line 311
    .line 312
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_15

    .line 317
    .line 318
    :cond_12
    invoke-virtual {p0}, Lra;->getFocusOwner()Lu91;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Ley;

    .line 323
    .line 324
    invoke-virtual {p0, v2}, Ley;->g(I)Z

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    return p0

    .line 329
    :cond_13
    return v1

    .line 330
    :cond_14
    return v4

    .line 331
    :cond_15
    return v1
.end method

.method public final r(Lcf2;Lpi2;J)Lvi2;
    .locals 6

    .line 1
    invoke-interface {p2, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget v1, p2, Ljg3;->n:I

    .line 6
    .line 7
    iget v2, p2, Ljg3;->o:I

    .line 8
    .line 9
    new-instance v5, Lla;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-direct {v5, p2, p3}, Lla;-><init>(Ljg3;I)V

    .line 13
    .line 14
    .line 15
    sget-object v3, Lv01;->n:Lv01;

    .line 16
    .line 17
    iget-object v4, p0, Lma;->B:Lx;

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    invoke-virtual/range {v0 .. v5}, Lcf2;->T(IILjava/util/Map;Lif1;Lif1;)Lvi2;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

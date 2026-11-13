.class public final Ldefpackage/ra;
.super Landroid/view/ViewGroup;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ub3;
.implements Ldefpackage/b34;
.implements Ldefpackage/rl0;
.implements Ldefpackage/lb3;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;
.implements Ldefpackage/t91;


# static fields
.field public static U0:Ljava/lang/Class;

.field public static V0:Ljava/lang/reflect/Method;

.field public static W0:Ljava/lang/reflect/Method;

.field public static final X0:Ldefpackage/q03;

.field public static Y0:Ldefpackage/u6;

.field public static Z0:Ljava/lang/reflect/Method;

.field public static a1:Ljava/lang/reflect/Method;


# instance fields
.field public A:Ldefpackage/ne0;

.field public A0:J

.field public final B:Ldefpackage/qb;

.field public final B0:Ldefpackage/hd5;

.field public final C:Ldefpackage/zd3;

.field public final C0:Ldefpackage/q03;

.field public final D:Ldefpackage/dp0;

.field public D0:F

.field public final E:Ldefpackage/xz1;

.field public E0:F

.field public final F:Ldefpackage/c72;

.field public F0:F

.field public final G:Ldefpackage/i03;

.field public G0:F

.field public final H:Ldefpackage/yv3;

.field public final H0:Ldefpackage/g5;

.field public final I:Ldefpackage/l94;

.field public final I0:Ldefpackage/ia;

.field public final J:Ldefpackage/ya;

.field public J0:Z

.field public K:Ldefpackage/lb;

.field public K0:Ldefpackage/wf1;

.field public final L:Ldefpackage/jw;

.field public final L0:Ldefpackage/bk;

.field public final M:Ldefpackage/wn;

.field public final M0:Ldefpackage/da;

.field public final N:Ldefpackage/q03;

.field public final N0:Ldefpackage/da;

.field public O:Ldefpackage/q03;

.field public O0:Z

.field public P:Z

.field public P0:Z

.field public final Q:Ldefpackage/tx2;

.field public Q0:Z

.field public final R:Ldefpackage/jw;

.field public final R0:Ldefpackage/rm2;

.field public final S:Ldefpackage/zd3;

.field public S0:Landroid/view/View;

.field public final T:Ldefpackage/dp0;

.field public final T0:Ldefpackage/pa;

.field public final U:Ldefpackage/x9;

.field public final V:Ldefpackage/y9;

.field public W:Z

.field public final a0:Ldefpackage/wb3;

.field public b0:Z

.field public c0:Ldefpackage/id;

.field public d0:Ldefpackage/nc0;

.field public e0:Z

.field public final f0:Ldefpackage/ri2;

.field public g0:J

.field public final h0:[I

.field public final i0:[F

.field public final j0:Landroid/graphics/Matrix;

.field public final k0:[F

.field public final l0:[F

.field public m0:J

.field public final n:Ldefpackage/zd3;

.field public n0:Z

.field public o:J

.field public o0:J

.field public final p:Z

.field public p0:Ldefpackage/if1;

.field public q:Ldefpackage/dy1;

.field public q0:Ldefpackage/js4;

.field public r:Ldefpackage/ga2;

.field public r0:Ldefpackage/is4;

.field public s:Ldefpackage/ha2;

.field public final s0:Ljava/util/concurrent/atomic/AtomicReference;

.field public t:Ldefpackage/bs0;

.field public t0:Ldefpackage/om0;

.field public u:Ldefpackage/y14;

.field public final u0:Ldefpackage/b13;

.field public final v:Ldefpackage/ii;

.field public final v0:Ldefpackage/zd3;

.field public final w:Ldefpackage/ia;

.field public w0:Ldefpackage/sz1;

.field public final x:Ldefpackage/zd3;

.field public final x0:Ldefpackage/ex2;

.field public final y:Landroid/view/View;

.field public y0:Ldefpackage/pa;

.field public final z:Ldefpackage/ey;

.field public z0:Landroid/view/MotionEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/q03;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/q03;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/ra;->X0:Ldefpackage/q03;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/h80;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static/range {p2 .. p2}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, v2, Ldefpackage/ra;->n:Ldefpackage/zd3;

    .line 13
    .line 14
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, v2, Ldefpackage/ra;->o:J

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    iput-boolean v9, v2, Ldefpackage/ra;->p:Z

    .line 23
    .line 24
    sget-object v0, Ldefpackage/fz0;->b0:Ldefpackage/fz0;

    .line 25
    .line 26
    iput-object v0, v2, Ldefpackage/ra;->u:Ldefpackage/y14;

    .line 27
    .line 28
    new-instance v0, Ldefpackage/ii;

    .line 29
    .line 30
    invoke-direct {v0}, Ldefpackage/ii;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, v2, Ldefpackage/ra;->v:Ldefpackage/ii;

    .line 34
    .line 35
    new-instance v0, Ldefpackage/ia;

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    invoke-direct {v0, v2, v10}, Ldefpackage/ia;-><init>(Ldefpackage/ra;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, v2, Ldefpackage/ra;->w:Ldefpackage/ia;

    .line 42
    .line 43
    invoke-static {v8}, Ldefpackage/bu;->a(Landroid/content/Context;)Ldefpackage/so0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ldefpackage/rv2;->A:Ldefpackage/rv2;

    .line 48
    .line 49
    new-instance v3, Ldefpackage/zd3;

    .line 50
    .line 51
    invoke-direct {v3, v0, v1}, Ldefpackage/zd3;-><init>(Ljava/lang/Object;Ldefpackage/rv2;)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v2, Ldefpackage/ra;->x:Ldefpackage/zd3;

    .line 55
    .line 56
    new-instance v0, Ldefpackage/ey;

    .line 57
    .line 58
    invoke-direct {v0, v2, v2}, Ldefpackage/ey;-><init>(Ldefpackage/ra;Ldefpackage/ra;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, v2, Ldefpackage/ra;->z:Ldefpackage/ey;

    .line 62
    .line 63
    invoke-virtual/range {p2 .. p2}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, v2, Ldefpackage/ra;->A:Ldefpackage/ne0;

    .line 72
    .line 73
    new-instance v0, Ldefpackage/qb;

    .line 74
    .line 75
    new-instance v1, Ldefpackage/oa;

    .line 76
    .line 77
    invoke-direct {v0}, Ldefpackage/qb;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, v2, Ldefpackage/ra;->B:Ldefpackage/qb;

    .line 81
    .line 82
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-static {v0}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, v2, Ldefpackage/ra;->C:Ldefpackage/zd3;

    .line 89
    .line 90
    new-instance v0, Ldefpackage/da;

    .line 91
    .line 92
    const/4 v11, 0x2

    .line 93
    invoke-direct {v0, v2, v11}, Ldefpackage/da;-><init>(Ldefpackage/ra;I)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Ldefpackage/ph4;->a:Ldefpackage/z05;

    .line 97
    .line 98
    new-instance v1, Ldefpackage/dp0;

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    invoke-direct {v1, v0, v12}, Ldefpackage/dp0;-><init>(Ldefpackage/gf1;Ldefpackage/rv2;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, v2, Ldefpackage/ra;->D:Ldefpackage/dp0;

    .line 105
    .line 106
    new-instance v0, Ldefpackage/xz1;

    .line 107
    .line 108
    invoke-direct {v0}, Ldefpackage/xz1;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v0, v2, Ldefpackage/ra;->E:Ldefpackage/xz1;

    .line 112
    .line 113
    new-instance v0, Ldefpackage/c72;

    .line 114
    .line 115
    const/4 v13, 0x3

    .line 116
    invoke-direct {v0, v13}, Ldefpackage/c72;-><init>(I)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v0, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 120
    .line 121
    sget-object v3, Ldefpackage/c34;->b:Ldefpackage/c34;

    .line 122
    .line 123
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_0

    .line 128
    .line 129
    iput-object v3, v0, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 130
    .line 131
    invoke-virtual {v0}, Ldefpackage/c72;->D()V

    .line 132
    .line 133
    .line 134
    :cond_0
    invoke-virtual {v2}, Ldefpackage/ra;->getDensity()Ldefpackage/oo0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Ldefpackage/c72;->a0(Ldefpackage/oo0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ldefpackage/ra;->getViewConfiguration()Ldefpackage/m65;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ldefpackage/c72;->e0(Ldefpackage/m65;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Ldefpackage/qa;

    .line 149
    .line 150
    invoke-direct {v1, v2}, Ldefpackage/qa;-><init>(Ldefpackage/ra;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ldefpackage/ey;

    .line 158
    .line 159
    iget-object v3, v3, Ldefpackage/ey;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, Ldefpackage/w91;

    .line 162
    .line 163
    invoke-interface {v1, v3}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v2}, Ldefpackage/ra;->getDragAndDropManager()Ldefpackage/qb;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iget-object v3, v3, Ldefpackage/qb;->c:Ldefpackage/pb;

    .line 172
    .line 173
    invoke-interface {v1, v3}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Ldefpackage/c72;->d0(Ldefpackage/dx2;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, v2, Ldefpackage/ra;->F:Ldefpackage/c72;

    .line 181
    .line 182
    sget-object v0, Ldefpackage/f02;->a:Ldefpackage/i03;

    .line 183
    .line 184
    new-instance v0, Ldefpackage/i03;

    .line 185
    .line 186
    invoke-direct {v0}, Ldefpackage/i03;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v0, v2, Ldefpackage/ra;->G:Ldefpackage/i03;

    .line 190
    .line 191
    new-instance v0, Ldefpackage/yv3;

    .line 192
    .line 193
    invoke-virtual {v2}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v0, v1, v2}, Ldefpackage/yv3;-><init>(Ldefpackage/i03;Ldefpackage/ra;)V

    .line 198
    .line 199
    .line 200
    iput-object v0, v2, Ldefpackage/ra;->H:Ldefpackage/yv3;

    .line 201
    .line 202
    new-instance v0, Ldefpackage/l94;

    .line 203
    .line 204
    invoke-virtual {v2}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    new-instance v3, Ldefpackage/x01;

    .line 209
    .line 210
    invoke-direct {v3}, Ldefpackage/cx2;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-direct {v0, v1, v3, v4}, Ldefpackage/l94;-><init>(Ldefpackage/c72;Ldefpackage/x01;Ldefpackage/i03;)V

    .line 218
    .line 219
    .line 220
    iput-object v0, v2, Ldefpackage/ra;->I:Ldefpackage/l94;

    .line 221
    .line 222
    new-instance v14, Ldefpackage/ya;

    .line 223
    .line 224
    invoke-direct {v14, v2}, Ldefpackage/ya;-><init>(Ldefpackage/ra;)V

    .line 225
    .line 226
    .line 227
    iput-object v14, v2, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 228
    .line 229
    new-instance v15, Ldefpackage/lb;

    .line 230
    .line 231
    new-instance v0, Ldefpackage/na;

    .line 232
    .line 233
    const/4 v6, 0x1

    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v1, 0x0

    .line 236
    const-class v3, Ldefpackage/gb;

    .line 237
    .line 238
    const-string v4, "getContentCaptureSessionCompat"

    .line 239
    .line 240
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 241
    .line 242
    invoke-direct/range {v0 .. v7}, Ldefpackage/na;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v15, v2, v0}, Ldefpackage/lb;-><init>(Ldefpackage/ra;Ldefpackage/na;)V

    .line 246
    .line 247
    .line 248
    iput-object v15, v2, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 249
    .line 250
    new-instance v0, Ldefpackage/jw;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    iput-object v2, v0, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 256
    .line 257
    new-instance v1, Ljava/lang/Object;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 260
    .line 261
    .line 262
    iput-object v1, v0, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 263
    .line 264
    new-instance v1, Ldefpackage/ac;

    .line 265
    .line 266
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 267
    .line 268
    .line 269
    iput-object v1, v0, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_1

    .line 276
    .line 277
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iget-boolean v4, v0, Ldefpackage/jw;->n:Z

    .line 282
    .line 283
    if-nez v4, :cond_1

    .line 284
    .line 285
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v3, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 290
    .line 291
    .line 292
    iput-boolean v9, v0, Ldefpackage/jw;->n:Z

    .line 293
    .line 294
    :cond_1
    new-instance v1, Ldefpackage/bc;

    .line 295
    .line 296
    invoke-direct {v1, v10, v0}, Ldefpackage/bc;-><init>(ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 300
    .line 301
    .line 302
    iput-object v0, v2, Ldefpackage/ra;->L:Ldefpackage/jw;

    .line 303
    .line 304
    new-instance v0, Ldefpackage/wn;

    .line 305
    .line 306
    invoke-direct {v0}, Ldefpackage/wn;-><init>()V

    .line 307
    .line 308
    .line 309
    iput-object v0, v2, Ldefpackage/ra;->M:Ldefpackage/wn;

    .line 310
    .line 311
    new-instance v0, Ldefpackage/q03;

    .line 312
    .line 313
    invoke-direct {v0}, Ldefpackage/q03;-><init>()V

    .line 314
    .line 315
    .line 316
    iput-object v0, v2, Ldefpackage/ra;->N:Ldefpackage/q03;

    .line 317
    .line 318
    new-instance v0, Ldefpackage/tx2;

    .line 319
    .line 320
    invoke-direct {v0}, Ldefpackage/tx2;-><init>()V

    .line 321
    .line 322
    .line 323
    iput-object v0, v2, Ldefpackage/ra;->Q:Ldefpackage/tx2;

    .line 324
    .line 325
    new-instance v0, Ldefpackage/jw;

    .line 326
    .line 327
    invoke-virtual {v2}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 332
    .line 333
    .line 334
    iput-object v1, v0, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 335
    .line 336
    new-instance v3, Ldefpackage/cm1;

    .line 337
    .line 338
    iget-object v1, v1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 339
    .line 340
    iget-object v1, v1, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, Ldefpackage/iz1;

    .line 343
    .line 344
    invoke-direct {v3, v1}, Ldefpackage/cm1;-><init>(Ldefpackage/q62;)V

    .line 345
    .line 346
    .line 347
    iput-object v3, v0, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 348
    .line 349
    new-instance v1, Ldefpackage/pz1;

    .line 350
    .line 351
    const/16 v6, 0xf

    .line 352
    .line 353
    invoke-direct {v1, v6}, Ldefpackage/pz1;-><init>(I)V

    .line 354
    .line 355
    .line 356
    iput-object v1, v0, Ldefpackage/jw;->q:Ljava/lang/Object;

    .line 357
    .line 358
    new-instance v1, Ldefpackage/fm1;

    .line 359
    .line 360
    invoke-direct {v1}, Ldefpackage/fm1;-><init>()V

    .line 361
    .line 362
    .line 363
    iput-object v1, v0, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v0, v2, Ldefpackage/ra;->R:Ldefpackage/jw;

    .line 366
    .line 367
    new-instance v0, Landroid/content/res/Configuration;

    .line 368
    .line 369
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v0}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iput-object v0, v2, Ldefpackage/ra;->S:Ldefpackage/zd3;

    .line 385
    .line 386
    new-instance v0, Ldefpackage/da;

    .line 387
    .line 388
    invoke-direct {v0, v2, v13}, Ldefpackage/da;-><init>(Ldefpackage/ra;I)V

    .line 389
    .line 390
    .line 391
    new-instance v1, Ldefpackage/dp0;

    .line 392
    .line 393
    invoke-direct {v1, v0, v12}, Ldefpackage/dp0;-><init>(Ldefpackage/gf1;Ldefpackage/rv2;)V

    .line 394
    .line 395
    .line 396
    iput-object v1, v2, Ldefpackage/ra;->T:Ldefpackage/dp0;

    .line 397
    .line 398
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_2

    .line 403
    .line 404
    new-instance v0, Ldefpackage/x9;

    .line 405
    .line 406
    invoke-virtual {v2}, Ldefpackage/ra;->getAutofillTree()Ldefpackage/wn;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-direct {v0, v2, v1}, Ldefpackage/x9;-><init>(Ldefpackage/ra;Ldefpackage/wn;)V

    .line 411
    .line 412
    .line 413
    goto :goto_0

    .line 414
    :cond_2
    move-object v0, v12

    .line 415
    :goto_0
    iput-object v0, v2, Ldefpackage/ra;->U:Ldefpackage/x9;

    .line 416
    .line 417
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_3

    .line 422
    .line 423
    new-instance v0, Ldefpackage/y9;

    .line 424
    .line 425
    new-instance v1, Ldefpackage/qr2;

    .line 426
    .line 427
    invoke-direct {v1, v6, v8}, Ldefpackage/qr2;-><init>(ILjava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {p0 .. p0}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-virtual/range {p0 .. p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    move-object/from16 v3, p0

    .line 443
    .line 444
    invoke-direct/range {v0 .. v5}, Ldefpackage/y9;-><init>(Ldefpackage/qr2;Ldefpackage/l94;Ldefpackage/ra;Ldefpackage/yv3;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    move-object v2, v3

    .line 448
    goto :goto_1

    .line 449
    :cond_3
    move-object v0, v12

    .line 450
    :goto_1
    iput-object v0, v2, Ldefpackage/ra;->V:Ldefpackage/y9;

    .line 451
    .line 452
    new-instance v0, Ldefpackage/wb3;

    .line 453
    .line 454
    new-instance v1, Ldefpackage/ja;

    .line 455
    .line 456
    invoke-direct {v1, v2, v10}, Ldefpackage/ja;-><init>(Ldefpackage/ra;I)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v0, v1}, Ldefpackage/wb3;-><init>(Ldefpackage/ja;)V

    .line 460
    .line 461
    .line 462
    iput-object v0, v2, Ldefpackage/ra;->a0:Ldefpackage/wb3;

    .line 463
    .line 464
    new-instance v0, Ldefpackage/ri2;

    .line 465
    .line 466
    invoke-virtual {v2}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-direct {v0, v1}, Ldefpackage/ri2;-><init>(Ldefpackage/c72;)V

    .line 471
    .line 472
    .line 473
    iput-object v0, v2, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 474
    .line 475
    const-wide v0, 0x7fffffff7fffffffL

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    iput-wide v0, v2, Ldefpackage/ra;->g0:J

    .line 481
    .line 482
    filled-new-array {v10, v10}, [I

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iput-object v0, v2, Ldefpackage/ra;->h0:[I

    .line 487
    .line 488
    invoke-static {}, Ldefpackage/ya4;->h()[F

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iput-object v0, v2, Ldefpackage/ra;->i0:[F

    .line 493
    .line 494
    new-instance v0, Landroid/graphics/Matrix;

    .line 495
    .line 496
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 497
    .line 498
    .line 499
    iput-object v0, v2, Ldefpackage/ra;->j0:Landroid/graphics/Matrix;

    .line 500
    .line 501
    invoke-static {}, Ldefpackage/ya4;->h()[F

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    iput-object v0, v2, Ldefpackage/ra;->k0:[F

    .line 506
    .line 507
    invoke-static {}, Ldefpackage/ya4;->h()[F

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    iput-object v0, v2, Ldefpackage/ra;->l0:[F

    .line 512
    .line 513
    const-wide/16 v0, -0x1

    .line 514
    .line 515
    iput-wide v0, v2, Ldefpackage/ra;->m0:J

    .line 516
    .line 517
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    iput-wide v0, v2, Ldefpackage/ra;->o0:J

    .line 523
    .line 524
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 525
    .line 526
    invoke-direct {v0, v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iput-object v0, v2, Ldefpackage/ra;->s0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 530
    .line 531
    move-object/from16 v0, p2

    .line 532
    .line 533
    iget-object v0, v0, Ldefpackage/h80;->p:Ldefpackage/b13;

    .line 534
    .line 535
    iput-object v0, v2, Ldefpackage/ra;->u0:Ldefpackage/b13;

    .line 536
    .line 537
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    sget-object v1, Ldefpackage/r91;->a:[I

    .line 550
    .line 551
    sget-object v1, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 552
    .line 553
    if-eqz v0, :cond_5

    .line 554
    .line 555
    if-eq v0, v9, :cond_4

    .line 556
    .line 557
    move-object v0, v12

    .line 558
    goto :goto_2

    .line 559
    :cond_4
    sget-object v0, Ldefpackage/r62;->o:Ldefpackage/r62;

    .line 560
    .line 561
    goto :goto_2

    .line 562
    :cond_5
    move-object v0, v1

    .line 563
    :goto_2
    if-nez v0, :cond_6

    .line 564
    .line 565
    goto :goto_3

    .line 566
    :cond_6
    move-object v1, v0

    .line 567
    :goto_3
    invoke-static {v1}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iput-object v0, v2, Ldefpackage/ra;->v0:Ldefpackage/zd3;

    .line 572
    .line 573
    new-instance v0, Ldefpackage/ex2;

    .line 574
    .line 575
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 576
    .line 577
    .line 578
    iput-object v0, v2, Ldefpackage/ra;->x0:Ldefpackage/ex2;

    .line 579
    .line 580
    new-instance v0, Ldefpackage/hd5;

    .line 581
    .line 582
    const/16 v1, 0x16

    .line 583
    .line 584
    invoke-direct {v0, v1}, Ldefpackage/hd5;-><init>(I)V

    .line 585
    .line 586
    .line 587
    iput-object v0, v2, Ldefpackage/ra;->B0:Ldefpackage/hd5;

    .line 588
    .line 589
    new-instance v0, Ldefpackage/q03;

    .line 590
    .line 591
    invoke-direct {v0}, Ldefpackage/q03;-><init>()V

    .line 592
    .line 593
    .line 594
    iput-object v0, v2, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 595
    .line 596
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 597
    .line 598
    iput v0, v2, Ldefpackage/ra;->D0:F

    .line 599
    .line 600
    iput v0, v2, Ldefpackage/ra;->E0:F

    .line 601
    .line 602
    iput v0, v2, Ldefpackage/ra;->F0:F

    .line 603
    .line 604
    iput v0, v2, Ldefpackage/ra;->G0:F

    .line 605
    .line 606
    new-instance v0, Ldefpackage/g5;

    .line 607
    .line 608
    invoke-direct {v0, v11, v2}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    iput-object v0, v2, Ldefpackage/ra;->H0:Ldefpackage/g5;

    .line 612
    .line 613
    new-instance v0, Ldefpackage/ia;

    .line 614
    .line 615
    invoke-direct {v0, v2, v9}, Ldefpackage/ia;-><init>(Ldefpackage/ra;I)V

    .line 616
    .line 617
    .line 618
    iput-object v0, v2, Ldefpackage/ra;->I0:Ldefpackage/ia;

    .line 619
    .line 620
    new-instance v0, Ldefpackage/ka;

    .line 621
    .line 622
    invoke-direct {v0, v2}, Ldefpackage/ka;-><init>(Ldefpackage/ra;)V

    .line 623
    .line 624
    .line 625
    iput-object v0, v2, Ldefpackage/ra;->K0:Ldefpackage/wf1;

    .line 626
    .line 627
    new-instance v0, Ldefpackage/bk;

    .line 628
    .line 629
    new-instance v1, Ldefpackage/ja;

    .line 630
    .line 631
    invoke-direct {v1, v2, v9}, Ldefpackage/ja;-><init>(Ldefpackage/ra;I)V

    .line 632
    .line 633
    .line 634
    invoke-direct {v0, v8, v1}, Ldefpackage/bk;-><init>(Landroid/content/Context;Ldefpackage/ja;)V

    .line 635
    .line 636
    .line 637
    iput-object v0, v2, Ldefpackage/ra;->L0:Ldefpackage/bk;

    .line 638
    .line 639
    new-instance v0, Ldefpackage/da;

    .line 640
    .line 641
    const/4 v1, 0x4

    .line 642
    invoke-direct {v0, v2, v1}, Ldefpackage/da;-><init>(Ldefpackage/ra;I)V

    .line 643
    .line 644
    .line 645
    iput-object v0, v2, Ldefpackage/ra;->M0:Ldefpackage/da;

    .line 646
    .line 647
    new-instance v0, Ldefpackage/da;

    .line 648
    .line 649
    invoke-direct {v0, v2, v10}, Ldefpackage/da;-><init>(Ldefpackage/ra;I)V

    .line 650
    .line 651
    .line 652
    iput-object v0, v2, Ldefpackage/ra;->N0:Ldefpackage/da;

    .line 653
    .line 654
    iget-object v0, v2, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 655
    .line 656
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 663
    .line 664
    .line 665
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 666
    .line 667
    const/16 v1, 0x1a

    .line 668
    .line 669
    if-lt v0, v1, :cond_7

    .line 670
    .line 671
    sget-object v1, Ldefpackage/fb;->a:Ldefpackage/fb;

    .line 672
    .line 673
    invoke-virtual {v1, v2, v9, v10}, Ldefpackage/fb;->a(Landroid/view/View;IZ)V

    .line 674
    .line 675
    .line 676
    :cond_7
    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 680
    .line 681
    .line 682
    invoke-static {v2, v14}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, Ldefpackage/ra;->getDragAndDropManager()Ldefpackage/qb;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 690
    .line 691
    .line 692
    const/16 v1, 0x1d

    .line 693
    .line 694
    if-lt v0, v1, :cond_8

    .line 695
    .line 696
    sget-object v1, Ldefpackage/ab;->a:Ldefpackage/ab;

    .line 697
    .line 698
    invoke-virtual {v1, v2}, Ldefpackage/ab;->a(Landroid/view/View;)V

    .line 699
    .line 700
    .line 701
    :cond_8
    invoke-static {}, Ldefpackage/ra;->l()Z

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    if-eqz v1, :cond_9

    .line 706
    .line 707
    new-instance v1, Landroid/view/View;

    .line 708
    .line 709
    invoke-direct {v1, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 710
    .line 711
    .line 712
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 713
    .line 714
    invoke-direct {v3, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 718
    .line 719
    .line 720
    const v3, 0x7f0a028c

    .line 721
    .line 722
    .line 723
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 724
    .line 725
    invoke-virtual {v1, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    iput-object v1, v2, Ldefpackage/ra;->y:Landroid/view/View;

    .line 729
    .line 730
    const/4 v3, -0x1

    .line 731
    invoke-virtual {v2, v1, v3}, Ldefpackage/ra;->addView(Landroid/view/View;I)V

    .line 732
    .line 733
    .line 734
    :cond_9
    const/16 v1, 0x1f

    .line 735
    .line 736
    if-lt v0, v1, :cond_a

    .line 737
    .line 738
    new-instance v12, Ldefpackage/rm2;

    .line 739
    .line 740
    invoke-direct {v12, v6}, Ldefpackage/rm2;-><init>(I)V

    .line 741
    .line 742
    .line 743
    :cond_a
    iput-object v12, v2, Ldefpackage/ra;->R0:Ldefpackage/rm2;

    .line 744
    .line 745
    new-instance v0, Ldefpackage/pa;

    .line 746
    .line 747
    invoke-direct {v0, v2}, Ldefpackage/pa;-><init>(Ldefpackage/ra;)V

    .line 748
    .line 749
    .line 750
    iput-object v0, v2, Ldefpackage/ra;->T0:Ldefpackage/pa;

    .line 751
    .line 752
    return-void
.end method

.method public static c(Ldefpackage/ra;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static d()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static e(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, Ldefpackage/ra;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Ldefpackage/ra;

    .line 17
    .line 18
    invoke-virtual {v2}, Ldefpackage/ra;->s()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, Ldefpackage/ra;->e(Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public static f(I)J
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/high16 v1, 0x40000000    # 2.0f

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    int-to-long v0, p0

    .line 20
    const/16 p0, 0x20

    .line 21
    .line 22
    shl-long v2, v0, p0

    .line 23
    .line 24
    or-long/2addr v0, v2

    .line 25
    return-wide v0

    .line 26
    :cond_0
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 27
    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_1
    const-wide/32 v0, 0x7fffffff

    .line 33
    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    int-to-long v0, p0

    .line 37
    return-wide v0
.end method

.method private final getCanvasHolder()Ldefpackage/nz;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->u:Ldefpackage/nz;

    .line 6
    .line 7
    return-object p0
.end method

.method private final getDerivedIsAttached()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->D:Ldefpackage/dp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/dp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getLegacyTextInputServiceAndroid()Ldefpackage/js4;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->q0:Ldefpackage/js4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/js4;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/ra;->getView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1, p0}, Ldefpackage/js4;-><init>(Landroid/view/View;Ldefpackage/ra;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/ra;->q0:Ldefpackage/js4;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public static synthetic getPlayNavigationSoundEffect$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getRoot$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getWindowInfo$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final get_composeViewContext()Ldefpackage/h80;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->n:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/h80;

    .line 8
    .line 9
    return-object p0
.end method

.method public static i(Ldefpackage/c72;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/c72;->C()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p0, :cond_0

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    check-cast v2, Ldefpackage/c72;

    .line 18
    .line 19
    invoke-static {v2}, Ldefpackage/ra;->i(Ldefpackage/c72;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public static l()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static m(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    if-ge v0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/2addr v0, v1

    .line 28
    if-ge v0, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/2addr v0, v1

    .line 39
    if-ge v0, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    and-int/2addr v0, v1

    .line 50
    if-ge v0, v4, :cond_0

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v0, v3

    .line 55
    :goto_0
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v3

    .line 62
    :goto_1
    if-ge v6, v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getX(I)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    and-int/2addr v0, v1

    .line 73
    if-ge v0, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    and-int/2addr v0, v1

    .line 84
    if-ge v0, v4, :cond_2

    .line 85
    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v7, 0x1d

    .line 89
    .line 90
    if-lt v0, v7, :cond_1

    .line 91
    .line 92
    sget-object v0, Ldefpackage/ux2;->a:Ldefpackage/ux2;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v6}, Ldefpackage/ux2;->a(Landroid/view/MotionEvent;I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    move v0, v2

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    :goto_2
    move v0, v3

    .line 104
    :goto_3
    if-nez v0, :cond_3

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    return v0
.end method

.method private final setAttached(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->C:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private setDensity(Ldefpackage/oo0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->x:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(Ldefpackage/r62;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->v0:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_composeViewContext(Ldefpackage/h80;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->n:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/ra;->k0:[F

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/ra;->h0:[I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Ldefpackage/ay;->a:Ldefpackage/ay;

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/ra;->j0:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v0, p0, v2, v1, v3}, Ldefpackage/ay;->a(Landroid/view/View;[FLandroid/graphics/Matrix;[I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v2}, Ldefpackage/ya4;->G([F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/ra;->i0:[F

    .line 23
    .line 24
    invoke-static {p0, v2, v0, v3}, Ldefpackage/gi1;->Y(Landroid/view/View;[F[F[I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, p0, Ldefpackage/ra;->l0:[F

    .line 28
    .line 29
    invoke-static {v2, p0}, Ldefpackage/q05;->q([F[F)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final B()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/16 v0, 0x82

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-super {p0, v0, v1}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final C(Ldefpackage/gf1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->v:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, p1}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ra;->w:Ldefpackage/ia;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "schedule is called when outOfFrameExecutor is not available (view is detached)"

    .line 25
    .line 26
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final D(Ldefpackage/c72;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/c72;->r()Ldefpackage/a72;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ldefpackage/a72;->n:Ldefpackage/a72;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Ldefpackage/ra;->e0:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ldefpackage/iz1;

    .line 40
    .line 41
    iget-wide v0, v0, Ldefpackage/jg3;->q:J

    .line 42
    .line 43
    invoke-static {v0, v1}, Ldefpackage/nc0;->f(J)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-static {v0, v1}, Ldefpackage/nc0;->e(J)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public final E(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->y()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    shr-long v1, p1, v0

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-wide v2, p0, Ldefpackage/ra;->o0:J

    .line 14
    .line 15
    shr-long/2addr v2, v0

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v2

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-wide v4, p0, Ldefpackage/ra;->o0:J

    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    long-to-int p2, v4

    .line 37
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-float/2addr p1, p2

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    int-to-long v4, p2

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-long p1, p1

    .line 52
    shl-long v0, v4, v0

    .line 53
    .line 54
    and-long/2addr p1, v2

    .line 55
    or-long/2addr p1, v0

    .line 56
    iget-object p0, p0, Ldefpackage/ra;->l0:[F

    .line 57
    .line 58
    invoke-static {p1, p2, p0}, Ldefpackage/ya4;->A(J[F)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0
.end method

.method public final F(Landroid/view/MotionEvent;)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Ldefpackage/ra;->O0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Ldefpackage/ra;->O0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ldefpackage/h80;->t:Ldefpackage/om1;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, Ldefpackage/la5;->n:Ldefpackage/zd3;

    .line 22
    .line 23
    new-instance v3, Ldefpackage/tn3;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Ldefpackage/tn3;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Ldefpackage/ra;->Q:Ldefpackage/tx2;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, Ldefpackage/tx2;->c(Landroid/view/MotionEvent;Ldefpackage/ra;)Ldefpackage/rf2;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Ldefpackage/ra;->R:Ldefpackage/jw;

    .line 42
    .line 43
    if-eqz v2, :cond_9

    .line 44
    .line 45
    iget-object v1, v2, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    add-int/lit8 v5, v5, -0x1

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x5

    .line 57
    if-ltz v5, :cond_3

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v8, v5, -0x1

    .line 60
    .line 61
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v9, v5

    .line 66
    check-cast v9, Ldefpackage/qn3;

    .line 67
    .line 68
    iget-boolean v9, v9, Ldefpackage/qn3;->e:Z

    .line 69
    .line 70
    if-eqz v9, :cond_1

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    if-ne v3, v7, :cond_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    if-gez v8, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move v5, v8

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    :goto_1
    move-object v5, v6

    .line 83
    :cond_4
    :goto_2
    check-cast v5, Ldefpackage/qn3;

    .line 84
    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    iget-wide v8, v5, Ldefpackage/qn3;->d:J

    .line 88
    .line 89
    iput-wide v8, p0, Ldefpackage/ra;->o:J

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0, p1}, Ldefpackage/ra;->n(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v4, v2, p0, v1}, Ldefpackage/jw;->s(Ldefpackage/rf2;Ldefpackage/ra;Z)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    iput-object v6, v2, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    if-ne v3, v7, :cond_7

    .line 104
    .line 105
    :cond_6
    and-int/lit8 v1, p0, 0x1

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    :cond_7
    return p0

    .line 110
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget-object v1, v0, Ldefpackage/tx2;->c:Landroid/util/SparseBooleanArray;

    .line 119
    .line 120
    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Ldefpackage/tx2;->b:Landroid/util/SparseLongArray;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 126
    .line 127
    .line 128
    return p0

    .line 129
    :cond_9
    iget-boolean p0, v4, Ldefpackage/jw;->n:Z

    .line 130
    .line 131
    if-nez p0, :cond_a

    .line 132
    .line 133
    iget-object p0, v4, Ldefpackage/jw;->q:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Ldefpackage/pz1;

    .line 136
    .line 137
    iget-object p0, p0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, Ldefpackage/xe2;

    .line 140
    .line 141
    invoke-virtual {p0}, Ldefpackage/xe2;->a()V

    .line 142
    .line 143
    .line 144
    iget-object p0, v4, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Ldefpackage/cm1;

    .line 147
    .line 148
    invoke-virtual {p0}, Ldefpackage/cm1;->c()V

    .line 149
    .line 150
    .line 151
    :cond_a
    return v1
.end method

.method public final G(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eq v2, v6, :cond_1

    .line 14
    .line 15
    const/4 v7, 0x6

    .line 16
    if-eq v2, v7, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v2, 0x9

    .line 25
    .line 26
    if-eq v5, v2, :cond_2

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    if-eq v5, v2, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ltz v3, :cond_3

    .line 38
    .line 39
    move v7, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 v7, 0x0

    .line 42
    :goto_1
    sub-int/2addr v2, v7

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_2
    if-ge v8, v2, :cond_5

    .line 50
    .line 51
    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    .line 52
    .line 53
    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 54
    .line 55
    .line 56
    aput-object v9, v7, v8

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    :goto_3
    if-ge v9, v2, :cond_6

    .line 65
    .line 66
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 67
    .line 68
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 69
    .line 70
    .line 71
    aput-object v10, v8, v9

    .line 72
    .line 73
    add-int/lit8 v9, v9, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    const/4 v9, 0x0

    .line 77
    :goto_4
    if-ge v9, v2, :cond_8

    .line 78
    .line 79
    if-ltz v3, :cond_7

    .line 80
    .line 81
    if-gt v3, v9, :cond_7

    .line 82
    .line 83
    move v10, v6

    .line 84
    goto :goto_5

    .line 85
    :cond_7
    const/4 v10, 0x0

    .line 86
    :goto_5
    add-int/2addr v10, v9

    .line 87
    aget-object v11, v7, v9

    .line 88
    .line 89
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 90
    .line 91
    .line 92
    aget-object v11, v8, v9

    .line 93
    .line 94
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 95
    .line 96
    .line 97
    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 98
    .line 99
    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    int-to-long v13, v10

    .line 106
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    int-to-long v4, v10

    .line 111
    const/16 v10, 0x20

    .line 112
    .line 113
    shl-long/2addr v13, v10

    .line 114
    const-wide v15, 0xffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    and-long/2addr v4, v15

    .line 120
    or-long/2addr v4, v13

    .line 121
    invoke-virtual {v0, v4, v5}, Ldefpackage/ra;->p(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v4

    .line 125
    shr-long v13, v4, v10

    .line 126
    .line 127
    long-to-int v10, v13

    .line 128
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 133
    .line 134
    and-long/2addr v4, v15

    .line 135
    long-to-int v4, v4

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    iput v4, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 141
    .line 142
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    move/from16 v5, p2

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_8
    if-eqz p5, :cond_9

    .line 148
    .line 149
    const/4 v10, 0x0

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    move v10, v4

    .line 156
    :goto_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    cmp-long v3, v3, v11

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    move-wide/from16 v3, p3

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 172
    .line 173
    .line 174
    move-result-wide v3

    .line 175
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getFlags()I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    move/from16 v5, p2

    .line 204
    .line 205
    move v6, v2

    .line 206
    move-wide v1, v3

    .line 207
    move-wide/from16 v3, p3

    .line 208
    .line 209
    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object v2, v0, Ldefpackage/ra;->Q:Ldefpackage/tx2;

    .line 214
    .line 215
    invoke-virtual {v2, v1, v0}, Ldefpackage/tx2;->c(Landroid/view/MotionEvent;Ldefpackage/ra;)Ldefpackage/rf2;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v3, v0, Ldefpackage/ra;->R:Ldefpackage/jw;

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    invoke-virtual {v3, v2, v0, v4}, Ldefpackage/jw;->s(Ldefpackage/rf2;Ldefpackage/ra;Z)I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final H(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getConfiguration()Landroid/content/res/Configuration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    new-instance v1, Landroid/content/res/Configuration;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ldefpackage/ra;->setConfiguration(Landroid/content/res/Configuration;)V

    .line 17
    .line 18
    .line 19
    iget v1, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 20
    .line 21
    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    cmpg-float v1, v1, v2

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget v0, v0, Landroid/content/res/Configuration;->densityDpi:I

    .line 28
    .line 29
    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 30
    .line 31
    if-eq v0, p1, :cond_1

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Ldefpackage/bu;->a(Landroid/content/Context;)Ldefpackage/so0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, p1}, Ldefpackage/ra;->setDensity(Ldefpackage/oo0;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final I()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ra;->h0:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Ldefpackage/ra;->g0:J

    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    shr-long v5, v2, v4

    .line 13
    .line 14
    long-to-int v5, v5

    .line 15
    const-wide v6, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v6

    .line 21
    long-to-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    aget v8, v1, v3

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    if-ne v5, v8, :cond_0

    .line 27
    .line 28
    aget v10, v1, v9

    .line 29
    .line 30
    if-ne v2, v10, :cond_0

    .line 31
    .line 32
    iget-wide v10, v0, Ldefpackage/ra;->m0:J

    .line 33
    .line 34
    const-wide/16 v12, 0x0

    .line 35
    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-gez v10, :cond_2

    .line 39
    .line 40
    :cond_0
    aget v1, v1, v9

    .line 41
    .line 42
    int-to-long v10, v8

    .line 43
    shl-long/2addr v10, v4

    .line 44
    int-to-long v12, v1

    .line 45
    and-long/2addr v6, v12

    .line 46
    or-long/2addr v6, v10

    .line 47
    iput-wide v6, v0, Ldefpackage/ra;->g0:J

    .line 48
    .line 49
    const v1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v5, v1, :cond_2

    .line 53
    .line 54
    if-eq v2, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 67
    .line 68
    move v4, v3

    .line 69
    :goto_0
    if-ge v4, v1, :cond_1

    .line 70
    .line 71
    aget-object v5, v2, v4

    .line 72
    .line 73
    check-cast v5, Ldefpackage/c72;

    .line 74
    .line 75
    iget-object v5, v5, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 76
    .line 77
    iget-object v5, v5, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 78
    .line 79
    invoke-virtual {v5}, Ldefpackage/ti2;->e0()V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v1, v9

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v1, v3

    .line 88
    :goto_1
    invoke-virtual {v0}, Ldefpackage/ra;->y()V

    .line 89
    .line 90
    .line 91
    iget-object v2, v0, Ldefpackage/ra;->S0:Landroid/view/View;

    .line 92
    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, v0, Ldefpackage/ra;->S0:Landroid/view/View;

    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-wide v11, v0, Ldefpackage/ra;->g0:J

    .line 106
    .line 107
    iget-wide v5, v0, Ldefpackage/ra;->o0:J

    .line 108
    .line 109
    invoke-static {v5, v6}, Ldefpackage/ji2;->K(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v13

    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v17

    .line 121
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Ldefpackage/ra;->k0:[F

    .line 125
    .line 126
    array-length v5, v2

    .line 127
    const/16 v6, 0x10

    .line 128
    .line 129
    const/4 v7, 0x2

    .line 130
    if-ge v5, v6, :cond_4

    .line 131
    .line 132
    move v5, v3

    .line 133
    goto/16 :goto_f

    .line 134
    .line 135
    :cond_4
    aget v5, v2, v3

    .line 136
    .line 137
    const/high16 v6, 0x3f800000    # 1.0f

    .line 138
    .line 139
    cmpg-float v5, v5, v6

    .line 140
    .line 141
    if-nez v5, :cond_5

    .line 142
    .line 143
    move v5, v9

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    move v5, v3

    .line 146
    :goto_2
    aget v8, v2, v9

    .line 147
    .line 148
    const/4 v10, 0x0

    .line 149
    cmpg-float v8, v8, v10

    .line 150
    .line 151
    if-nez v8, :cond_6

    .line 152
    .line 153
    move v8, v9

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move v8, v3

    .line 156
    :goto_3
    and-int/2addr v5, v8

    .line 157
    aget v8, v2, v7

    .line 158
    .line 159
    cmpg-float v8, v8, v10

    .line 160
    .line 161
    if-nez v8, :cond_7

    .line 162
    .line 163
    move v8, v9

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    move v8, v3

    .line 166
    :goto_4
    and-int/2addr v5, v8

    .line 167
    const/4 v8, 0x4

    .line 168
    aget v8, v2, v8

    .line 169
    .line 170
    cmpg-float v8, v8, v10

    .line 171
    .line 172
    if-nez v8, :cond_8

    .line 173
    .line 174
    move v8, v9

    .line 175
    goto :goto_5

    .line 176
    :cond_8
    move v8, v3

    .line 177
    :goto_5
    and-int/2addr v5, v8

    .line 178
    const/4 v8, 0x5

    .line 179
    aget v8, v2, v8

    .line 180
    .line 181
    cmpg-float v8, v8, v6

    .line 182
    .line 183
    if-nez v8, :cond_9

    .line 184
    .line 185
    move v8, v9

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    move v8, v3

    .line 188
    :goto_6
    and-int/2addr v5, v8

    .line 189
    const/4 v8, 0x6

    .line 190
    aget v8, v2, v8

    .line 191
    .line 192
    cmpg-float v8, v8, v10

    .line 193
    .line 194
    if-nez v8, :cond_a

    .line 195
    .line 196
    move v8, v9

    .line 197
    goto :goto_7

    .line 198
    :cond_a
    move v8, v3

    .line 199
    :goto_7
    and-int/2addr v5, v8

    .line 200
    const/16 v8, 0x8

    .line 201
    .line 202
    aget v8, v2, v8

    .line 203
    .line 204
    cmpg-float v8, v8, v10

    .line 205
    .line 206
    if-nez v8, :cond_b

    .line 207
    .line 208
    move v8, v9

    .line 209
    goto :goto_8

    .line 210
    :cond_b
    move v8, v3

    .line 211
    :goto_8
    and-int/2addr v5, v8

    .line 212
    const/16 v8, 0x9

    .line 213
    .line 214
    aget v8, v2, v8

    .line 215
    .line 216
    cmpg-float v8, v8, v10

    .line 217
    .line 218
    if-nez v8, :cond_c

    .line 219
    .line 220
    move v8, v9

    .line 221
    goto :goto_9

    .line 222
    :cond_c
    move v8, v3

    .line 223
    :goto_9
    and-int/2addr v5, v8

    .line 224
    const/16 v8, 0xa

    .line 225
    .line 226
    aget v8, v2, v8

    .line 227
    .line 228
    cmpg-float v8, v8, v6

    .line 229
    .line 230
    if-nez v8, :cond_d

    .line 231
    .line 232
    move v8, v9

    .line 233
    goto :goto_a

    .line 234
    :cond_d
    move v8, v3

    .line 235
    :goto_a
    and-int/2addr v5, v8

    .line 236
    const/16 v8, 0xc

    .line 237
    .line 238
    aget v8, v2, v8

    .line 239
    .line 240
    cmpg-float v8, v8, v10

    .line 241
    .line 242
    if-nez v8, :cond_e

    .line 243
    .line 244
    move v8, v9

    .line 245
    goto :goto_b

    .line 246
    :cond_e
    move v8, v3

    .line 247
    :goto_b
    const/16 v15, 0xd

    .line 248
    .line 249
    aget v15, v2, v15

    .line 250
    .line 251
    cmpg-float v15, v15, v10

    .line 252
    .line 253
    if-nez v15, :cond_f

    .line 254
    .line 255
    move v15, v9

    .line 256
    goto :goto_c

    .line 257
    :cond_f
    move v15, v3

    .line 258
    :goto_c
    and-int/2addr v8, v15

    .line 259
    const/16 v15, 0xe

    .line 260
    .line 261
    aget v15, v2, v15

    .line 262
    .line 263
    cmpg-float v10, v15, v10

    .line 264
    .line 265
    if-nez v10, :cond_10

    .line 266
    .line 267
    move v10, v9

    .line 268
    goto :goto_d

    .line 269
    :cond_10
    move v10, v3

    .line 270
    :goto_d
    and-int/2addr v8, v10

    .line 271
    const/16 v10, 0xf

    .line 272
    .line 273
    aget v10, v2, v10

    .line 274
    .line 275
    cmpg-float v6, v10, v6

    .line 276
    .line 277
    if-nez v6, :cond_11

    .line 278
    .line 279
    move v6, v9

    .line 280
    goto :goto_e

    .line 281
    :cond_11
    move v6, v3

    .line 282
    :goto_e
    and-int/2addr v6, v8

    .line 283
    shl-int/2addr v5, v9

    .line 284
    or-int/2addr v5, v6

    .line 285
    :goto_f
    iget-object v10, v4, Ldefpackage/yv3;->d:Ldefpackage/pt4;

    .line 286
    .line 287
    and-int/2addr v5, v7

    .line 288
    if-nez v5, :cond_12

    .line 289
    .line 290
    :goto_10
    move-object v15, v2

    .line 291
    goto :goto_11

    .line 292
    :cond_12
    const/4 v2, 0x0

    .line 293
    goto :goto_10

    .line 294
    :goto_11
    invoke-virtual/range {v10 .. v17}, Ldefpackage/pt4;->b(JJ[FII)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-nez v2, :cond_13

    .line 299
    .line 300
    iget-boolean v2, v4, Ldefpackage/yv3;->g:Z

    .line 301
    .line 302
    if-eqz v2, :cond_14

    .line 303
    .line 304
    :cond_13
    move v3, v9

    .line 305
    :cond_14
    iput-boolean v3, v4, Ldefpackage/yv3;->g:Z

    .line 306
    .line 307
    iget-object v2, v0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 308
    .line 309
    invoke-virtual {v2, v1}, Ldefpackage/ri2;->b(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v0}, Ldefpackage/yv3;->a()V

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public final J(F)V
    .locals 2

    .line 1
    invoke-static {}, Ldefpackage/ra;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v1, p1, v0

    .line 9
    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Ldefpackage/ra;->D0:F

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Ldefpackage/ra;->D0:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    if-lez v0, :cond_3

    .line 25
    .line 26
    :cond_0
    iput p1, p0, Ldefpackage/ra;->D0:F

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    cmpg-float v0, p1, v0

    .line 30
    .line 31
    if-gez v0, :cond_3

    .line 32
    .line 33
    iget v0, p0, Ldefpackage/ra;->E0:F

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, Ldefpackage/ra;->E0:F

    .line 42
    .line 43
    cmpg-float v0, p1, v0

    .line 44
    .line 45
    if-gez v0, :cond_3

    .line 46
    .line 47
    :cond_2
    iput p1, p0, Ldefpackage/ra;->E0:F

    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method public final a(Ldefpackage/ba1;Ldefpackage/ba1;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_1e

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    check-cast p0, Ldefpackage/cx2;

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 7
    .line 8
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 18
    .line 19
    invoke-static {p1}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    move-object v2, v0

    .line 25
    :goto_0
    const/16 v3, 0x10

    .line 26
    .line 27
    const/high16 v4, 0x200000

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    if-eqz p1, :cond_c

    .line 32
    .line 33
    iget-object v7, p1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 34
    .line 35
    iget-object v7, v7, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, Ldefpackage/cx2;

    .line 38
    .line 39
    iget v7, v7, Ldefpackage/cx2;->q:I

    .line 40
    .line 41
    and-int/2addr v7, v4

    .line 42
    if-eqz v7, :cond_a

    .line 43
    .line 44
    :goto_1
    if-eqz p0, :cond_a

    .line 45
    .line 46
    iget v7, p0, Ldefpackage/cx2;->p:I

    .line 47
    .line 48
    and-int/2addr v7, v4

    .line 49
    if-eqz v7, :cond_9

    .line 50
    .line 51
    move-object v7, p0

    .line 52
    move-object v8, v0

    .line 53
    :goto_2
    if-eqz v7, :cond_9

    .line 54
    .line 55
    instance-of v9, v7, Ldefpackage/my1;

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move v9, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move v9, v6

    .line 72
    :goto_3
    if-eqz v9, :cond_8

    .line 73
    .line 74
    iget v9, v7, Ldefpackage/cx2;->p:I

    .line 75
    .line 76
    and-int/2addr v9, v4

    .line 77
    if-eqz v9, :cond_8

    .line 78
    .line 79
    instance-of v9, v7, Ldefpackage/fo0;

    .line 80
    .line 81
    if-eqz v9, :cond_8

    .line 82
    .line 83
    move-object v9, v7

    .line 84
    check-cast v9, Ldefpackage/fo0;

    .line 85
    .line 86
    iget-object v9, v9, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 87
    .line 88
    move v10, v5

    .line 89
    :goto_4
    if-eqz v9, :cond_7

    .line 90
    .line 91
    iget v11, v9, Ldefpackage/cx2;->p:I

    .line 92
    .line 93
    and-int/2addr v11, v4

    .line 94
    if-eqz v11, :cond_6

    .line 95
    .line 96
    add-int/lit8 v10, v10, 0x1

    .line 97
    .line 98
    if-ne v10, v6, :cond_3

    .line 99
    .line 100
    move-object v7, v9

    .line 101
    goto :goto_5

    .line 102
    :cond_3
    if-nez v8, :cond_4

    .line 103
    .line 104
    new-instance v8, Ldefpackage/f13;

    .line 105
    .line 106
    new-array v11, v3, [Ldefpackage/cx2;

    .line 107
    .line 108
    invoke-direct {v8, v11}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    if-eqz v7, :cond_5

    .line 112
    .line 113
    invoke-virtual {v8, v7}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v7, v0

    .line 117
    :cond_5
    invoke-virtual {v8, v9}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    :goto_5
    iget-object v9, v9, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    if-ne v10, v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    invoke-static {v8}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    goto :goto_2

    .line 131
    :cond_9
    iget-object p0, p0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_a
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_b

    .line 139
    .line 140
    iget-object p0, p1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 141
    .line 142
    if-eqz p0, :cond_b

    .line 143
    .line 144
    iget-object p0, p0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Ldefpackage/sq4;

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_b
    move-object p0, v0

    .line 150
    goto :goto_0

    .line 151
    :cond_c
    if-nez v2, :cond_d

    .line 152
    .line 153
    goto/16 :goto_e

    .line 154
    .line 155
    :cond_d
    if-eqz p2, :cond_1b

    .line 156
    .line 157
    iget-object p0, p2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 158
    .line 159
    iget-boolean p0, p0, Ldefpackage/cx2;->A:Z

    .line 160
    .line 161
    if-nez p0, :cond_e

    .line 162
    .line 163
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_e
    iget-object p0, p2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 167
    .line 168
    invoke-static {p2}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    move-object p2, v0

    .line 173
    :goto_6
    if-eqz p1, :cond_1a

    .line 174
    .line 175
    iget-object v1, p1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 176
    .line 177
    iget-object v1, v1, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ldefpackage/cx2;

    .line 180
    .line 181
    iget v1, v1, Ldefpackage/cx2;->q:I

    .line 182
    .line 183
    and-int/2addr v1, v4

    .line 184
    if-eqz v1, :cond_18

    .line 185
    .line 186
    :goto_7
    if-eqz p0, :cond_18

    .line 187
    .line 188
    iget v1, p0, Ldefpackage/cx2;->p:I

    .line 189
    .line 190
    and-int/2addr v1, v4

    .line 191
    if-eqz v1, :cond_17

    .line 192
    .line 193
    move-object v1, p0

    .line 194
    move-object v7, v0

    .line 195
    :goto_8
    if-eqz v1, :cond_17

    .line 196
    .line 197
    instance-of v8, v1, Ldefpackage/my1;

    .line 198
    .line 199
    if-eqz v8, :cond_10

    .line 200
    .line 201
    if-nez p2, :cond_f

    .line 202
    .line 203
    sget-object p2, Ldefpackage/w54;->a:Ldefpackage/x03;

    .line 204
    .line 205
    new-instance p2, Ldefpackage/x03;

    .line 206
    .line 207
    invoke-direct {p2}, Ldefpackage/x03;-><init>()V

    .line 208
    .line 209
    .line 210
    :cond_f
    invoke-virtual {p2, v1}, Ldefpackage/x03;->a(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move v8, v5

    .line 214
    goto :goto_9

    .line 215
    :cond_10
    move v8, v6

    .line 216
    :goto_9
    if-eqz v8, :cond_16

    .line 217
    .line 218
    iget v8, v1, Ldefpackage/cx2;->p:I

    .line 219
    .line 220
    and-int/2addr v8, v4

    .line 221
    if-eqz v8, :cond_16

    .line 222
    .line 223
    instance-of v8, v1, Ldefpackage/fo0;

    .line 224
    .line 225
    if-eqz v8, :cond_16

    .line 226
    .line 227
    move-object v8, v1

    .line 228
    check-cast v8, Ldefpackage/fo0;

    .line 229
    .line 230
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 231
    .line 232
    move v9, v5

    .line 233
    :goto_a
    if-eqz v8, :cond_15

    .line 234
    .line 235
    iget v10, v8, Ldefpackage/cx2;->p:I

    .line 236
    .line 237
    and-int/2addr v10, v4

    .line 238
    if-eqz v10, :cond_14

    .line 239
    .line 240
    add-int/lit8 v9, v9, 0x1

    .line 241
    .line 242
    if-ne v9, v6, :cond_11

    .line 243
    .line 244
    move-object v1, v8

    .line 245
    goto :goto_b

    .line 246
    :cond_11
    if-nez v7, :cond_12

    .line 247
    .line 248
    new-instance v7, Ldefpackage/f13;

    .line 249
    .line 250
    new-array v10, v3, [Ldefpackage/cx2;

    .line 251
    .line 252
    invoke-direct {v7, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_12
    if-eqz v1, :cond_13

    .line 256
    .line 257
    invoke-virtual {v7, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    move-object v1, v0

    .line 261
    :cond_13
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_14
    :goto_b
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_15
    if-ne v9, v6, :cond_16

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_16
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    goto :goto_8

    .line 275
    :cond_17
    iget-object p0, p0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_18
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_19

    .line 283
    .line 284
    iget-object p0, p1, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 285
    .line 286
    if-eqz p0, :cond_19

    .line 287
    .line 288
    iget-object p0, p0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p0, Ldefpackage/sq4;

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_19
    move-object p0, v0

    .line 294
    goto :goto_6

    .line 295
    :cond_1a
    move-object v0, p2

    .line 296
    :cond_1b
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    move p1, v5

    .line 301
    :goto_c
    if-ge p1, p0, :cond_1e

    .line 302
    .line 303
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    check-cast p2, Ldefpackage/my1;

    .line 308
    .line 309
    if-eqz v0, :cond_1c

    .line 310
    .line 311
    invoke-virtual {v0, p2}, Ldefpackage/x03;->c(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    goto :goto_d

    .line 316
    :cond_1c
    move v1, v5

    .line 317
    :goto_d
    if-nez v1, :cond_1d

    .line 318
    .line 319
    invoke-interface {p2}, Ldefpackage/my1;->N()V

    .line 320
    .line 321
    .line 322
    :cond_1d
    add-int/lit8 p1, p1, 0x1

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_1e
    :goto_e
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldefpackage/ey;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/ba1;

    .line 10
    .line 11
    iget-boolean v1, v0, Ldefpackage/cx2;->A:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_c

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 18
    .line 19
    iget-boolean v1, v1, Ldefpackage/cx2;->A:Z

    .line 20
    .line 21
    const-string v2, "visitSubtreeIf called on an unattached node"

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    new-instance v1, Ldefpackage/f13;

    .line 29
    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    new-array v4, v3, [Ldefpackage/cx2;

    .line 33
    .line 34
    invoke-direct {v1, v4}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 38
    .line 39
    iget-object v4, v0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    invoke-static {v1, v0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v1, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget v0, v1, Ldefpackage/f13;->p:I

    .line 51
    .line 52
    if-eqz v0, :cond_1a

    .line 53
    .line 54
    add-int/lit8 v0, v0, -0x1

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ldefpackage/cx2;

    .line 61
    .line 62
    iget v4, v0, Ldefpackage/cx2;->q:I

    .line 63
    .line 64
    and-int/lit16 v4, v4, 0x400

    .line 65
    .line 66
    if-eqz v4, :cond_19

    .line 67
    .line 68
    move-object v4, v0

    .line 69
    :goto_1
    if-eqz v4, :cond_19

    .line 70
    .line 71
    iget-boolean v5, v4, Ldefpackage/cx2;->A:Z

    .line 72
    .line 73
    if-eqz v5, :cond_19

    .line 74
    .line 75
    iget v5, v4, Ldefpackage/cx2;->p:I

    .line 76
    .line 77
    and-int/lit16 v5, v5, 0x400

    .line 78
    .line 79
    if-eqz v5, :cond_18

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    move-object v6, v4

    .line 83
    move-object v7, v5

    .line 84
    :goto_2
    if-eqz v6, :cond_18

    .line 85
    .line 86
    instance-of v8, v6, Ldefpackage/ba1;

    .line 87
    .line 88
    const/4 v9, 0x1

    .line 89
    const/4 v10, 0x0

    .line 90
    if-eqz v8, :cond_11

    .line 91
    .line 92
    check-cast v6, Ldefpackage/ba1;

    .line 93
    .line 94
    iget-boolean v8, v6, Ldefpackage/cx2;->A:Z

    .line 95
    .line 96
    if-eqz v8, :cond_17

    .line 97
    .line 98
    invoke-virtual {v6}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    iget-boolean v6, v6, Ldefpackage/x91;->a:Z

    .line 103
    .line 104
    if-eqz v6, :cond_17

    .line 105
    .line 106
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Ldefpackage/ey;

    .line 114
    .line 115
    iget-object p2, p2, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, Ldefpackage/ba1;

    .line 118
    .line 119
    iget-boolean p3, p2, Ldefpackage/cx2;->A:Z

    .line 120
    .line 121
    if-nez p3, :cond_3

    .line 122
    .line 123
    goto/16 :goto_9

    .line 124
    .line 125
    :cond_3
    iget-object p3, p2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 126
    .line 127
    iget-boolean p3, p3, Ldefpackage/cx2;->A:Z

    .line 128
    .line 129
    if-nez p3, :cond_4

    .line 130
    .line 131
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    new-instance p3, Ldefpackage/f13;

    .line 135
    .line 136
    new-array v0, v3, [Ldefpackage/cx2;

    .line 137
    .line 138
    invoke-direct {p3, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 142
    .line 143
    iget-object v0, p2, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 144
    .line 145
    if-nez v0, :cond_5

    .line 146
    .line 147
    invoke-static {p3, p2}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-virtual {p3, v0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_3
    iget p2, p3, Ldefpackage/f13;->p:I

    .line 155
    .line 156
    if-eqz p2, :cond_10

    .line 157
    .line 158
    add-int/lit8 p2, p2, -0x1

    .line 159
    .line 160
    invoke-virtual {p3, p2}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, Ldefpackage/cx2;

    .line 165
    .line 166
    iget v0, p2, Ldefpackage/cx2;->q:I

    .line 167
    .line 168
    and-int/lit16 v0, v0, 0x400

    .line 169
    .line 170
    if-eqz v0, :cond_f

    .line 171
    .line 172
    move-object v0, p2

    .line 173
    :goto_4
    if-eqz v0, :cond_f

    .line 174
    .line 175
    iget-boolean v1, v0, Ldefpackage/cx2;->A:Z

    .line 176
    .line 177
    if-eqz v1, :cond_f

    .line 178
    .line 179
    iget v1, v0, Ldefpackage/cx2;->p:I

    .line 180
    .line 181
    and-int/lit16 v1, v1, 0x400

    .line 182
    .line 183
    if-eqz v1, :cond_e

    .line 184
    .line 185
    move-object v1, v0

    .line 186
    move-object v2, v5

    .line 187
    :goto_5
    if-eqz v1, :cond_e

    .line 188
    .line 189
    instance-of v4, v1, Ldefpackage/ba1;

    .line 190
    .line 191
    if-eqz v4, :cond_7

    .line 192
    .line 193
    check-cast v1, Ldefpackage/ba1;

    .line 194
    .line 195
    iget-boolean v4, v1, Ldefpackage/cx2;->A:Z

    .line 196
    .line 197
    if-nez v4, :cond_6

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_6
    invoke-virtual {v1}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    iget-boolean v1, v1, Ldefpackage/cx2;->A:Z

    .line 205
    .line 206
    if-eqz v1, :cond_d

    .line 207
    .line 208
    iget-boolean v1, v4, Ldefpackage/x91;->a:Z

    .line 209
    .line 210
    if-eqz v1, :cond_d

    .line 211
    .line 212
    goto/16 :goto_c

    .line 213
    .line 214
    :cond_7
    iget v4, v1, Ldefpackage/cx2;->p:I

    .line 215
    .line 216
    and-int/lit16 v4, v4, 0x400

    .line 217
    .line 218
    if-eqz v4, :cond_d

    .line 219
    .line 220
    instance-of v4, v1, Ldefpackage/fo0;

    .line 221
    .line 222
    if-eqz v4, :cond_d

    .line 223
    .line 224
    move-object v4, v1

    .line 225
    check-cast v4, Ldefpackage/fo0;

    .line 226
    .line 227
    iget-object v4, v4, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 228
    .line 229
    move v6, v10

    .line 230
    :goto_6
    if-eqz v4, :cond_c

    .line 231
    .line 232
    iget v7, v4, Ldefpackage/cx2;->p:I

    .line 233
    .line 234
    and-int/lit16 v7, v7, 0x400

    .line 235
    .line 236
    if-eqz v7, :cond_b

    .line 237
    .line 238
    add-int/lit8 v6, v6, 0x1

    .line 239
    .line 240
    if-ne v6, v9, :cond_8

    .line 241
    .line 242
    move-object v1, v4

    .line 243
    goto :goto_7

    .line 244
    :cond_8
    if-nez v2, :cond_9

    .line 245
    .line 246
    new-instance v2, Ldefpackage/f13;

    .line 247
    .line 248
    new-array v7, v3, [Ldefpackage/cx2;

    .line 249
    .line 250
    invoke-direct {v2, v7}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_9
    if-eqz v1, :cond_a

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object v1, v5

    .line 259
    :cond_a
    invoke-virtual {v2, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    :goto_7
    iget-object v4, v4, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_c
    if-ne v6, v9, :cond_d

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_d
    :goto_8
    invoke-static {v2}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    goto :goto_5

    .line 273
    :cond_e
    iget-object v0, v0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_f
    invoke-static {p3, p2}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_10
    :goto_9
    if-eqz p1, :cond_1a

    .line 281
    .line 282
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_11
    iget v8, v6, Ldefpackage/cx2;->p:I

    .line 287
    .line 288
    and-int/lit16 v8, v8, 0x400

    .line 289
    .line 290
    if-eqz v8, :cond_17

    .line 291
    .line 292
    instance-of v8, v6, Ldefpackage/fo0;

    .line 293
    .line 294
    if-eqz v8, :cond_17

    .line 295
    .line 296
    move-object v8, v6

    .line 297
    check-cast v8, Ldefpackage/fo0;

    .line 298
    .line 299
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 300
    .line 301
    :goto_a
    if-eqz v8, :cond_16

    .line 302
    .line 303
    iget v11, v8, Ldefpackage/cx2;->p:I

    .line 304
    .line 305
    and-int/lit16 v11, v11, 0x400

    .line 306
    .line 307
    if-eqz v11, :cond_15

    .line 308
    .line 309
    add-int/lit8 v10, v10, 0x1

    .line 310
    .line 311
    if-ne v10, v9, :cond_12

    .line 312
    .line 313
    move-object v6, v8

    .line 314
    goto :goto_b

    .line 315
    :cond_12
    if-nez v7, :cond_13

    .line 316
    .line 317
    new-instance v7, Ldefpackage/f13;

    .line 318
    .line 319
    new-array v11, v3, [Ldefpackage/cx2;

    .line 320
    .line 321
    invoke-direct {v7, v11}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_13
    if-eqz v6, :cond_14

    .line 325
    .line 326
    invoke-virtual {v7, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    move-object v6, v5

    .line 330
    :cond_14
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_15
    :goto_b
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_16
    if-ne v10, v9, :cond_17

    .line 337
    .line 338
    goto/16 :goto_2

    .line 339
    .line 340
    :cond_17
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :cond_18
    iget-object v4, v4, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_19
    invoke-static {v1, v0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_1a
    :goto_c
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Ldefpackage/ra;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 21
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 22
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 23
    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 25
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 10

    .line 1
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {p1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v5}, Ldefpackage/j3;->n(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v0, Ldefpackage/y9;->o:Ldefpackage/l94;

    .line 34
    .line 35
    iget-object v6, v6, Ldefpackage/l94;->c:Ldefpackage/e02;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ldefpackage/c72;

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {v4}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    iget-object v4, v4, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 52
    .line 53
    sget-object v6, Ldefpackage/d94;->g:Ldefpackage/p94;

    .line 54
    .line 55
    invoke-virtual {v4, v6}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const/4 v7, 0x0

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    move-object v6, v7

    .line 63
    :cond_0
    check-cast v6, Ldefpackage/w2;

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    iget-object v6, v6, Ldefpackage/w2;->b:Ldefpackage/sf1;

    .line 68
    .line 69
    check-cast v6, Ldefpackage/if1;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    new-instance v8, Ldefpackage/he;

    .line 74
    .line 75
    invoke-static {v5}, Ldefpackage/tn;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-direct {v8, v9}, Ldefpackage/he;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, v8}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_1
    sget-object v6, Ldefpackage/d94;->h:Ldefpackage/p94;

    .line 93
    .line 94
    invoke-virtual {v4, v6}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-nez v4, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v7, v4

    .line 102
    :goto_1
    check-cast v7, Ldefpackage/w2;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    iget-object v4, v7, Ldefpackage/w2;->b:Ldefpackage/sf1;

    .line 107
    .line 108
    check-cast v4, Ldefpackage/if1;

    .line 109
    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    new-instance v6, Ldefpackage/wb;

    .line 113
    .line 114
    invoke-direct {v6, v5}, Ldefpackage/wb;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v4, v6}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Ljava/lang/Boolean;

    .line 122
    .line 123
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofill()Ldefpackage/x9;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_b

    .line 131
    .line 132
    iget-object p0, p0, Ldefpackage/x9;->b:Ldefpackage/wn;

    .line 133
    .line 134
    iget-object v0, p0, Ldefpackage/wn;->a:Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    :goto_2
    if-ge v1, v0, :cond_b

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v3}, Ldefpackage/j3;->n(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v3}, Ldefpackage/tn;->C(Landroid/view/autofill/AutofillValue;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_7

    .line 166
    .line 167
    invoke-static {v3}, Ldefpackage/tn;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    iget-object v3, p0, Ldefpackage/wn;->a:Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    if-nez v2, :cond_6

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_7
    invoke-static {v3}, Ldefpackage/tn;->D(Landroid/view/autofill/AutofillValue;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    invoke-static {v3}, Ldefpackage/tn;->B(Landroid/view/autofill/AutofillValue;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_9

    .line 202
    .line 203
    invoke-static {v3}, Ldefpackage/tn;->z(Landroid/view/autofill/AutofillValue;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_8

    .line 208
    .line 209
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    new-instance p0, Ldefpackage/p63;

    .line 213
    .line 214
    const-string p1, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 215
    .line 216
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p0

    .line 220
    :cond_9
    new-instance p0, Ldefpackage/p63;

    .line 221
    .line 222
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 223
    .line 224
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p0

    .line 228
    :cond_a
    new-instance p0, Ldefpackage/p63;

    .line 229
    .line 230
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 231
    .line 232
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :cond_b
    :goto_4
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-wide v1, p0, Ldefpackage/ra;->o:J

    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1, v2, v0}, Ldefpackage/ya;->m(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final canScrollVertically(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-wide v1, p0, Ldefpackage/ra;->o:J

    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1, v2, v0}, Ldefpackage/ya;->m(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->N:Ldefpackage/q03;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ldefpackage/ra;->i(Ldefpackage/c72;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v1}, Ldefpackage/ra;->q(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ldefpackage/ch4;->m()V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, Ldefpackage/ra;->P:Z

    .line 28
    .line 29
    const-string v1, "AndroidOwner:draw"

    .line 30
    .line 31
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-direct {p0}, Ldefpackage/ra;->getCanvasHolder()Ldefpackage/nz;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, v1, Ldefpackage/nz;->a:Ldefpackage/aa;

    .line 39
    .line 40
    iget-object v3, v2, Ldefpackage/aa;->a:Landroid/graphics/Canvas;

    .line 41
    .line 42
    iput-object p1, v2, Ldefpackage/aa;->a:Landroid/graphics/Canvas;

    .line 43
    .line 44
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v4, v2, v5}, Ldefpackage/c72;->i(Ldefpackage/jz;Ldefpackage/sj1;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Ldefpackage/nz;->a:Ldefpackage/aa;

    .line 53
    .line 54
    iput-object v3, v1, Ldefpackage/aa;->a:Landroid/graphics/Canvas;

    .line 55
    .line 56
    invoke-virtual {v0}, Ldefpackage/q03;->i()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget v1, v0, Ldefpackage/q03;->b:I

    .line 64
    .line 65
    move v3, v2

    .line 66
    :goto_0
    if-ge v3, v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ldefpackage/tb3;

    .line 73
    .line 74
    check-cast v4, Ldefpackage/vj1;

    .line 75
    .line 76
    invoke-virtual {v4}, Ldefpackage/vj1;->g()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    sget v1, Ldefpackage/u65;->n:I

    .line 83
    .line 84
    invoke-virtual {v0}, Ldefpackage/q03;->d()V

    .line 85
    .line 86
    .line 87
    iput-boolean v2, p0, Ldefpackage/ra;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Ldefpackage/ra;->O:Ldefpackage/q03;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ldefpackage/q03;->b(Ldefpackage/q03;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ldefpackage/q03;->d()V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-static {}, Ldefpackage/ra;->l()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget v0, p0, Ldefpackage/ra;->D0:F

    .line 109
    .line 110
    iget v1, p0, Ldefpackage/ra;->F0:F

    .line 111
    .line 112
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget v0, p0, Ldefpackage/ra;->D0:F

    .line 119
    .line 120
    iput v0, p0, Ldefpackage/ra;->F0:F

    .line 121
    .line 122
    invoke-static {p0, v0}, Ldefpackage/re;->a(Landroid/view/View;F)V

    .line 123
    .line 124
    .line 125
    :cond_3
    iget-object v0, p0, Ldefpackage/ra;->y:Landroid/view/View;

    .line 126
    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    iget v1, p0, Ldefpackage/ra;->E0:F

    .line 130
    .line 131
    iget v2, p0, Ldefpackage/ra;->G0:F

    .line 132
    .line 133
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    iget v1, p0, Ldefpackage/ra;->E0:F

    .line 140
    .line 141
    iput v1, p0, Ldefpackage/ra;->G0:F

    .line 142
    .line 143
    invoke-static {v0, v1}, Ldefpackage/re;->a(Landroid/view/View;F)V

    .line 144
    .line 145
    .line 146
    :cond_4
    iget v1, p0, Ldefpackage/ra;->E0:F

    .line 147
    .line 148
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 162
    .line 163
    .line 164
    :cond_5
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 165
    .line 166
    iput p1, p0, Ldefpackage/ra;->D0:F

    .line 167
    .line 168
    iput p1, p0, Ldefpackage/ra;->E0:F

    .line 169
    .line 170
    :cond_6
    return-void

    .line 171
    :catchall_0
    move-exception p0

    .line 172
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 173
    .line 174
    .line 175
    throw p0
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Ldefpackage/ra;->J0:Z

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, v0, Ldefpackage/ra;->I0:Ldefpackage/ia;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ne v5, v3, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v0, Ldefpackage/ra;->J0:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Ldefpackage/ia;->run()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-static {v1}, Ldefpackage/ra;->m(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_91

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto/16 :goto_58

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v5, "visitAncestors called on an unattached node"

    .line 48
    .line 49
    const/4 v6, -0x1

    .line 50
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-ne v2, v3, :cond_35

    .line 54
    .line 55
    const/high16 v2, 0x400000

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_33

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/16 v3, 0x1a

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    if-lt v11, v3, :cond_3

    .line 83
    .line 84
    sget-object v10, Ldefpackage/n65;->a:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-static {v2}, Ldefpackage/r50;->g(Landroid/view/ViewConfiguration;)F

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {v2, v10}, Ldefpackage/n65;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-lt v11, v3, :cond_4

    .line 98
    .line 99
    invoke-static {v2}, Ldefpackage/r50;->f(Landroid/view/ViewConfiguration;)F

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {v2, v10}, Ldefpackage/n65;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ldefpackage/ey;

    .line 117
    .line 118
    iget-object v3, v2, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v3, Ldefpackage/s91;

    .line 121
    .line 122
    iget-boolean v3, v3, Ldefpackage/s91;->e:Z

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 127
    .line 128
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return v4

    .line 134
    :cond_5
    iget-object v2, v2, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v2, Ldefpackage/ba1;

    .line 137
    .line 138
    invoke-static {v2}, Ldefpackage/te5;->p(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_12

    .line 143
    .line 144
    iget-object v3, v2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 145
    .line 146
    iget-boolean v3, v3, Ldefpackage/cx2;->A:Z

    .line 147
    .line 148
    if-nez v3, :cond_6

    .line 149
    .line 150
    invoke-static {v5}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object v3, v2, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 154
    .line 155
    invoke-static {v2}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :goto_3
    if-eqz v2, :cond_11

    .line 160
    .line 161
    iget-object v10, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 162
    .line 163
    iget-object v10, v10, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v10, Ldefpackage/cx2;

    .line 166
    .line 167
    iget v10, v10, Ldefpackage/cx2;->q:I

    .line 168
    .line 169
    and-int/lit16 v10, v10, 0x4000

    .line 170
    .line 171
    if-eqz v10, :cond_f

    .line 172
    .line 173
    :goto_4
    if-eqz v3, :cond_f

    .line 174
    .line 175
    iget v10, v3, Ldefpackage/cx2;->p:I

    .line 176
    .line 177
    and-int/lit16 v10, v10, 0x4000

    .line 178
    .line 179
    if-eqz v10, :cond_e

    .line 180
    .line 181
    move-object v10, v3

    .line 182
    const/4 v11, 0x0

    .line 183
    :goto_5
    if-eqz v10, :cond_e

    .line 184
    .line 185
    instance-of v12, v10, Ldefpackage/ma;

    .line 186
    .line 187
    if-eqz v12, :cond_7

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_7
    iget v12, v10, Ldefpackage/cx2;->p:I

    .line 191
    .line 192
    and-int/lit16 v12, v12, 0x4000

    .line 193
    .line 194
    if-eqz v12, :cond_d

    .line 195
    .line 196
    instance-of v12, v10, Ldefpackage/fo0;

    .line 197
    .line 198
    if-eqz v12, :cond_d

    .line 199
    .line 200
    move-object v12, v10

    .line 201
    check-cast v12, Ldefpackage/fo0;

    .line 202
    .line 203
    iget-object v12, v12, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 204
    .line 205
    move v13, v4

    .line 206
    :goto_6
    if-eqz v12, :cond_c

    .line 207
    .line 208
    iget v14, v12, Ldefpackage/cx2;->p:I

    .line 209
    .line 210
    and-int/lit16 v14, v14, 0x4000

    .line 211
    .line 212
    if-eqz v14, :cond_b

    .line 213
    .line 214
    add-int/lit8 v13, v13, 0x1

    .line 215
    .line 216
    if-ne v13, v9, :cond_8

    .line 217
    .line 218
    move-object v10, v12

    .line 219
    goto :goto_7

    .line 220
    :cond_8
    if-nez v11, :cond_9

    .line 221
    .line 222
    new-instance v11, Ldefpackage/f13;

    .line 223
    .line 224
    new-array v14, v8, [Ldefpackage/cx2;

    .line 225
    .line 226
    invoke-direct {v11, v14}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_9
    if-eqz v10, :cond_a

    .line 230
    .line 231
    invoke-virtual {v11, v10}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    const/4 v10, 0x0

    .line 235
    :cond_a
    invoke-virtual {v11, v12}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_b
    :goto_7
    iget-object v12, v12, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_c
    if-ne v13, v9, :cond_d

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_d
    invoke-static {v11}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    goto :goto_5

    .line 249
    :cond_e
    iget-object v3, v3, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_f
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-eqz v2, :cond_10

    .line 257
    .line 258
    iget-object v3, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 259
    .line 260
    if-eqz v3, :cond_10

    .line 261
    .line 262
    iget-object v3, v3, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v3, Ldefpackage/sq4;

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_10
    const/4 v3, 0x0

    .line 268
    goto :goto_3

    .line 269
    :cond_11
    const/4 v10, 0x0

    .line 270
    :goto_8
    check-cast v10, Ldefpackage/ma;

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_12
    const/4 v10, 0x0

    .line 274
    :goto_9
    if-eqz v10, :cond_34

    .line 275
    .line 276
    iget-object v2, v10, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 277
    .line 278
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 279
    .line 280
    if-nez v2, :cond_13

    .line 281
    .line 282
    invoke-static {v5}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_13
    iget-object v2, v10, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 286
    .line 287
    iget-object v2, v2, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 288
    .line 289
    invoke-static {v10}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const/4 v5, 0x0

    .line 294
    :goto_a
    if-eqz v3, :cond_1f

    .line 295
    .line 296
    iget-object v11, v3, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 297
    .line 298
    iget-object v11, v11, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v11, Ldefpackage/cx2;

    .line 301
    .line 302
    iget v11, v11, Ldefpackage/cx2;->q:I

    .line 303
    .line 304
    and-int/lit16 v11, v11, 0x4000

    .line 305
    .line 306
    if-eqz v11, :cond_1d

    .line 307
    .line 308
    :goto_b
    if-eqz v2, :cond_1d

    .line 309
    .line 310
    iget v11, v2, Ldefpackage/cx2;->p:I

    .line 311
    .line 312
    and-int/lit16 v11, v11, 0x4000

    .line 313
    .line 314
    if-eqz v11, :cond_1c

    .line 315
    .line 316
    move-object v11, v2

    .line 317
    const/4 v12, 0x0

    .line 318
    :goto_c
    if-eqz v11, :cond_1c

    .line 319
    .line 320
    instance-of v13, v11, Ldefpackage/ma;

    .line 321
    .line 322
    if-eqz v13, :cond_15

    .line 323
    .line 324
    if-nez v5, :cond_14

    .line 325
    .line 326
    new-instance v5, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 329
    .line 330
    .line 331
    :cond_14
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move v13, v4

    .line 335
    goto :goto_d

    .line 336
    :cond_15
    move v13, v9

    .line 337
    :goto_d
    if-eqz v13, :cond_1b

    .line 338
    .line 339
    iget v13, v11, Ldefpackage/cx2;->p:I

    .line 340
    .line 341
    and-int/lit16 v13, v13, 0x4000

    .line 342
    .line 343
    if-eqz v13, :cond_1b

    .line 344
    .line 345
    instance-of v13, v11, Ldefpackage/fo0;

    .line 346
    .line 347
    if-eqz v13, :cond_1b

    .line 348
    .line 349
    move-object v13, v11

    .line 350
    check-cast v13, Ldefpackage/fo0;

    .line 351
    .line 352
    iget-object v13, v13, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 353
    .line 354
    move v14, v4

    .line 355
    :goto_e
    if-eqz v13, :cond_1a

    .line 356
    .line 357
    iget v15, v13, Ldefpackage/cx2;->p:I

    .line 358
    .line 359
    and-int/lit16 v15, v15, 0x4000

    .line 360
    .line 361
    if-eqz v15, :cond_19

    .line 362
    .line 363
    add-int/lit8 v14, v14, 0x1

    .line 364
    .line 365
    if-ne v14, v9, :cond_16

    .line 366
    .line 367
    move-object v11, v13

    .line 368
    goto :goto_f

    .line 369
    :cond_16
    if-nez v12, :cond_17

    .line 370
    .line 371
    new-instance v12, Ldefpackage/f13;

    .line 372
    .line 373
    new-array v15, v8, [Ldefpackage/cx2;

    .line 374
    .line 375
    invoke-direct {v12, v15}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_17
    if-eqz v11, :cond_18

    .line 379
    .line 380
    invoke-virtual {v12, v11}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    const/4 v11, 0x0

    .line 384
    :cond_18
    invoke-virtual {v12, v13}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_19
    :goto_f
    iget-object v13, v13, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 388
    .line 389
    goto :goto_e

    .line 390
    :cond_1a
    if-ne v14, v9, :cond_1b

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_1b
    invoke-static {v12}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    goto :goto_c

    .line 398
    :cond_1c
    iget-object v2, v2, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_1d
    invoke-virtual {v3}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    if-eqz v3, :cond_1e

    .line 406
    .line 407
    iget-object v2, v3, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 408
    .line 409
    if-eqz v2, :cond_1e

    .line 410
    .line 411
    iget-object v2, v2, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v2, Ldefpackage/sq4;

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_1e
    const/4 v2, 0x0

    .line 417
    goto :goto_a

    .line 418
    :cond_1f
    if-eqz v5, :cond_21

    .line 419
    .line 420
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    add-int/2addr v2, v6

    .line 425
    if-ltz v2, :cond_21

    .line 426
    .line 427
    :goto_10
    add-int/lit8 v3, v2, -0x1

    .line 428
    .line 429
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v2, Ldefpackage/ma;

    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    if-gez v3, :cond_20

    .line 439
    .line 440
    goto :goto_11

    .line 441
    :cond_20
    move v2, v3

    .line 442
    goto :goto_10

    .line 443
    :cond_21
    :goto_11
    iget-object v2, v10, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 444
    .line 445
    const/4 v3, 0x0

    .line 446
    :goto_12
    if-eqz v2, :cond_29

    .line 447
    .line 448
    instance-of v6, v2, Ldefpackage/ma;

    .line 449
    .line 450
    if-eqz v6, :cond_22

    .line 451
    .line 452
    goto :goto_15

    .line 453
    :cond_22
    iget v6, v2, Ldefpackage/cx2;->p:I

    .line 454
    .line 455
    and-int/lit16 v6, v6, 0x4000

    .line 456
    .line 457
    if-eqz v6, :cond_28

    .line 458
    .line 459
    instance-of v6, v2, Ldefpackage/fo0;

    .line 460
    .line 461
    if-eqz v6, :cond_28

    .line 462
    .line 463
    move-object v6, v2

    .line 464
    check-cast v6, Ldefpackage/fo0;

    .line 465
    .line 466
    iget-object v6, v6, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 467
    .line 468
    move v11, v4

    .line 469
    :goto_13
    if-eqz v6, :cond_27

    .line 470
    .line 471
    iget v12, v6, Ldefpackage/cx2;->p:I

    .line 472
    .line 473
    and-int/lit16 v12, v12, 0x4000

    .line 474
    .line 475
    if-eqz v12, :cond_26

    .line 476
    .line 477
    add-int/lit8 v11, v11, 0x1

    .line 478
    .line 479
    if-ne v11, v9, :cond_23

    .line 480
    .line 481
    move-object v2, v6

    .line 482
    goto :goto_14

    .line 483
    :cond_23
    if-nez v3, :cond_24

    .line 484
    .line 485
    new-instance v3, Ldefpackage/f13;

    .line 486
    .line 487
    new-array v12, v8, [Ldefpackage/cx2;

    .line 488
    .line 489
    invoke-direct {v3, v12}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    :cond_24
    if-eqz v2, :cond_25

    .line 493
    .line 494
    invoke-virtual {v3, v2}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    const/4 v2, 0x0

    .line 498
    :cond_25
    invoke-virtual {v3, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :cond_26
    :goto_14
    iget-object v6, v6, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 502
    .line 503
    goto :goto_13

    .line 504
    :cond_27
    if-ne v11, v9, :cond_28

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_28
    :goto_15
    invoke-static {v3}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    goto :goto_12

    .line 512
    :cond_29
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_2a

    .line 517
    .line 518
    goto/16 :goto_1b

    .line 519
    .line 520
    :cond_2a
    iget-object v0, v10, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 521
    .line 522
    const/4 v1, 0x0

    .line 523
    :goto_16
    if-eqz v0, :cond_32

    .line 524
    .line 525
    instance-of v2, v0, Ldefpackage/ma;

    .line 526
    .line 527
    if-eqz v2, :cond_2b

    .line 528
    .line 529
    goto :goto_19

    .line 530
    :cond_2b
    iget v2, v0, Ldefpackage/cx2;->p:I

    .line 531
    .line 532
    and-int/lit16 v2, v2, 0x4000

    .line 533
    .line 534
    if-eqz v2, :cond_31

    .line 535
    .line 536
    instance-of v2, v0, Ldefpackage/fo0;

    .line 537
    .line 538
    if-eqz v2, :cond_31

    .line 539
    .line 540
    move-object v2, v0

    .line 541
    check-cast v2, Ldefpackage/fo0;

    .line 542
    .line 543
    iget-object v2, v2, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 544
    .line 545
    move v3, v4

    .line 546
    :goto_17
    if-eqz v2, :cond_30

    .line 547
    .line 548
    iget v6, v2, Ldefpackage/cx2;->p:I

    .line 549
    .line 550
    and-int/lit16 v6, v6, 0x4000

    .line 551
    .line 552
    if-eqz v6, :cond_2f

    .line 553
    .line 554
    add-int/lit8 v3, v3, 0x1

    .line 555
    .line 556
    if-ne v3, v9, :cond_2c

    .line 557
    .line 558
    move-object v0, v2

    .line 559
    goto :goto_18

    .line 560
    :cond_2c
    if-nez v1, :cond_2d

    .line 561
    .line 562
    new-instance v1, Ldefpackage/f13;

    .line 563
    .line 564
    new-array v6, v8, [Ldefpackage/cx2;

    .line 565
    .line 566
    invoke-direct {v1, v6}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_2d
    if-eqz v0, :cond_2e

    .line 570
    .line 571
    invoke-virtual {v1, v0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    const/4 v0, 0x0

    .line 575
    :cond_2e
    invoke-virtual {v1, v2}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    :cond_2f
    :goto_18
    iget-object v2, v2, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 579
    .line 580
    goto :goto_17

    .line 581
    :cond_30
    if-ne v3, v9, :cond_31

    .line 582
    .line 583
    goto :goto_16

    .line 584
    :cond_31
    :goto_19
    invoke-static {v1}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    goto :goto_16

    .line 589
    :cond_32
    if-eqz v5, :cond_34

    .line 590
    .line 591
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    move v1, v4

    .line 596
    :goto_1a
    if-ge v1, v0, :cond_34

    .line 597
    .line 598
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    check-cast v2, Ldefpackage/ma;

    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    add-int/lit8 v1, v1, 0x1

    .line 608
    .line 609
    goto :goto_1a

    .line 610
    :cond_33
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->h(Landroid/view/MotionEvent;)I

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    and-int/lit8 v0, v0, 0x4

    .line 615
    .line 616
    if-eqz v0, :cond_34

    .line 617
    .line 618
    :goto_1b
    return v9

    .line 619
    :cond_34
    return v4

    .line 620
    :cond_35
    const/high16 v2, 0x200000

    .line 621
    .line 622
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    if-eqz v3, :cond_90

    .line 627
    .line 628
    iget-object v3, v0, Ldefpackage/ra;->q:Ldefpackage/dy1;

    .line 629
    .line 630
    iget-object v10, v0, Ldefpackage/ra;->Q:Ldefpackage/tx2;

    .line 631
    .line 632
    iget-object v11, v10, Ldefpackage/tx2;->e:Ldefpackage/xe2;

    .line 633
    .line 634
    iget-object v12, v10, Ldefpackage/tx2;->b:Landroid/util/SparseLongArray;

    .line 635
    .line 636
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 637
    .line 638
    .line 639
    move-result v13

    .line 640
    invoke-virtual {v10, v1}, Ldefpackage/tx2;->b(Landroid/view/MotionEvent;)V

    .line 641
    .line 642
    .line 643
    const/4 v14, 0x3

    .line 644
    const/4 v15, 0x2

    .line 645
    if-ne v13, v14, :cond_36

    .line 646
    .line 647
    invoke-virtual {v12}, Landroid/util/SparseLongArray;->clear()V

    .line 648
    .line 649
    .line 650
    iget-object v1, v10, Ldefpackage/tx2;->c:Landroid/util/SparseBooleanArray;

    .line 651
    .line 652
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 653
    .line 654
    .line 655
    move-object/from16 v22, v5

    .line 656
    .line 657
    move/from16 v16, v6

    .line 658
    .line 659
    move/from16 v18, v8

    .line 660
    .line 661
    const/4 v3, 0x0

    .line 662
    goto/16 :goto_2f

    .line 663
    .line 664
    :cond_36
    invoke-virtual {v10, v1}, Ldefpackage/tx2;->a(Landroid/view/MotionEvent;)V

    .line 665
    .line 666
    .line 667
    const/4 v14, 0x6

    .line 668
    if-eq v13, v9, :cond_38

    .line 669
    .line 670
    if-eq v13, v14, :cond_37

    .line 671
    .line 672
    move/from16 v16, v6

    .line 673
    .line 674
    goto :goto_1c

    .line 675
    :cond_37
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 676
    .line 677
    .line 678
    move-result v16

    .line 679
    move/from16 v40, v16

    .line 680
    .line 681
    move/from16 v16, v6

    .line 682
    .line 683
    move/from16 v6, v40

    .line 684
    .line 685
    goto :goto_1c

    .line 686
    :cond_38
    move/from16 v16, v6

    .line 687
    .line 688
    move v6, v4

    .line 689
    :goto_1c
    const/4 v7, 0x5

    .line 690
    if-eqz v13, :cond_39

    .line 691
    .line 692
    if-eq v13, v15, :cond_39

    .line 693
    .line 694
    if-eq v13, v7, :cond_39

    .line 695
    .line 696
    move/from16 v17, v4

    .line 697
    .line 698
    :goto_1d
    move/from16 v18, v8

    .line 699
    .line 700
    goto :goto_1e

    .line 701
    :cond_39
    move/from16 v17, v9

    .line 702
    .line 703
    goto :goto_1d

    .line 704
    :goto_1e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 705
    .line 706
    .line 707
    move-result v8

    .line 708
    new-instance v14, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 711
    .line 712
    .line 713
    move v7, v4

    .line 714
    :goto_1f
    if-ge v7, v8, :cond_42

    .line 715
    .line 716
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 717
    .line 718
    .line 719
    move-result v15

    .line 720
    move/from16 v19, v9

    .line 721
    .line 722
    invoke-virtual {v12, v15}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 723
    .line 724
    .line 725
    move-result v9

    .line 726
    const-wide/16 v20, 0x1

    .line 727
    .line 728
    if-ltz v9, :cond_3a

    .line 729
    .line 730
    invoke-virtual {v12, v9}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 731
    .line 732
    .line 733
    move-result-wide v22

    .line 734
    move-wide/from16 v40, v22

    .line 735
    .line 736
    move-object/from16 v22, v5

    .line 737
    .line 738
    move-wide/from16 v4, v40

    .line 739
    .line 740
    move-object/from16 v24, v3

    .line 741
    .line 742
    goto :goto_20

    .line 743
    :cond_3a
    move-object/from16 v22, v5

    .line 744
    .line 745
    iget-wide v4, v10, Ldefpackage/tx2;->a:J

    .line 746
    .line 747
    move-object/from16 v24, v3

    .line 748
    .line 749
    add-long v2, v4, v20

    .line 750
    .line 751
    iput-wide v2, v10, Ldefpackage/tx2;->a:J

    .line 752
    .line 753
    invoke-virtual {v12, v15, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 754
    .line 755
    .line 756
    :goto_20
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    move-object v15, v10

    .line 769
    int-to-long v9, v2

    .line 770
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    int-to-long v2, v2

    .line 775
    const/16 v25, 0x20

    .line 776
    .line 777
    shl-long v9, v9, v25

    .line 778
    .line 779
    const-wide v26, 0xffffffffL

    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    and-long v2, v2, v26

    .line 785
    .line 786
    or-long v30, v9, v2

    .line 787
    .line 788
    if-eq v7, v6, :cond_3b

    .line 789
    .line 790
    move/from16 v32, v19

    .line 791
    .line 792
    goto :goto_21

    .line 793
    :cond_3b
    const/16 v32, 0x0

    .line 794
    .line 795
    :goto_21
    invoke-virtual {v11, v4, v5}, Ldefpackage/xe2;->b(J)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    check-cast v2, Ldefpackage/sx2;

    .line 800
    .line 801
    const-wide/32 v9, 0x7fffffff

    .line 802
    .line 803
    .line 804
    if-ne v7, v6, :cond_3c

    .line 805
    .line 806
    invoke-virtual {v11, v4, v5}, Ldefpackage/xe2;->g(J)V

    .line 807
    .line 808
    .line 809
    move-wide v3, v4

    .line 810
    move-wide/from16 v33, v9

    .line 811
    .line 812
    move/from16 v9, v25

    .line 813
    .line 814
    const v5, 0xffff

    .line 815
    .line 816
    .line 817
    goto :goto_23

    .line 818
    :cond_3c
    if-eqz v17, :cond_3d

    .line 819
    .line 820
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 821
    .line 822
    .line 823
    move-result-wide v28

    .line 824
    and-long v28, v28, v9

    .line 825
    .line 826
    shl-long v28, v28, v19

    .line 827
    .line 828
    or-long v28, v20, v28

    .line 829
    .line 830
    move-wide/from16 v33, v9

    .line 831
    .line 832
    shr-long v9, v30, v25

    .line 833
    .line 834
    long-to-int v9, v9

    .line 835
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 836
    .line 837
    .line 838
    move-result v9

    .line 839
    float-to-int v9, v9

    .line 840
    int-to-short v9, v9

    .line 841
    move-wide/from16 v35, v4

    .line 842
    .line 843
    const v5, 0xffff

    .line 844
    .line 845
    .line 846
    and-long v3, v30, v26

    .line 847
    .line 848
    long-to-int v3, v3

    .line 849
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    float-to-int v3, v3

    .line 854
    int-to-short v3, v3

    .line 855
    shl-int/lit8 v4, v9, 0x10

    .line 856
    .line 857
    and-int/2addr v3, v5

    .line 858
    or-int/2addr v3, v4

    .line 859
    int-to-long v3, v3

    .line 860
    shl-long v3, v3, v25

    .line 861
    .line 862
    or-long v3, v28, v3

    .line 863
    .line 864
    new-instance v9, Ldefpackage/sx2;

    .line 865
    .line 866
    invoke-direct {v9, v3, v4}, Ldefpackage/sx2;-><init>(J)V

    .line 867
    .line 868
    .line 869
    move-wide/from16 v3, v35

    .line 870
    .line 871
    invoke-virtual {v11, v3, v4, v9}, Ldefpackage/xe2;->f(JLjava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    :goto_22
    move/from16 v9, v25

    .line 875
    .line 876
    goto :goto_23

    .line 877
    :cond_3d
    move-wide v3, v4

    .line 878
    move-wide/from16 v33, v9

    .line 879
    .line 880
    const v5, 0xffff

    .line 881
    .line 882
    .line 883
    goto :goto_22

    .line 884
    :goto_23
    new-instance v25, Ldefpackage/ey1;

    .line 885
    .line 886
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 887
    .line 888
    .line 889
    move-result-wide v28

    .line 890
    move-wide/from16 v34, v33

    .line 891
    .line 892
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 893
    .line 894
    .line 895
    move-result v33

    .line 896
    move/from16 v36, v5

    .line 897
    .line 898
    move v10, v6

    .line 899
    if-eqz v2, :cond_3e

    .line 900
    .line 901
    iget-wide v5, v2, Ldefpackage/sx2;->a:J

    .line 902
    .line 903
    shr-long v5, v5, v19

    .line 904
    .line 905
    and-long v5, v5, v34

    .line 906
    .line 907
    :goto_24
    move-wide/from16 v34, v5

    .line 908
    .line 909
    goto :goto_25

    .line 910
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 911
    .line 912
    .line 913
    move-result-wide v5

    .line 914
    goto :goto_24

    .line 915
    :goto_25
    if-eqz v2, :cond_3f

    .line 916
    .line 917
    iget-wide v5, v2, Ldefpackage/sx2;->a:J

    .line 918
    .line 919
    ushr-long/2addr v5, v9

    .line 920
    long-to-int v5, v5

    .line 921
    ushr-int/lit8 v6, v5, 0x10

    .line 922
    .line 923
    int-to-short v6, v6

    .line 924
    int-to-float v6, v6

    .line 925
    and-int v5, v5, v36

    .line 926
    .line 927
    int-to-short v5, v5

    .line 928
    int-to-float v5, v5

    .line 929
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 930
    .line 931
    .line 932
    move-result v6

    .line 933
    move/from16 v36, v9

    .line 934
    .line 935
    move/from16 v39, v10

    .line 936
    .line 937
    int-to-long v9, v6

    .line 938
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 939
    .line 940
    .line 941
    move-result v5

    .line 942
    int-to-long v5, v5

    .line 943
    shl-long v9, v9, v36

    .line 944
    .line 945
    and-long v5, v5, v26

    .line 946
    .line 947
    or-long/2addr v5, v9

    .line 948
    move-wide/from16 v36, v5

    .line 949
    .line 950
    goto :goto_26

    .line 951
    :cond_3f
    move/from16 v39, v10

    .line 952
    .line 953
    move-wide/from16 v36, v30

    .line 954
    .line 955
    :goto_26
    if-eqz v2, :cond_41

    .line 956
    .line 957
    iget-wide v5, v2, Ldefpackage/sx2;->a:J

    .line 958
    .line 959
    and-long v5, v5, v20

    .line 960
    .line 961
    const-wide/16 v9, 0x0

    .line 962
    .line 963
    cmp-long v2, v5, v9

    .line 964
    .line 965
    if-eqz v2, :cond_40

    .line 966
    .line 967
    move/from16 v2, v19

    .line 968
    .line 969
    goto :goto_27

    .line 970
    :cond_40
    const/4 v2, 0x0

    .line 971
    :goto_27
    move/from16 v38, v2

    .line 972
    .line 973
    :goto_28
    move-wide/from16 v26, v3

    .line 974
    .line 975
    goto :goto_29

    .line 976
    :cond_41
    const/16 v38, 0x0

    .line 977
    .line 978
    goto :goto_28

    .line 979
    :goto_29
    invoke-direct/range {v25 .. v38}, Ldefpackage/ey1;-><init>(JJJZFJJZ)V

    .line 980
    .line 981
    .line 982
    move-object/from16 v2, v25

    .line 983
    .line 984
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    add-int/lit8 v7, v7, 0x1

    .line 988
    .line 989
    move-object v10, v15

    .line 990
    move/from16 v9, v19

    .line 991
    .line 992
    move-object/from16 v5, v22

    .line 993
    .line 994
    move-object/from16 v3, v24

    .line 995
    .line 996
    move/from16 v6, v39

    .line 997
    .line 998
    const/high16 v2, 0x200000

    .line 999
    .line 1000
    const/4 v4, 0x0

    .line 1001
    const/4 v15, 0x2

    .line 1002
    goto/16 :goto_1f

    .line 1003
    .line 1004
    :cond_42
    move-object/from16 v24, v3

    .line 1005
    .line 1006
    move-object/from16 v22, v5

    .line 1007
    .line 1008
    move/from16 v19, v9

    .line 1009
    .line 1010
    move-object v15, v10

    .line 1011
    invoke-virtual {v15, v1}, Ldefpackage/tx2;->e(Landroid/view/MotionEvent;)V

    .line 1012
    .line 1013
    .line 1014
    if-eqz v24, :cond_43

    .line 1015
    .line 1016
    move-object/from16 v2, v24

    .line 1017
    .line 1018
    iget v2, v2, Ldefpackage/dy1;->a:I

    .line 1019
    .line 1020
    goto :goto_2e

    .line 1021
    :cond_43
    const/high16 v2, 0x200000

    .line 1022
    .line 1023
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    if-eqz v3, :cond_8f

    .line 1028
    .line 1029
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    if-eqz v2, :cond_49

    .line 1034
    .line 1035
    const/4 v9, 0x0

    .line 1036
    invoke-virtual {v2, v9}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    move/from16 v4, v19

    .line 1041
    .line 1042
    invoke-virtual {v2, v4}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    if-eqz v3, :cond_44

    .line 1047
    .line 1048
    if-nez v2, :cond_44

    .line 1049
    .line 1050
    :goto_2a
    const/4 v2, 0x1

    .line 1051
    goto :goto_2e

    .line 1052
    :cond_44
    if-eqz v2, :cond_45

    .line 1053
    .line 1054
    if-nez v3, :cond_45

    .line 1055
    .line 1056
    :goto_2b
    const/4 v2, 0x2

    .line 1057
    goto :goto_2e

    .line 1058
    :cond_45
    if-eqz v3, :cond_49

    .line 1059
    .line 1060
    if-eqz v2, :cond_49

    .line 1061
    .line 1062
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1063
    .line 1064
    .line 1065
    move-result v3

    .line 1066
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    cmpl-float v4, v3, v2

    .line 1071
    .line 1072
    const/high16 v5, 0x40a00000    # 5.0f

    .line 1073
    .line 1074
    const/4 v6, 0x0

    .line 1075
    if-lez v4, :cond_47

    .line 1076
    .line 1077
    cmpg-float v4, v2, v6

    .line 1078
    .line 1079
    if-nez v4, :cond_46

    .line 1080
    .line 1081
    goto :goto_2c

    .line 1082
    :cond_46
    div-float v4, v3, v2

    .line 1083
    .line 1084
    cmpl-float v4, v4, v5

    .line 1085
    .line 1086
    if-ltz v4, :cond_47

    .line 1087
    .line 1088
    :goto_2c
    goto :goto_2a

    .line 1089
    :cond_47
    cmpl-float v4, v2, v3

    .line 1090
    .line 1091
    if-lez v4, :cond_49

    .line 1092
    .line 1093
    cmpg-float v4, v3, v6

    .line 1094
    .line 1095
    if-nez v4, :cond_48

    .line 1096
    .line 1097
    goto :goto_2d

    .line 1098
    :cond_48
    div-float/2addr v2, v3

    .line 1099
    cmpl-float v2, v2, v5

    .line 1100
    .line 1101
    if-ltz v2, :cond_49

    .line 1102
    .line 1103
    :goto_2d
    goto :goto_2b

    .line 1104
    :cond_49
    const/4 v2, 0x0

    .line 1105
    :goto_2e
    new-instance v3, Ldefpackage/ue1;

    .line 1106
    .line 1107
    if-eqz v13, :cond_4a

    .line 1108
    .line 1109
    const/4 v4, 0x1

    .line 1110
    if-eq v13, v4, :cond_4a

    .line 1111
    .line 1112
    const/4 v4, 0x2

    .line 1113
    if-eq v13, v4, :cond_4a

    .line 1114
    .line 1115
    const/4 v4, 0x5

    .line 1116
    if-eq v13, v4, :cond_4a

    .line 1117
    .line 1118
    const/4 v4, 0x6

    .line 1119
    :cond_4a
    invoke-direct {v3, v14, v2, v1}, Ldefpackage/ue1;-><init>(Ljava/util/ArrayList;ILandroid/view/MotionEvent;)V

    .line 1120
    .line 1121
    .line 1122
    :goto_2f
    iget-object v1, v0, Ldefpackage/ra;->L0:Ldefpackage/bk;

    .line 1123
    .line 1124
    if-eqz v3, :cond_71

    .line 1125
    .line 1126
    invoke-virtual {v0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    check-cast v0, Ldefpackage/ey;

    .line 1131
    .line 1132
    iget-object v2, v0, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v2, Ldefpackage/s91;

    .line 1135
    .line 1136
    iget-boolean v2, v2, Ldefpackage/s91;->e:Z

    .line 1137
    .line 1138
    if-eqz v2, :cond_4c

    .line 1139
    .line 1140
    const-string v0, "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."

    .line 1141
    .line 1142
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 1143
    .line 1144
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    :cond_4b
    const/4 v0, 0x0

    .line 1148
    goto/16 :goto_45

    .line 1149
    .line 1150
    :cond_4c
    invoke-virtual {v0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    if-eqz v0, :cond_59

    .line 1155
    .line 1156
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1157
    .line 1158
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 1159
    .line 1160
    if-nez v2, :cond_4d

    .line 1161
    .line 1162
    invoke-static/range {v22 .. v22}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    :cond_4d
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1166
    .line 1167
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    :goto_30
    if-eqz v0, :cond_58

    .line 1172
    .line 1173
    iget-object v4, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1174
    .line 1175
    iget-object v4, v4, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 1176
    .line 1177
    check-cast v4, Ldefpackage/cx2;

    .line 1178
    .line 1179
    iget v4, v4, Ldefpackage/cx2;->q:I

    .line 1180
    .line 1181
    const/high16 v23, 0x200000

    .line 1182
    .line 1183
    and-int v4, v4, v23

    .line 1184
    .line 1185
    if-eqz v4, :cond_56

    .line 1186
    .line 1187
    :goto_31
    if-eqz v2, :cond_56

    .line 1188
    .line 1189
    iget v4, v2, Ldefpackage/cx2;->p:I

    .line 1190
    .line 1191
    and-int v4, v4, v23

    .line 1192
    .line 1193
    if-eqz v4, :cond_55

    .line 1194
    .line 1195
    move-object v4, v2

    .line 1196
    const/4 v5, 0x0

    .line 1197
    :goto_32
    if-eqz v4, :cond_55

    .line 1198
    .line 1199
    instance-of v6, v4, Ldefpackage/my1;

    .line 1200
    .line 1201
    if-eqz v6, :cond_4e

    .line 1202
    .line 1203
    goto/16 :goto_37

    .line 1204
    .line 1205
    :cond_4e
    iget v6, v4, Ldefpackage/cx2;->p:I

    .line 1206
    .line 1207
    and-int v6, v6, v23

    .line 1208
    .line 1209
    if-eqz v6, :cond_54

    .line 1210
    .line 1211
    instance-of v6, v4, Ldefpackage/fo0;

    .line 1212
    .line 1213
    if-eqz v6, :cond_54

    .line 1214
    .line 1215
    move-object v6, v4

    .line 1216
    check-cast v6, Ldefpackage/fo0;

    .line 1217
    .line 1218
    iget-object v6, v6, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 1219
    .line 1220
    const/4 v7, 0x0

    .line 1221
    :goto_33
    if-eqz v6, :cond_53

    .line 1222
    .line 1223
    iget v8, v6, Ldefpackage/cx2;->p:I

    .line 1224
    .line 1225
    and-int v8, v8, v23

    .line 1226
    .line 1227
    if-eqz v8, :cond_52

    .line 1228
    .line 1229
    add-int/lit8 v7, v7, 0x1

    .line 1230
    .line 1231
    const/4 v8, 0x1

    .line 1232
    if-ne v7, v8, :cond_4f

    .line 1233
    .line 1234
    move-object v4, v6

    .line 1235
    goto :goto_34

    .line 1236
    :cond_4f
    if-nez v5, :cond_50

    .line 1237
    .line 1238
    new-instance v5, Ldefpackage/f13;

    .line 1239
    .line 1240
    move/from16 v8, v18

    .line 1241
    .line 1242
    new-array v10, v8, [Ldefpackage/cx2;

    .line 1243
    .line 1244
    invoke-direct {v5, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    :cond_50
    if-eqz v4, :cond_51

    .line 1248
    .line 1249
    invoke-virtual {v5, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1250
    .line 1251
    .line 1252
    const/4 v4, 0x0

    .line 1253
    :cond_51
    invoke-virtual {v5, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1254
    .line 1255
    .line 1256
    :cond_52
    :goto_34
    iget-object v6, v6, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 1257
    .line 1258
    const/16 v18, 0x10

    .line 1259
    .line 1260
    const/high16 v23, 0x200000

    .line 1261
    .line 1262
    goto :goto_33

    .line 1263
    :cond_53
    const/4 v8, 0x1

    .line 1264
    if-ne v7, v8, :cond_54

    .line 1265
    .line 1266
    :goto_35
    const/16 v18, 0x10

    .line 1267
    .line 1268
    const/high16 v23, 0x200000

    .line 1269
    .line 1270
    goto :goto_32

    .line 1271
    :cond_54
    invoke-static {v5}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    goto :goto_35

    .line 1276
    :cond_55
    iget-object v2, v2, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1277
    .line 1278
    const/16 v18, 0x10

    .line 1279
    .line 1280
    const/high16 v23, 0x200000

    .line 1281
    .line 1282
    goto :goto_31

    .line 1283
    :cond_56
    invoke-virtual {v0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    if-eqz v0, :cond_57

    .line 1288
    .line 1289
    iget-object v2, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1290
    .line 1291
    if-eqz v2, :cond_57

    .line 1292
    .line 1293
    iget-object v2, v2, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v2, Ldefpackage/sq4;

    .line 1296
    .line 1297
    goto :goto_36

    .line 1298
    :cond_57
    const/4 v2, 0x0

    .line 1299
    :goto_36
    const/16 v18, 0x10

    .line 1300
    .line 1301
    goto/16 :goto_30

    .line 1302
    .line 1303
    :cond_58
    const/4 v4, 0x0

    .line 1304
    :goto_37
    check-cast v4, Ldefpackage/my1;

    .line 1305
    .line 1306
    goto :goto_38

    .line 1307
    :cond_59
    const/4 v4, 0x0

    .line 1308
    :goto_38
    if-eqz v4, :cond_6c

    .line 1309
    .line 1310
    move-object v0, v4

    .line 1311
    check-cast v0, Ldefpackage/cx2;

    .line 1312
    .line 1313
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1314
    .line 1315
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 1316
    .line 1317
    if-nez v2, :cond_5a

    .line 1318
    .line 1319
    invoke-static/range {v22 .. v22}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    :cond_5a
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1323
    .line 1324
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1325
    .line 1326
    invoke-static {v4}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    const/4 v5, 0x0

    .line 1331
    :goto_39
    if-eqz v2, :cond_66

    .line 1332
    .line 1333
    iget-object v6, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1334
    .line 1335
    iget-object v6, v6, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 1336
    .line 1337
    check-cast v6, Ldefpackage/cx2;

    .line 1338
    .line 1339
    iget v6, v6, Ldefpackage/cx2;->q:I

    .line 1340
    .line 1341
    const/high16 v23, 0x200000

    .line 1342
    .line 1343
    and-int v6, v6, v23

    .line 1344
    .line 1345
    if-eqz v6, :cond_64

    .line 1346
    .line 1347
    :goto_3a
    if-eqz v0, :cond_64

    .line 1348
    .line 1349
    iget v6, v0, Ldefpackage/cx2;->p:I

    .line 1350
    .line 1351
    and-int v6, v6, v23

    .line 1352
    .line 1353
    if-eqz v6, :cond_63

    .line 1354
    .line 1355
    move-object v6, v0

    .line 1356
    const/4 v7, 0x0

    .line 1357
    :goto_3b
    if-eqz v6, :cond_63

    .line 1358
    .line 1359
    instance-of v8, v6, Ldefpackage/my1;

    .line 1360
    .line 1361
    if-eqz v8, :cond_5c

    .line 1362
    .line 1363
    if-nez v5, :cond_5b

    .line 1364
    .line 1365
    new-instance v5, Ljava/util/ArrayList;

    .line 1366
    .line 1367
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1368
    .line 1369
    .line 1370
    :cond_5b
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    const/4 v8, 0x0

    .line 1374
    goto :goto_3c

    .line 1375
    :cond_5c
    const/4 v8, 0x1

    .line 1376
    :goto_3c
    if-eqz v8, :cond_62

    .line 1377
    .line 1378
    iget v8, v6, Ldefpackage/cx2;->p:I

    .line 1379
    .line 1380
    const/high16 v23, 0x200000

    .line 1381
    .line 1382
    and-int v8, v8, v23

    .line 1383
    .line 1384
    if-eqz v8, :cond_62

    .line 1385
    .line 1386
    instance-of v8, v6, Ldefpackage/fo0;

    .line 1387
    .line 1388
    if-eqz v8, :cond_62

    .line 1389
    .line 1390
    move-object v8, v6

    .line 1391
    check-cast v8, Ldefpackage/fo0;

    .line 1392
    .line 1393
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 1394
    .line 1395
    const/4 v10, 0x0

    .line 1396
    :goto_3d
    if-eqz v8, :cond_61

    .line 1397
    .line 1398
    iget v11, v8, Ldefpackage/cx2;->p:I

    .line 1399
    .line 1400
    and-int v11, v11, v23

    .line 1401
    .line 1402
    if-eqz v11, :cond_60

    .line 1403
    .line 1404
    add-int/lit8 v10, v10, 0x1

    .line 1405
    .line 1406
    const/4 v11, 0x1

    .line 1407
    if-ne v10, v11, :cond_5d

    .line 1408
    .line 1409
    move-object v6, v8

    .line 1410
    goto :goto_3e

    .line 1411
    :cond_5d
    if-nez v7, :cond_5e

    .line 1412
    .line 1413
    new-instance v7, Ldefpackage/f13;

    .line 1414
    .line 1415
    const/16 v11, 0x10

    .line 1416
    .line 1417
    new-array v12, v11, [Ldefpackage/cx2;

    .line 1418
    .line 1419
    invoke-direct {v7, v12}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 1420
    .line 1421
    .line 1422
    :cond_5e
    if-eqz v6, :cond_5f

    .line 1423
    .line 1424
    invoke-virtual {v7, v6}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1425
    .line 1426
    .line 1427
    const/4 v6, 0x0

    .line 1428
    :cond_5f
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1429
    .line 1430
    .line 1431
    :cond_60
    :goto_3e
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 1432
    .line 1433
    const/high16 v23, 0x200000

    .line 1434
    .line 1435
    goto :goto_3d

    .line 1436
    :cond_61
    const/4 v8, 0x1

    .line 1437
    if-ne v10, v8, :cond_62

    .line 1438
    .line 1439
    goto :goto_3b

    .line 1440
    :cond_62
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v6

    .line 1444
    goto :goto_3b

    .line 1445
    :cond_63
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1446
    .line 1447
    const/high16 v23, 0x200000

    .line 1448
    .line 1449
    goto :goto_3a

    .line 1450
    :cond_64
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v2

    .line 1454
    if-eqz v2, :cond_65

    .line 1455
    .line 1456
    iget-object v0, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1457
    .line 1458
    if-eqz v0, :cond_65

    .line 1459
    .line 1460
    iget-object v0, v0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 1461
    .line 1462
    check-cast v0, Ldefpackage/sq4;

    .line 1463
    .line 1464
    goto/16 :goto_39

    .line 1465
    .line 1466
    :cond_65
    const/4 v0, 0x0

    .line 1467
    goto/16 :goto_39

    .line 1468
    .line 1469
    :cond_66
    sget-object v0, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 1470
    .line 1471
    if-eqz v5, :cond_68

    .line 1472
    .line 1473
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    add-int/lit8 v2, v2, -0x1

    .line 1478
    .line 1479
    if-ltz v2, :cond_68

    .line 1480
    .line 1481
    :goto_3f
    add-int/lit8 v6, v2, -0x1

    .line 1482
    .line 1483
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v2

    .line 1487
    check-cast v2, Ldefpackage/my1;

    .line 1488
    .line 1489
    invoke-interface {v2, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1490
    .line 1491
    .line 1492
    if-gez v6, :cond_67

    .line 1493
    .line 1494
    goto :goto_40

    .line 1495
    :cond_67
    move v2, v6

    .line 1496
    goto :goto_3f

    .line 1497
    :cond_68
    :goto_40
    invoke-interface {v4, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1498
    .line 1499
    .line 1500
    sget-object v0, Ldefpackage/ln3;->o:Ldefpackage/ln3;

    .line 1501
    .line 1502
    invoke-interface {v4, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1503
    .line 1504
    .line 1505
    if-eqz v5, :cond_69

    .line 1506
    .line 1507
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1508
    .line 1509
    .line 1510
    move-result v2

    .line 1511
    const/4 v6, 0x0

    .line 1512
    :goto_41
    if-ge v6, v2, :cond_69

    .line 1513
    .line 1514
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v7

    .line 1518
    check-cast v7, Ldefpackage/my1;

    .line 1519
    .line 1520
    invoke-interface {v7, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1521
    .line 1522
    .line 1523
    add-int/lit8 v6, v6, 0x1

    .line 1524
    .line 1525
    goto :goto_41

    .line 1526
    :cond_69
    sget-object v0, Ldefpackage/ln3;->p:Ldefpackage/ln3;

    .line 1527
    .line 1528
    if-eqz v5, :cond_6b

    .line 1529
    .line 1530
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1531
    .line 1532
    .line 1533
    move-result v2

    .line 1534
    add-int/lit8 v2, v2, -0x1

    .line 1535
    .line 1536
    if-ltz v2, :cond_6b

    .line 1537
    .line 1538
    :goto_42
    add-int/lit8 v6, v2, -0x1

    .line 1539
    .line 1540
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v2

    .line 1544
    check-cast v2, Ldefpackage/my1;

    .line 1545
    .line 1546
    invoke-interface {v2, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1547
    .line 1548
    .line 1549
    if-gez v6, :cond_6a

    .line 1550
    .line 1551
    goto :goto_43

    .line 1552
    :cond_6a
    move v2, v6

    .line 1553
    goto :goto_42

    .line 1554
    :cond_6b
    :goto_43
    invoke-interface {v4, v3, v0}, Ldefpackage/my1;->G(Ldefpackage/ue1;Ldefpackage/ln3;)V

    .line 1555
    .line 1556
    .line 1557
    :cond_6c
    iget-object v0, v3, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 1558
    .line 1559
    check-cast v0, Ljava/util/ArrayList;

    .line 1560
    .line 1561
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1562
    .line 1563
    .line 1564
    move-result v2

    .line 1565
    const/4 v4, 0x0

    .line 1566
    :goto_44
    if-ge v4, v2, :cond_4b

    .line 1567
    .line 1568
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v5

    .line 1572
    check-cast v5, Ldefpackage/ey1;

    .line 1573
    .line 1574
    iget-boolean v5, v5, Ldefpackage/ey1;->i:Z

    .line 1575
    .line 1576
    if-eqz v5, :cond_6d

    .line 1577
    .line 1578
    const/4 v0, 0x1

    .line 1579
    goto :goto_45

    .line 1580
    :cond_6d
    add-int/lit8 v4, v4, 0x1

    .line 1581
    .line 1582
    goto :goto_44

    .line 1583
    :goto_45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1584
    .line 1585
    .line 1586
    iget-object v2, v3, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 1587
    .line 1588
    check-cast v2, Landroid/view/MotionEvent;

    .line 1589
    .line 1590
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 1591
    .line 1592
    .line 1593
    move-result v4

    .line 1594
    if-eqz v4, :cond_6f

    .line 1595
    .line 1596
    const/4 v8, 0x1

    .line 1597
    if-eq v4, v8, :cond_6e

    .line 1598
    .line 1599
    const/4 v3, 0x2

    .line 1600
    if-eq v4, v3, :cond_6e

    .line 1601
    .line 1602
    goto :goto_46

    .line 1603
    :cond_6e
    if-eqz v0, :cond_70

    .line 1604
    .line 1605
    const/4 v9, 0x0

    .line 1606
    iput v9, v1, Ldefpackage/bk;->o:I

    .line 1607
    .line 1608
    iput-boolean v8, v1, Ldefpackage/bk;->p:Z

    .line 1609
    .line 1610
    goto :goto_46

    .line 1611
    :cond_6f
    const/4 v8, 0x1

    .line 1612
    const/4 v9, 0x0

    .line 1613
    iget v0, v3, Ldefpackage/ue1;->o:I

    .line 1614
    .line 1615
    iput v0, v1, Ldefpackage/bk;->o:I

    .line 1616
    .line 1617
    iput-boolean v9, v1, Ldefpackage/bk;->p:Z

    .line 1618
    .line 1619
    :cond_70
    :goto_46
    iget-object v0, v1, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v0, Landroid/view/GestureDetector;

    .line 1622
    .line 1623
    invoke-virtual {v0, v2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1624
    .line 1625
    .line 1626
    return v8

    .line 1627
    :cond_71
    invoke-virtual {v0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    check-cast v0, Ldefpackage/ey;

    .line 1632
    .line 1633
    invoke-virtual {v0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v0

    .line 1637
    if-eqz v0, :cond_7e

    .line 1638
    .line 1639
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1640
    .line 1641
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 1642
    .line 1643
    if-nez v2, :cond_72

    .line 1644
    .line 1645
    invoke-static/range {v22 .. v22}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    :cond_72
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1649
    .line 1650
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v0

    .line 1654
    :goto_47
    if-eqz v0, :cond_7d

    .line 1655
    .line 1656
    iget-object v3, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1657
    .line 1658
    iget-object v3, v3, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 1659
    .line 1660
    check-cast v3, Ldefpackage/cx2;

    .line 1661
    .line 1662
    iget v3, v3, Ldefpackage/cx2;->q:I

    .line 1663
    .line 1664
    const/high16 v23, 0x200000

    .line 1665
    .line 1666
    and-int v3, v3, v23

    .line 1667
    .line 1668
    if-eqz v3, :cond_7b

    .line 1669
    .line 1670
    :goto_48
    if-eqz v2, :cond_7b

    .line 1671
    .line 1672
    iget v3, v2, Ldefpackage/cx2;->p:I

    .line 1673
    .line 1674
    and-int v3, v3, v23

    .line 1675
    .line 1676
    if-eqz v3, :cond_7a

    .line 1677
    .line 1678
    move-object v3, v2

    .line 1679
    const/4 v4, 0x0

    .line 1680
    :goto_49
    if-eqz v3, :cond_7a

    .line 1681
    .line 1682
    instance-of v5, v3, Ldefpackage/my1;

    .line 1683
    .line 1684
    if-eqz v5, :cond_73

    .line 1685
    .line 1686
    goto :goto_4d

    .line 1687
    :cond_73
    iget v5, v3, Ldefpackage/cx2;->p:I

    .line 1688
    .line 1689
    and-int v5, v5, v23

    .line 1690
    .line 1691
    if-eqz v5, :cond_79

    .line 1692
    .line 1693
    instance-of v5, v3, Ldefpackage/fo0;

    .line 1694
    .line 1695
    if-eqz v5, :cond_79

    .line 1696
    .line 1697
    move-object v5, v3

    .line 1698
    check-cast v5, Ldefpackage/fo0;

    .line 1699
    .line 1700
    iget-object v5, v5, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 1701
    .line 1702
    const/4 v6, 0x0

    .line 1703
    :goto_4a
    if-eqz v5, :cond_78

    .line 1704
    .line 1705
    iget v7, v5, Ldefpackage/cx2;->p:I

    .line 1706
    .line 1707
    and-int v7, v7, v23

    .line 1708
    .line 1709
    if-eqz v7, :cond_77

    .line 1710
    .line 1711
    add-int/lit8 v6, v6, 0x1

    .line 1712
    .line 1713
    const/4 v8, 0x1

    .line 1714
    if-ne v6, v8, :cond_74

    .line 1715
    .line 1716
    move-object v3, v5

    .line 1717
    goto :goto_4b

    .line 1718
    :cond_74
    if-nez v4, :cond_75

    .line 1719
    .line 1720
    new-instance v4, Ldefpackage/f13;

    .line 1721
    .line 1722
    const/16 v8, 0x10

    .line 1723
    .line 1724
    new-array v7, v8, [Ldefpackage/cx2;

    .line 1725
    .line 1726
    invoke-direct {v4, v7}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    :cond_75
    if-eqz v3, :cond_76

    .line 1730
    .line 1731
    invoke-virtual {v4, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1732
    .line 1733
    .line 1734
    const/4 v3, 0x0

    .line 1735
    :cond_76
    invoke-virtual {v4, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1736
    .line 1737
    .line 1738
    :cond_77
    :goto_4b
    iget-object v5, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 1739
    .line 1740
    const/high16 v23, 0x200000

    .line 1741
    .line 1742
    goto :goto_4a

    .line 1743
    :cond_78
    const/4 v8, 0x1

    .line 1744
    if-ne v6, v8, :cond_79

    .line 1745
    .line 1746
    :goto_4c
    const/high16 v23, 0x200000

    .line 1747
    .line 1748
    goto :goto_49

    .line 1749
    :cond_79
    invoke-static {v4}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v3

    .line 1753
    goto :goto_4c

    .line 1754
    :cond_7a
    iget-object v2, v2, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1755
    .line 1756
    const/high16 v23, 0x200000

    .line 1757
    .line 1758
    goto :goto_48

    .line 1759
    :cond_7b
    invoke-virtual {v0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v0

    .line 1763
    if-eqz v0, :cond_7c

    .line 1764
    .line 1765
    iget-object v2, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1766
    .line 1767
    if-eqz v2, :cond_7c

    .line 1768
    .line 1769
    iget-object v2, v2, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 1770
    .line 1771
    check-cast v2, Ldefpackage/sq4;

    .line 1772
    .line 1773
    goto :goto_47

    .line 1774
    :cond_7c
    const/4 v2, 0x0

    .line 1775
    goto :goto_47

    .line 1776
    :cond_7d
    const/4 v3, 0x0

    .line 1777
    :goto_4d
    check-cast v3, Ldefpackage/my1;

    .line 1778
    .line 1779
    goto :goto_4e

    .line 1780
    :cond_7e
    const/4 v3, 0x0

    .line 1781
    :goto_4e
    if-eqz v3, :cond_8e

    .line 1782
    .line 1783
    move-object v0, v3

    .line 1784
    check-cast v0, Ldefpackage/cx2;

    .line 1785
    .line 1786
    iget-object v2, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1787
    .line 1788
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 1789
    .line 1790
    if-nez v2, :cond_7f

    .line 1791
    .line 1792
    invoke-static/range {v22 .. v22}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    :cond_7f
    iget-object v0, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 1796
    .line 1797
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1798
    .line 1799
    invoke-static {v3}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    const/4 v4, 0x0

    .line 1804
    :goto_4f
    if-eqz v2, :cond_8d

    .line 1805
    .line 1806
    iget-object v5, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1807
    .line 1808
    iget-object v5, v5, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 1809
    .line 1810
    check-cast v5, Ldefpackage/cx2;

    .line 1811
    .line 1812
    iget v5, v5, Ldefpackage/cx2;->q:I

    .line 1813
    .line 1814
    const/high16 v23, 0x200000

    .line 1815
    .line 1816
    and-int v5, v5, v23

    .line 1817
    .line 1818
    if-eqz v5, :cond_8b

    .line 1819
    .line 1820
    :goto_50
    if-eqz v0, :cond_8b

    .line 1821
    .line 1822
    iget v5, v0, Ldefpackage/cx2;->p:I

    .line 1823
    .line 1824
    and-int v5, v5, v23

    .line 1825
    .line 1826
    if-eqz v5, :cond_8a

    .line 1827
    .line 1828
    move-object v5, v0

    .line 1829
    const/4 v6, 0x0

    .line 1830
    :goto_51
    if-eqz v5, :cond_8a

    .line 1831
    .line 1832
    instance-of v7, v5, Ldefpackage/my1;

    .line 1833
    .line 1834
    if-eqz v7, :cond_81

    .line 1835
    .line 1836
    if-nez v4, :cond_80

    .line 1837
    .line 1838
    new-instance v4, Ljava/util/ArrayList;

    .line 1839
    .line 1840
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1841
    .line 1842
    .line 1843
    :cond_80
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1844
    .line 1845
    .line 1846
    const/4 v7, 0x0

    .line 1847
    goto :goto_52

    .line 1848
    :cond_81
    const/4 v7, 0x1

    .line 1849
    :goto_52
    if-eqz v7, :cond_88

    .line 1850
    .line 1851
    iget v7, v5, Ldefpackage/cx2;->p:I

    .line 1852
    .line 1853
    const/high16 v23, 0x200000

    .line 1854
    .line 1855
    and-int v7, v7, v23

    .line 1856
    .line 1857
    if-eqz v7, :cond_87

    .line 1858
    .line 1859
    instance-of v7, v5, Ldefpackage/fo0;

    .line 1860
    .line 1861
    if-eqz v7, :cond_87

    .line 1862
    .line 1863
    move-object v7, v5

    .line 1864
    check-cast v7, Ldefpackage/fo0;

    .line 1865
    .line 1866
    iget-object v7, v7, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 1867
    .line 1868
    const/4 v8, 0x0

    .line 1869
    :goto_53
    if-eqz v7, :cond_86

    .line 1870
    .line 1871
    iget v10, v7, Ldefpackage/cx2;->p:I

    .line 1872
    .line 1873
    and-int v10, v10, v23

    .line 1874
    .line 1875
    if-eqz v10, :cond_82

    .line 1876
    .line 1877
    add-int/lit8 v8, v8, 0x1

    .line 1878
    .line 1879
    const/4 v11, 0x1

    .line 1880
    if-ne v8, v11, :cond_83

    .line 1881
    .line 1882
    move-object v5, v7

    .line 1883
    :cond_82
    const/16 v11, 0x10

    .line 1884
    .line 1885
    goto :goto_55

    .line 1886
    :cond_83
    if-nez v6, :cond_84

    .line 1887
    .line 1888
    new-instance v6, Ldefpackage/f13;

    .line 1889
    .line 1890
    const/16 v11, 0x10

    .line 1891
    .line 1892
    new-array v10, v11, [Ldefpackage/cx2;

    .line 1893
    .line 1894
    invoke-direct {v6, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 1895
    .line 1896
    .line 1897
    goto :goto_54

    .line 1898
    :cond_84
    const/16 v11, 0x10

    .line 1899
    .line 1900
    :goto_54
    if-eqz v5, :cond_85

    .line 1901
    .line 1902
    invoke-virtual {v6, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1903
    .line 1904
    .line 1905
    const/4 v5, 0x0

    .line 1906
    :cond_85
    invoke-virtual {v6, v7}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1907
    .line 1908
    .line 1909
    :goto_55
    iget-object v7, v7, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 1910
    .line 1911
    goto :goto_53

    .line 1912
    :cond_86
    const/4 v7, 0x1

    .line 1913
    const/16 v11, 0x10

    .line 1914
    .line 1915
    if-ne v8, v7, :cond_89

    .line 1916
    .line 1917
    goto :goto_51

    .line 1918
    :cond_87
    const/16 v11, 0x10

    .line 1919
    .line 1920
    goto :goto_56

    .line 1921
    :cond_88
    const/16 v11, 0x10

    .line 1922
    .line 1923
    const/high16 v23, 0x200000

    .line 1924
    .line 1925
    :cond_89
    :goto_56
    invoke-static {v6}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v5

    .line 1929
    goto :goto_51

    .line 1930
    :cond_8a
    const/16 v11, 0x10

    .line 1931
    .line 1932
    const/high16 v23, 0x200000

    .line 1933
    .line 1934
    iget-object v0, v0, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 1935
    .line 1936
    goto :goto_50

    .line 1937
    :cond_8b
    const/16 v11, 0x10

    .line 1938
    .line 1939
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    if-eqz v2, :cond_8c

    .line 1944
    .line 1945
    iget-object v0, v2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1946
    .line 1947
    if-eqz v0, :cond_8c

    .line 1948
    .line 1949
    iget-object v0, v0, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 1950
    .line 1951
    check-cast v0, Ldefpackage/sq4;

    .line 1952
    .line 1953
    goto/16 :goto_4f

    .line 1954
    .line 1955
    :cond_8c
    const/4 v0, 0x0

    .line 1956
    goto/16 :goto_4f

    .line 1957
    .line 1958
    :cond_8d
    invoke-interface {v3}, Ldefpackage/my1;->N()V

    .line 1959
    .line 1960
    .line 1961
    if-eqz v4, :cond_8e

    .line 1962
    .line 1963
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1964
    .line 1965
    .line 1966
    move-result v0

    .line 1967
    const/4 v2, 0x0

    .line 1968
    :goto_57
    if-ge v2, v0, :cond_8e

    .line 1969
    .line 1970
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v3

    .line 1974
    check-cast v3, Ldefpackage/my1;

    .line 1975
    .line 1976
    invoke-interface {v3}, Ldefpackage/my1;->N()V

    .line 1977
    .line 1978
    .line 1979
    add-int/lit8 v2, v2, 0x1

    .line 1980
    .line 1981
    goto :goto_57

    .line 1982
    :cond_8e
    const/4 v9, 0x0

    .line 1983
    iput v9, v1, Ldefpackage/bk;->o:I

    .line 1984
    .line 1985
    const/4 v8, 0x1

    .line 1986
    iput-boolean v8, v1, Ldefpackage/bk;->p:Z

    .line 1987
    .line 1988
    return v8

    .line 1989
    :cond_8f
    const/4 v9, 0x0

    .line 1990
    const-string v0, "MotionEvent must be a touch navigation source"

    .line 1991
    .line 1992
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1993
    .line 1994
    .line 1995
    return v9

    .line 1996
    :cond_90
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 1997
    .line 1998
    .line 1999
    move-result v0

    .line 2000
    return v0

    .line 2001
    :cond_91
    :goto_58
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2002
    .line 2003
    .line 2004
    move-result v0

    .line 2005
    return v0
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Ldefpackage/ra;->J0:Z

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/ra;->I0:Ldefpackage/ia;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ldefpackage/ia;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, Ldefpackage/ra;->m(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v2, :cond_15

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_a

    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 33
    .line 34
    iget-object v5, v2, Ldefpackage/ya;->q:Ldefpackage/ra;

    .line 35
    .line 36
    iget-object v6, v2, Ldefpackage/ya;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v9, 0x7

    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v7, :cond_d

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_d

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/16 v7, 0x100

    .line 59
    .line 60
    const/16 v11, 0x80

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/16 v13, 0xc

    .line 64
    .line 65
    const/high16 v14, -0x80000000

    .line 66
    .line 67
    if-eq v6, v9, :cond_5

    .line 68
    .line 69
    const/16 v15, 0x9

    .line 70
    .line 71
    if-eq v6, v15, :cond_5

    .line 72
    .line 73
    if-eq v6, v8, :cond_2

    .line 74
    .line 75
    move v2, v4

    .line 76
    :goto_0
    move/from16 v23, v10

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_2
    iget v6, v2, Ldefpackage/ya;->r:I

    .line 81
    .line 82
    if-eq v6, v14, :cond_4

    .line 83
    .line 84
    if-ne v6, v14, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iput v14, v2, Ldefpackage/ya;->r:I

    .line 88
    .line 89
    invoke-static {v2, v14, v11, v12, v13}, Ldefpackage/ya;->E(Ldefpackage/ya;IILjava/lang/Integer;I)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v6, v7, v12, v13}, Ldefpackage/ya;->E(Ldefpackage/ya;IILjava/lang/Integer;I)V

    .line 93
    .line 94
    .line 95
    :goto_1
    move v2, v10

    .line 96
    move/from16 v23, v2

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v5}, Ldefpackage/ra;->getAndroidViewsHandler$ui()Ldefpackage/id;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    goto :goto_0

    .line 109
    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    invoke-virtual {v5, v10}, Ldefpackage/ra;->q(Z)V

    .line 118
    .line 119
    .line 120
    new-instance v20, Ldefpackage/fm1;

    .line 121
    .line 122
    invoke-direct/range {v20 .. v20}, Ldefpackage/fm1;-><init>()V

    .line 123
    .line 124
    .line 125
    move/from16 v23, v10

    .line 126
    .line 127
    invoke-virtual {v5}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    int-to-long v8, v6

    .line 136
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    int-to-long v14, v6

    .line 141
    const/16 v6, 0x20

    .line 142
    .line 143
    shl-long/2addr v8, v6

    .line 144
    const-wide v16, 0xffffffffL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    and-long v14, v14, v16

    .line 150
    .line 151
    or-long/2addr v8, v14

    .line 152
    iget-object v6, v10, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 153
    .line 154
    iget-object v10, v6, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v10, Ldefpackage/f63;

    .line 157
    .line 158
    sget-object v14, Ldefpackage/f63;->h0:Ldefpackage/k52;

    .line 159
    .line 160
    invoke-virtual {v10, v8, v9}, Ldefpackage/f63;->x0(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v18

    .line 164
    iget-object v6, v6, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 165
    .line 166
    move-object/from16 v16, v6

    .line 167
    .line 168
    check-cast v16, Ldefpackage/f63;

    .line 169
    .line 170
    sget-object v17, Ldefpackage/f63;->m0:Ldefpackage/tv1;

    .line 171
    .line 172
    const/16 v21, 0x1

    .line 173
    .line 174
    const/16 v22, 0x1

    .line 175
    .line 176
    invoke-virtual/range {v16 .. v22}, Ldefpackage/f63;->G0(Ldefpackage/e63;JLdefpackage/fm1;IZ)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v6, v20

    .line 180
    .line 181
    iget-object v6, v6, Ldefpackage/fm1;->n:Ldefpackage/q03;

    .line 182
    .line 183
    iget v8, v6, Ldefpackage/q03;->b:I

    .line 184
    .line 185
    add-int/lit8 v8, v8, -0x1

    .line 186
    .line 187
    :goto_2
    const/4 v9, -0x1

    .line 188
    if-ge v9, v8, :cond_9

    .line 189
    .line 190
    invoke-virtual {v6, v8}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    check-cast v9, Ldefpackage/cx2;

    .line 198
    .line 199
    invoke-static {v9}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v5}, Ldefpackage/ra;->getAndroidViewsHandler$ui()Ldefpackage/id;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-virtual {v10}, Ldefpackage/id;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-nez v10, :cond_8

    .line 216
    .line 217
    iget-object v10, v9, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 218
    .line 219
    const/16 v14, 0x8

    .line 220
    .line 221
    invoke-virtual {v10, v14}, Ldefpackage/w12;->d(I)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-nez v10, :cond_6

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    iget v10, v9, Ldefpackage/c72;->o:I

    .line 229
    .line 230
    invoke-virtual {v2, v10}, Ldefpackage/ya;->A(I)I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    invoke-static {v9, v4}, Ldefpackage/hw;->a(Ldefpackage/c72;Z)Ldefpackage/i94;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-static {v9}, Ldefpackage/wr1;->I(Ldefpackage/i94;)Z

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    if-nez v14, :cond_7

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_7
    invoke-static {v9}, Ldefpackage/fh0;->p(Ldefpackage/i94;)Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_a

    .line 250
    .line 251
    :goto_3
    add-int/lit8 v8, v8, -0x1

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_8
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 255
    .line 256
    .line 257
    return v4

    .line 258
    :cond_9
    const/high16 v10, -0x80000000

    .line 259
    .line 260
    :cond_a
    invoke-virtual {v5}, Ldefpackage/ra;->getAndroidViewsHandler$ui()Ldefpackage/id;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    iget v6, v2, Ldefpackage/ya;->r:I

    .line 269
    .line 270
    if-ne v6, v10, :cond_b

    .line 271
    .line 272
    :goto_4
    const/high16 v2, -0x80000000

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_b
    iput v10, v2, Ldefpackage/ya;->r:I

    .line 276
    .line 277
    invoke-static {v2, v10, v11, v12, v13}, Ldefpackage/ya;->E(Ldefpackage/ya;IILjava/lang/Integer;I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v2, v6, v7, v12, v13}, Ldefpackage/ya;->E(Ldefpackage/ya;IILjava/lang/Integer;I)V

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :goto_5
    if-ne v10, v2, :cond_c

    .line 285
    .line 286
    move v2, v5

    .line 287
    goto :goto_6

    .line 288
    :cond_c
    move/from16 v2, v23

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_d
    move/from16 v23, v10

    .line 292
    .line 293
    move v2, v4

    .line 294
    :goto_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    const/4 v6, 0x7

    .line 299
    if-eq v5, v6, :cond_12

    .line 300
    .line 301
    const/16 v6, 0xa

    .line 302
    .line 303
    if-eq v5, v6, :cond_f

    .line 304
    .line 305
    :cond_e
    move/from16 v5, v23

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_f
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->n(Landroid/view/MotionEvent;)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-eqz v5, :cond_e

    .line 313
    .line 314
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    const/4 v5, 0x3

    .line 319
    if-ne v4, v5, :cond_10

    .line 320
    .line 321
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_10

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_10
    iget-object v4, v0, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 329
    .line 330
    if-eqz v4, :cond_11

    .line 331
    .line 332
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 333
    .line 334
    .line 335
    :cond_11
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iput-object v1, v0, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 340
    .line 341
    move/from16 v5, v23

    .line 342
    .line 343
    iput-boolean v5, v0, Ldefpackage/ra;->J0:Z

    .line 344
    .line 345
    const-wide/16 v4, 0x8

    .line 346
    .line 347
    invoke-virtual {v0, v3, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 348
    .line 349
    .line 350
    return v2

    .line 351
    :cond_12
    move/from16 v5, v23

    .line 352
    .line 353
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->o(Landroid/view/MotionEvent;)Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-nez v3, :cond_13

    .line 358
    .line 359
    :goto_7
    return v2

    .line 360
    :cond_13
    :goto_8
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->h(Landroid/view/MotionEvent;)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    and-int/2addr v0, v5

    .line 365
    if-eqz v0, :cond_14

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_14
    if-eqz v2, :cond_15

    .line 369
    .line 370
    :goto_9
    return v5

    .line 371
    :cond_15
    :goto_a
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ldefpackage/h80;->t:Ldefpackage/om1;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, Ldefpackage/la5;->n:Ldefpackage/zd3;

    .line 22
    .line 23
    new-instance v3, Ldefpackage/tn3;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Ldefpackage/tn3;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v2, Ldefpackage/e90;

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-direct {v2, v3}, Ldefpackage/e90;-><init>(I)V

    .line 39
    .line 40
    .line 41
    check-cast v0, Ldefpackage/ey;

    .line 42
    .line 43
    invoke-virtual {v0, p1, v2}, Ldefpackage/ey;->d(Landroid/view/KeyEvent;Ldefpackage/gf1;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return v1

    .line 57
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_2
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v2, Ldefpackage/fa;

    .line 64
    .line 65
    invoke-direct {v2, v1, p0, p1}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    check-cast v0, Ldefpackage/ey;

    .line 69
    .line 70
    invoke-virtual {v0, p1, v2}, Ldefpackage/ey;->d(Landroid/view/KeyEvent;Ldefpackage/gf1;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ldefpackage/ey;

    .line 14
    .line 15
    iget-object v3, v0, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ldefpackage/s91;

    .line 18
    .line 19
    iget-boolean v3, v3, Ldefpackage/s91;->e:Z

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const-string v0, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 24
    .line 25
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    iget-object v0, v0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ldefpackage/ba1;

    .line 35
    .line 36
    invoke-static {v0}, Ldefpackage/te5;->p(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_b

    .line 41
    .line 42
    iget-object v3, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 43
    .line 44
    iget-boolean v3, v3, Ldefpackage/cx2;->A:Z

    .line 45
    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const-string v3, "visitAncestors called on an unattached node"

    .line 49
    .line 50
    invoke-static {v3}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v3, v0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 54
    .line 55
    invoke-static {v0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    if-eqz v0, :cond_b

    .line 60
    .line 61
    iget-object v4, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 62
    .line 63
    iget-object v4, v4, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Ldefpackage/cx2;

    .line 66
    .line 67
    iget v4, v4, Ldefpackage/cx2;->q:I

    .line 68
    .line 69
    const/high16 v5, 0x20000

    .line 70
    .line 71
    and-int/2addr v4, v5

    .line 72
    const/4 v6, 0x0

    .line 73
    if-eqz v4, :cond_9

    .line 74
    .line 75
    :goto_1
    if-eqz v3, :cond_9

    .line 76
    .line 77
    iget v4, v3, Ldefpackage/cx2;->p:I

    .line 78
    .line 79
    and-int/2addr v4, v5

    .line 80
    if-eqz v4, :cond_8

    .line 81
    .line 82
    move-object v4, v3

    .line 83
    move-object v7, v6

    .line 84
    :goto_2
    if-eqz v4, :cond_8

    .line 85
    .line 86
    iget v8, v4, Ldefpackage/cx2;->p:I

    .line 87
    .line 88
    and-int/2addr v8, v5

    .line 89
    if-eqz v8, :cond_7

    .line 90
    .line 91
    instance-of v8, v4, Ldefpackage/fo0;

    .line 92
    .line 93
    if-eqz v8, :cond_7

    .line 94
    .line 95
    move-object v8, v4

    .line 96
    check-cast v8, Ldefpackage/fo0;

    .line 97
    .line 98
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 99
    .line 100
    move v9, v1

    .line 101
    :goto_3
    if-eqz v8, :cond_6

    .line 102
    .line 103
    iget v10, v8, Ldefpackage/cx2;->p:I

    .line 104
    .line 105
    and-int/2addr v10, v5

    .line 106
    if-eqz v10, :cond_5

    .line 107
    .line 108
    add-int/lit8 v9, v9, 0x1

    .line 109
    .line 110
    if-ne v9, v2, :cond_2

    .line 111
    .line 112
    move-object v4, v8

    .line 113
    goto :goto_4

    .line 114
    :cond_2
    if-nez v7, :cond_3

    .line 115
    .line 116
    new-instance v7, Ldefpackage/f13;

    .line 117
    .line 118
    const/16 v10, 0x10

    .line 119
    .line 120
    new-array v10, v10, [Ldefpackage/cx2;

    .line 121
    .line 122
    invoke-direct {v7, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    if-eqz v4, :cond_4

    .line 126
    .line 127
    invoke-virtual {v7, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v4, v6

    .line 131
    :cond_4
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_4
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    if-ne v9, v2, :cond_7

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    goto :goto_2

    .line 145
    :cond_8
    iget-object v3, v3, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_9
    invoke-virtual {v0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    iget-object v3, v0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 155
    .line 156
    if-eqz v3, :cond_a

    .line 157
    .line 158
    iget-object v3, v3, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v3, Ldefpackage/sq4;

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_a
    move-object v3, v6

    .line 164
    goto :goto_0

    .line 165
    :cond_b
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_c

    .line 170
    .line 171
    return v2

    .line 172
    :cond_c
    return v1
.end method

.method public final dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Ldefpackage/ra;->Q0:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iput-boolean v0, p0, Ldefpackage/ra;->Q0:Z

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/ra;->x(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    iput-boolean v0, p0, Ldefpackage/ra;->Q0:Z

    .line 23
    .line 24
    throw p1
.end method

.method public final dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Ldefpackage/za;->a:Ldefpackage/za;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/ra;->getView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p1, p0}, Ldefpackage/za;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Ldefpackage/ra;->J0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/ra;->I0:Ldefpackage/ia;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v3, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v2, v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-boolean v1, p0, Ldefpackage/ra;->J0:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ldefpackage/ia;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, Ldefpackage/ra;->m(Landroid/view/MotionEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_12

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_b

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v2, 0x2

    .line 68
    if-ne v0, v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ldefpackage/ra;->o(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto/16 :goto_b

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, Ldefpackage/ra;->h(Landroid/view/MotionEvent;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    and-int/lit8 v2, v0, 0x2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v4, 0x5

    .line 105
    if-ne v2, v4, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move v2, v1

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    :goto_2
    move v2, v3

    .line 111
    :goto_3
    const/16 v4, 0x2002

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_9

    .line 118
    .line 119
    const v4, 0x100008

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v4, v1

    .line 130
    goto :goto_5

    .line 131
    :cond_9
    :goto_4
    move v4, v3

    .line 132
    :goto_5
    if-eqz v2, :cond_11

    .line 133
    .line 134
    if-eqz v4, :cond_11

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    instance-of v4, v2, Landroid/view/View;

    .line 141
    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    check-cast v2, Landroid/view/View;

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    const/4 v2, 0x0

    .line 148
    :goto_6
    if-eqz v2, :cond_b

    .line 149
    .line 150
    const v4, 0x7f0a0105

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v2, :cond_c

    .line 158
    .line 159
    :cond_b
    new-instance v2, Ldefpackage/on;

    .line 160
    .line 161
    invoke-direct {v2, v3}, Ldefpackage/on;-><init>(I)V

    .line 162
    .line 163
    .line 164
    :cond_c
    new-instance v4, Ldefpackage/on;

    .line 165
    .line 166
    invoke-direct {v4, v3}, Ldefpackage/on;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_11

    .line 174
    .line 175
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ldefpackage/ey;

    .line 180
    .line 181
    invoke-virtual {v2}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_11

    .line 186
    .line 187
    invoke-static {v2}, Ldefpackage/j51;->N(Ldefpackage/eo0;)Ldefpackage/f63;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, Ldefpackage/wr1;->n(Ldefpackage/q62;)Ldefpackage/q62;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v4, v2, v3}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    int-to-long v4, v4

    .line 212
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    int-to-long v6, p1

    .line 217
    const/16 p1, 0x20

    .line 218
    .line 219
    shl-long/2addr v4, p1

    .line 220
    const-wide v8, 0xffffffffL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v6, v8

    .line 226
    or-long/2addr v4, v6

    .line 227
    shr-long v6, v4, p1

    .line 228
    .line 229
    long-to-int p1, v6

    .line 230
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    and-long/2addr v4, v8

    .line 235
    long-to-int v4, v4

    .line 236
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    iget v5, v2, Ldefpackage/wv3;->a:F

    .line 241
    .line 242
    cmpl-float v5, p1, v5

    .line 243
    .line 244
    if-ltz v5, :cond_d

    .line 245
    .line 246
    move v5, v3

    .line 247
    goto :goto_7

    .line 248
    :cond_d
    move v5, v1

    .line 249
    :goto_7
    iget v6, v2, Ldefpackage/wv3;->c:F

    .line 250
    .line 251
    cmpg-float p1, p1, v6

    .line 252
    .line 253
    if-gez p1, :cond_e

    .line 254
    .line 255
    move p1, v3

    .line 256
    goto :goto_8

    .line 257
    :cond_e
    move p1, v1

    .line 258
    :goto_8
    and-int/2addr p1, v5

    .line 259
    iget v5, v2, Ldefpackage/wv3;->b:F

    .line 260
    .line 261
    cmpl-float v5, v4, v5

    .line 262
    .line 263
    if-ltz v5, :cond_f

    .line 264
    .line 265
    move v5, v3

    .line 266
    goto :goto_9

    .line 267
    :cond_f
    move v5, v1

    .line 268
    :goto_9
    and-int/2addr p1, v5

    .line 269
    iget v2, v2, Ldefpackage/wv3;->d:F

    .line 270
    .line 271
    cmpg-float v2, v4, v2

    .line 272
    .line 273
    if-gez v2, :cond_10

    .line 274
    .line 275
    move v2, v3

    .line 276
    goto :goto_a

    .line 277
    :cond_10
    move v2, v1

    .line 278
    :goto_a
    and-int/2addr p1, v2

    .line 279
    if-nez p1, :cond_11

    .line 280
    .line 281
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ldefpackage/ey;

    .line 286
    .line 287
    const/16 p1, 0x8

    .line 288
    .line 289
    invoke-virtual {p0, p1, v1, v3}, Ldefpackage/ey;->b(IZZ)Z

    .line 290
    .line 291
    .line 292
    :cond_11
    and-int/lit8 p0, v0, 0x1

    .line 293
    .line 294
    if-eqz p0, :cond_12

    .line 295
    .line 296
    return v3

    .line 297
    :cond_12
    :goto_b
    return v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    const-string v1, "findViewByAccessibilityIdTraversal"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v3, v2, [Ljava/lang/Class;

    .line 13
    .line 14
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v4, v3, v5

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    new-array v1, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    aput-object p1, v1, v5

    .line 33
    .line 34
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of p1, p0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/te5;->q(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p0

    .line 50
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 4
    .line 5
    iget-boolean v0, v0, Ldefpackage/ri2;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-ne v2, p0, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    :goto_1
    move-object v0, v1

    .line 53
    :goto_2
    if-ne p1, p0, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ldefpackage/ey;

    .line 60
    .line 61
    iget-object v2, v2, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ldefpackage/ba1;

    .line 64
    .line 65
    invoke-static {v2}, Ldefpackage/te5;->p(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    invoke-static {v2}, Ldefpackage/te5;->r(Ldefpackage/ba1;)Ldefpackage/wv3;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_4
    if-nez v1, :cond_6

    .line 76
    .line 77
    invoke-static {p1, p0}, Ldefpackage/r91;->a(Landroid/view/View;Ldefpackage/ra;)Ldefpackage/wv3;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    invoke-static {p1, p0}, Ldefpackage/r91;->a(Landroid/view/View;Ldefpackage/ra;)Ldefpackage/wv3;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_6
    :goto_3
    invoke-static {p2}, Ldefpackage/r91;->c(I)Ldefpackage/o91;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-eqz v2, :cond_7

    .line 91
    .line 92
    iget v2, v2, Ldefpackage/o91;->a:I

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    const/4 v2, 0x6

    .line 96
    :goto_4
    new-instance v3, Ldefpackage/jx3;

    .line 97
    .line 98
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, Ldefpackage/ea;

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-direct {v5, v6, v3}, Ldefpackage/ea;-><init>(ILdefpackage/jx3;)V

    .line 109
    .line 110
    .line 111
    check-cast v4, Ldefpackage/ey;

    .line 112
    .line 113
    invoke-virtual {v4, v2, v1, v5}, Ldefpackage/ey;->e(ILdefpackage/wv3;Ldefpackage/if1;)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-nez v4, :cond_8

    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_8
    iget-object v3, v3, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 121
    .line 122
    if-nez v3, :cond_9

    .line 123
    .line 124
    if-nez v0, :cond_d

    .line 125
    .line 126
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :cond_9
    if-nez v0, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_a
    const/4 p1, 0x1

    .line 135
    if-ne v2, p1, :cond_b

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_b
    const/4 p1, 0x2

    .line 139
    if-ne v2, p1, :cond_c

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_c
    check-cast v3, Ldefpackage/ba1;

    .line 143
    .line 144
    invoke-static {v3}, Ldefpackage/te5;->r(Ldefpackage/ba1;)Ldefpackage/wv3;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {v0, p0}, Ldefpackage/r91;->a(Landroid/view/View;Ldefpackage/ra;)Ldefpackage/wv3;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p1, p2, v1, v2}, Ldefpackage/kb4;->F(Ldefpackage/wv3;Ldefpackage/wv3;Ldefpackage/wv3;I)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_d

    .line 157
    .line 158
    :goto_5
    return-object p0

    .line 159
    :cond_d
    return-object v0

    .line 160
    :cond_e
    :goto_6
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
.end method

.method public final g(Ldefpackage/c72;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/ri2;->g(Ldefpackage/c72;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getAccessibilityManager()Ldefpackage/f3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->k:Ldefpackage/rv2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getAndroidViewsHandler$ui()Ldefpackage/id;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/id;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ldefpackage/id;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Ldefpackage/ra;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public bridge synthetic getAutofill()Ldefpackage/sn;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofill()Ldefpackage/x9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getAutofill()Ldefpackage/x9;
    .locals 0

    .line 6
    iget-object p0, p0, Ldefpackage/ra;->U:Ldefpackage/x9;

    return-object p0
.end method

.method public bridge synthetic getAutofillManager()Ldefpackage/vn;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getAutofillManager()Ldefpackage/y9;
    .locals 0

    .line 6
    iget-object p0, p0, Ldefpackage/ra;->V:Ldefpackage/y9;

    return-object p0
.end method

.method public getAutofillTree()Ldefpackage/wn;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->M:Ldefpackage/wn;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClipboard()Ldefpackage/y30;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->n:Ldefpackage/y30;

    .line 6
    .line 7
    return-object p0
.end method

.method public getClipboardManager()Ldefpackage/z30;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->m:Ldefpackage/hd5;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getComposeViewContext()Ldefpackage/h80;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/ra;->get_composeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getComposeViewContextIncrementedDuringInit$ui()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/ra;->P0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getConfiguration()Landroid/content/res/Configuration;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->S:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/res/Configuration;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getContentCaptureManager$ui()Ldefpackage/lb;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCoroutineContext()Ldefpackage/ne0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->A:Ldefpackage/ne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDensity()Ldefpackage/oo0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->x:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/oo0;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getDragAndDropManager()Ldefpackage/nu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getDragAndDropManager()Ldefpackage/qb;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDragAndDropManager()Ldefpackage/qb;
    .locals 0

    .line 6
    iget-object p0, p0, Ldefpackage/ra;->B:Ldefpackage/qb;

    return-object p0
.end method

.method public getEmbeddedViewFocusRect()Ldefpackage/wv3;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ey;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/ba1;

    .line 17
    .line 18
    invoke-static {p0}, Ldefpackage/te5;->p(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Ldefpackage/te5;->r(Ldefpackage/ba1;)Ldefpackage/wv3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    return-object v1

    .line 30
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-static {v0, p0}, Ldefpackage/r91;->a(Landroid/view/View;Ldefpackage/ra;)Ldefpackage/wv3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    return-object v1
.end method

.method public getFocusOwner()Ldefpackage/u91;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->z:Ldefpackage/ey;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getEmbeddedViewFocusRect()Ldefpackage/wv3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, v0, Ldefpackage/wv3;->a:F

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget p0, v0, Ldefpackage/wv3;->b:F

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    iget p0, v0, Ldefpackage/wv3;->c:F

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget p0, v0, Ldefpackage/wv3;->d:F

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Ldefpackage/k2;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v1, v2, v3}, Ldefpackage/k2;-><init>(IB)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Ldefpackage/ey;

    .line 52
    .line 53
    const/4 v2, 0x6

    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v2, v3, v1}, Ldefpackage/ey;->e(ILdefpackage/wv3;Ldefpackage/if1;)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    const/high16 p0, -0x80000000

    .line 68
    .line 69
    invoke-virtual {p1, p0, p0, p0, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public getFontFamilyResolver()Ldefpackage/ha1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->u0:Ldefpackage/b13;

    .line 2
    .line 3
    invoke-interface {p0}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/ha1;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFontLoader()Ldefpackage/ga1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->o:Ldefpackage/ga1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getFrameEndScheduler$ui()Ldefpackage/ga2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->r:Ldefpackage/ga2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGraphicsContext()Ldefpackage/rj1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->L:Ldefpackage/jw;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHapticFeedBack()Ldefpackage/kl1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->q:Ldefpackage/kl1;

    .line 6
    .line 7
    return-object p0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/i61;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ra;->v:Ldefpackage/ii;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public getImportantForAutofill()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public bridge synthetic getInputModeManager()Ldefpackage/rz1;
    .locals 0

    .line 22
    invoke-virtual {p0}, Ldefpackage/ra;->getInputModeManager()Ldefpackage/sz1;

    move-result-object p0

    return-object p0
.end method

.method public getInputModeManager()Ldefpackage/sz1;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->w0:Ldefpackage/sz1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ldefpackage/sz1;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    :goto_0
    invoke-direct {v0, v1}, Ldefpackage/sz1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/ra;->w0:Ldefpackage/sz1;

    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public final getInsetsListener()Ldefpackage/xz1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->E:Ldefpackage/xz1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/ra;->m0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()Ldefpackage/r62;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->v0:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/r62;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getLayoutNodes()Ldefpackage/e02;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getLayoutNodes()Ldefpackage/i03;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getLayoutNodes()Ldefpackage/i03;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldefpackage/i03;"
        }
    .end annotation

    .line 6
    iget-object p0, p0, Ldefpackage/ra;->G:Ldefpackage/i03;

    return-object p0
.end method

.method public getLocaleList()Ldefpackage/vd2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->T:Ldefpackage/dp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/dp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/vd2;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/ri2;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {v0}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Ldefpackage/ri2;->g:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()Ldefpackage/ex2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->x0:Ldefpackage/ex2;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getOutOfFrameExecutor()Ldefpackage/lb3;
    .locals 0

    .line 10
    invoke-virtual {p0}, Ldefpackage/ra;->getOutOfFrameExecutor()Ldefpackage/ra;

    move-result-object p0

    return-object p0
.end method

.method public getOutOfFrameExecutor()Ldefpackage/ra;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getPlacementScope()Ldefpackage/ig3;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/kg3;->a:Ldefpackage/k52;

    .line 2
    .line 3
    new-instance v0, Ldefpackage/df2;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p0}, Ldefpackage/df2;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final getPlayNavigationSoundEffect$ui()Ldefpackage/wf1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldefpackage/wf1;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->K0:Ldefpackage/wf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPointerIconService()Ldefpackage/nn3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->T0:Ldefpackage/pa;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui()Ldefpackage/dy1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->q:Ldefpackage/dy1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRectManager()Ldefpackage/yv3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->H:Ldefpackage/yv3;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetainedValuesStore()Ldefpackage/y14;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->u:Ldefpackage/y14;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRoot()Ldefpackage/c72;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->F:Ldefpackage/c72;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRootForTest()Ldefpackage/b34;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getSavedStateRegistry()Ldefpackage/bs0;
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->t:Ldefpackage/bs0;

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ldefpackage/h80;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/h80;->e:Ldefpackage/j54;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v1, Landroid/view/View;

    .line 25
    .line 26
    const v2, 0x7f0a0162

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    instance-of v3, v2, Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v2, v4

    .line 42
    :goto_0
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_1
    const-string v1, "SaveableStateRegistry:"

    .line 53
    .line 54
    invoke-static {v1, v2}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0}, Ldefpackage/j54;->f()Ldefpackage/rm3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, v1}, Ldefpackage/rm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v2, Ldefpackage/k2;

    .line 107
    .line 108
    const/16 v3, 0xd

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-direct {v2, v3, v5}, Ldefpackage/k2;-><init>(IB)V

    .line 112
    .line 113
    .line 114
    sget-object v3, Ldefpackage/z44;->a:Ldefpackage/wl4;

    .line 115
    .line 116
    new-instance v3, Ldefpackage/y44;

    .line 117
    .line 118
    invoke-direct {v3, v4, v2}, Ldefpackage/y44;-><init>(Ljava/util/Map;Ldefpackage/if1;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ldefpackage/rm3;->G(Ljava/lang/String;)Ldefpackage/i54;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    :try_start_0
    new-instance v2, Ldefpackage/cs0;

    .line 129
    .line 130
    invoke-direct {v2, v5, v3}, Ldefpackage/cs0;-><init>(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1, v2}, Ldefpackage/rm3;->L(Ljava/lang/String;Ldefpackage/i54;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    :catch_0
    :goto_2
    new-instance v2, Ldefpackage/bs0;

    .line 138
    .line 139
    new-instance v4, Ldefpackage/ds0;

    .line 140
    .line 141
    invoke-direct {v4, v5, v0, v1}, Ldefpackage/ds0;-><init>(ZLdefpackage/rm3;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v2, v3, v4}, Ldefpackage/bs0;-><init>(Ldefpackage/y44;Ldefpackage/ds0;)V

    .line 145
    .line 146
    .line 147
    iput-object v2, p0, Ldefpackage/ra;->t:Ldefpackage/bs0;

    .line 148
    .line 149
    return-object v2

    .line 150
    :cond_4
    return-object v0
.end method

.method public final getScrollCaptureInProgress()Z
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
    iget-object v0, p0, Ldefpackage/ra;->R0:Ldefpackage/rm2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/zd3;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    if-eqz p0, :cond_2

    .line 34
    .line 35
    instance-of v0, p0, Ldefpackage/ra;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast p0, Ldefpackage/ra;

    .line 40
    .line 41
    invoke-virtual {p0}, Ldefpackage/ra;->getScrollCaptureInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public getSemanticsOwner()Ldefpackage/l94;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->I:Ldefpackage/l94;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSharedDrawScope()Ldefpackage/e72;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->s:Ldefpackage/e72;

    .line 6
    .line 7
    return-object p0
.end method

.method public getShowLayoutBounds()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Ldefpackage/oe;->a:Ldefpackage/oe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ldefpackage/oe;->a(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-boolean p0, p0, Ldefpackage/ra;->b0:Z

    .line 15
    .line 16
    return p0
.end method

.method public getSnapshotObserver()Ldefpackage/wb3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->a0:Ldefpackage/wb3;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSoftwareKeyboardController()Ldefpackage/wh4;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->t0:Ldefpackage/om0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/om0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/ra;->getTextInputService()Ldefpackage/is4;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, v1}, Ldefpackage/om0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/ra;->t0:Ldefpackage/om0;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getTextInputService()Ldefpackage/is4;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->r0:Ldefpackage/is4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/is4;

    .line 6
    .line 7
    invoke-direct {p0}, Ldefpackage/ra;->getLegacyTextInputServiceAndroid()Ldefpackage/js4;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/ra;->r0:Ldefpackage/is4;

    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

.method public getTextToolbar()Ldefpackage/at4;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->y0:Ldefpackage/pa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/pa;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, v1}, Ldefpackage/pa;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/ra;->y0:Ldefpackage/pa;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final getUncaughtExceptionHandler$ui()Ldefpackage/a34;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getViewConfiguration()Ldefpackage/m65;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->r:Ldefpackage/gd;

    .line 6
    .line 7
    return-object p0
.end method

.method public getWindowInfo()Ldefpackage/ka5;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/h80;->t:Ldefpackage/om1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/ra;->H0:Ldefpackage/g5;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->z(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, Ldefpackage/ra;->n0:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Ldefpackage/ra;->q(Z)V

    .line 18
    .line 19
    .line 20
    const-string v2, "AndroidOwner:onTouch"

    .line 21
    .line 22
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget-object v2, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 30
    .line 31
    const/4 v10, 0x3

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 35
    .line 36
    .line 37
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-ne v3, v10, :cond_0

    .line 39
    .line 40
    move v11, v8

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v11, v7

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_11

    .line 46
    .line 47
    :goto_0
    const/16 v12, 0xa

    .line 48
    .line 49
    iget-object v13, v1, Ldefpackage/ra;->R:Ldefpackage/jw;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v3, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eq v3, v4, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v3, v7

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    :goto_1
    move v3, v8

    .line 77
    :goto_2
    if-eqz v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    :cond_3
    move-object v14, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    if-eq v3, v4, :cond_3

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eq v3, v12, :cond_5

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    const/4 v6, 0x1

    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-virtual/range {v1 .. v6}, Ldefpackage/ra;->G(Landroid/view/MotionEvent;IJZ)V

    .line 115
    .line 116
    .line 117
    move-object v14, v2

    .line 118
    goto :goto_4

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object/from16 v1, p0

    .line 121
    .line 122
    goto/16 :goto_11

    .line 123
    .line 124
    :cond_5
    move-object v14, v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    iget-boolean v1, v13, Ldefpackage/jw;->n:Z

    .line 127
    .line 128
    if-nez v1, :cond_6

    .line 129
    .line 130
    iget-object v1, v13, Ldefpackage/jw;->q:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Ldefpackage/pz1;

    .line 133
    .line 134
    iget-object v1, v1, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Ldefpackage/xe2;

    .line 137
    .line 138
    invoke-virtual {v1}, Ldefpackage/xe2;->a()V

    .line 139
    .line 140
    .line 141
    iget-object v1, v13, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Ldefpackage/cm1;

    .line 144
    .line 145
    invoke-virtual {v1}, Ldefpackage/cm1;->c()V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_4
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-ne v1, v10, :cond_7

    .line 153
    .line 154
    move v1, v8

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move v1, v7

    .line 157
    :goto_5
    const/16 v15, 0x9

    .line 158
    .line 159
    if-nez v11, :cond_8

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    if-eq v9, v10, :cond_8

    .line 164
    .line 165
    if-eq v9, v15, :cond_8

    .line 166
    .line 167
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->n(Landroid/view/MotionEvent;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_8

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    const/4 v6, 0x1

    .line 178
    const/16 v3, 0x9

    .line 179
    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    move-object v2, v0

    .line 183
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Ldefpackage/ra;->G(Landroid/view/MotionEvent;IJZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object/from16 v1, p0

    .line 188
    .line 189
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_9

    .line 194
    .line 195
    move v0, v8

    .line 196
    goto :goto_7

    .line 197
    :cond_9
    move v0, v7

    .line 198
    :goto_7
    const/16 v2, 0x8

    .line 199
    .line 200
    if-ne v9, v2, :cond_a

    .line 201
    .line 202
    if-nez v0, :cond_a

    .line 203
    .line 204
    if-eqz v14, :cond_a

    .line 205
    .line 206
    const/16 v0, 0x1002

    .line 207
    .line 208
    invoke-virtual {v14, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_a

    .line 213
    .line 214
    move v0, v8

    .line 215
    goto :goto_8

    .line 216
    :cond_a
    move v0, v7

    .line 217
    :goto_8
    if-eqz v14, :cond_b

    .line 218
    .line 219
    invoke-virtual {v14}, Landroid/view/MotionEvent;->recycle()V

    .line 220
    .line 221
    .line 222
    :cond_b
    iget-object v2, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 223
    .line 224
    if-eqz v2, :cond_16

    .line 225
    .line 226
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-ne v2, v12, :cond_16

    .line 231
    .line 232
    iget-object v2, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 233
    .line 234
    if-eqz v2, :cond_c

    .line 235
    .line 236
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    goto :goto_9

    .line 241
    :cond_c
    const/4 v2, -0x1

    .line 242
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 243
    .line 244
    .line 245
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    iget-object v4, v1, Ldefpackage/ra;->Q:Ldefpackage/tx2;

    .line 247
    .line 248
    if-ne v3, v15, :cond_d

    .line 249
    .line 250
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_d

    .line 255
    .line 256
    if-ltz v2, :cond_16

    .line 257
    .line 258
    iget-object v3, v4, Ldefpackage/tx2;->c:Landroid/util/SparseBooleanArray;

    .line 259
    .line 260
    invoke-virtual {v3, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 261
    .line 262
    .line 263
    iget-object v3, v4, Ldefpackage/tx2;->b:Landroid/util/SparseLongArray;

    .line 264
    .line 265
    invoke-virtual {v3, v2}, Landroid/util/SparseLongArray;->delete(I)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_e

    .line 269
    .line 270
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-nez v3, :cond_16

    .line 275
    .line 276
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-nez v3, :cond_16

    .line 281
    .line 282
    iget-object v3, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 283
    .line 284
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 285
    .line 286
    if-eqz v3, :cond_e

    .line 287
    .line 288
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    goto :goto_a

    .line 293
    :cond_e
    move v3, v5

    .line 294
    :goto_a
    iget-object v6, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 295
    .line 296
    if-eqz v6, :cond_f

    .line 297
    .line 298
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    cmpg-float v3, v3, v6

    .line 311
    .line 312
    if-nez v3, :cond_10

    .line 313
    .line 314
    cmpg-float v3, v5, v9

    .line 315
    .line 316
    if-nez v3, :cond_10

    .line 317
    .line 318
    move v3, v7

    .line 319
    goto :goto_b

    .line 320
    :cond_10
    move v3, v8

    .line 321
    :goto_b
    iget-object v5, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 322
    .line 323
    if-eqz v5, :cond_11

    .line 324
    .line 325
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getEventTime()J

    .line 326
    .line 327
    .line 328
    move-result-wide v5

    .line 329
    goto :goto_c

    .line 330
    :cond_11
    const-wide/16 v5, -0x1

    .line 331
    .line 332
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 333
    .line 334
    .line 335
    move-result-wide v9

    .line 336
    cmp-long v5, v5, v9

    .line 337
    .line 338
    if-eqz v5, :cond_12

    .line 339
    .line 340
    move v5, v8

    .line 341
    goto :goto_d

    .line 342
    :cond_12
    move v5, v7

    .line 343
    :goto_d
    if-nez v3, :cond_13

    .line 344
    .line 345
    if-eqz v5, :cond_16

    .line 346
    .line 347
    :cond_13
    if-ltz v2, :cond_14

    .line 348
    .line 349
    iget-object v3, v4, Ldefpackage/tx2;->c:Landroid/util/SparseBooleanArray;

    .line 350
    .line 351
    invoke-virtual {v3, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 352
    .line 353
    .line 354
    iget-object v3, v4, Ldefpackage/tx2;->b:Landroid/util/SparseLongArray;

    .line 355
    .line 356
    invoke-virtual {v3, v2}, Landroid/util/SparseLongArray;->delete(I)V

    .line 357
    .line 358
    .line 359
    :cond_14
    iget-object v2, v13, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v2, Ldefpackage/cm1;

    .line 362
    .line 363
    iget-boolean v3, v2, Ldefpackage/cm1;->d:Z

    .line 364
    .line 365
    if-eqz v3, :cond_15

    .line 366
    .line 367
    iput-boolean v8, v2, Ldefpackage/cm1;->d:Z

    .line 368
    .line 369
    goto :goto_e

    .line 370
    :cond_15
    iget-object v2, v2, Ldefpackage/cm1;->g:Ldefpackage/i63;

    .line 371
    .line 372
    iget-object v2, v2, Ldefpackage/i63;->a:Ldefpackage/f13;

    .line 373
    .line 374
    invoke-virtual {v2}, Ldefpackage/f13;->g()V

    .line 375
    .line 376
    .line 377
    :cond_16
    :goto_e
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    iput-object v2, v1, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 382
    .line 383
    if-eqz v0, :cond_17

    .line 384
    .line 385
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 386
    .line 387
    .line 388
    move-result-wide v4

    .line 389
    const/4 v6, 0x1

    .line 390
    const/16 v3, 0xa

    .line 391
    .line 392
    move-object/from16 v2, p1

    .line 393
    .line 394
    invoke-virtual/range {v1 .. v6}, Ldefpackage/ra;->G(Landroid/view/MotionEvent;IJZ)V

    .line 395
    .line 396
    .line 397
    :cond_17
    invoke-virtual/range {p0 .. p1}, Ldefpackage/ra;->F(Landroid/view/MotionEvent;)I

    .line 398
    .line 399
    .line 400
    move-result v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 401
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 402
    .line 403
    .line 404
    and-int/lit8 v1, v9, 0x4

    .line 405
    .line 406
    if-eqz v1, :cond_19

    .line 407
    .line 408
    :cond_18
    move-object/from16 v1, p0

    .line 409
    .line 410
    goto :goto_10

    .line 411
    :cond_19
    if-eqz v0, :cond_18

    .line 412
    .line 413
    iget-object v0, v13, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Ldefpackage/cm1;

    .line 416
    .line 417
    iget-boolean v1, v0, Ldefpackage/cm1;->d:Z

    .line 418
    .line 419
    if-eqz v1, :cond_1a

    .line 420
    .line 421
    iput-boolean v8, v0, Ldefpackage/cm1;->d:Z

    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_1a
    iget-object v0, v0, Ldefpackage/cm1;->g:Ldefpackage/i63;

    .line 425
    .line 426
    iget-object v0, v0, Ldefpackage/i63;->a:Ldefpackage/f13;

    .line 427
    .line 428
    invoke-virtual {v0}, Ldefpackage/f13;->g()V

    .line 429
    .line 430
    .line 431
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 432
    .line 433
    .line 434
    move-result-wide v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 435
    const/4 v6, 0x1

    .line 436
    const/16 v3, 0x9

    .line 437
    .line 438
    move-object/from16 v1, p0

    .line 439
    .line 440
    move-object/from16 v2, p1

    .line 441
    .line 442
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Ldefpackage/ra;->G(Landroid/view/MotionEvent;IJZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 443
    .line 444
    .line 445
    goto :goto_10

    .line 446
    :catchall_2
    move-exception v0

    .line 447
    goto :goto_12

    .line 448
    :catchall_3
    move-exception v0

    .line 449
    move-object/from16 v1, p0

    .line 450
    .line 451
    goto :goto_12

    .line 452
    :goto_10
    iput-boolean v7, v1, Ldefpackage/ra;->n0:Z

    .line 453
    .line 454
    return v9

    .line 455
    :goto_11
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 456
    .line 457
    .line 458
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 459
    :goto_12
    iput-boolean v7, v1, Ldefpackage/ra;->n0:Z

    .line 460
    .line 461
    throw v0
.end method

.method public final j(Ldefpackage/ba2;)V
    .locals 3

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ldefpackage/te5;->v()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Ldefpackage/ra;->setShowLayoutBounds(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Ldefpackage/ra;->s:Ldefpackage/ha2;

    .line 15
    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ra;->r:Ldefpackage/ga2;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, Ldefpackage/ha2;->a:Ldefpackage/pz1;

    .line 24
    .line 25
    iget-object v1, v0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ldefpackage/wf2;

    .line 28
    .line 29
    iget-boolean v2, v1, Ldefpackage/wf2;->n:Z

    .line 30
    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    iget-boolean v1, v1, Ldefpackage/wf2;->p:Z

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    :try_start_0
    new-instance v1, Ldefpackage/wc;

    .line 38
    .line 39
    const/16 v2, 0xd

    .line 40
    .line 41
    invoke-direct {v1, v2, p1}, Ldefpackage/wc;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p0, Ldefpackage/yd5;

    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/yd5;->a:Ldefpackage/u80;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ldefpackage/u80;->s(Ldefpackage/wc;)Ldefpackage/ez;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    iget-object p0, v0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ldefpackage/wf2;

    .line 56
    .line 57
    iget-boolean v0, p0, Ldefpackage/wf2;->o:Z

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v0, p0, Ldefpackage/wf2;->p:Z

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 67
    .line 68
    invoke-static {v0}, Ldefpackage/po3;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, Ldefpackage/wf2;->a()V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Ldefpackage/wf2;->p:Z

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    :goto_1
    iget-object v0, p1, Ldefpackage/ha2;->d:Ldefpackage/ez;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0}, Ldefpackage/ez;->cancel()V

    .line 83
    .line 84
    .line 85
    :cond_3
    iput-object p0, p1, Ldefpackage/ha2;->d:Ldefpackage/ez;

    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public final k(Ldefpackage/c72;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ldefpackage/ri2;->r(Ldefpackage/c72;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, Ldefpackage/f13;->p:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, Ldefpackage/c72;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ldefpackage/ra;->k(Ldefpackage/c72;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final n(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v0, v0, v2

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    cmpg-float v0, v1, p1

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    cmpg-float p0, p1, p0

    .line 33
    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final o(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p0, p0, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    cmpg-float v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    cmpg-float p0, p1, p0

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public final onAttachedToWindow()V
    .locals 8

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ldefpackage/c72;->G()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, Ldefpackage/c72;->d(Ldefpackage/ub3;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, v0}, Ldefpackage/ra;->setAttached(Z)V

    .line 23
    .line 24
    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x1e

    .line 28
    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    invoke-static {}, Ldefpackage/te5;->v()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p0, v1}, Ldefpackage/ra;->setShowLayoutBounds(Z)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v1, p0, Ldefpackage/ra;->E:Ldefpackage/xz1;

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ldefpackage/xz1;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v1, p0, Ldefpackage/ra;->P0:Z

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ldefpackage/h80;->e()V

    .line 52
    .line 53
    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    iput-boolean v1, p0, Ldefpackage/ra;->P0:Z

    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p0, v2}, Ldefpackage/ra;->k(Ldefpackage/c72;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Ldefpackage/ra;->i(Ldefpackage/c72;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v2, v2, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 76
    .line 77
    iget-object v3, v2, Ldefpackage/pp3;->e:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Ldefpackage/z;

    .line 80
    .line 81
    sget-object v4, Ldefpackage/jh4;->a:Ldefpackage/o54;

    .line 82
    .line 83
    invoke-static {v4}, Ldefpackage/jh4;->e(Ldefpackage/if1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object v4, Ldefpackage/jh4;->c:Ljava/lang/Object;

    .line 87
    .line 88
    monitor-enter v4

    .line 89
    :try_start_0
    sget-object v5, Ldefpackage/jh4;->h:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v3, v5}, Ldefpackage/q40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sput-object v5, Ldefpackage/jh4;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    monitor-exit v4

    .line 98
    new-instance v4, Ldefpackage/ss2;

    .line 99
    .line 100
    const/16 v5, 0x12

    .line 101
    .line 102
    invoke-direct {v4, v5, v3}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iput-object v4, v2, Ldefpackage/pp3;->i:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/ra;->getOutOfFrameExecutor()Ldefpackage/ra;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_f

    .line 112
    .line 113
    new-instance v3, Ldefpackage/da;

    .line 114
    .line 115
    invoke-direct {v3, p0, v0}, Ldefpackage/da;-><init>(Ldefpackage/ra;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ldefpackage/ra;->C(Ldefpackage/gf1;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2}, Ldefpackage/h80;->g()V

    .line 133
    .line 134
    .line 135
    iget-object v2, v2, Ldefpackage/h80;->f:Ldefpackage/f75;

    .line 136
    .line 137
    iget-object v3, p0, Ldefpackage/ra;->r:Ldefpackage/ga2;

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    if-eqz v2, :cond_9

    .line 141
    .line 142
    if-nez v3, :cond_3

    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :cond_3
    invoke-interface {v2}, Ldefpackage/f75;->d()Ldefpackage/e75;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    new-instance v3, Ldefpackage/c75;

    .line 151
    .line 152
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    sget-object v5, Ldefpackage/sf0;->b:Ldefpackage/sf0;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v6, Ldefpackage/bq4;

    .line 164
    .line 165
    invoke-direct {v6, v2, v3, v5}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 166
    .line 167
    .line 168
    const-class v2, Ldefpackage/ia2;

    .line 169
    .line 170
    invoke-static {v2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    if-eqz v3, :cond_8

    .line 179
    .line 180
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 181
    .line 182
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v6, v2, v3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Ldefpackage/ia2;

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    check-cast v3, Landroid/view/View;

    .line 200
    .line 201
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iget-object v2, v2, Ldefpackage/ia2;->b:Ldefpackage/i03;

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    if-nez v5, :cond_4

    .line 212
    .line 213
    new-instance v5, Ldefpackage/q03;

    .line 214
    .line 215
    invoke-direct {v5, v0}, Ldefpackage/q03;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v3, v5}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_4
    check-cast v5, Ldefpackage/q03;

    .line 222
    .line 223
    iget-object v2, v5, Ldefpackage/q03;->a:[Ljava/lang/Object;

    .line 224
    .line 225
    iget v3, v5, Ldefpackage/q03;->b:I

    .line 226
    .line 227
    :goto_0
    if-ge v1, v3, :cond_6

    .line 228
    .line 229
    aget-object v6, v2, v1

    .line 230
    .line 231
    move-object v7, v6

    .line 232
    check-cast v7, Ldefpackage/ha2;

    .line 233
    .line 234
    iget-boolean v7, v7, Ldefpackage/ha2;->c:Z

    .line 235
    .line 236
    if-nez v7, :cond_5

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_6
    move-object v6, v4

    .line 243
    :goto_1
    check-cast v6, Ldefpackage/ha2;

    .line 244
    .line 245
    if-nez v6, :cond_7

    .line 246
    .line 247
    new-instance v6, Ldefpackage/ha2;

    .line 248
    .line 249
    invoke-direct {v6}, Ldefpackage/ha2;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, v6}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_7
    iput-boolean v0, v6, Ldefpackage/ha2;->c:Z

    .line 256
    .line 257
    iput-object v6, p0, Ldefpackage/ra;->s:Ldefpackage/ha2;

    .line 258
    .line 259
    iget-object v1, v6, Ldefpackage/ha2;->b:Ldefpackage/pz1;

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 263
    .line 264
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_9
    :goto_2
    move-object v1, v4

    .line 269
    :goto_3
    if-nez v1, :cond_a

    .line 270
    .line 271
    sget-object v1, Ldefpackage/fz0;->b0:Ldefpackage/fz0;

    .line 272
    .line 273
    :cond_a
    iput-object v1, p0, Ldefpackage/ra;->u:Ldefpackage/y14;

    .line 274
    .line 275
    iget-object v1, p0, Ldefpackage/ra;->p0:Ldefpackage/if1;

    .line 276
    .line 277
    if-eqz v1, :cond_b

    .line 278
    .line 279
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-interface {v1, v2}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    iput-object v4, p0, Ldefpackage/ra;->p0:Ldefpackage/if1;

    .line 287
    .line 288
    :cond_b
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-interface {v1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1, p0}, Ldefpackage/ea2;->a(Ldefpackage/aa2;)V

    .line 301
    .line 302
    .line 303
    iget-object v2, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 304
    .line 305
    invoke-virtual {v1, v2}, Ldefpackage/ea2;->a(Ldefpackage/aa2;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Ldefpackage/ra;->getInputModeManager()Ldefpackage/sz1;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_c

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_c
    const/4 v0, 0x2

    .line 320
    :goto_4
    iget-object v1, v1, Ldefpackage/sz1;->a:Ldefpackage/zd3;

    .line 321
    .line 322
    new-instance v2, Ldefpackage/qz1;

    .line 323
    .line 324
    invoke-direct {v2, v0}, Ldefpackage/qz1;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v2}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 349
    .line 350
    .line 351
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 352
    .line 353
    const/16 v1, 0x1f

    .line 354
    .line 355
    if-lt v0, v1, :cond_d

    .line 356
    .line 357
    sget-object v0, Ldefpackage/eb;->a:Ldefpackage/eb;

    .line 358
    .line 359
    invoke-virtual {v0, p0}, Ldefpackage/eb;->b(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    :cond_d
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-eqz v0, :cond_e

    .line 367
    .line 368
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Ldefpackage/ey;

    .line 373
    .line 374
    iget-object v1, v1, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, Ldefpackage/q03;

    .line 377
    .line 378
    invoke-virtual {v1, v0}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    iget-object v1, v1, Ldefpackage/l94;->d:Ldefpackage/q03;

    .line 386
    .line 387
    invoke-virtual {v1, v0}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_e
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, Ldefpackage/ey;

    .line 395
    .line 396
    iget-object v0, v0, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, Ldefpackage/q03;

    .line 399
    .line 400
    invoke-virtual {v0, p0}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :cond_f
    const-string p0, "Expected the view to be attached to window."

    .line 405
    .line 406
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :catchall_0
    move-exception p0

    .line 411
    monitor-exit v4

    .line 412
    throw p0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->s0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Ldefpackage/ra;->getLegacyTextInputServiceAndroid()Ldefpackage/js4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 19
    .line 20
    .line 21
    goto :goto_0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ldefpackage/ra;->H(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/ra;->s0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Ldefpackage/ra;->getLegacyTextInputServiceAndroid()Ldefpackage/js4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 19
    .line 20
    .line 21
    goto :goto_0
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length p2, p1

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-ge v0, p2, :cond_3

    .line 9
    .line 10
    aget-wide v1, p1, v0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/lb;->d()Ldefpackage/e02;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-virtual {v3, v1}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ldefpackage/k94;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v1, v1, Ldefpackage/k94;->a:Ldefpackage/i94;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, Ldefpackage/db;->p()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/lb;->n:Ldefpackage/ra;

    .line 34
    .line 35
    invoke-static {v2}, Ldefpackage/j3;->m(Ldefpackage/ra;)Landroid/view/autofill/AutofillId;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v1, Ldefpackage/i94;->f:I

    .line 40
    .line 41
    int-to-long v3, v3

    .line 42
    invoke-static {v2, v3, v4}, Ldefpackage/db;->l(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v1, v1, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 47
    .line 48
    sget-object v3, Ldefpackage/n94;->z:Ldefpackage/p94;

    .line 49
    .line 50
    iget-object v1, v1, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x0

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    move-object v1, v3

    .line 60
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    const-string v4, "\n"

    .line 65
    .line 66
    const/16 v5, 0x3e

    .line 67
    .line 68
    invoke-static {v1, v4, v3, v5}, Ldefpackage/gc2;->a(Ljava/util/List;Ljava/lang/String;Ldefpackage/k52;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, Ldefpackage/he;

    .line 73
    .line 74
    invoke-direct {v3, v1}, Ldefpackage/he;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Ldefpackage/db;->j(Ldefpackage/he;)Landroid/view/translation/TranslationRequestValue;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v2, v1}, Ldefpackage/db;->y(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Ldefpackage/db;->m(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p3, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Ldefpackage/ra;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/ra;->E:Ldefpackage/xz1;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ldefpackage/xz1;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/ra;->y:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {}, Ldefpackage/ra;->l()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1c

    .line 29
    .line 30
    if-le v1, v2, :cond_1

    .line 31
    .line 32
    sget-object v1, Ldefpackage/ra;->X0:Ldefpackage/q03;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    invoke-virtual {v1, p0}, Ldefpackage/q03;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    monitor-exit v1

    .line 43
    throw p0

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ldefpackage/h80;->b()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, v1, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 56
    .line 57
    iget-object v2, v2, Ldefpackage/pp3;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ldefpackage/ss2;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Ldefpackage/ss2;->d()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v1, v1, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 67
    .line 68
    iget-object v2, v1, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v2

    .line 71
    :try_start_1
    iget-object v1, v1, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ldefpackage/f13;

    .line 74
    .line 75
    iget-object v3, v1, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 76
    .line 77
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 78
    .line 79
    move v4, v0

    .line 80
    :goto_1
    if-ge v4, v1, :cond_3

    .line 81
    .line 82
    aget-object v5, v3, v4

    .line 83
    .line 84
    check-cast v5, Ldefpackage/sh4;

    .line 85
    .line 86
    iget-object v6, v5, Ldefpackage/sh4;->e:Ldefpackage/w03;

    .line 87
    .line 88
    invoke-virtual {v6}, Ldefpackage/w03;->a()V

    .line 89
    .line 90
    .line 91
    iget-object v6, v5, Ldefpackage/sh4;->f:Ldefpackage/w03;

    .line 92
    .line 93
    invoke-virtual {v6}, Ldefpackage/w03;->a()V

    .line 94
    .line 95
    .line 96
    iget-object v6, v5, Ldefpackage/sh4;->l:Ldefpackage/w03;

    .line 97
    .line 98
    invoke-virtual {v6}, Ldefpackage/w03;->a()V

    .line 99
    .line 100
    .line 101
    iget-object v5, v5, Ldefpackage/sh4;->m:Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move-object p0, v0

    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_3
    monitor-exit v2

    .line 114
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v2, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Ldefpackage/ra;->s:Ldefpackage/ha2;

    .line 156
    .line 157
    if-eqz v1, :cond_4

    .line 158
    .line 159
    iput-boolean v0, v1, Ldefpackage/ha2;->c:Z

    .line 160
    .line 161
    :cond_4
    const/4 v0, 0x0

    .line 162
    iput-object v0, p0, Ldefpackage/ra;->s:Ldefpackage/ha2;

    .line 163
    .line 164
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 165
    .line 166
    const/16 v2, 0x1f

    .line 167
    .line 168
    if-lt v1, v2, :cond_5

    .line 169
    .line 170
    sget-object v1, Ldefpackage/eb;->a:Ldefpackage/eb;

    .line 171
    .line 172
    invoke-virtual {v1, p0}, Ldefpackage/eb;->a(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-eqz v1, :cond_6

    .line 180
    .line 181
    invoke-virtual {p0}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-object v2, v2, Ldefpackage/l94;->d:Ldefpackage/q03;

    .line 186
    .line 187
    invoke-virtual {v2, v1}, Ldefpackage/q03;->j(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Ldefpackage/ey;

    .line 195
    .line 196
    iget-object v2, v2, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Ldefpackage/q03;

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Ldefpackage/q03;->j(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    :cond_6
    invoke-virtual {p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iget-object v2, v1, Ldefpackage/yv3;->d:Ldefpackage/pt4;

    .line 208
    .line 209
    const/4 v8, 0x0

    .line 210
    const/4 v9, 0x0

    .line 211
    const-wide/16 v3, 0x0

    .line 212
    .line 213
    const-wide/16 v5, 0x0

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    invoke-virtual/range {v2 .. v9}, Ldefpackage/pt4;->b(JJ[FII)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    iput-boolean v2, v1, Ldefpackage/yv3;->g:Z

    .line 221
    .line 222
    invoke-virtual {p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ldefpackage/yv3;->a()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iget-object v2, v1, Ldefpackage/yv3;->i:Ldefpackage/ga;

    .line 234
    .line 235
    if-eqz v2, :cond_7

    .line 236
    .line 237
    iget-object v3, v1, Ldefpackage/yv3;->b:Ldefpackage/ra;

    .line 238
    .line 239
    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 240
    .line 241
    .line 242
    iput-object v0, v1, Ldefpackage/yv3;->i:Ldefpackage/ga;

    .line 243
    .line 244
    :cond_7
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Ldefpackage/ey;

    .line 249
    .line 250
    iget-object v0, v0, Ldefpackage/ey;->g:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Ldefpackage/q03;

    .line 253
    .line 254
    invoke-virtual {v0, p0}, Ldefpackage/q03;->j(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :goto_2
    monitor-exit v2

    .line 259
    throw p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/ey;

    .line 17
    .line 18
    iget-object p1, p0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ldefpackage/ba1;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-static {p1, p2}, Ldefpackage/uc5;->P(Ldefpackage/ba1;Z)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p2}, Ldefpackage/ey;->h(Ldefpackage/ba1;)V

    .line 38
    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    sget-object p0, Ldefpackage/z91;->n:Ldefpackage/z91;

    .line 43
    .line 44
    sget-object p2, Ldefpackage/z91;->p:Ldefpackage/z91;

    .line 45
    .line 46
    invoke-virtual {p1, p0, p2}, Ldefpackage/ba1;->r0(Ldefpackage/z91;Ldefpackage/z91;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ldefpackage/ra;->m0:J

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/ra;->I()V

    .line 6
    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    if-gt v1, v0, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x22

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ldefpackage/ra;->H(Landroid/content/res/Configuration;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const-string p1, "AndroidOwner:onLayout"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :try_start_0
    iput-wide v0, p0, Ldefpackage/ra;->m0:J

    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/ra;->M0:Ldefpackage/da;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ldefpackage/ri2;->l(Ldefpackage/gf1;)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Ldefpackage/ra;->d0:Ldefpackage/nc0;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/ra;->I()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const-string p1, "AndroidOwner:viewLayout"

    .line 28
    .line 29
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/ra;->getAndroidViewsHandler$ui()Ldefpackage/id;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sub-int/2addr p4, p2

    .line 37
    sub-int/2addr p5, p3

    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:onMeasure"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ldefpackage/c72;->G()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p0}, Ldefpackage/c72;->d(Ldefpackage/ub3;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v1}, Ldefpackage/ra;->k(Ldefpackage/c72;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, Ldefpackage/ra;->f(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const/16 p1, 0x20

    .line 43
    .line 44
    ushr-long v3, v1, p1

    .line 45
    .line 46
    long-to-int v3, v3

    .line 47
    const-wide v4, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v1, v4

    .line 53
    long-to-int v1, v1

    .line 54
    invoke-static {p2}, Ldefpackage/ra;->f(I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    ushr-long p1, v6, p1

    .line 59
    .line 60
    long-to-int p1, p1

    .line 61
    and-long/2addr v4, v6

    .line 62
    long-to-int p2, v4

    .line 63
    invoke-static {v3, v1, p1, p2}, Ldefpackage/zz1;->l(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p1

    .line 67
    iget-object v1, p0, Ldefpackage/ra;->d0:Ldefpackage/nc0;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    new-instance v1, Ldefpackage/nc0;

    .line 72
    .line 73
    invoke-direct {v1, p1, p2}, Ldefpackage/nc0;-><init>(J)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, Ldefpackage/ra;->d0:Ldefpackage/nc0;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    iput-boolean v1, p0, Ldefpackage/ra;->e0:Z

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iget-wide v1, v1, Ldefpackage/nc0;->a:J

    .line 83
    .line 84
    invoke-static {v1, v2, p1, p2}, Ldefpackage/nc0;->b(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    iput-boolean v1, p0, Ldefpackage/ra;->e0:Z

    .line 92
    .line 93
    :cond_3
    :goto_0
    invoke-virtual {v0, p1, p2}, Ldefpackage/ri2;->s(J)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ldefpackage/ri2;->n()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p1, p1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 104
    .line 105
    iget-object p1, p1, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 106
    .line 107
    iget p1, p1, Ldefpackage/jg3;->n:I

    .line 108
    .line 109
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    iget-object p2, p2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 114
    .line 115
    iget-object p2, p2, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 116
    .line 117
    iget p2, p2, Ldefpackage/jg3;->o:I

    .line 118
    .line 119
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    const-string p1, "AndroidOwner:androidViewMeasure"

    .line 127
    .line 128
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 129
    .line 130
    .line 131
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/ra;->getAndroidViewsHandler$ui()Ldefpackage/id;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iget-object p2, p2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 140
    .line 141
    iget-object p2, p2, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 142
    .line 143
    iget p2, p2, Ldefpackage/jg3;->n:I

    .line 144
    .line 145
    const/high16 v0, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 156
    .line 157
    iget-object p0, p0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 158
    .line 159
    iget p0, p0, Ldefpackage/jg3;->o:I

    .line 160
    .line 161
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    .line 167
    .line 168
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catchall_0
    move-exception p0

    .line 173
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 174
    .line 175
    .line 176
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :catchall_1
    move-exception p0

    .line 182
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 183
    .line 184
    .line 185
    throw p0
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 0

    .line 1
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p2, p0, Ldefpackage/ra;->Q0:Z

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/ra;->x(Landroid/view/ViewStructure;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2002

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x4002

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ra;->getPointerIconService()Ldefpackage/nn3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/ra;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Ldefpackage/r91;->a:[I

    .line 6
    .line 7
    sget-object v0, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Ldefpackage/r62;->o:Ldefpackage/r62;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object p1, v0

    .line 20
    :goto_0
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v0, p1

    .line 24
    :goto_1
    invoke-direct {p0, v0}, Ldefpackage/ra;->setLayoutDirection(Ldefpackage/r62;)V

    .line 25
    .line 26
    .line 27
    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 12

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x1f

    .line 4
    .line 5
    if-lt p1, p2, :cond_2

    .line 6
    .line 7
    iget-object v4, p0, Ldefpackage/ra;->R0:Ldefpackage/rm2;

    .line 8
    .line 9
    if-eqz v4, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/ra;->getSemanticsOwner()Ldefpackage/l94;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Ldefpackage/ra;->getCoroutineContext()Ldefpackage/ne0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v9, Ldefpackage/f13;

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    new-array v0, v0, [Ldefpackage/j64;

    .line 24
    .line 25
    invoke-direct {v9, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ldefpackage/l94;->a()Ldefpackage/i94;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v5, Ldefpackage/i64;

    .line 33
    .line 34
    const-string v11, "add(Ljava/lang/Object;)Z"

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    const-class v8, Ldefpackage/f13;

    .line 40
    .line 41
    const-string v10, "add"

    .line 42
    .line 43
    invoke-direct/range {v5 .. v11}, Ldefpackage/a6;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0, v5}, Ldefpackage/gb;->h0(Ldefpackage/i94;ILdefpackage/i64;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Ldefpackage/o54;

    .line 51
    .line 52
    const/16 v1, 0xa

    .line 53
    .line 54
    invoke-direct {p1, v1}, Ldefpackage/o54;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Ldefpackage/o54;

    .line 58
    .line 59
    const/16 v2, 0xb

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ldefpackage/o54;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    new-array v2, v2, [Ldefpackage/if1;

    .line 66
    .line 67
    aput-object p1, v2, v0

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    aput-object v1, v2, p1

    .line 71
    .line 72
    new-instance v1, Ldefpackage/w60;

    .line 73
    .line 74
    invoke-direct {v1, p1, v2}, Ldefpackage/w60;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v9, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 78
    .line 79
    iget v3, v9, Ldefpackage/f13;->p:I

    .line 80
    .line 81
    invoke-static {v2, v0, v3, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 82
    .line 83
    .line 84
    iget v0, v9, Ldefpackage/f13;->p:I

    .line 85
    .line 86
    if-nez v0, :cond_0

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    sub-int/2addr v0, p1

    .line 91
    iget-object v1, v9, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 92
    .line 93
    aget-object v0, v1, v0

    .line 94
    .line 95
    :goto_0
    move-object v6, v0

    .line 96
    check-cast v6, Ldefpackage/j64;

    .line 97
    .line 98
    if-nez v6, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    iget-object v2, v6, Ldefpackage/j64;->c:Ldefpackage/k02;

    .line 102
    .line 103
    invoke-static {p2}, Ldefpackage/te5;->a(Ldefpackage/ne0;)Ldefpackage/td0;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-instance v0, Ldefpackage/a80;

    .line 108
    .line 109
    iget-object v1, v6, Ldefpackage/j64;->a:Ldefpackage/i94;

    .line 110
    .line 111
    move-object v5, p0

    .line 112
    invoke-direct/range {v0 .. v5}, Ldefpackage/a80;-><init>(Ldefpackage/i94;Ldefpackage/k02;Ldefpackage/td0;Ldefpackage/rm2;Ldefpackage/ra;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, v6, Ldefpackage/j64;->d:Ldefpackage/f63;

    .line 116
    .line 117
    invoke-static {p0}, Ldefpackage/wr1;->n(Ldefpackage/q62;)Ldefpackage/q62;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-interface {p2, p0, p1}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    iget p1, v2, Ldefpackage/k02;->a:I

    .line 126
    .line 127
    iget p2, v2, Ldefpackage/k02;->b:I

    .line 128
    .line 129
    int-to-long v3, p1

    .line 130
    const/16 p1, 0x20

    .line 131
    .line 132
    shl-long/2addr v3, p1

    .line 133
    int-to-long v6, p2

    .line 134
    const-wide v8, 0xffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v6, v8

    .line 140
    or-long/2addr v3, v6

    .line 141
    invoke-static {p0}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Ldefpackage/uo;->U(Ldefpackage/k02;)Landroid/graphics/Rect;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    new-instance p2, Landroid/graphics/Point;

    .line 150
    .line 151
    shr-long v6, v3, p1

    .line 152
    .line 153
    long-to-int p1, v6

    .line 154
    and-long/2addr v3, v8

    .line 155
    long-to-int v1, v3

    .line 156
    invoke-direct {p2, p1, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 157
    .line 158
    .line 159
    invoke-static {v5, p0, p2, v0}, Ldefpackage/go2;->h(Ldefpackage/ra;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {v2}, Ldefpackage/uo;->U(Ldefpackage/k02;)Landroid/graphics/Rect;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p0, p1}, Ldefpackage/go2;->u(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p3, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_2
    :goto_1
    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->I()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onStop(Ldefpackage/ba2;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->s:Ldefpackage/ha2;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    iget-object p1, p0, Ldefpackage/ha2;->a:Ldefpackage/pz1;

    .line 6
    .line 7
    iget-object p1, p1, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ldefpackage/wf2;

    .line 10
    .line 11
    iget-boolean v0, p1, Ldefpackage/wf2;->n:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p1, Ldefpackage/wf2;->p:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Ldefpackage/ha2;->d:Ldefpackage/ez;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ldefpackage/ez;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Ldefpackage/ha2;->d:Ldefpackage/ez;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean p0, p1, Ldefpackage/wf2;->o:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-boolean p0, p1, Ldefpackage/wf2;->p:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    const-string p0, "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/po3;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p0, p1, Ldefpackage/wf2;->q:Ldefpackage/w03;

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/w03;->i()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_4

    .line 51
    .line 52
    const-string p0, "Attempted to start retaining exited values with pending exited values"

    .line 53
    .line 54
    invoke-static {p0}, Ldefpackage/po3;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p0, 0x0

    .line 58
    iput-boolean p0, p1, Ldefpackage/wf2;->p:Z

    .line 59
    .line 60
    :cond_5
    :goto_0
    return-void
.end method

.method public final onTouchModeChanged(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getInputModeManager()Ldefpackage/sz1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x2

    .line 10
    :goto_0
    iget-object p0, p0, Ldefpackage/sz1;->a:Ldefpackage/zd3;

    .line 11
    .line 12
    new-instance v0, Ldefpackage/qz1;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ldefpackage/qz1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, p1}, Ldefpackage/uo;->p(Ldefpackage/lb;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Ldefpackage/lb;->n:Ldefpackage/ra;

    .line 36
    .line 37
    new-instance v1, Ldefpackage/k6;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v1, v2, p0, p1}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/ra;->O0:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v0, 0x1e

    .line 12
    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ldefpackage/te5;->v()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Ldefpackage/ra;->getShowLayoutBounds()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq v0, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/ra;->setShowLayoutBounds(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ldefpackage/ra;->i(Ldefpackage/c72;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final p(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ra;->k0:[F

    .line 5
    .line 6
    invoke-static {p1, p2, v0}, Ldefpackage/ya4;->A(J[F)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v1, p1, v0

    .line 13
    .line 14
    long-to-int v1, v1

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-wide v2, p0, Ldefpackage/ra;->o0:J

    .line 20
    .line 21
    shr-long/2addr v2, v0

    .line 22
    long-to-int v2, v2

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-float/2addr v2, v1

    .line 28
    const-wide v3, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p1, v3

    .line 34
    long-to-int p1, p1

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-wide v5, p0, Ldefpackage/ra;->o0:J

    .line 40
    .line 41
    and-long/2addr v5, v3

    .line 42
    long-to-int p0, v5

    .line 43
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-float/2addr p0, p1

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-long p1, p1

    .line 53
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-long v1, p0

    .line 58
    shl-long p0, p1, v0

    .line 59
    .line 60
    and-long v0, v1, v3

    .line 61
    .line 62
    or-long/2addr p0, v0

    .line 63
    return-wide p0
.end method

.method public final q(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldefpackage/i61;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Ldefpackage/ri2;->e:Ldefpackage/rm3;

    .line 12
    .line 13
    iget-object v1, v1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ldefpackage/f13;

    .line 16
    .line 17
    iget v1, v1, Ldefpackage/f13;->p:I

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 24
    .line 25
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :try_start_0
    iget-object p1, p0, Ldefpackage/ra;->M0:Ldefpackage/da;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object p1, p0, Ldefpackage/ra;->N0:Ldefpackage/da;

    .line 34
    .line 35
    :goto_1
    invoke-virtual {v0, p1}, Ldefpackage/ri2;->l(Ldefpackage/gf1;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 42
    .line 43
    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    invoke-virtual {v0, p1}, Ldefpackage/ri2;->b(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ldefpackage/yv3;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    throw p0
.end method

.method public final r(Ldefpackage/c72;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Ldefpackage/ri2;->m(Ldefpackage/c72;J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/i61;->o()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Ldefpackage/ri2;->b(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/ra;->getRectManager()Ldefpackage/yv3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ldefpackage/yv3;->a()V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/ra;->N0:Ldefpackage/da;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/da;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    throw p0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-static {p1}, Ldefpackage/r91;->c(I)Ldefpackage/o91;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget p1, p1, Ldefpackage/o91;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x7

    .line 19
    :goto_0
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    new-instance v3, Ldefpackage/wv3;

    .line 27
    .line 28
    iget v4, p2, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    int-to-float v4, v4

    .line 31
    iget v5, p2, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    int-to-float v5, v5

    .line 34
    iget v6, p2, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    int-to-float v6, v6

    .line 37
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    int-to-float p2, p2

    .line 40
    invoke-direct {v3, v4, v5, v6, p2}, Ldefpackage/wv3;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v3, v2

    .line 45
    :goto_1
    new-instance p2, Ldefpackage/ha;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {p2, p1, v4}, Ldefpackage/ha;-><init>(II)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Ldefpackage/ey;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3, p2}, Ldefpackage/ey;->e(ILdefpackage/wv3;Ldefpackage/if1;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    new-instance v3, Ldefpackage/ha;

    .line 71
    .line 72
    invoke-direct {v3, p1, v1}, Ldefpackage/ha;-><init>(II)V

    .line 73
    .line 74
    .line 75
    check-cast p2, Ldefpackage/ey;

    .line 76
    .line 77
    invoke-virtual {p2, p1, v2, v3}, Ldefpackage/ey;->e(ILdefpackage/wv3;Ldefpackage/if1;)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    :goto_2
    return v1

    .line 88
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_6

    .line 93
    .line 94
    if-ne p1, v1, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    const/4 p2, 0x2

    .line 98
    if-ne p1, p2, :cond_6

    .line 99
    .line 100
    :goto_3
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Ldefpackage/ey;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ldefpackage/ey;->g(I)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :cond_6
    return v4
.end method

.method public final s()V
    .locals 12

    .line 1
    iget-boolean v0, p0, Ldefpackage/ra;->W:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 13
    .line 14
    new-instance v4, Ldefpackage/k52;

    .line 15
    .line 16
    const/16 v5, 0x19

    .line 17
    .line 18
    invoke-direct {v4, v5}, Ldefpackage/k52;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v5, v0, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v5

    .line 24
    :try_start_0
    iget-object v0, v0, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/f13;

    .line 27
    .line 28
    iget v6, v0, Ldefpackage/f13;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    move v7, v3

    .line 31
    move v8, v7

    .line 32
    :goto_0
    iget-object v9, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 33
    .line 34
    if-ge v7, v6, :cond_3

    .line 35
    .line 36
    :try_start_1
    aget-object v9, v9, v7

    .line 37
    .line 38
    check-cast v9, Ldefpackage/sh4;

    .line 39
    .line 40
    invoke-virtual {v9, v4}, Ldefpackage/sh4;->c(Ldefpackage/k52;)V

    .line 41
    .line 42
    .line 43
    iget-object v9, v9, Ldefpackage/sh4;->f:Ldefpackage/w03;

    .line 44
    .line 45
    iget v9, v9, Ldefpackage/w03;->e:I

    .line 46
    .line 47
    if-eqz v9, :cond_0

    .line 48
    .line 49
    move v9, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v9, v3

    .line 52
    :goto_1
    if-nez v9, :cond_1

    .line 53
    .line 54
    add-int/lit8 v8, v8, 0x1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    if-lez v8, :cond_2

    .line 58
    .line 59
    iget-object v9, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 60
    .line 61
    sub-int v10, v7, v8

    .line 62
    .line 63
    aget-object v11, v9, v7

    .line 64
    .line 65
    aput-object v11, v9, v10

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    sub-int v4, v6, v8

    .line 74
    .line 75
    invoke-static {v9, v4, v6, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput v4, v0, Ldefpackage/f13;->p:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit v5

    .line 81
    iput-boolean v3, p0, Ldefpackage/ra;->W:Z

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :goto_3
    monitor-exit v5

    .line 85
    throw p0

    .line 86
    :cond_4
    :goto_4
    iget-object v0, p0, Ldefpackage/ra;->c0:Ldefpackage/id;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {v0}, Ldefpackage/ra;->e(Landroid/view/ViewGroup;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-static {}, Ldefpackage/ra;->d()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    iget-object v4, v0, Ldefpackage/y9;->t:Ldefpackage/j03;

    .line 106
    .line 107
    iget v5, v4, Ldefpackage/j03;->d:I

    .line 108
    .line 109
    if-nez v5, :cond_6

    .line 110
    .line 111
    iget-boolean v5, v0, Ldefpackage/y9;->u:Z

    .line 112
    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    iget-object v5, v0, Ldefpackage/y9;->n:Ldefpackage/qr2;

    .line 116
    .line 117
    invoke-virtual {v5}, Ldefpackage/qr2;->k()Landroid/view/autofill/AutofillManager;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v5}, Ldefpackage/gm0;->t(Landroid/view/autofill/AutofillManager;)V

    .line 122
    .line 123
    .line 124
    iput-boolean v3, v0, Ldefpackage/y9;->u:Z

    .line 125
    .line 126
    :cond_6
    iget v4, v4, Ldefpackage/j03;->d:I

    .line 127
    .line 128
    if-eqz v4, :cond_7

    .line 129
    .line 130
    iput-boolean v2, v0, Ldefpackage/y9;->u:Z

    .line 131
    .line 132
    :cond_7
    :goto_5
    iget-object v0, p0, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 133
    .line 134
    invoke-virtual {v0}, Ldefpackage/q03;->i()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_a

    .line 139
    .line 140
    iget-object v0, p0, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 141
    .line 142
    invoke-virtual {v0, v3}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    iget-object v0, p0, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 149
    .line 150
    iget v0, v0, Ldefpackage/q03;->b:I

    .line 151
    .line 152
    move v2, v3

    .line 153
    :goto_6
    iget-object v4, p0, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 154
    .line 155
    if-ge v2, v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {v4, v2}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Ldefpackage/gf1;

    .line 162
    .line 163
    iget-object v5, p0, Ldefpackage/ra;->C0:Ldefpackage/q03;

    .line 164
    .line 165
    invoke-virtual {v5, v2, v1}, Ldefpackage/q03;->n(ILjava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    invoke-interface {v4}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    invoke-virtual {v4, v3, v0}, Ldefpackage/q03;->l(II)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_a
    return-void
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 2
    .line 3
    iput-wide p1, p0, Ldefpackage/ya;->u:J

    .line 4
    .line 5
    return-void
.end method

.method public final setComposeViewContext(Ldefpackage/h80;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getCoroutineContext()Ldefpackage/ne0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/ra;->getRoot()Ldefpackage/c72;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ldefpackage/c13;

    .line 24
    .line 25
    invoke-virtual {v0}, Ldefpackage/c13;->isEmpty()Z

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
    const-string v0, "Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first."

    .line 33
    .line 34
    invoke-static {v0}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-static {}, Ldefpackage/ya4;->t()Ldefpackage/ch4;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Ldefpackage/ch4;->e()Ldefpackage/if1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_1
    invoke-static {v0}, Ldefpackage/ya4;->z(Ldefpackage/ch4;)Ldefpackage/ch4;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :try_start_0
    invoke-direct {p0}, Ldefpackage/ra;->get_composeViewContext()Ldefpackage/h80;

    .line 54
    .line 55
    .line 56
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    invoke-static {v0, v2, v1}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 58
    .line 59
    .line 60
    if-eq p1, v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3}, Ldefpackage/h80;->b()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ldefpackage/h80;->e()V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-direct {p0, p1}, Ldefpackage/ra;->set_composeViewContext(Ldefpackage/h80;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Ldefpackage/ra;->setCoroutineContext(Ldefpackage/ne0;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return-void

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    invoke-static {v0, v2, v1}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public final setComposeViewContextIncrementedDuringInit$ui(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldefpackage/ra;->P0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setConfiguration(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->S:Ldefpackage/zd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setContentCaptureManager$ui(Ldefpackage/lb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Ldefpackage/ne0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ra;->A:Ldefpackage/ne0;

    .line 2
    .line 3
    return-void
.end method

.method public final setFrameEndScheduler$ui(Ldefpackage/ga2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ra;->r:Ldefpackage/ga2;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ldefpackage/ra;->m0:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnReadyForComposition(Ldefpackage/if1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/if1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldefpackage/ra;->getDerivedIsAttached()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Ldefpackage/ra;->P0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput-object p1, p0, Ldefpackage/ra;->p0:Ldefpackage/if1;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setPlayNavigationSoundEffect$ui(Ldefpackage/wf1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/wf1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldefpackage/ra;->K0:Ldefpackage/wf1;

    .line 2
    .line 3
    return-void
.end method

.method public final setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui(Ldefpackage/dy1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ra;->q:Ldefpackage/dy1;

    .line 2
    .line 3
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldefpackage/ra;->b0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setUncaughtExceptionHandler(Ldefpackage/a34;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setUncaughtExceptionHandler$ui(Ldefpackage/a34;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final t(Ldefpackage/c72;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ldefpackage/ya;->K:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/ya;->v()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Ldefpackage/ya;->w(Ldefpackage/c72;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p0, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 17
    .line 18
    iput-boolean v1, p0, Ldefpackage/lb;->t:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/lb;->e()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/lb;->u:Ldefpackage/aw;

    .line 27
    .line 28
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final u(Ldefpackage/c72;ZZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 6
    .line 7
    iget-object v1, p1, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 8
    .line 9
    iget-object v2, p1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v1, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    .line 15
    .line 16
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, v2, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_a

    .line 27
    .line 28
    if-eq v1, v3, :cond_c

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-eq v1, v4, :cond_a

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    if-eq v1, v4, :cond_a

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-ne v1, v4, :cond_9

    .line 38
    .line 39
    iget-boolean v1, v2, Ldefpackage/f72;->e:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    iput-boolean v3, v2, Ldefpackage/f72;->e:Z

    .line 48
    .line 49
    iget-object p3, v2, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 50
    .line 51
    iput-boolean v3, p3, Ldefpackage/ti2;->E:Z

    .line 52
    .line 53
    iget-boolean p3, p1, Ldefpackage/c72;->Z:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Ldefpackage/c72;->I()Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {p3, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Ldefpackage/ri2;->i(Ldefpackage/c72;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_7

    .line 81
    .line 82
    iget-object p3, p3, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 83
    .line 84
    iget-boolean p3, p3, Ldefpackage/f72;->e:Z

    .line 85
    .line 86
    if-ne p3, v3, :cond_7

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Ldefpackage/c72;->H()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-static {p1}, Ldefpackage/ri2;->j(Ldefpackage/c72;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_8

    .line 99
    .line 100
    :cond_5
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    invoke-virtual {p3}, Ldefpackage/c72;->q()Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-ne p3, v3, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    sget-object p3, Ldefpackage/n12;->p:Ldefpackage/n12;

    .line 114
    .line 115
    invoke-virtual {p2, p1, p3}, Ldefpackage/i61;->c(Ldefpackage/c72;Ldefpackage/n12;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    sget-object p3, Ldefpackage/n12;->n:Ldefpackage/n12;

    .line 120
    .line 121
    invoke-virtual {p2, p1, p3}, Ldefpackage/i61;->c(Ldefpackage/c72;Ldefpackage/n12;)V

    .line 122
    .line 123
    .line 124
    :cond_8
    :goto_1
    iget-boolean p2, v0, Ldefpackage/ri2;->d:Z

    .line 125
    .line 126
    if-nez p2, :cond_c

    .line 127
    .line 128
    if-eqz p4, :cond_c

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Ldefpackage/ra;->D(Ldefpackage/c72;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_9
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_a
    iget-object p0, v0, Ldefpackage/ri2;->h:Ldefpackage/f13;

    .line 139
    .line 140
    new-instance p2, Ldefpackage/qi2;

    .line 141
    .line 142
    invoke-direct {p2, p1, v3, p3}, Ldefpackage/qi2;-><init>(Ldefpackage/c72;ZZ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p2}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    invoke-virtual {v0, p1, p3}, Ldefpackage/ri2;->r(Ldefpackage/c72;Z)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_c

    .line 154
    .line 155
    if-eqz p4, :cond_c

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ldefpackage/ra;->D(Ldefpackage/c72;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    :goto_2
    return-void
.end method

.method public final v(Ldefpackage/c72;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldefpackage/n12;->q:Ldefpackage/n12;

    .line 5
    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    iget-object v7, p0, Ldefpackage/ra;->f0:Ldefpackage/ri2;

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget-object p2, v7, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 15
    .line 16
    iget-object v8, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-eq v8, v6, :cond_13

    .line 25
    .line 26
    if-eq v8, v5, :cond_1

    .line 27
    .line 28
    if-eq v8, v4, :cond_13

    .line 29
    .line 30
    if-ne v8, v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-boolean v3, v0, Ldefpackage/f72;->e:Z

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-boolean v3, v0, Ldefpackage/f72;->f:Z

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    :cond_2
    if-nez p3, :cond_3

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_3
    iput-boolean v6, v0, Ldefpackage/f72;->f:Z

    .line 50
    .line 51
    iput-boolean v6, v0, Ldefpackage/f72;->g:Z

    .line 52
    .line 53
    iget-object p3, v0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 54
    .line 55
    iput-boolean v6, p3, Ldefpackage/ti2;->F:Z

    .line 56
    .line 57
    iput-boolean v6, p3, Ldefpackage/ti2;->G:Z

    .line 58
    .line 59
    iget-boolean p3, p1, Ldefpackage/c72;->Z:Z

    .line 60
    .line 61
    if-eqz p3, :cond_4

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p1}, Ldefpackage/c72;->I()Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v0, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    if-eqz p3, :cond_5

    .line 82
    .line 83
    iget-object v0, p3, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 84
    .line 85
    iget-boolean v0, v0, Ldefpackage/f72;->e:Z

    .line 86
    .line 87
    if-ne v0, v6, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    if-eqz p3, :cond_6

    .line 91
    .line 92
    iget-object v0, p3, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 93
    .line 94
    iget-boolean v0, v0, Ldefpackage/f72;->f:Z

    .line 95
    .line 96
    if-ne v0, v6, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    sget-object p3, Ldefpackage/n12;->o:Ldefpackage/n12;

    .line 100
    .line 101
    invoke-virtual {p2, p1, p3}, Ldefpackage/i61;->c(Ldefpackage/c72;Ldefpackage/n12;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ldefpackage/c72;->H()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    if-eqz p3, :cond_8

    .line 112
    .line 113
    invoke-virtual {p3}, Ldefpackage/c72;->p()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v6, :cond_8

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    if-eqz p3, :cond_9

    .line 121
    .line 122
    invoke-virtual {p3}, Ldefpackage/c72;->q()Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-ne p3, v6, :cond_9

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    invoke-virtual {p2, p1, v2}, Ldefpackage/i61;->c(Ldefpackage/c72;Ldefpackage/n12;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_2
    iget-boolean p1, v7, Ldefpackage/ri2;->d:Z

    .line 133
    .line 134
    if-nez p1, :cond_13

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Ldefpackage/ra;->D(Ldefpackage/c72;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p2, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_13

    .line 150
    .line 151
    if-eq p2, v6, :cond_13

    .line 152
    .line 153
    if-eq p2, v5, :cond_13

    .line 154
    .line 155
    if-eq p2, v4, :cond_13

    .line 156
    .line 157
    if-ne p2, v3, :cond_12

    .line 158
    .line 159
    invoke-virtual {p1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-eqz p2, :cond_d

    .line 164
    .line 165
    invoke-virtual {p2}, Ldefpackage/c72;->H()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_c

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_c
    const/4 v3, 0x0

    .line 173
    goto :goto_4

    .line 174
    :cond_d
    :goto_3
    move v3, v6

    .line 175
    :goto_4
    if-nez p3, :cond_e

    .line 176
    .line 177
    invoke-virtual {p1}, Ldefpackage/c72;->q()Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-nez p3, :cond_13

    .line 182
    .line 183
    invoke-virtual {p1}, Ldefpackage/c72;->p()Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_e

    .line 188
    .line 189
    invoke-virtual {p1}, Ldefpackage/c72;->H()Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-ne p3, v3, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Ldefpackage/c72;->H()Z

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    iget-object v4, v0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 200
    .line 201
    iget-boolean v4, v4, Ldefpackage/ti2;->D:Z

    .line 202
    .line 203
    if-ne p3, v4, :cond_e

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_e
    iget-object p3, v0, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 207
    .line 208
    iput-boolean v6, p3, Ldefpackage/ti2;->F:Z

    .line 209
    .line 210
    iput-boolean v6, p3, Ldefpackage/ti2;->G:Z

    .line 211
    .line 212
    iget-boolean v0, p1, Ldefpackage/c72;->Z:Z

    .line 213
    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_f
    iget-boolean p3, p3, Ldefpackage/ti2;->D:Z

    .line 218
    .line 219
    if-eqz p3, :cond_13

    .line 220
    .line 221
    if-eqz v3, :cond_13

    .line 222
    .line 223
    if-eqz p2, :cond_10

    .line 224
    .line 225
    invoke-virtual {p2}, Ldefpackage/c72;->p()Z

    .line 226
    .line 227
    .line 228
    move-result p3

    .line 229
    if-ne p3, v6, :cond_10

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_10
    if-eqz p2, :cond_11

    .line 233
    .line 234
    invoke-virtual {p2}, Ldefpackage/c72;->q()Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-ne p2, v6, :cond_11

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_11
    iget-object p2, v7, Ldefpackage/ri2;->b:Ldefpackage/i61;

    .line 242
    .line 243
    invoke-virtual {p2, p1, v2}, Ldefpackage/i61;->c(Ldefpackage/c72;Ldefpackage/n12;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    iget-boolean p1, v7, Ldefpackage/ri2;->d:Z

    .line 247
    .line 248
    if-nez p1, :cond_13

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Ldefpackage/ra;->D(Ldefpackage/c72;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_12
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 255
    .line 256
    .line 257
    :cond_13
    :goto_6
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ra;->J:Ldefpackage/ya;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ldefpackage/ya;->K:Z

    .line 5
    .line 6
    iget-object v2, v0, Ldefpackage/ya;->q:Ldefpackage/ra;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Ldefpackage/ya;->v()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-boolean v3, v0, Ldefpackage/ya;->V:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iput-boolean v1, v0, Ldefpackage/ya;->V:Z

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/ya;->X:Ldefpackage/a0;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Ldefpackage/ra;->K:Ldefpackage/lb;

    .line 32
    .line 33
    iput-boolean v1, p0, Ldefpackage/lb;->t:Z

    .line 34
    .line 35
    iget-object v0, p0, Ldefpackage/lb;->n:Ldefpackage/ra;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Ldefpackage/lb;->e()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-boolean v2, p0, Ldefpackage/lb;->z:Z

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iput-boolean v1, p0, Ldefpackage/lb;->z:Z

    .line 54
    .line 55
    iget-object p0, p0, Ldefpackage/lb;->A:Ldefpackage/a0;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final x(Landroid/view/ViewStructure;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofillManager()Ldefpackage/y9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v2, v0, Ldefpackage/y9;->o:Ldefpackage/l94;

    .line 9
    .line 10
    iget-object v2, v2, Ldefpackage/l94;->a:Ldefpackage/c72;

    .line 11
    .line 12
    iget-object v3, v0, Ldefpackage/y9;->s:Landroid/view/autofill/AutofillId;

    .line 13
    .line 14
    iget-object v4, v0, Ldefpackage/y9;->r:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, v0, Ldefpackage/y9;->q:Ldefpackage/yv3;

    .line 17
    .line 18
    invoke-static {p1, v2, v3, v4, v5}, Ldefpackage/zz1;->z(Landroid/view/ViewStructure;Ldefpackage/c72;Landroid/view/autofill/AutofillId;Ljava/lang/String;Ldefpackage/yv3;)V

    .line 19
    .line 20
    .line 21
    sget-object v3, Ldefpackage/t73;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v3, Ldefpackage/q03;

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v6}, Ldefpackage/q03;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Ldefpackage/q03;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    iget v2, v3, Ldefpackage/q03;->b:I

    .line 42
    .line 43
    sub-int/2addr v2, v1

    .line 44
    invoke-virtual {v3, v2}, Ldefpackage/q03;->k(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v2, Landroid/view/ViewStructure;

    .line 52
    .line 53
    iget v6, v3, Ldefpackage/q03;->b:I

    .line 54
    .line 55
    sub-int/2addr v6, v1

    .line 56
    invoke-virtual {v3, v6}, Ldefpackage/q03;->k(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v6, Ldefpackage/c72;

    .line 64
    .line 65
    invoke-virtual {v6}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Ldefpackage/c13;

    .line 70
    .line 71
    iget-object v7, v6, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 72
    .line 73
    iget v7, v7, Ldefpackage/f13;->p:I

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    :goto_0
    if-ge v8, v7, :cond_0

    .line 77
    .line 78
    invoke-virtual {v6, v8}, Ldefpackage/c13;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    check-cast v9, Ldefpackage/c72;

    .line 83
    .line 84
    iget-boolean v10, v9, Ldefpackage/c72;->Z:Z

    .line 85
    .line 86
    if-nez v10, :cond_4

    .line 87
    .line 88
    invoke-virtual {v9}, Ldefpackage/c72;->G()Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_4

    .line 93
    .line 94
    invoke-virtual {v9}, Ldefpackage/c72;->H()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-nez v10, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v9}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-eqz v10, :cond_3

    .line 106
    .line 107
    iget-object v10, v10, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 108
    .line 109
    sget-object v11, Ldefpackage/d94;->g:Ldefpackage/p94;

    .line 110
    .line 111
    invoke-virtual {v10, v11}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_2

    .line 116
    .line 117
    sget-object v11, Ldefpackage/d94;->h:Ldefpackage/p94;

    .line 118
    .line 119
    invoke-virtual {v10, v11}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-nez v11, :cond_2

    .line 124
    .line 125
    sget-object v11, Ldefpackage/n94;->q:Ldefpackage/p94;

    .line 126
    .line 127
    invoke-virtual {v10, v11}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-nez v11, :cond_2

    .line 132
    .line 133
    sget-object v11, Ldefpackage/n94;->r:Ldefpackage/p94;

    .line 134
    .line 135
    invoke-virtual {v10, v11}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-nez v11, :cond_2

    .line 140
    .line 141
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 142
    .line 143
    const/16 v12, 0x22

    .line 144
    .line 145
    if-lt v11, v12, :cond_3

    .line 146
    .line 147
    sget-object v11, Ldefpackage/zz1;->m:Ldefpackage/p94;

    .line 148
    .line 149
    invoke-virtual {v10, v11}, Ldefpackage/w03;->b(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_3

    .line 154
    .line 155
    :cond_2
    invoke-virtual {v2, v1}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-virtual {v2, v10}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    iget-object v11, v0, Ldefpackage/y9;->s:Landroid/view/autofill/AutofillId;

    .line 164
    .line 165
    invoke-static {v10, v9, v11, v4, v5}, Ldefpackage/zz1;->z(Landroid/view/ViewStructure;Ldefpackage/c72;Landroid/view/autofill/AutofillId;Ljava/lang/String;Ldefpackage/yv3;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v9}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v10}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    invoke-virtual {v3, v9}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, Ldefpackage/q03;->a(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_4
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_5
    invoke-virtual {p0}, Ldefpackage/ra;->getAutofill()Ldefpackage/x9;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    if-eqz p0, :cond_9

    .line 189
    .line 190
    iget-object v0, p0, Ldefpackage/x9;->b:Ldefpackage/wn;

    .line 191
    .line 192
    iget-object v2, v0, Ldefpackage/wn;->a:Ljava/util/LinkedHashMap;

    .line 193
    .line 194
    iget-object v0, v0, Ldefpackage/wn;->a:Ljava/util/LinkedHashMap;

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_7

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    check-cast v3, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_8

    .line 247
    .line 248
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_8
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget-object v0, p0, Ldefpackage/x9;->c:Landroid/view/autofill/AutofillId;

    .line 257
    .line 258
    invoke-static {p1, v0, v3}, Ldefpackage/j3;->u(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, Ldefpackage/x9;->a:Ldefpackage/ra;

    .line 262
    .line 263
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    const/4 v0, 0x0

    .line 272
    invoke-virtual {p1, v3, p0, v0, v0}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {p1, v1}, Ldefpackage/tn;->r(Landroid/view/ViewStructure;I)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :cond_9
    :goto_2
    return-void
.end method

.method public final y()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldefpackage/ra;->n0:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Ldefpackage/ra;->m0:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Ldefpackage/ra;->m0:J

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/ra;->A()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, p0

    .line 25
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, Landroid/view/View;

    .line 31
    .line 32
    move-object v0, v1

    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Ldefpackage/ra;->h0:[I

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    aget v3, v0, v2

    .line 47
    .line 48
    int-to-float v3, v3

    .line 49
    const/4 v4, 0x1

    .line 50
    aget v5, v0, v4

    .line 51
    .line 52
    int-to-float v5, v5

    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 54
    .line 55
    .line 56
    aget v1, v0, v2

    .line 57
    .line 58
    int-to-float v1, v1

    .line 59
    aget v0, v0, v4

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    sub-float/2addr v3, v1

    .line 63
    sub-float/2addr v5, v0

    .line 64
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v0, v0

    .line 69
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    int-to-long v2, v2

    .line 74
    const/16 v4, 0x20

    .line 75
    .line 76
    shl-long/2addr v0, v4

    .line 77
    const-wide v4, 0xffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr v2, v4

    .line 83
    or-long/2addr v0, v2

    .line 84
    iput-wide v0, p0, Ldefpackage/ra;->o0:J

    .line 85
    .line 86
    :cond_1
    return-void
.end method

.method public final z(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Ldefpackage/ra;->m0:J

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/ra;->A()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-long v2, v0

    .line 23
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v0, v0

    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    shl-long/2addr v2, v4

    .line 31
    const-wide v5, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v5

    .line 37
    or-long/2addr v0, v2

    .line 38
    iget-object v2, p0, Ldefpackage/ra;->k0:[F

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Ldefpackage/ya4;->A(J[F)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    shr-long v7, v0, v4

    .line 49
    .line 50
    long-to-int v3, v7

    .line 51
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-float/2addr v2, v3

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    and-long/2addr v0, v5

    .line 61
    long-to-int v0, v0

    .line 62
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sub-float/2addr p1, v0

    .line 67
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v0, v0

    .line 72
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    int-to-long v2, p1

    .line 77
    shl-long/2addr v0, v4

    .line 78
    and-long/2addr v2, v5

    .line 79
    or-long/2addr v0, v2

    .line 80
    iput-wide v0, p0, Ldefpackage/ra;->o0:J

    .line 81
    .line 82
    return-void
.end method

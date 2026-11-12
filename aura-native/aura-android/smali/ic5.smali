.class public abstract Lic5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lw03;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lv54;->a:[J

    .line 2
    .line 3
    new-instance v0, Lw03;

    .line 4
    .line 5
    invoke-direct {v0}, Lw03;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lic5;->a:Lw03;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Landroid/view/View;)Lu80;
    .locals 1

    .line 1
    const v0, 0x7f0a00ce

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lu80;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lu80;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static final b(Landroid/view/View;)Ltv3;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Cannot locate windowRecomposer; View "

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " is not attached to a window"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {p0}, Lau0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    instance-of v1, v0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    check-cast v0, Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const v2, 0x1020002

    .line 44
    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    move-object v9, v0

    .line 54
    move-object v0, p0

    .line 55
    move-object p0, v9

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    invoke-static {p0}, Lic5;->a(Landroid/view/View;)Lu80;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x0

    .line 62
    if-nez v0, :cond_a

    .line 63
    .line 64
    sget-object v0, Lfc5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lec5;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v0, Lq01;->n:Lq01;

    .line 76
    .line 77
    sget-object v2, Lbd;->z:Lrp4;

    .line 78
    .line 79
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-ne v2, v3, :cond_3

    .line 88
    .line 89
    sget-object v2, Lbd;->z:Lrp4;

    .line 90
    .line 91
    invoke-virtual {v2}, Lrp4;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lne0;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    sget-object v2, Lbd;->A:Lzc;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lne0;

    .line 105
    .line 106
    if-eqz v2, :cond_9

    .line 107
    .line 108
    :goto_2
    invoke-interface {v2, v0}, Lne0;->J(Lne0;)Lne0;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sget-object v3, Lrv2;->p:Lrv2;

    .line 113
    .line 114
    invoke-interface {v2, v3}, Lne0;->K(Lme0;)Lle0;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Led;

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    new-instance v5, Led;

    .line 124
    .line 125
    invoke-direct {v5, v3}, Led;-><init>(Led;)V

    .line 126
    .line 127
    .line 128
    iget-object v3, v5, Led;->p:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, Lll;

    .line 131
    .line 132
    iget-object v6, v3, Lll;->p:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter v6

    .line 135
    :try_start_0
    iput-boolean v4, v3, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    monitor-exit v6

    .line 138
    goto :goto_3

    .line 139
    :catchall_0
    move-exception p0

    .line 140
    monitor-exit v6

    .line 141
    throw p0

    .line 142
    :cond_4
    move-object v5, v1

    .line 143
    :goto_3
    new-instance v3, Ljx3;

    .line 144
    .line 145
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 146
    .line 147
    .line 148
    sget-object v6, Lrv2;->q:Lrv2;

    .line 149
    .line 150
    invoke-interface {v2, v6}, Lne0;->K(Lme0;)Lle0;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    check-cast v6, Lqx2;

    .line 155
    .line 156
    if-nez v6, :cond_5

    .line 157
    .line 158
    new-instance v6, Lrx2;

    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-direct {v6, v7}, Lrx2;-><init>(Landroid/content/Context;)V

    .line 169
    .line 170
    .line 171
    iput-object v6, v3, Ljx3;->n:Ljava/lang/Object;

    .line 172
    .line 173
    :cond_5
    if-eqz v5, :cond_6

    .line 174
    .line 175
    move-object v0, v5

    .line 176
    :cond_6
    invoke-interface {v2, v0}, Lne0;->J(Lne0;)Lne0;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v0, v6}, Lne0;->J(Lne0;)Lne0;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v2, Ltv3;

    .line 185
    .line 186
    invoke-direct {v2, v0}, Ltv3;-><init>(Lne0;)V

    .line 187
    .line 188
    .line 189
    iget-object v6, v2, Ltv3;->c:Ljava/lang/Object;

    .line 190
    .line 191
    monitor-enter v6

    .line 192
    const/4 v7, 0x1

    .line 193
    :try_start_1
    iput-boolean v7, v2, Ltv3;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    .line 195
    monitor-exit v6

    .line 196
    invoke-static {v0}, Lte5;->a(Lne0;)Ltd0;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {p0}, Lj51;->u(Landroid/view/View;)Lba2;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    if-eqz v6, :cond_7

    .line 205
    .line 206
    invoke-interface {v6}, Lba2;->h()Lea2;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    goto :goto_4

    .line 211
    :cond_7
    move-object v6, v1

    .line 212
    :goto_4
    if-eqz v6, :cond_8

    .line 213
    .line 214
    new-instance v7, Lvc1;

    .line 215
    .line 216
    const/4 v8, 0x2

    .line 217
    invoke-direct {v7, v8, p0, v2}, Lvc1;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v7}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 221
    .line 222
    .line 223
    new-instance v7, Led1;

    .line 224
    .line 225
    invoke-direct {v7, v0, v5, v2, v3}, Led1;-><init>(Ltd0;Led;Ltv3;Ljx3;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v7}, Lea2;->a(Laa2;)V

    .line 229
    .line 230
    .line 231
    const v0, 0x7f0a00ce

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Lxi1;->n:Lxi1;

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const-string v5, "windowRecomposer cleanup"

    .line 244
    .line 245
    sget v6, Lgl1;->a:I

    .line 246
    .line 247
    new-instance v6, Lfl1;

    .line 248
    .line 249
    invoke-direct {v6, v3, v5, v4}, Lfl1;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 250
    .line 251
    .line 252
    iget-object v3, v6, Lfl1;->s:Lfl1;

    .line 253
    .line 254
    new-instance v4, Lp;

    .line 255
    .line 256
    const/16 v5, 0x13

    .line 257
    .line 258
    invoke-direct {v4, v2, p0, v1, v5}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v0, v3, v1, v4, v8}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    new-instance v1, Lbc;

    .line 266
    .line 267
    const/16 v3, 0x8

    .line 268
    .line 269
    invoke-direct {v1, v3, v0}, Lbc;-><init>(ILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 273
    .line 274
    .line 275
    return-object v2

    .line 276
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    const-string v2, "ViewTreeLifecycleOwner not found from "

    .line 279
    .line 280
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p0}, Lcz1;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Ler1;->a()V

    .line 294
    .line 295
    .line 296
    return-object v1

    .line 297
    :catchall_1
    move-exception p0

    .line 298
    monitor-exit v6

    .line 299
    throw p0

    .line 300
    :cond_9
    const-string p0, "no AndroidUiDispatcher for this thread"

    .line 301
    .line 302
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v1

    .line 306
    :cond_a
    instance-of p0, v0, Ltv3;

    .line 307
    .line 308
    if-eqz p0, :cond_b

    .line 309
    .line 310
    check-cast v0, Ltv3;

    .line 311
    .line 312
    return-object v0

    .line 313
    :cond_b
    const-string p0, "root viewTreeParentCompositionContext is not a Recomposer"

    .line 314
    .line 315
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    return-object v1
.end method

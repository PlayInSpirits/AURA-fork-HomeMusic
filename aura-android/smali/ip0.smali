.class public final Lip0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/io/Serializable;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lui1;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lip0;->f:Ljava/io/Serializable;

    .line 45
    new-instance v0, Lv9;

    const/16 v1, 0x9

    invoke-direct {v0, v1, p0}, Lv9;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lip0;->g:Ljava/lang/Object;

    .line 46
    new-instance v0, Lg5;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lip0;->h:Ljava/lang/Object;

    .line 47
    iput-object p1, p0, Lip0;->b:Ljava/lang/Object;

    .line 48
    iput-object p2, p0, Lip0;->c:Ljava/lang/Object;

    .line 49
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lip0;->d:Ljava/lang/Object;

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lip0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lsq3;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lip0;->a:Z

    .line 6
    .line 7
    iput-object p2, p0, Lip0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lip0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lip0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lip0;->f:Ljava/io/Serializable;

    .line 14
    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 p2, 0x1f

    .line 18
    .line 19
    if-lt p1, p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lau0;->x:[B

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :pswitch_0
    sget-object p1, Lau0;->y:[B

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    sget-object p1, Lau0;->z:[B

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_2
    sget-object p1, Lau0;->A:[B

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    sget-object p1, Lau0;->B:[B

    .line 39
    .line 40
    :goto_0
    iput-object p1, p0, Lip0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p2, "compressed"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lip0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lsq3;

    .line 28
    .line 29
    invoke-interface {p0}, Lsq3;->c()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public b(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lip0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lgk;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lgk;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c()V
    .locals 14

    .line 1
    iget-object v0, p0, Lip0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lui1;

    .line 4
    .line 5
    iget-object v1, p0, Lip0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    iget-object v2, p0, Lip0;->f:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v3, p0, Lip0;->a:Z

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v5, 0x1e

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-lt v4, v5, :cond_2

    .line 30
    .line 31
    new-instance v3, Landroid/content/Intent;

    .line 32
    .line 33
    const-string v4, "android.media.MediaRoute2ProviderService"

    .line 34
    .line 35
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v4, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3, v6}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 62
    .line 63
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v3, v4

    .line 70
    :cond_2
    new-instance v4, Landroid/content/Intent;

    .line 71
    .line 72
    const-string v5, "android.media.MediaRouteProviderService"

    .line 73
    .line 74
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v4, v6}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move v4, v6

    .line 86
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const/4 v7, 0x1

    .line 91
    if-eqz v5, :cond_10

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 98
    .line 99
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 100
    .line 101
    if-nez v5, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    sget-object v8, Lyq2;->c:Lui1;

    .line 105
    .line 106
    if-nez v8, :cond_5

    .line 107
    .line 108
    move v8, v6

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-static {}, Lyq2;->c()Lui1;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    iget-boolean v8, v8, Lui1;->p:Z

    .line 115
    .line 116
    :goto_2
    if-eqz v8, :cond_8

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    move v9, v6

    .line 130
    :cond_7
    if-ge v9, v8, :cond_8

    .line 131
    .line 132
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    check-cast v10, Landroid/content/pm/ServiceInfo;

    .line 139
    .line 140
    iget-object v11, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v12, v10, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    if-eqz v11, :cond_7

    .line 149
    .line 150
    iget-object v11, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v10, v10, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_7

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    :goto_3
    iget-object v8, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v9, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    move v11, v6

    .line 170
    :goto_4
    if-ge v11, v10, :cond_a

    .line 171
    .line 172
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    check-cast v12, Lcy3;

    .line 177
    .line 178
    iget-object v12, v12, Lcy3;->v:Landroid/content/ComponentName;

    .line 179
    .line 180
    invoke-virtual {v12}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    if-eqz v13, :cond_9

    .line 189
    .line 190
    invoke-virtual {v12}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-eqz v12, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_a
    const/4 v11, -0x1

    .line 205
    :goto_5
    if-gez v11, :cond_c

    .line 206
    .line 207
    new-instance v8, Lcy3;

    .line 208
    .line 209
    iget-object v9, p0, Lip0;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v9, Landroid/content/Context;

    .line 212
    .line 213
    new-instance v10, Landroid/content/ComponentName;

    .line 214
    .line 215
    iget-object v11, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 216
    .line 217
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 218
    .line 219
    invoke-direct {v10, v11, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v8, v9, v10}, Lcy3;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 223
    .line 224
    .line 225
    new-instance v5, Lss2;

    .line 226
    .line 227
    invoke-direct {v5, p0, v8}, Lss2;-><init>(Lip0;Lcy3;)V

    .line 228
    .line 229
    .line 230
    iput-object v5, v8, Lcy3;->C:Lss2;

    .line 231
    .line 232
    iget-boolean v5, v8, Lcy3;->y:Z

    .line 233
    .line 234
    if-nez v5, :cond_b

    .line 235
    .line 236
    iput-boolean v7, v8, Lcy3;->y:Z

    .line 237
    .line 238
    invoke-virtual {v8}, Lcy3;->l()V

    .line 239
    .line 240
    .line 241
    :cond_b
    add-int/lit8 v5, v4, 0x1

    .line 242
    .line 243
    invoke-virtual {v2, v4, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v8, v6}, Lui1;->a(Lqq2;Z)V

    .line 247
    .line 248
    .line 249
    :goto_6
    move v4, v5

    .line 250
    goto/16 :goto_1

    .line 251
    .line 252
    :cond_c
    if-lt v11, v4, :cond_3

    .line 253
    .line 254
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    check-cast v5, Lcy3;

    .line 259
    .line 260
    iget-boolean v8, v5, Lcy3;->y:Z

    .line 261
    .line 262
    if-nez v8, :cond_d

    .line 263
    .line 264
    iput-boolean v7, v5, Lcy3;->y:Z

    .line 265
    .line 266
    invoke-virtual {v5}, Lcy3;->l()V

    .line 267
    .line 268
    .line 269
    :cond_d
    iget-object v7, v5, Lcy3;->A:Lxx3;

    .line 270
    .line 271
    if-nez v7, :cond_f

    .line 272
    .line 273
    iget-boolean v7, v5, Lcy3;->y:Z

    .line 274
    .line 275
    if-eqz v7, :cond_f

    .line 276
    .line 277
    iget-object v7, v5, Lqq2;->r:Lup2;

    .line 278
    .line 279
    if-eqz v7, :cond_e

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_e
    iget-object v7, v5, Lcy3;->x:Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-nez v7, :cond_f

    .line 289
    .line 290
    :goto_7
    invoke-virtual {v5}, Lcy3;->k()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Lcy3;->h()V

    .line 294
    .line 295
    .line 296
    :cond_f
    add-int/lit8 v5, v4, 0x1

    .line 297
    .line 298
    invoke-static {v2, v11, v4}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-ge v4, p0, :cond_13

    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    sub-int/2addr p0, v7

    .line 313
    :goto_8
    if-lt p0, v4, :cond_13

    .line 314
    .line 315
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, Lcy3;

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Lui1;->d(Lqq2;)Lvq2;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    const/4 v5, 0x0

    .line 326
    if-eqz v3, :cond_11

    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {}, Lyq2;->b()V

    .line 332
    .line 333
    .line 334
    iput-object v5, v1, Lqq2;->q:Lsi1;

    .line 335
    .line 336
    invoke-virtual {v1, v5}, Lqq2;->g(Lup2;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v3, v5}, Lui1;->m(Lvq2;Lxk0;)V

    .line 340
    .line 341
    .line 342
    iget-object v7, v0, Lui1;->a:Lri1;

    .line 343
    .line 344
    const/16 v8, 0x202

    .line 345
    .line 346
    invoke-virtual {v7, v8, v3}, Lri1;->b(ILjava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    iget-object v7, v0, Lui1;->k:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    :cond_11
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    iput-object v5, v1, Lcy3;->C:Lss2;

    .line 358
    .line 359
    iget-boolean v3, v1, Lcy3;->y:Z

    .line 360
    .line 361
    if-eqz v3, :cond_12

    .line 362
    .line 363
    iput-boolean v6, v1, Lcy3;->y:Z

    .line 364
    .line 365
    invoke-virtual {v1}, Lcy3;->l()V

    .line 366
    .line 367
    .line 368
    :cond_12
    add-int/lit8 p0, p0, -0x1

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_13
    :goto_9
    return-void
.end method

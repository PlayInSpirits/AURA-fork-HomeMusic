.class public final Lqf5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lqf5;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lqf5;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lqf5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhk5;

    .line 4
    .line 5
    iget-object v0, v0, Lhk5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lqf5;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lhk5;

    .line 11
    .line 12
    iget-object v1, v1, Lhk5;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Le93;

    .line 15
    .line 16
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljw;

    .line 19
    .line 20
    iget-object v2, p0, Ljw;->o:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :try_start_1
    iget-object p0, p0, Ljw;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Exception;

    .line 26
    .line 27
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :try_start_2
    invoke-static {p0}, Lji2;->m(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p0}, Le93;->a(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception p0

    .line 39
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    :try_start_4
    throw p0

    .line 41
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 42
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lqf5;->n:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lhk5;

    .line 13
    .line 14
    iget-object v0, v0, Lhk5;->c:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, Lqf5;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lhk5;

    .line 20
    .line 21
    iget-object v1, v1, Lhk5;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcg0;

    .line 24
    .line 25
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljw;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljw;->n()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget v2, v1, Lcg0;->a:I

    .line 34
    .line 35
    packed-switch v2, :pswitch_data_1

    .line 36
    .line 37
    .line 38
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 39
    .line 40
    invoke-static {v1, p0}, Landroidx/credentials/playservices/HiddenActivity;->$r8$lambda$xk6z1pBgwfylIivjcQlijI8e3RM(Lif1;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_0
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 45
    .line 46
    invoke-static {v1, p0}, Landroidx/credentials/playservices/HiddenActivity;->$r8$lambda$XnByCOhdw6M3NUVrPdK9IYFdcaQ(Lif1;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_1
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 51
    .line 52
    invoke-static {v1, p0}, Landroidx/credentials/playservices/HiddenActivity;->$r8$lambda$8029HvfIkyuQLdhX5BYT4HccZOc(Lif1;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_2
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 57
    .line 58
    invoke-static {v1, p0}, Landroidx/credentials/playservices/HiddenActivity;->$r8$lambda$bAsCQGcUULbIQqCqmx80zDQYFhE(Lif1;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_3
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 63
    .line 64
    invoke-static {v1, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController;->$r8$lambda$mTHDsjfGVNXe6TNGFFFHHPUMjGE(Lif1;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_4
    iget-object v1, v1, Lcg0;->b:Lif1;

    .line 69
    .line 70
    invoke-static {v1, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->$r8$lambda$_IbKyRaIxxXTX1LNwia-hBSJsqc(Lif1;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    throw p0

    .line 78
    :pswitch_5
    invoke-direct {p0}, Lqf5;->a()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_6
    iget-object v0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lhk5;

    .line 85
    .line 86
    iget-object v0, v0, Lhk5;->c:Ljava/lang/Object;

    .line 87
    .line 88
    monitor-enter v0

    .line 89
    :try_start_1
    iget-object v1, p0, Lqf5;->p:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Lhk5;

    .line 92
    .line 93
    iget-object v1, v1, Lhk5;->d:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lb93;

    .line 96
    .line 97
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Ljw;

    .line 100
    .line 101
    invoke-interface {v1, p0}, Lb93;->a(Ljw;)V

    .line 102
    .line 103
    .line 104
    monitor-exit v0

    .line 105
    return-void

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    throw p0

    .line 109
    :pswitch_7
    iget-object v0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Ldf5;

    .line 112
    .line 113
    iget-object p0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Lvi5;

    .line 116
    .line 117
    iget v5, p0, Lvi5;->m0:I

    .line 118
    .line 119
    if-lez v5, :cond_1

    .line 120
    .line 121
    iget-object v5, p0, Lvi5;->n0:Landroid/os/Bundle;

    .line 122
    .line 123
    if-eqz v5, :cond_0

    .line 124
    .line 125
    const-string v4, "ConnectionlessLifecycleHelper"

    .line 126
    .line 127
    invoke-virtual {v5, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    :cond_0
    invoke-virtual {v0, v4}, Ldf5;->c(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    :cond_1
    iget v4, p0, Lvi5;->m0:I

    .line 135
    .line 136
    if-lt v4, v3, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0}, Ldf5;->f()V

    .line 139
    .line 140
    .line 141
    :cond_2
    iget v3, p0, Lvi5;->m0:I

    .line 142
    .line 143
    if-lt v3, v2, :cond_3

    .line 144
    .line 145
    invoke-virtual {v0}, Ldf5;->d()V

    .line 146
    .line 147
    .line 148
    :cond_3
    iget p0, p0, Lvi5;->m0:I

    .line 149
    .line 150
    if-lt p0, v1, :cond_4

    .line 151
    .line 152
    invoke-virtual {v0}, Ldf5;->g()V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-void

    .line 156
    :pswitch_8
    iget-object v0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ldf5;

    .line 159
    .line 160
    iget-object p0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, Lph5;

    .line 163
    .line 164
    iget v5, p0, Lph5;->o:I

    .line 165
    .line 166
    if-lez v5, :cond_6

    .line 167
    .line 168
    iget-object v5, p0, Lph5;->p:Landroid/os/Bundle;

    .line 169
    .line 170
    if-eqz v5, :cond_5

    .line 171
    .line 172
    const-string v4, "ConnectionlessLifecycleHelper"

    .line 173
    .line 174
    invoke-virtual {v5, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    :cond_5
    invoke-virtual {v0, v4}, Ldf5;->c(Landroid/os/Bundle;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget v4, p0, Lph5;->o:I

    .line 182
    .line 183
    if-lt v4, v3, :cond_7

    .line 184
    .line 185
    invoke-virtual {v0}, Ldf5;->f()V

    .line 186
    .line 187
    .line 188
    :cond_7
    iget v3, p0, Lph5;->o:I

    .line 189
    .line 190
    if-lt v3, v2, :cond_8

    .line 191
    .line 192
    invoke-virtual {v0}, Ldf5;->d()V

    .line 193
    .line 194
    .line 195
    :cond_8
    iget p0, p0, Lph5;->o:I

    .line 196
    .line 197
    if-lt p0, v1, :cond_9

    .line 198
    .line 199
    invoke-virtual {v0}, Ldf5;->g()V

    .line 200
    .line 201
    .line 202
    :cond_9
    return-void

    .line 203
    :pswitch_9
    iget-object v0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Ldf5;

    .line 206
    .line 207
    iget-boolean v0, v0, Ldf5;->o:Z

    .line 208
    .line 209
    if-nez v0, :cond_a

    .line 210
    .line 211
    goto/16 :goto_6

    .line 212
    .line 213
    :cond_a
    iget-object v0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Leg5;

    .line 216
    .line 217
    iget-object v0, v0, Leg5;->b:Lka0;

    .line 218
    .line 219
    iget v1, v0, Lka0;->o:I

    .line 220
    .line 221
    const/4 v5, 0x1

    .line 222
    const/4 v6, 0x0

    .line 223
    if-eqz v1, :cond_b

    .line 224
    .line 225
    iget-object v1, v0, Lka0;->p:Landroid/app/PendingIntent;

    .line 226
    .line 227
    if-eqz v1, :cond_b

    .line 228
    .line 229
    move v1, v5

    .line 230
    goto :goto_1

    .line 231
    :cond_b
    move v1, v6

    .line 232
    :goto_1
    iget-object v7, p0, Lqf5;->p:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v7, Ldf5;

    .line 235
    .line 236
    if-eqz v1, :cond_c

    .line 237
    .line 238
    iget-object v1, v7, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Lx92;

    .line 239
    .line 240
    invoke-virtual {v7}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->a()Landroid/app/Activity;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget-object v0, v0, Lka0;->p:Landroid/app/PendingIntent;

    .line 245
    .line 246
    invoke-static {v0}, Lji2;->m(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p0, Leg5;

    .line 252
    .line 253
    iget p0, p0, Leg5;->a:I

    .line 254
    .line 255
    sget v3, Lcom/google/android/gms/common/api/GoogleApiActivity;->o:I

    .line 256
    .line 257
    const-class v3, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 258
    .line 259
    new-instance v4, Landroid/content/Intent;

    .line 260
    .line 261
    invoke-direct {v4, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 262
    .line 263
    .line 264
    const-string v2, "pending_intent"

    .line 265
    .line 266
    invoke-virtual {v4, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    const-string v0, "failing_client_id"

    .line 270
    .line 271
    invoke-virtual {v4, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 272
    .line 273
    .line 274
    const-string p0, "notify_manager"

    .line 275
    .line 276
    invoke-virtual {v4, p0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 277
    .line 278
    .line 279
    invoke-interface {v1, v4, v5}, Lx92;->startActivityForResult(Landroid/content/Intent;I)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_6

    .line 283
    .line 284
    :cond_c
    invoke-virtual {v7}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->a()Landroid/app/Activity;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    iget v8, v0, Lka0;->o:I

    .line 289
    .line 290
    iget-object v7, v7, Ldf5;->r:Lej1;

    .line 291
    .line 292
    invoke-virtual {v7, v8, v1, v4}, Lfj1;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-eqz v1, :cond_d

    .line 297
    .line 298
    iget-object v1, p0, Lqf5;->p:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v1, Ldf5;

    .line 301
    .line 302
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->a()Landroid/app/Activity;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Lx92;

    .line 307
    .line 308
    iget v0, v0, Lka0;->o:I

    .line 309
    .line 310
    iget-object p0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p0, Ldf5;

    .line 313
    .line 314
    iget-object v1, v1, Ldf5;->r:Lej1;

    .line 315
    .line 316
    invoke-virtual {v1, v2, v3, v0, p0}, Lej1;->g(Landroid/app/Activity;Lx92;ILandroid/content/DialogInterface$OnCancelListener;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_6

    .line 320
    .line 321
    :cond_d
    iget v1, v0, Lka0;->o:I

    .line 322
    .line 323
    iget-object v7, p0, Lqf5;->p:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v7, Ldf5;

    .line 326
    .line 327
    const/16 v8, 0x12

    .line 328
    .line 329
    if-ne v1, v8, :cond_12

    .line 330
    .line 331
    iget-object v0, v7, Ldf5;->r:Lej1;

    .line 332
    .line 333
    invoke-virtual {v7}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->a()Landroid/app/Activity;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v0, Landroid/widget/ProgressBar;

    .line 341
    .line 342
    const v9, 0x101007a

    .line 343
    .line 344
    .line 345
    invoke-direct {v0, v1, v4, v9}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    new-instance v5, Landroid/app/AlertDialog$Builder;

    .line 355
    .line 356
    invoke-direct {v5, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 360
    .line 361
    .line 362
    invoke-static {v1, v8}, Llf5;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 367
    .line 368
    .line 369
    const-string v0, ""

    .line 370
    .line 371
    invoke-virtual {v5, v0, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const-string v5, "GooglePlayServicesUpdatingDialog"

    .line 379
    .line 380
    invoke-static {v1, v0, v5, v7}, Lej1;->e(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 381
    .line 382
    .line 383
    iget-object v1, p0, Lqf5;->p:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v1, Ldf5;

    .line 386
    .line 387
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->a()Landroid/app/Activity;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    new-instance v7, Lwo0;

    .line 396
    .line 397
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    iput-object p0, v7, Lwo0;->o:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v0, v7, Lwo0;->n:Ljava/lang/Object;

    .line 403
    .line 404
    iget-object v1, v1, Ldf5;->r:Lej1;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance v1, Landroid/content/IntentFilter;

    .line 410
    .line 411
    const-string v8, "android.intent.action.PACKAGE_ADDED"

    .line 412
    .line 413
    invoke-direct {v1, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const-string v8, "package"

    .line 417
    .line 418
    invoke-virtual {v1, v8}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    new-instance v8, Ljf5;

    .line 422
    .line 423
    invoke-direct {v8, v7}, Ljf5;-><init>(Lwo0;)V

    .line 424
    .line 425
    .line 426
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 427
    .line 428
    const/16 v9, 0x21

    .line 429
    .line 430
    if-lt v7, v9, :cond_f

    .line 431
    .line 432
    if-lt v7, v9, :cond_e

    .line 433
    .line 434
    goto :goto_2

    .line 435
    :cond_e
    move v3, v6

    .line 436
    :goto_2
    invoke-static {v5, v8, v1, v3}, Lrg3;->b(Landroid/content/Context;Ljf5;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 437
    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_f
    invoke-virtual {v5, v8, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 441
    .line 442
    .line 443
    :goto_3
    iput-object v5, v8, Ljf5;->a:Landroid/content/Context;

    .line 444
    .line 445
    invoke-static {v5}, Llj1;->a(Landroid/content/Context;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_13

    .line 450
    .line 451
    iget-object p0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p0, Ldf5;

    .line 454
    .line 455
    iget-object v1, p0, Ldf5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 456
    .line 457
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    iget-object p0, p0, Ldf5;->t:Lij1;

    .line 461
    .line 462
    iget-object p0, p0, Lij1;->A:Lzw2;

    .line 463
    .line 464
    invoke-virtual {p0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 472
    .line 473
    .line 474
    move-result p0

    .line 475
    if-eqz p0, :cond_10

    .line 476
    .line 477
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 478
    .line 479
    .line 480
    :cond_10
    monitor-enter v8

    .line 481
    :try_start_2
    iget-object p0, v8, Ljf5;->a:Landroid/content/Context;

    .line 482
    .line 483
    if-eqz p0, :cond_11

    .line 484
    .line 485
    invoke-virtual {p0, v8}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 486
    .line 487
    .line 488
    goto :goto_4

    .line 489
    :catchall_2
    move-exception p0

    .line 490
    goto :goto_5

    .line 491
    :cond_11
    :goto_4
    iput-object v4, v8, Ljf5;->a:Landroid/content/Context;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 492
    .line 493
    monitor-exit v8

    .line 494
    goto :goto_6

    .line 495
    :goto_5
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 496
    throw p0

    .line 497
    :cond_12
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast p0, Leg5;

    .line 500
    .line 501
    iget p0, p0, Leg5;->a:I

    .line 502
    .line 503
    iget-object v1, v7, Ldf5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 504
    .line 505
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    iget-object v1, v7, Ldf5;->t:Lij1;

    .line 509
    .line 510
    invoke-virtual {v1, v0, p0}, Lij1;->g(Lka0;I)V

    .line 511
    .line 512
    .line 513
    :cond_13
    :goto_6
    return-void

    .line 514
    :pswitch_a
    iget-object v0, p0, Lqf5;->p:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v0, Lrf5;

    .line 517
    .line 518
    iget-object p0, p0, Lqf5;->o:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast p0, Ldg5;

    .line 521
    .line 522
    iget-object v2, p0, Ldg5;->o:Lka0;

    .line 523
    .line 524
    iget v3, v2, Lka0;->o:I

    .line 525
    .line 526
    if-nez v3, :cond_19

    .line 527
    .line 528
    iget-object p0, p0, Ldg5;->p:Lig5;

    .line 529
    .line 530
    invoke-static {p0}, Lji2;->m(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    iget-object v2, p0, Lig5;->p:Lka0;

    .line 534
    .line 535
    iget v3, v2, Lka0;->o:I

    .line 536
    .line 537
    if-nez v3, :cond_18

    .line 538
    .line 539
    iget-object v2, v0, Lrf5;->l:Lnq;

    .line 540
    .line 541
    iget-object p0, p0, Lig5;->o:Landroid/os/IBinder;

    .line 542
    .line 543
    if-nez p0, :cond_14

    .line 544
    .line 545
    goto :goto_7

    .line 546
    :cond_14
    sget v3, Lg4;->f:I

    .line 547
    .line 548
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 549
    .line 550
    invoke-interface {p0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    instance-of v4, v3, Leu1;

    .line 555
    .line 556
    if-eqz v4, :cond_15

    .line 557
    .line 558
    move-object v4, v3

    .line 559
    check-cast v4, Leu1;

    .line 560
    .line 561
    goto :goto_7

    .line 562
    :cond_15
    new-instance v4, Lvk5;

    .line 563
    .line 564
    invoke-direct {v4, p0}, Lvk5;-><init>(Landroid/os/IBinder;)V

    .line 565
    .line 566
    .line 567
    :goto_7
    iget-object p0, v0, Lrf5;->i:Ljava/util/Set;

    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    if-eqz v4, :cond_17

    .line 573
    .line 574
    if-nez p0, :cond_16

    .line 575
    .line 576
    goto :goto_8

    .line 577
    :cond_16
    iput-object v4, v2, Lnq;->q:Ljava/lang/Object;

    .line 578
    .line 579
    iput-object p0, v2, Lnq;->r:Ljava/lang/Object;

    .line 580
    .line 581
    iget-boolean v1, v2, Lnq;->n:Z

    .line 582
    .line 583
    if-eqz v1, :cond_1a

    .line 584
    .line 585
    iget-object v1, v2, Lnq;->o:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Lme;

    .line 588
    .line 589
    invoke-interface {v1, v4, p0}, Lme;->j0(Leu1;Ljava/util/Set;)V

    .line 590
    .line 591
    .line 592
    goto :goto_9

    .line 593
    :cond_17
    :goto_8
    new-instance p0, Ljava/lang/Exception;

    .line 594
    .line 595
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 596
    .line 597
    .line 598
    const-string v3, "GoogleApiManager"

    .line 599
    .line 600
    const-string v4, "Received null response from onSignInSuccess"

    .line 601
    .line 602
    invoke-static {v3, v4, p0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 603
    .line 604
    .line 605
    new-instance p0, Lka0;

    .line 606
    .line 607
    invoke-direct {p0, v1}, Lka0;-><init>(I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2, p0}, Lnq;->a(Lka0;)V

    .line 611
    .line 612
    .line 613
    goto :goto_9

    .line 614
    :cond_18
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    new-instance v1, Ljava/lang/Exception;

    .line 619
    .line 620
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 621
    .line 622
    .line 623
    const-string v3, "Sign-in succeeded with resolve account failure: "

    .line 624
    .line 625
    const-string v4, "SignInCoordinator"

    .line 626
    .line 627
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    invoke-static {v4, p0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 632
    .line 633
    .line 634
    iget-object p0, v0, Lrf5;->l:Lnq;

    .line 635
    .line 636
    invoke-virtual {p0, v2}, Lnq;->a(Lka0;)V

    .line 637
    .line 638
    .line 639
    iget-object p0, v0, Lrf5;->k:Lsd4;

    .line 640
    .line 641
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->b()V

    .line 642
    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_19
    iget-object p0, v0, Lrf5;->l:Lnq;

    .line 646
    .line 647
    invoke-virtual {p0, v2}, Lnq;->a(Lka0;)V

    .line 648
    .line 649
    .line 650
    :cond_1a
    :goto_9
    iget-object p0, v0, Lrf5;->k:Lsd4;

    .line 651
    .line 652
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->b()V

    .line 653
    .line 654
    .line 655
    :goto_a
    return-void

    .line 656
    nop

    .line 657
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

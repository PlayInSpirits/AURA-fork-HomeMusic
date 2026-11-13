.class public final Ldefpackage/sc5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static k:Ldefpackage/sc5;

.field public static l:Ldefpackage/sc5;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ldefpackage/r90;

.field public final c:Landroidx/work/impl/WorkDatabase;

.field public final d:Ldefpackage/bq4;

.field public final e:Ljava/util/List;

.field public final f:Ldefpackage/pq3;

.field public final g:Ldefpackage/rv1;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;

.field public final j:Ldefpackage/z40;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/cx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, Ldefpackage/sc5;->k:Ldefpackage/sc5;

    .line 8
    .line 9
    sput-object v0, Ldefpackage/sc5;->l:Ldefpackage/sc5;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldefpackage/sc5;->m:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/r90;Ldefpackage/bq4;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ldefpackage/pq3;Ldefpackage/z40;)V
    .locals 12

    .line 1
    move-object/from16 v3, p4

    .line 2
    .line 3
    move-object/from16 v4, p5

    .line 4
    .line 5
    move-object/from16 v5, p6

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    iput-boolean v6, p0, Ldefpackage/sc5;->h:Z

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    invoke-virtual {v7}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    if-nez v8, :cond_2

    .line 22
    .line 23
    new-instance v8, Ldefpackage/cx;

    .line 24
    .line 25
    iget v9, p2, Ldefpackage/r90;->h:I

    .line 26
    .line 27
    invoke-direct {v8, v9}, Ldefpackage/cx;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sget-object v9, Ldefpackage/cx;->c:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v9

    .line 33
    :try_start_0
    sget-object v10, Ldefpackage/cx;->d:Ldefpackage/cx;

    .line 34
    .line 35
    if-nez v10, :cond_0

    .line 36
    .line 37
    sput-object v8, Ldefpackage/cx;->d:Ldefpackage/cx;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_0
    :goto_0
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iput-object v7, p0, Ldefpackage/sc5;->a:Landroid/content/Context;

    .line 45
    .line 46
    iput-object p3, p0, Ldefpackage/sc5;->d:Ldefpackage/bq4;

    .line 47
    .line 48
    iput-object v3, p0, Ldefpackage/sc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 49
    .line 50
    iput-object v5, p0, Ldefpackage/sc5;->f:Ldefpackage/pq3;

    .line 51
    .line 52
    move-object/from16 v8, p7

    .line 53
    .line 54
    iput-object v8, p0, Ldefpackage/sc5;->j:Ldefpackage/z40;

    .line 55
    .line 56
    iput-object p2, p0, Ldefpackage/sc5;->b:Ldefpackage/r90;

    .line 57
    .line 58
    iput-object v4, p0, Ldefpackage/sc5;->e:Ljava/util/List;

    .line 59
    .line 60
    iget-object v8, p3, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, Ldefpackage/pe0;

    .line 63
    .line 64
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v8}, Ldefpackage/te5;->a(Ldefpackage/ne0;)Ldefpackage/td0;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    new-instance v9, Ldefpackage/rv1;

    .line 72
    .line 73
    const/4 v10, 0x1

    .line 74
    invoke-direct {v9, v3, v10}, Ldefpackage/rv1;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 75
    .line 76
    .line 77
    iput-object v9, p0, Ldefpackage/sc5;->g:Ldefpackage/rv1;

    .line 78
    .line 79
    iget-object v9, p3, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, Ldefpackage/ia4;

    .line 82
    .line 83
    sget-object v11, Ldefpackage/c64;->a:Ljava/lang/String;

    .line 84
    .line 85
    new-instance v11, Ldefpackage/b64;

    .line 86
    .line 87
    invoke-direct {v11, v9, v4, p2, v3}, Ldefpackage/b64;-><init>(Ljava/util/concurrent/Executor;Ljava/util/List;Ldefpackage/r90;Landroidx/work/impl/WorkDatabase;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v11}, Ldefpackage/pq3;->a(Ldefpackage/w21;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Ldefpackage/lb1;

    .line 94
    .line 95
    invoke-direct {v4, v7, p0}, Ldefpackage/lb1;-><init>(Landroid/content/Context;Ldefpackage/sc5;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, v4}, Ldefpackage/bq4;->h(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Ldefpackage/i15;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v7, p2}, Ldefpackage/nq3;->a(Landroid/content/Context;Ldefpackage/r90;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->A()Ldefpackage/fd5;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 117
    .line 118
    invoke-static {v6, v1}, Ldefpackage/w24;->b(ILjava/lang/String;)Ldefpackage/w24;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v2, v0, Ldefpackage/fd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 123
    .line 124
    const-string v3, "workspec"

    .line 125
    .line 126
    filled-new-array {v3}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    new-instance v4, Ldefpackage/ed5;

    .line 131
    .line 132
    invoke-direct {v4, v0, v1}, Ldefpackage/ed5;-><init>(Ldefpackage/fd5;Ldefpackage/w24;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Ldefpackage/x;

    .line 136
    .line 137
    const/16 v1, 0x9

    .line 138
    .line 139
    invoke-direct {v0, v1, v4}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, [Ljava/lang/String;

    .line 151
    .line 152
    iget-object v1, v1, Ldefpackage/s12;->b:Ldefpackage/jy4;

    .line 153
    .line 154
    invoke-virtual {v1, v3}, Ldefpackage/jy4;->g([Ljava/lang/String;)Ldefpackage/kd3;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget-object v4, v3, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, [Ljava/lang/String;

    .line 161
    .line 162
    iget-object v3, v3, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, [I

    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v5, Ldefpackage/x70;

    .line 173
    .line 174
    const/4 v9, 0x7

    .line 175
    const/4 v11, 0x0

    .line 176
    move-object p1, v1

    .line 177
    move-object p2, v3

    .line 178
    move-object p3, v4

    .line 179
    move-object p0, v5

    .line 180
    move/from16 p5, v9

    .line 181
    .line 182
    move-object/from16 p4, v11

    .line 183
    .line 184
    invoke-direct/range {p0 .. p5}, Ldefpackage/x70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ldefpackage/vd0;I)V

    .line 185
    .line 186
    .line 187
    move-object v1, p0

    .line 188
    move-object/from16 v3, p4

    .line 189
    .line 190
    new-instance v4, Ldefpackage/gc0;

    .line 191
    .line 192
    invoke-direct {v4, v10, v1}, Ldefpackage/gc0;-><init>(ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    const/4 v1, -0x1

    .line 196
    invoke-static {v4, v1}, Ldefpackage/ya4;->e(Ldefpackage/p81;I)Ldefpackage/p81;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    new-instance v5, Ldefpackage/j91;

    .line 201
    .line 202
    invoke-direct {v5, v4, v2, v0}, Ldefpackage/j91;-><init>(Ldefpackage/p81;Landroidx/work/impl/WorkDatabase_Impl;Ldefpackage/x;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Ldefpackage/g15;

    .line 206
    .line 207
    const/4 v2, 0x4

    .line 208
    invoke-direct {v0, v2, v3}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 209
    .line 210
    .line 211
    new-instance v2, Ldefpackage/x81;

    .line 212
    .line 213
    invoke-direct {v2, v5, v0, v6}, Ldefpackage/x81;-><init>(Ldefpackage/p81;Ldefpackage/sf1;I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v2, v1}, Ldefpackage/ya4;->e(Ldefpackage/p81;I)Ldefpackage/p81;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, Ldefpackage/ya4;->m(Ldefpackage/p81;)Ldefpackage/p81;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v1, Ldefpackage/h15;

    .line 225
    .line 226
    invoke-direct {v1, v7, v3}, Ldefpackage/h15;-><init>(Landroid/content/Context;Ldefpackage/vd0;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, Ldefpackage/x81;

    .line 230
    .line 231
    const/4 v4, 0x2

    .line 232
    invoke-direct {v2, v0, v1, v4}, Ldefpackage/x81;-><init>(Ldefpackage/p81;Ldefpackage/sf1;I)V

    .line 233
    .line 234
    .line 235
    new-instance v0, Ldefpackage/ac0;

    .line 236
    .line 237
    invoke-direct {v0, v2, v3, v4}, Ldefpackage/ac0;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 238
    .line 239
    .line 240
    const/4 v1, 0x3

    .line 241
    invoke-static {v8, v3, v3, v0, v1}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 242
    .line 243
    .line 244
    :cond_1
    return-void

    .line 245
    :goto_1
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    throw v0

    .line 247
    :cond_2
    const-string v0, "Cannot initialize WorkManager in direct boot mode"

    .line 248
    .line 249
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    throw v0
.end method

.method public static b(Landroid/content/Context;)Ldefpackage/sc5;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/sc5;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    sget-object v1, Ldefpackage/sc5;->k:Ldefpackage/sc5;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v1, Ldefpackage/sc5;->l:Ldefpackage/sc5;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_2
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_1
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :try_start_4
    throw p0

    .line 35
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ldefpackage/kf3;)Ldefpackage/rv2;
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/mc5;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v5}, Ldefpackage/mc5;-><init>(Ldefpackage/sc5;Ljava/lang/String;ILjava/util/List;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ldefpackage/mc5;->a()Ldefpackage/rv2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final c()V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/sc5;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ldefpackage/sc5;->h:Z

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/sc5;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Ldefpackage/sc5;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/sc5;->b:Ldefpackage/r90;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/r90;->m:Ldefpackage/i80;

    .line 4
    .line 5
    const-string v1, "ReschedulingWork"

    .line 6
    .line 7
    new-instance v2, Ldefpackage/e25;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    invoke-direct {v2, v3, p0}, Ldefpackage/e25;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ldefpackage/xl;->y()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-static {v1}, Ldefpackage/xl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v2}, Ldefpackage/e25;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 42
    .line 43
    .line 44
    :cond_2
    throw v0
.end method

.class public abstract Ldj1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lrf2;

.field public final d:Lle;

.field public final e:Lve;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Lif5;

.field public final i:Lpa;

.field public final j:Lij1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p3, v0}, Lji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p5, v0}, Lji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ldj1;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1e

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-lt v1, v2, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, Ll3;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object p1, v3

    .line 43
    :goto_0
    iput-object p1, p0, Ldj1;->b:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p3, p0, Ldj1;->c:Lrf2;

    .line 46
    .line 47
    iput-object p4, p0, Ldj1;->d:Lle;

    .line 48
    .line 49
    iget-object v1, p5, Lcj1;->b:Landroid/os/Looper;

    .line 50
    .line 51
    iput-object v1, p0, Ldj1;->f:Landroid/os/Looper;

    .line 52
    .line 53
    new-instance v1, Lve;

    .line 54
    .line 55
    invoke-direct {v1, p3, p4, p1}, Lve;-><init>(Lrf2;Lle;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Ldj1;->e:Lve;

    .line 59
    .line 60
    new-instance p1, Lif5;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Lif5;-><init>(Ldj1;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Ldj1;->h:Lif5;

    .line 66
    .line 67
    invoke-static {v0}, Lij1;->f(Landroid/content/Context;)Lij1;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Ldj1;->j:Lij1;

    .line 72
    .line 73
    iget-object p3, p1, Lij1;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    iput p3, p0, Ldj1;->g:I

    .line 80
    .line 81
    iget-object p3, p5, Lcj1;->a:Lpa;

    .line 82
    .line 83
    iput-object p3, p0, Ldj1;->i:Lpa;

    .line 84
    .line 85
    if-eqz p2, :cond_6

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    if-ne p3, p4, :cond_6

    .line 96
    .line 97
    const-string p3, "LifecycleFragmentImpl"

    .line 98
    .line 99
    sget-object p4, Lph5;->q:Ljava/util/WeakHashMap;

    .line 100
    .line 101
    invoke-virtual {p4, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p5

    .line 105
    check-cast p5, Ljava/lang/ref/WeakReference;

    .line 106
    .line 107
    if-eqz p5, :cond_1

    .line 108
    .line 109
    invoke-virtual {p5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p5

    .line 113
    check-cast p5, Lph5;

    .line 114
    .line 115
    if-nez p5, :cond_4

    .line 116
    .line 117
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 118
    .line 119
    .line 120
    move-result-object p5

    .line 121
    invoke-virtual {p5, p3}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 122
    .line 123
    .line 124
    move-result-object p5

    .line 125
    check-cast p5, Lph5;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .line 127
    if-eqz p5, :cond_2

    .line 128
    .line 129
    invoke-virtual {p5}, Landroid/app/Fragment;->isRemoving()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    :cond_2
    new-instance p5, Lph5;

    .line 136
    .line 137
    invoke-direct {p5}, Lph5;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0, p5, p3}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-virtual {p3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 153
    .line 154
    .line 155
    :cond_3
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 156
    .line 157
    invoke-direct {p3, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p4, p2, p3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-interface {p5}, Lx92;->c()Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    check-cast p2, Ldf5;

    .line 168
    .line 169
    if-nez p2, :cond_5

    .line 170
    .line 171
    new-instance p2, Ldf5;

    .line 172
    .line 173
    sget-object p3, Lej1;->b:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-direct {p2, p5, p1}, Ldf5;-><init>(Lx92;Lij1;)V

    .line 176
    .line 177
    .line 178
    :cond_5
    iget-object p3, p2, Ldf5;->s:Lqi;

    .line 179
    .line 180
    invoke-virtual {p3, v1}, Lqi;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lij1;->a(Ldf5;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :catch_0
    move-exception p0

    .line 188
    const-string p1, "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"

    .line 189
    .line 190
    invoke-static {p1, p0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    throw v3

    .line 194
    :cond_6
    :goto_1
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 195
    .line 196
    const/4 p2, 0x7

    .line 197
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 202
    .line 203
    .line 204
    return-void
.end method


# virtual methods
.method public final a()Lc12;
    .locals 4

    .line 1
    new-instance v0, Lc12;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lc12;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v2, v0, Lc12;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lqi;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lqi;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3}, Lqi;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v2, v0, Lc12;->o:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    iget-object v2, v0, Lc12;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lqi;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lqi;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldj1;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, v0, Lc12;->q:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iput-object p0, v0, Lc12;->p:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v0
.end method

.method public final b(ILbk;)Ljw;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lcr4;

    .line 6
    .line 7
    invoke-direct {v2}, Lcr4;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lcr4;->a:Ljw;

    .line 11
    .line 12
    iget-object v4, v0, Ldj1;->i:Lpa;

    .line 13
    .line 14
    iget-object v6, v0, Ldj1;->j:Lij1;

    .line 15
    .line 16
    iget-object v13, v6, Lij1;->A:Lzw2;

    .line 17
    .line 18
    iget v7, v1, Lbk;->o:I

    .line 19
    .line 20
    if-eqz v7, :cond_6

    .line 21
    .line 22
    iget-object v8, v0, Ldj1;->e:Lve;

    .line 23
    .line 24
    invoke-virtual {v6}, Lij1;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, Ld34;->E()Ld34;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v5, v5, Ld34;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Le34;

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-boolean v10, v5, Le34;->o:Z

    .line 43
    .line 44
    if-eqz v10, :cond_2

    .line 45
    .line 46
    iget-boolean v5, v5, Le34;->p:Z

    .line 47
    .line 48
    iget-object v10, v6, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-virtual {v10, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, Lgf5;

    .line 55
    .line 56
    if-eqz v10, :cond_1

    .line 57
    .line 58
    iget-object v11, v10, Lgf5;->f:Lme;

    .line 59
    .line 60
    instance-of v12, v11, Lcom/google/android/gms/common/internal/a;

    .line 61
    .line 62
    if-eqz v12, :cond_2

    .line 63
    .line 64
    check-cast v11, Lcom/google/android/gms/common/internal/a;

    .line 65
    .line 66
    iget-object v12, v11, Lcom/google/android/gms/common/internal/a;->H:Ljk5;

    .line 67
    .line 68
    if-eqz v12, :cond_1

    .line 69
    .line 70
    invoke-virtual {v11}, Lcom/google/android/gms/common/internal/a;->c0()Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    if-nez v12, :cond_1

    .line 75
    .line 76
    invoke-static {v10, v11, v7}, Lnf5;->b(Lgf5;Lcom/google/android/gms/common/internal/a;I)Lpa0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    iget v11, v10, Lgf5;->p:I

    .line 83
    .line 84
    add-int/2addr v11, v9

    .line 85
    iput v11, v10, Lgf5;->p:I

    .line 86
    .line 87
    iget-boolean v9, v5, Lpa0;->p:Z

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v9, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    :goto_1
    new-instance v5, Lnf5;

    .line 95
    .line 96
    const-wide/16 v10, 0x0

    .line 97
    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move-wide v14, v10

    .line 106
    :goto_2
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v10

    .line 112
    :cond_5
    move-wide v11, v10

    .line 113
    move-wide v9, v14

    .line 114
    invoke-direct/range {v5 .. v12}, Lnf5;-><init>(Lij1;ILve;JJ)V

    .line 115
    .line 116
    .line 117
    :goto_3
    if-eqz v5, :cond_6

    .line 118
    .line 119
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v7, Lok;

    .line 123
    .line 124
    const/4 v8, 0x3

    .line 125
    invoke-direct {v7, v13, v8}, Lok;-><init>(Landroid/os/Handler;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v8, Lhk5;

    .line 132
    .line 133
    invoke-direct {v8, v7, v5}, Lhk5;-><init>(Ljava/util/concurrent/Executor;Lb93;)V

    .line 134
    .line 135
    .line 136
    iget-object v5, v3, Ljw;->p:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Lmf4;

    .line 139
    .line 140
    invoke-virtual {v5, v8}, Lmf4;->i(Lhk5;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljw;->v()V

    .line 144
    .line 145
    .line 146
    :cond_6
    new-instance v5, Lxf5;

    .line 147
    .line 148
    move/from16 v7, p1

    .line 149
    .line 150
    invoke-direct {v5, v7, v1, v2, v4}, Lxf5;-><init>(ILbk;Lcr4;Lpa;)V

    .line 151
    .line 152
    .line 153
    iget-object v1, v6, Lij1;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 154
    .line 155
    new-instance v2, Lpf5;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-direct {v2, v5, v1, v0}, Lpf5;-><init>(Lcg5;ILdj1;)V

    .line 162
    .line 163
    .line 164
    const/4 v0, 0x4

    .line 165
    invoke-virtual {v13, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v13, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 170
    .line 171
    .line 172
    return-object v3
.end method

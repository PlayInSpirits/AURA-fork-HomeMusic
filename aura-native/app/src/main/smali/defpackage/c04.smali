.class public Ldefpackage/c04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Ldefpackage/z92;


# static fields
.field public static final x:Ldefpackage/g04;


# instance fields
.field public final n:Lcom/bumptech/glide/a;

.field public final o:Landroid/content/Context;

.field public final p:Ldefpackage/s92;

.field public final q:Ldefpackage/mf4;

.field public final r:Ldefpackage/f04;

.field public final s:Ldefpackage/zq4;

.field public final t:Ldefpackage/g5;

.field public final u:Ldefpackage/ua0;

.field public final v:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public w:Ldefpackage/g04;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/g04;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/lq;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ldefpackage/lq;->d(Ljava/lang/Class;)Ldefpackage/lq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ldefpackage/g04;

    .line 13
    .line 14
    invoke-virtual {v0}, Ldefpackage/lq;->k()Ldefpackage/lq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ldefpackage/g04;

    .line 19
    .line 20
    sput-object v0, Ldefpackage/c04;->x:Ldefpackage/g04;

    .line 21
    .line 22
    new-instance v0, Ldefpackage/g04;

    .line 23
    .line 24
    invoke-direct {v0}, Ldefpackage/lq;-><init>()V

    .line 25
    .line 26
    .line 27
    const-class v1, Ldefpackage/vh1;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ldefpackage/lq;->d(Ljava/lang/Class;)Ldefpackage/lq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ldefpackage/g04;

    .line 34
    .line 35
    invoke-virtual {v0}, Ldefpackage/lq;->k()Ldefpackage/lq;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ldefpackage/g04;

    .line 40
    .line 41
    new-instance v0, Ldefpackage/g04;

    .line 42
    .line 43
    invoke-direct {v0}, Ldefpackage/lq;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v1, Ldefpackage/xq0;->d:Ldefpackage/xq0;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ldefpackage/lq;->e(Ldefpackage/xq0;)Ldefpackage/lq;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ldefpackage/g04;

    .line 53
    .line 54
    invoke-virtual {v0}, Ldefpackage/lq;->s()Ldefpackage/lq;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ldefpackage/g04;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-virtual {v0, v1}, Ldefpackage/lq;->y(Z)Ldefpackage/lq;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ldefpackage/g04;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Ldefpackage/s92;Ldefpackage/f04;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/mf4;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/mf4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p1, Lcom/bumptech/glide/a;->s:Ldefpackage/i80;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ldefpackage/zq4;

    .line 13
    .line 14
    invoke-direct {v2}, Ldefpackage/zq4;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 18
    .line 19
    new-instance v2, Ldefpackage/g5;

    .line 20
    .line 21
    const/16 v3, 0x1b

    .line 22
    .line 23
    invoke-direct {v2, v3, p0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Ldefpackage/c04;->t:Ldefpackage/g5;

    .line 27
    .line 28
    iput-object p1, p0, Ldefpackage/c04;->n:Lcom/bumptech/glide/a;

    .line 29
    .line 30
    iput-object p2, p0, Ldefpackage/c04;->p:Ldefpackage/s92;

    .line 31
    .line 32
    iput-object p3, p0, Ldefpackage/c04;->r:Ldefpackage/f04;

    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 35
    .line 36
    iput-object p4, p0, Ldefpackage/c04;->o:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    new-instance p4, Ldefpackage/b04;

    .line 43
    .line 44
    invoke-direct {p4, p0, v0}, Ldefpackage/b04;-><init>(Ldefpackage/c04;Ldefpackage/mf4;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v0, "ConnectivityMonitor"

    .line 51
    .line 52
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 53
    .line 54
    invoke-static {p3, v1}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x1

    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    move v1, v4

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v1, v3

    .line 65
    :goto_0
    const/4 v5, 0x3

    .line 66
    invoke-static {v0, v5}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    const-string v5, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const-string v5, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 78
    .line 79
    :goto_1
    invoke-static {v0, v5}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    new-instance v0, Ldefpackage/wj0;

    .line 85
    .line 86
    invoke-direct {v0, p3, p4}, Ldefpackage/wj0;-><init>(Landroid/content/Context;Ldefpackage/b04;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    new-instance v0, Ldefpackage/k73;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    :goto_2
    iput-object v0, p0, Ldefpackage/c04;->u:Ldefpackage/ua0;

    .line 96
    .line 97
    iget-object p3, p1, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 98
    .line 99
    monitor-enter p3

    .line 100
    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    if-nez p4, :cond_7

    .line 107
    .line 108
    iget-object p4, p1, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    if-ne p3, p4, :cond_4

    .line 123
    .line 124
    move v3, v4

    .line 125
    :cond_4
    if-nez v3, :cond_5

    .line 126
    .line 127
    invoke-static {}, Ldefpackage/e35;->C()Landroid/os/Handler;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    invoke-interface {p2, p0}, Ldefpackage/s92;->f(Ldefpackage/z92;)V

    .line 136
    .line 137
    .line 138
    :goto_3
    invoke-interface {p2, v0}, Ldefpackage/s92;->f(Ldefpackage/z92;)V

    .line 139
    .line 140
    .line 141
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 142
    .line 143
    iget-object p3, p1, Lcom/bumptech/glide/a;->p:Ldefpackage/ii1;

    .line 144
    .line 145
    iget-object p3, p3, Ldefpackage/ii1;->e:Ljava/util/List;

    .line 146
    .line 147
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 148
    .line 149
    .line 150
    iput-object p2, p0, Ldefpackage/c04;->v:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/bumptech/glide/a;->p:Ldefpackage/ii1;

    .line 153
    .line 154
    monitor-enter p1

    .line 155
    :try_start_1
    iget-object p2, p1, Ldefpackage/ii1;->j:Ldefpackage/g04;

    .line 156
    .line 157
    if-nez p2, :cond_6

    .line 158
    .line 159
    iget-object p2, p1, Ldefpackage/ii1;->d:Ldefpackage/fi1;

    .line 160
    .line 161
    invoke-interface {p2}, Ldefpackage/fi1;->build()Ldefpackage/g04;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, Ldefpackage/lq;->k()Ldefpackage/lq;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Ldefpackage/g04;

    .line 170
    .line 171
    iput-object p2, p1, Ldefpackage/ii1;->j:Ldefpackage/g04;

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :catchall_0
    move-exception p0

    .line 175
    goto :goto_5

    .line 176
    :cond_6
    :goto_4
    iget-object p2, p1, Ldefpackage/ii1;->j:Ldefpackage/g04;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    monitor-exit p1

    .line 179
    invoke-virtual {p0, p2}, Ldefpackage/c04;->w(Ldefpackage/g04;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :goto_5
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    throw p0

    .line 185
    :catchall_1
    move-exception p0

    .line 186
    goto :goto_6

    .line 187
    :cond_7
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    const-string p1, "Cannot register already registered manager"

    .line 190
    .line 191
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p0

    .line 195
    :goto_6
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 196
    throw p0
.end method


# virtual methods
.method public declared-synchronized a(Ldefpackage/g04;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget-object v0, p0, Ldefpackage/c04;->w:Ldefpackage/g04;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ldefpackage/lq;->a(Ldefpackage/lq;)Ldefpackage/lq;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ldefpackage/g04;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/c04;->w:Ldefpackage/g04;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 18
    :try_start_4
    throw p1

    .line 19
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 20
    throw p1

    .line 21
    :catchall_1
    move-exception p1

    .line 22
    goto :goto_0
.end method

.method public f(Ljava/lang/Class;)Ldefpackage/vz3;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/vz3;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/c04;->n:Lcom/bumptech/glide/a;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/c04;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1, v2}, Ldefpackage/vz3;-><init>(Lcom/bumptech/glide/a;Ldefpackage/c04;Ljava/lang/Class;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public g()Ldefpackage/vz3;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/c04;->f(Ljava/lang/Class;)Ldefpackage/vz3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ldefpackage/c04;->x:Ldefpackage/g04;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final declared-synchronized h()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 3
    .line 4
    invoke-virtual {v0}, Ldefpackage/zq4;->h()V

    .line 5
    .line 6
    .line 7
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    :try_start_1
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 9
    .line 10
    iget-object v0, v0, Ldefpackage/zq4;->n:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v0}, Ldefpackage/e35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    if-ge v3, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    check-cast v4, Ldefpackage/wq4;

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Ldefpackage/c04;->q(Ldefpackage/wq4;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 39
    .line 40
    iget-object v0, v0, Ldefpackage/zq4;->n:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    :try_start_2
    monitor-exit p0

    .line 46
    iget-object v0, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 47
    .line 48
    iget-object v1, v0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/Set;

    .line 51
    .line 52
    invoke-static {v1}, Ldefpackage/e35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    :goto_1
    if-ge v2, v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    check-cast v4, Ldefpackage/pz3;

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ldefpackage/mf4;->c(Ldefpackage/pz3;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    iget-object v0, v0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Ldefpackage/c04;->p:Ldefpackage/s92;

    .line 82
    .line 83
    invoke-interface {v0, p0}, Ldefpackage/s92;->a(Ldefpackage/z92;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Ldefpackage/c04;->p:Ldefpackage/s92;

    .line 87
    .line 88
    iget-object v1, p0, Ldefpackage/c04;->u:Ldefpackage/ua0;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ldefpackage/s92;->a(Ldefpackage/z92;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Ldefpackage/c04;->t:Ldefpackage/g5;

    .line 94
    .line 95
    invoke-static {}, Ldefpackage/e35;->C()Landroid/os/Handler;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Ldefpackage/c04;->n:Lcom/bumptech/glide/a;

    .line 103
    .line 104
    iget-object v1, v0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 105
    .line 106
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    :try_start_3
    iget-object v2, v0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    iget-object v0, v0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    monitor-exit p0

    .line 122
    return-void

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_2

    .line 125
    :cond_2
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v2, "Cannot unregister not yet registered manager"

    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 134
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 135
    :catchall_2
    move-exception v0

    .line 136
    goto :goto_4

    .line 137
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 138
    :try_start_7
    throw v0

    .line 139
    :goto_4
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 140
    throw v0
.end method

.method public final declared-synchronized j()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 3
    .line 4
    invoke-virtual {v0}, Ldefpackage/zq4;->j()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/c04;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final declared-synchronized n()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/c04;->v()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/zq4;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public o()Ldefpackage/vz3;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/c04;->f(Ljava/lang/Class;)Ldefpackage/vz3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public p()Ldefpackage/vz3;
    .locals 2

    .line 1
    const-class v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/c04;->f(Ljava/lang/Class;)Ldefpackage/vz3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ldefpackage/g04;->I:Ldefpackage/g04;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ldefpackage/g04;

    .line 12
    .line 13
    invoke-direct {v0}, Ldefpackage/lq;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ldefpackage/lq;->y(Z)Ldefpackage/lq;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldefpackage/g04;

    .line 22
    .line 23
    invoke-virtual {v0}, Ldefpackage/lq;->b()Ldefpackage/lq;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ldefpackage/g04;

    .line 28
    .line 29
    sput-object v0, Ldefpackage/g04;->I:Ldefpackage/g04;

    .line 30
    .line 31
    :cond_0
    sget-object v0, Ldefpackage/g04;->I:Ldefpackage/g04;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final q(Ldefpackage/wq4;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/c04;->x(Ldefpackage/wq4;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Ldefpackage/wq4;->l()Ldefpackage/pz3;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/c04;->n:Lcom/bumptech/glide/a;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/a;->t:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    :cond_1
    if-ge v3, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    check-cast v4, Ldefpackage/c04;

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Ldefpackage/c04;->x(Ldefpackage/wq4;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-interface {p1, p0}, Ldefpackage/wq4;->e(Ldefpackage/pz3;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ldefpackage/pz3;->clear()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_3
    :goto_1
    return-void
.end method

.method public r(Landroid/net/Uri;)Ldefpackage/vz3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/c04;->o()Ldefpackage/vz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->N(Landroid/net/Uri;)Ldefpackage/vz3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public s(Ljava/io/File;)Ldefpackage/vz3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/c04;->o()Ldefpackage/vz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->O(Ljava/io/File;)Ldefpackage/vz3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public t(Ljava/lang/String;)Ldefpackage/vz3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/c04;->o()Ldefpackage/vz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->P(Ljava/lang/String;)Ldefpackage/vz3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "{tracker="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", treeNode="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Ldefpackage/c04;->r:Ldefpackage/f04;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0
.end method

.method public final declared-synchronized u()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Ldefpackage/mf4;->o:Z

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Ldefpackage/e35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    check-cast v4, Ldefpackage/pz3;

    .line 29
    .line 30
    invoke-interface {v4}, Ldefpackage/pz3;->isRunning()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-interface {v4}, Ldefpackage/pz3;->c()V

    .line 37
    .line 38
    .line 39
    iget-object v5, v0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v0
.end method

.method public final declared-synchronized v()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Ldefpackage/mf4;->o:Z

    .line 6
    .line 7
    iget-object v2, v0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v2}, Ldefpackage/e35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    :cond_0
    :goto_0
    if-ge v1, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    check-cast v4, Ldefpackage/pz3;

    .line 28
    .line 29
    invoke-interface {v4}, Ldefpackage/pz3;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    invoke-interface {v4}, Ldefpackage/pz3;->isRunning()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v4}, Ldefpackage/pz3;->k()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, v0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public declared-synchronized w(Ldefpackage/g04;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ldefpackage/lq;->c()Ldefpackage/lq;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Ldefpackage/g04;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldefpackage/lq;->b()Ldefpackage/lq;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ldefpackage/g04;

    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/c04;->w:Ldefpackage/g04;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public final declared-synchronized x(Ldefpackage/wq4;)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ldefpackage/wq4;->l()Ldefpackage/pz3;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v2, p0, Ldefpackage/c04;->q:Ldefpackage/mf4;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ldefpackage/mf4;->c(Ldefpackage/pz3;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/c04;->s:Ldefpackage/zq4;

    .line 20
    .line 21
    iget-object v0, v0, Ldefpackage/zq4;->n:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Ldefpackage/wq4;->e(Ldefpackage/pz3;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
.end method

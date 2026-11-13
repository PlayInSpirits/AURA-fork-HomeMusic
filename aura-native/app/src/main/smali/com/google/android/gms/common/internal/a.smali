.class public abstract Lcom/google/android/gms/common/internal/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/me;


# static fields
.field public static final K:[Ldefpackage/p61;


# instance fields
.field public final A:Ldefpackage/oz4;

.field public final B:Ldefpackage/c05;

.field public final C:I

.field public final D:Ljava/lang/String;

.field public volatile E:Ljava/lang/String;

.field public F:Ldefpackage/ka0;

.field public G:Z

.field public volatile H:Ldefpackage/jk5;

.field public final I:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final J:Ljava/util/Set;

.field public volatile n:Ljava/lang/String;

.field public o:Ldefpackage/u24;

.field public final p:Landroid/content/Context;

.field public final q:Ldefpackage/tk5;

.field public final r:Ldefpackage/qh5;

.field public final s:Ljava/lang/Object;

.field public final t:Ljava/lang/Object;

.field public u:Ldefpackage/ih5;

.field public v:Ldefpackage/pp;

.field public w:Landroid/os/IInterface;

.field public final x:Ljava/util/ArrayList;

.field public y:Ldefpackage/wi5;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ldefpackage/p61;

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/common/internal/a;->K:[Ldefpackage/p61;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILdefpackage/ml3;Ldefpackage/gj1;Ldefpackage/hj1;I)V
    .locals 4

    .line 1
    sget-object p7, Ldefpackage/tk5;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p7

    .line 4
    :try_start_0
    sget-object v0, Ldefpackage/tk5;->h:Ldefpackage/tk5;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ldefpackage/tk5;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, v1, v2}, Ldefpackage/tk5;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldefpackage/tk5;->h:Ldefpackage/tk5;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    :goto_0
    monitor-exit p7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    sget-object p7, Ldefpackage/tk5;->h:Ldefpackage/tk5;

    .line 29
    .line 30
    sget-object v0, Ldefpackage/ej1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p5}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p6}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ldefpackage/oz4;

    .line 39
    .line 40
    invoke-direct {v0, p5}, Ldefpackage/oz4;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p5, Ldefpackage/c05;

    .line 44
    .line 45
    invoke-direct {p5, p6}, Ldefpackage/c05;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p6, p4, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p6, Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput-object v1, p0, Lcom/google/android/gms/common/internal/a;->n:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v2, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance v2, Ljava/lang/Object;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lcom/google/android/gms/common/internal/a;->t:Ljava/lang/Object;

    .line 71
    .line 72
    new-instance v2, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Lcom/google/android/gms/common/internal/a;->x:Ljava/util/ArrayList;

    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    iput v2, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 81
    .line 82
    iput-object v1, p0, Lcom/google/android/gms/common/internal/a;->F:Ldefpackage/ka0;

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    iput-boolean v2, p0, Lcom/google/android/gms/common/internal/a;->G:Z

    .line 86
    .line 87
    iput-object v1, p0, Lcom/google/android/gms/common/internal/a;->H:Ldefpackage/jk5;

    .line 88
    .line 89
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 90
    .line 91
    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    .line 96
    const-string v2, "Context must not be null"

    .line 97
    .line 98
    invoke-static {p1, v2}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->p:Landroid/content/Context;

    .line 102
    .line 103
    const-string p1, "Looper must not be null"

    .line 104
    .line 105
    invoke-static {p2, p1}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string p1, "Supervisor must not be null"

    .line 109
    .line 110
    invoke-static {p7, p1}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object p7, p0, Lcom/google/android/gms/common/internal/a;->q:Ldefpackage/tk5;

    .line 114
    .line 115
    new-instance p1, Ldefpackage/qh5;

    .line 116
    .line 117
    invoke-direct {p1, p0, p2}, Ldefpackage/qh5;-><init>(Lcom/google/android/gms/common/internal/a;Landroid/os/Looper;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 121
    .line 122
    iput p3, p0, Lcom/google/android/gms/common/internal/a;->C:I

    .line 123
    .line 124
    iput-object v0, p0, Lcom/google/android/gms/common/internal/a;->A:Ldefpackage/oz4;

    .line 125
    .line 126
    iput-object p5, p0, Lcom/google/android/gms/common/internal/a;->B:Ldefpackage/c05;

    .line 127
    .line 128
    iput-object p6, p0, Lcom/google/android/gms/common/internal/a;->D:Ljava/lang/String;

    .line 129
    .line 130
    iget-object p1, p4, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Ljava/util/Set;

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-eqz p3, :cond_2

    .line 143
    .line 144
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    check-cast p3, Lcom/google/android/gms/common/api/Scope;

    .line 149
    .line 150
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    if-eqz p3, :cond_1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_1
    const-string p0, "Expanding scopes is not permitted, use implied scopes instead"

    .line 158
    .line 159
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v1

    .line 163
    :cond_2
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->J:Ljava/util/Set;

    .line 164
    .line 165
    return-void

    .line 166
    :goto_2
    :try_start_1
    monitor-exit p7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    throw p0
.end method

.method public static bridge synthetic j(Lcom/google/android/gms/common/internal/a;IILandroid/os/IInterface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/common/internal/a;->k(ILandroid/os/IInterface;)V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method


# virtual methods
.method public final Y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final Z()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->i0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->J:Ljava/util/Set;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 11
    .line 12
    return-object p0
.end method

.method public abstract a(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->x:Ljava/util/ArrayList;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->x:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->x:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ldefpackage/fh5;

    .line 26
    .line 27
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :try_start_2
    iput-object v4, v3, Ldefpackage/fh5;->a:Ljava/lang/Boolean;

    .line 29
    .line 30
    monitor-exit v3

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    :try_start_3
    throw p0

    .line 37
    :catchall_1
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 40
    .line 41
    .line 42
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 43
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->t:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v1

    .line 46
    :try_start_4
    iput-object v4, p0, Lcom/google/android/gms/common/internal/a;->u:Ldefpackage/ih5;

    .line 47
    .line 48
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p0, v0, v4}, Lcom/google/android/gms/common/internal/a;->k(ILandroid/os/IInterface;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_2
    move-exception p0

    .line 55
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 56
    throw p0

    .line 57
    :goto_1
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 58
    throw p0
.end method

.method public final b0(Ldefpackage/h45;)V
    .locals 2

    .line 1
    iget-object p0, p1, Ldefpackage/h45;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/gf5;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/gf5;->q:Ldefpackage/ij1;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ij1;->A:Ldefpackage/zw2;

    .line 8
    .line 9
    new-instance v0, Ldefpackage/wu4;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, v1, p1}, Ldefpackage/wu4;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c()[Ldefpackage/p61;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/android/gms/common/internal/a;->K:[Ldefpackage/p61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-ne p0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :cond_1
    :goto_0
    monitor-exit v0

    .line 16
    return v2

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public d()Landroid/os/Bundle;
    .locals 0

    .line 1
    new-instance p0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "Failed to connect when checking package"

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/tb4;->e(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e()Landroid/os/IInterface;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->Y()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->w:Landroid/os/IInterface;

    .line 16
    .line 17
    const-string v1, "Client is connected but service is null"

    .line 18
    .line 19
    invoke-static {p0, v1}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    .line 29
    .line 30
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    new-instance p0, Landroid/os/DeadObjectException;

    .line 35
    .line 36
    invoke-direct {p0}, Landroid/os/DeadObjectException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0
.end method

.method public final e0(Ldefpackage/pp;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->v:Ldefpackage/pp;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/internal/a;->k(ILandroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public final g0()[Ldefpackage/p61;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->H:Ldefpackage/jk5;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Ldefpackage/jk5;->o:[Ldefpackage/p61;

    .line 8
    .line 9
    return-object p0
.end method

.method public h()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ldefpackage/me;->f0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, 0xc9e4920

    .line 6
    .line 7
    .line 8
    if-lt p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final h0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public i()Z
    .locals 0

    .line 1
    instance-of p0, p0, Ldefpackage/p14;

    .line 2
    .line 3
    return p0
.end method

.method public i0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j0(Ldefpackage/eu1;Ljava/util/Set;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->d()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ldefpackage/sh1;

    .line 10
    .line 11
    iget-object v4, v1, Lcom/google/android/gms/common/internal/a;->E:Ljava/lang/String;

    .line 12
    .line 13
    sget v6, Ldefpackage/fj1;->a:I

    .line 14
    .line 15
    sget-object v9, Ldefpackage/sh1;->B:[Lcom/google/android/gms/common/api/Scope;

    .line 16
    .line 17
    new-instance v10, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    iget v5, v1, Lcom/google/android/gms/common/internal/a;->C:I

    .line 23
    .line 24
    sget-object v12, Ldefpackage/sh1;->C:[Ldefpackage/p61;

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    move-object/from16 v17, v4

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v14, 0x1

    .line 36
    move-object v13, v12

    .line 37
    invoke-direct/range {v3 .. v17}, Ldefpackage/sh1;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Ldefpackage/p61;[Ldefpackage/p61;ZIZLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v1, Lcom/google/android/gms/common/internal/a;->p:Landroid/content/Context;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iput-object v4, v3, Ldefpackage/sh1;->q:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v2, v3, Ldefpackage/sh1;->t:Landroid/os/Bundle;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    .line 54
    .line 55
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    .line 60
    .line 61
    iput-object v0, v3, Ldefpackage/sh1;->s:[Lcom/google/android/gms/common/api/Scope;

    .line 62
    .line 63
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->i0()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    new-instance v0, Landroid/accounts/Account;

    .line 70
    .line 71
    const-string v2, "<<default account>>"

    .line 72
    .line 73
    const-string v4, "com.google"

    .line 74
    .line 75
    invoke-direct {v0, v2, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, v3, Ldefpackage/sh1;->u:Landroid/accounts/Account;

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    move-object/from16 v0, p1

    .line 83
    .line 84
    check-cast v0, Ldefpackage/vk5;

    .line 85
    .line 86
    iget-object v0, v0, Ldefpackage/vk5;->e:Landroid/os/IBinder;

    .line 87
    .line 88
    iput-object v0, v3, Ldefpackage/sh1;->r:Landroid/os/IBinder;

    .line 89
    .line 90
    :cond_1
    sget-object v0, Lcom/google/android/gms/common/internal/a;->K:[Ldefpackage/p61;

    .line 91
    .line 92
    iput-object v0, v3, Ldefpackage/sh1;->v:[Ldefpackage/p61;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->c()[Ldefpackage/p61;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, v3, Ldefpackage/sh1;->w:[Ldefpackage/p61;

    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/a;->i()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/4 v2, 0x1

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    iput-boolean v2, v3, Ldefpackage/sh1;->z:Z

    .line 108
    .line 109
    :cond_2
    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/common/internal/a;->t:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v4
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :try_start_1
    iget-object v0, v1, Lcom/google/android/gms/common/internal/a;->u:Ldefpackage/ih5;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    new-instance v5, Ldefpackage/ui5;

    .line 117
    .line 118
    iget-object v6, v1, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    invoke-direct {v5, v1, v6}, Ldefpackage/ui5;-><init>(Lcom/google/android/gms/common/internal/a;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v5, v3}, Ldefpackage/ih5;->m(Ldefpackage/ui5;Ldefpackage/sh1;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto :goto_1

    .line 133
    :cond_3
    const-string v0, "GmsClient"

    .line 134
    .line 135
    const-string v3, "mServiceBroker is null, client disconnected"

    .line 136
    .line 137
    invoke-static {v0, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    :goto_0
    monitor-exit v4

    .line 141
    return-void

    .line 142
    :goto_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 144
    :catch_0
    move-exception v0

    .line 145
    goto :goto_2

    .line 146
    :catch_1
    move-exception v0

    .line 147
    goto :goto_2

    .line 148
    :catch_2
    move-exception v0

    .line 149
    goto :goto_3

    .line 150
    :goto_2
    const-string v3, "GmsClient"

    .line 151
    .line 152
    const-string v4, "IGmsServiceBroker.getService failed"

    .line 153
    .line 154
    invoke-static {v3, v4, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 155
    .line 156
    .line 157
    iget-object v0, v1, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    new-instance v3, Ldefpackage/xi5;

    .line 164
    .line 165
    const/16 v4, 0x8

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    invoke-direct {v3, v1, v4, v5, v5}, Ldefpackage/xi5;-><init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v1, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 172
    .line 173
    const/4 v4, -0x1

    .line 174
    invoke-virtual {v1, v2, v0, v4, v3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_3
    move-exception v0

    .line 183
    throw v0

    .line 184
    :goto_3
    const-string v2, "GmsClient"

    .line 185
    .line 186
    const-string v3, "IGmsServiceBroker.getService failed"

    .line 187
    .line 188
    invoke-static {v2, v3, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    .line 190
    .line 191
    iget-object v0, v1, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iget-object v1, v1, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 198
    .line 199
    const/4 v2, 0x6

    .line 200
    const/4 v3, 0x3

    .line 201
    invoke-virtual {v1, v2, v0, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final k(ILandroid/os/IInterface;)V
    .locals 9

    .line 1
    const-string v0, " on com.google.android.gms"

    .line 2
    .line 3
    const-string v1, " on com.google.android.gms"

    .line 4
    .line 5
    const-string v2, "unable to connect to service: "

    .line 6
    .line 7
    const-string v3, "Calling connect() while still connected, missing disconnect() for "

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x4

    .line 12
    if-eq p1, v6, :cond_0

    .line 13
    .line 14
    move v7, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v7, v5

    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    move v8, v4

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v8, v5

    .line 22
    :goto_1
    if-ne v7, v8, :cond_2

    .line 23
    .line 24
    move v4, v5

    .line 25
    :cond_2
    invoke-static {v4}, Ldefpackage/ji2;->i(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Lcom/google/android/gms/common/internal/a;->s:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v4

    .line 31
    :try_start_0
    iput p1, p0, Lcom/google/android/gms/common/internal/a;->z:I

    .line 32
    .line 33
    iput-object p2, p0, Lcom/google/android/gms/common/internal/a;->w:Landroid/os/IInterface;

    .line 34
    .line 35
    if-eq p1, v5, :cond_a

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    if-eq p1, v5, :cond_4

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    if-eq p1, v5, :cond_4

    .line 42
    .line 43
    if-eq p1, v6, :cond_3

    .line 44
    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_3
    invoke-static {p2}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/common/internal/a;->y:Ldefpackage/wi5;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 63
    .line 64
    if-eqz p2, :cond_6

    .line 65
    .line 66
    const-string v5, "GmsClient"

    .line 67
    .line 68
    iget-object p2, p2, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v6, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {v5, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->q:Ldefpackage/tk5;

    .line 89
    .line 90
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 91
    .line 92
    iget-object v1, v1, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->D:Ljava/lang/String;

    .line 103
    .line 104
    if-nez v3, :cond_5

    .line 105
    .line 106
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->p:Landroid/content/Context;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 112
    .line 113
    iget-boolean v3, v3, Ldefpackage/u24;->a:Z

    .line 114
    .line 115
    invoke-virtual {p2, v1, p1, v3}, Ldefpackage/tk5;->a(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 121
    .line 122
    .line 123
    :cond_6
    new-instance p1, Ldefpackage/wi5;

    .line 124
    .line 125
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-direct {p1, p0, p2}, Ldefpackage/wi5;-><init>(Lcom/google/android/gms/common/internal/a;I)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->y:Ldefpackage/wi5;

    .line 135
    .line 136
    new-instance p2, Ldefpackage/u24;

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->g()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->h()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-direct {p2, v1, v3}, Ldefpackage/u24;-><init>(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    iput-object p2, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 150
    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    invoke-interface {p0}, Ldefpackage/me;->f0()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    const v1, 0x1110e58

    .line 158
    .line 159
    .line 160
    if-lt p2, v1, :cond_7

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 166
    .line 167
    iget-object p0, p0, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 168
    .line 169
    const-string p2, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    .line 170
    .line 171
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_8
    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->q:Ldefpackage/tk5;

    .line 184
    .line 185
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 186
    .line 187
    iget-object v1, v1, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v1}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->D:Ljava/lang/String;

    .line 198
    .line 199
    if-nez v3, :cond_9

    .line 200
    .line 201
    iget-object v3, p0, Lcom/google/android/gms/common/internal/a;->p:Landroid/content/Context;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    :cond_9
    iget-object v5, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 212
    .line 213
    iget-boolean v5, v5, Ldefpackage/u24;->a:Z

    .line 214
    .line 215
    new-instance v6, Ldefpackage/nk5;

    .line 216
    .line 217
    invoke-direct {v6, v1, v5}, Ldefpackage/nk5;-><init>(Ljava/lang/String;Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2, v6, p1, v3}, Ldefpackage/tk5;->b(Ldefpackage/nk5;Ldefpackage/wi5;Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-nez p1, :cond_c

    .line 225
    .line 226
    const-string p1, "GmsClient"

    .line 227
    .line 228
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 229
    .line 230
    iget-object p2, p2, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 231
    .line 232
    new-instance v1, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-static {p1, p2}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    iget-object p1, p0, Lcom/google/android/gms/common/internal/a;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    new-instance p2, Ldefpackage/fj5;

    .line 257
    .line 258
    const/16 v0, 0x10

    .line 259
    .line 260
    invoke-direct {p2, p0, v0}, Ldefpackage/fj5;-><init>(Lcom/google/android/gms/common/internal/a;I)V

    .line 261
    .line 262
    .line 263
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->r:Ldefpackage/qh5;

    .line 264
    .line 265
    const/4 v0, 0x7

    .line 266
    const/4 v1, -0x1

    .line 267
    invoke-virtual {p0, v0, p1, v1, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/common/internal/a;->y:Ldefpackage/wi5;

    .line 276
    .line 277
    if-eqz p1, :cond_c

    .line 278
    .line 279
    iget-object p2, p0, Lcom/google/android/gms/common/internal/a;->q:Ldefpackage/tk5;

    .line 280
    .line 281
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 282
    .line 283
    iget-object v0, v0, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 284
    .line 285
    invoke-static {v0}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->D:Ljava/lang/String;

    .line 294
    .line 295
    if-nez v1, :cond_b

    .line 296
    .line 297
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->p:Landroid/content/Context;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->o:Ldefpackage/u24;

    .line 303
    .line 304
    iget-boolean v1, v1, Ldefpackage/u24;->a:Z

    .line 305
    .line 306
    invoke-virtual {p2, v0, p1, v1}, Ldefpackage/tk5;->a(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    .line 307
    .line 308
    .line 309
    const/4 p1, 0x0

    .line 310
    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->y:Ldefpackage/wi5;

    .line 311
    .line 312
    :cond_c
    :goto_3
    monitor-exit v4

    .line 313
    return-void

    .line 314
    :goto_4
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    throw p0
.end method

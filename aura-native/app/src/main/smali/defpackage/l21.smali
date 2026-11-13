.class public abstract Ldefpackage/l21;
.super Ldefpackage/g21;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ao0;


# static fields
.field public static final synthetic t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic w:J

.field public static final synthetic x:J


# instance fields
.field private volatile synthetic _delayed$volatile:Ljava/lang/Object;

.field private volatile synthetic _isCompleted$volatile:I

.field private volatile synthetic _queue$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Ldefpackage/l21;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_queue$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sput-object v3, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sput-wide v4, Ldefpackage/l21;->x:J

    .line 24
    .line 25
    const-string v2, "_delayed$volatile"

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v3, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    sput-wide v1, Ldefpackage/l21;->w:J

    .line 42
    .line 43
    const-string v1, "_isCompleted$volatile"

    .line 44
    .line 45
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Ldefpackage/l21;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/pe0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ldefpackage/l21;->_isCompleted$volatile:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public F(JLdefpackage/gu4;Ldefpackage/ne0;)Ldefpackage/as0;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/qk0;->a:Ldefpackage/ao0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Ldefpackage/ao0;->F(JLdefpackage/gu4;Ldefpackage/ne0;)Ldefpackage/as0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final H(JLdefpackage/cz;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide v0, 0x8637bd05af6L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-ltz v0, :cond_1

    .line 16
    .line 17
    const-wide v0, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-wide/32 v0, 0xf4240

    .line 24
    .line 25
    .line 26
    mul-long/2addr v0, p1

    .line 27
    :goto_0
    const-wide p1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long p1, v0, p1

    .line 33
    .line 34
    if-gez p1, :cond_2

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    new-instance v2, Ldefpackage/h21;

    .line 41
    .line 42
    add-long/2addr v0, p1

    .line 43
    invoke-direct {v2, p0, v0, v1, p3}, Ldefpackage/h21;-><init>(Ldefpackage/l21;JLdefpackage/cz;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, p2, v2}, Ldefpackage/l21;->q0(JLdefpackage/j21;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Ldefpackage/wy;

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    invoke-direct {p0, p1, v2}, Ldefpackage/wy;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p0}, Ldefpackage/cz;->x(Ldefpackage/o63;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public final W(Ldefpackage/ne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Ldefpackage/l21;->h0(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d0()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/g21;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/l21;->i0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/l21;->g0()Ljava/lang/Runnable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 20
    .line 21
    .line 22
    return-wide v1

    .line 23
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l21;->k0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
.end method

.method public final f0()V
    .locals 14

    .line 1
    sget-object v5, Ldefpackage/hw;->c:Ldefpackage/f01;

    .line 2
    .line 3
    :goto_0
    sget-object v0, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v6, Ldefpackage/l21;->x:J

    .line 11
    .line 12
    invoke-virtual {v0, p0, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v12

    .line 16
    if-nez v12, :cond_2

    .line 17
    .line 18
    :goto_1
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v2, Ldefpackage/l21;->x:J

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p0

    .line 24
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_1
    move-object p0, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v1, p0

    .line 41
    instance-of p0, v12, Ldefpackage/ce2;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    check-cast v12, Ldefpackage/ce2;

    .line 46
    .line 47
    invoke-virtual {v12}, Ldefpackage/ce2;->c()Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    if-ne v12, v5, :cond_4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    new-instance v13, Ldefpackage/ce2;

    .line 55
    .line 56
    const/16 p0, 0x8

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-direct {v13, p0, v0}, Ldefpackage/ce2;-><init>(IZ)V

    .line 60
    .line 61
    .line 62
    move-object p0, v12

    .line 63
    check-cast p0, Ljava/lang/Runnable;

    .line 64
    .line 65
    invoke-virtual {v13, p0}, Ldefpackage/ce2;->a(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    :cond_5
    sget-object v8, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 69
    .line 70
    sget-wide v10, Ldefpackage/l21;->x:J

    .line 71
    .line 72
    move-object v9, v1

    .line 73
    invoke-virtual/range {v8 .. v13}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_6

    .line 78
    .line 79
    :goto_2
    return-void

    .line 80
    :cond_6
    invoke-virtual {v8, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eq p0, v12, :cond_5

    .line 85
    .line 86
    :goto_3
    move-object p0, v1

    .line 87
    goto :goto_0
.end method

.method public final g0()Ljava/lang/Runnable;
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ldefpackage/l21;->x:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    if-nez v7, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    instance-of v0, v7, Ldefpackage/ce2;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    move-object v0, v7

    .line 22
    check-cast v0, Ldefpackage/ce2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ldefpackage/ce2;->e()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    sget-object v4, Ldefpackage/ce2;->g:Ldefpackage/f01;

    .line 29
    .line 30
    if-eq v3, v4, :cond_1

    .line 31
    .line 32
    check-cast v3, Ljava/lang/Runnable;

    .line 33
    .line 34
    return-object v3

    .line 35
    :cond_1
    invoke-virtual {v0}, Ldefpackage/ce2;->d()Ldefpackage/ce2;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    :goto_1
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 40
    .line 41
    sget-wide v5, Ldefpackage/l21;->x:J

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eq p0, v7, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move-object p0, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object v4, p0

    .line 61
    sget-object p0, Ldefpackage/hw;->c:Ldefpackage/f01;

    .line 62
    .line 63
    if-ne v7, p0, :cond_5

    .line 64
    .line 65
    :goto_2
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 68
    .line 69
    sget-wide v5, Ldefpackage/l21;->x:J

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_6

    .line 77
    .line 78
    check-cast v7, Ljava/lang/Runnable;

    .line 79
    .line 80
    return-object v7

    .line 81
    :cond_6
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eq p0, v7, :cond_5

    .line 86
    .line 87
    :goto_3
    move-object p0, v4

    .line 88
    goto :goto_0
.end method

.method public h0(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/l21;->i0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ldefpackage/l21;->j0(Ljava/lang/Runnable;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/l21;->l0()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eq p1, p0, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    sget-object p0, Ldefpackage/pk0;->y:Ldefpackage/pk0;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ldefpackage/pk0;->h0(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final i0()V
    .locals 10

    .line 1
    sget-object v0, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ldefpackage/l21;->w:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ldefpackage/k21;

    .line 15
    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    sget-object v1, Ldefpackage/lt4;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    :cond_1
    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v3, v0, Ldefpackage/lt4;->a:[Ldefpackage/j21;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    aget-object v3, v3, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v3, v4

    .line 42
    :goto_0
    if-nez v3, :cond_3

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :try_start_1
    iget-wide v6, v3, Ldefpackage/j21;->n:J

    .line 47
    .line 48
    sub-long v6, v1, v6

    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    .line 52
    cmp-long v6, v6, v8

    .line 53
    .line 54
    if-ltz v6, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Ldefpackage/l21;->j0(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move v3, v5

    .line 64
    :goto_1
    if-eqz v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ldefpackage/lt4;->b(I)Ldefpackage/j21;

    .line 67
    .line 68
    .line 69
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :cond_5
    monitor-exit v0

    .line 71
    :goto_2
    if-nez v4, :cond_1

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :goto_3
    monitor-exit v0

    .line 75
    throw p0

    .line 76
    :cond_6
    :goto_4
    return-void
.end method

.method public final j0(Ljava/lang/Runnable;)Z
    .locals 14

    .line 1
    :goto_0
    sget-object v0, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ldefpackage/l21;->x:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    sget-object v0, Ldefpackage/l21;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    const/4 v0, 0x1

    .line 25
    if-nez v7, :cond_3

    .line 26
    .line 27
    :goto_1
    sget-object v8, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 28
    .line 29
    sget-wide v10, Ldefpackage/l21;->x:J

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    move-object v9, p0

    .line 33
    move-object v13, p1

    .line 34
    invoke-virtual/range {v8 .. v13}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    move-object v4, v9

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    invoke-virtual {v8, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    move-object p0, v4

    .line 50
    move-object p1, v13

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v4, p0

    .line 53
    move-object v13, p1

    .line 54
    instance-of p0, v7, Ldefpackage/ce2;

    .line 55
    .line 56
    if-eqz p0, :cond_7

    .line 57
    .line 58
    move-object p0, v7

    .line 59
    check-cast p0, Ldefpackage/ce2;

    .line 60
    .line 61
    invoke-virtual {p0, v13}, Ldefpackage/ce2;->a(Ljava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_b

    .line 66
    .line 67
    if-eq p1, v0, :cond_4

    .line 68
    .line 69
    const/4 p0, 0x2

    .line 70
    if-eq p1, p0, :cond_8

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-virtual {p0}, Ldefpackage/ce2;->d()Ldefpackage/ce2;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    :cond_5
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 78
    .line 79
    sget-wide v5, Ldefpackage/l21;->x:J

    .line 80
    .line 81
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eq p0, v7, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    sget-object p0, Ldefpackage/hw;->c:Ldefpackage/f01;

    .line 96
    .line 97
    if-ne v7, p0, :cond_9

    .line 98
    .line 99
    :cond_8
    return v3

    .line 100
    :cond_9
    new-instance v8, Ldefpackage/ce2;

    .line 101
    .line 102
    const/16 p0, 0x8

    .line 103
    .line 104
    invoke-direct {v8, p0, v0}, Ldefpackage/ce2;-><init>(IZ)V

    .line 105
    .line 106
    .line 107
    move-object p0, v7

    .line 108
    check-cast p0, Ljava/lang/Runnable;

    .line 109
    .line 110
    invoke-virtual {v8, p0}, Ldefpackage/ce2;->a(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v13}, Ldefpackage/ce2;->a(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    :cond_a
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 117
    .line 118
    sget-wide v5, Ldefpackage/l21;->x:J

    .line 119
    .line 120
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_c

    .line 125
    .line 126
    :cond_b
    :goto_2
    return v0

    .line 127
    :cond_c
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eq p0, v7, :cond_a

    .line 132
    .line 133
    :goto_3
    move-object p0, v4

    .line 134
    move-object p1, v13

    .line 135
    goto/16 :goto_0
.end method

.method public final k0()J
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/g21;->r:Ldefpackage/ii;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const-wide v3, 0x7fffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :goto_0
    move-wide v5, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-wide v5, v1

    .line 22
    :goto_1
    cmp-long v0, v5, v1

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_2
    sget-object v0, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 33
    .line 34
    sget-wide v5, Ldefpackage/l21;->x:J

    .line 35
    .line 36
    invoke-virtual {v0, p0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_5

    .line 41
    .line 42
    instance-of v6, v5, Ldefpackage/ce2;

    .line 43
    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    check-cast v5, Ldefpackage/ce2;

    .line 47
    .line 48
    sget-object v6, Ldefpackage/ce2;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 49
    .line 50
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    const-wide/32 v7, 0x3fffffff

    .line 55
    .line 56
    .line 57
    and-long/2addr v7, v5

    .line 58
    long-to-int v7, v7

    .line 59
    const-wide v8, 0xfffffffc0000000L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v5, v8

    .line 65
    const/16 v8, 0x1e

    .line 66
    .line 67
    shr-long/2addr v5, v8

    .line 68
    long-to-int v5, v5

    .line 69
    if-ne v7, v5, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    return-wide v1

    .line 73
    :cond_4
    sget-object p0, Ldefpackage/hw;->c:Ldefpackage/f01;

    .line 74
    .line 75
    if-ne v5, p0, :cond_8

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_5
    :goto_2
    sget-object v5, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-wide v5, Ldefpackage/l21;->w:J

    .line 84
    .line 85
    invoke-virtual {v0, p0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ldefpackage/k21;

    .line 90
    .line 91
    if-eqz p0, :cond_a

    .line 92
    .line 93
    monitor-enter p0

    .line 94
    :try_start_0
    iget-object v0, p0, Ldefpackage/lt4;->a:[Ldefpackage/j21;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    aget-object v0, v0, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_5

    .line 104
    :cond_6
    const/4 v0, 0x0

    .line 105
    :goto_3
    monitor-exit p0

    .line 106
    if-nez v0, :cond_7

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_7
    iget-wide v3, v0, Ldefpackage/j21;->n:J

    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    sub-long/2addr v3, v5

    .line 116
    cmp-long p0, v3, v1

    .line 117
    .line 118
    if-gez p0, :cond_9

    .line 119
    .line 120
    :cond_8
    :goto_4
    return-wide v1

    .line 121
    :cond_9
    return-wide v3

    .line 122
    :goto_5
    monitor-exit p0

    .line 123
    throw v0

    .line 124
    :cond_a
    :goto_6
    return-wide v3
.end method

.method public abstract l0()Ljava/lang/Thread;
.end method

.method public final m0()Z
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/g21;->r:Ldefpackage/ii;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_1
    sget-object v0, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v3, Ldefpackage/l21;->w:J

    .line 24
    .line 25
    invoke-virtual {v0, p0, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ldefpackage/k21;

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    sget-object v4, Ldefpackage/lt4;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    return v2

    .line 43
    :cond_3
    :goto_1
    sget-object v3, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-wide v3, Ldefpackage/l21;->x:J

    .line 49
    .line 50
    invoke-virtual {v0, p0, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    instance-of v0, p0, Ldefpackage/ce2;

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    check-cast p0, Ldefpackage/ce2;

    .line 62
    .line 63
    sget-object v0, Ldefpackage/ce2;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    const-wide/32 v5, 0x3fffffff

    .line 70
    .line 71
    .line 72
    and-long/2addr v5, v3

    .line 73
    long-to-int p0, v5

    .line 74
    const-wide v5, 0xfffffffc0000000L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v3, v5

    .line 80
    const/16 v0, 0x1e

    .line 81
    .line 82
    shr-long/2addr v3, v0

    .line 83
    long-to-int v0, v3

    .line 84
    if-ne p0, v0, :cond_5

    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    return v2

    .line 88
    :cond_6
    sget-object v0, Ldefpackage/hw;->c:Ldefpackage/f01;

    .line 89
    .line 90
    if-ne p0, v0, :cond_7

    .line 91
    .line 92
    :goto_2
    return v1

    .line 93
    :cond_7
    :goto_3
    return v2
.end method

.method public n0(JLdefpackage/j21;)V
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/pk0;->y:Ldefpackage/pk0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/l21;->q0(JLdefpackage/j21;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o0()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :goto_0
    sget-object v2, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v3, Ldefpackage/l21;->w:J

    .line 13
    .line 14
    invoke-virtual {v2, p0, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ldefpackage/k21;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    sget-object v3, Ldefpackage/lt4;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v2, v3}, Ldefpackage/lt4;->b(I)Ldefpackage/j21;

    .line 33
    .line 34
    .line 35
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    const/4 v3, 0x0

    .line 40
    :goto_1
    monitor-exit v2

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    invoke-virtual {p0, v0, v1, v3}, Ldefpackage/l21;->n0(JLdefpackage/j21;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_2
    monitor-exit v2

    .line 49
    throw p0

    .line 50
    :cond_2
    :goto_3
    return-void
.end method

.method public final p0()V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/l21;->t:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ldefpackage/l21;->x:J

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-wide v1, Ldefpackage/l21;->w:J

    .line 20
    .line 21
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final q0(JLdefpackage/j21;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/l21;->r0(JLdefpackage/j21;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "unexpected result"

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/l21;->n0(JLdefpackage/j21;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    invoke-virtual {p0, p3}, Ldefpackage/l21;->s0(Ldefpackage/j21;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/l21;->l0()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eq p1, p0, :cond_3

    .line 39
    .line 40
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 41
    .line 42
    .line 43
    :cond_3
    :goto_0
    return-void
.end method

.method public final r0(JLdefpackage/j21;)I
    .locals 9

    .line 1
    sget-object v0, Ldefpackage/l21;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    sget-object v0, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 17
    .line 18
    sget-wide v1, Ldefpackage/l21;->w:J

    .line 19
    .line 20
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ldefpackage/k21;

    .line 25
    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    new-instance v8, Ldefpackage/k21;

    .line 29
    .line 30
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-wide p1, v8, Ldefpackage/k21;->c:J

    .line 34
    .line 35
    :goto_0
    sget-object v3, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 36
    .line 37
    sget-wide v5, Ldefpackage/l21;->w:J

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    move-object v4, p0

    .line 41
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    :goto_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-object v0, p0

    .line 62
    check-cast v0, Ldefpackage/k21;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object p0, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move-object v4, p0

    .line 68
    :goto_2
    invoke-virtual {p3, p1, p2, v0, v4}, Ldefpackage/j21;->b(JLdefpackage/k21;Ldefpackage/l21;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method public final s0(Ldefpackage/j21;)Z
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/l21;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/dz;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ldefpackage/l21;->w:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ldefpackage/k21;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    iget-object v2, p0, Ldefpackage/lt4;->a:[Ldefpackage/j21;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    aget-object v0, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    goto :goto_2

    .line 32
    :goto_1
    monitor-exit p0

    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_2
    if-ne v0, p1, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    return v1
.end method

.method public shutdown()V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/it4;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    sget-object v1, Ldefpackage/l21;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/l21;->f0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Ldefpackage/l21;->d0()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-lez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/l21;->o0()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

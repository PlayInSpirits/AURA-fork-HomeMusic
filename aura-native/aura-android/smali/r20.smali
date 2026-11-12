.class public final Lr20;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Ln9;
.implements Lf51;
.implements Law1;
.implements Ldk;


# static fields
.field public static volatile r:Lr20;

.field public static final s:Ljava/lang/Object;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr20;->s:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr20;->n:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lr20;->q:Ljava/lang/Object;

    .line 51
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 52
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lic2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lr20;->n:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lr20;->o:Ljava/lang/Object;

    .line 59
    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 60
    iput-object p2, p0, Lr20;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lqj0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lr20;->n:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iput-object p3, p0, Lr20;->o:Ljava/lang/Object;

    .line 68
    invoke-static {p2, v0}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iput-object p2, p0, Lr20;->p:Ljava/lang/Object;

    .line 70
    new-instance p2, Lcom/bumptech/glide/load/data/a;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Lr20;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lr20;->n:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Li80;

    const/16 v1, 0x16

    .line 40
    invoke-direct {v0, v1}, Li80;-><init>(I)V

    .line 41
    iput-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 42
    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    .line 43
    new-instance p1, Lq20;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Lq20;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldo2;Lic2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lr20;->n:I

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iget-object v0, p1, Ldo2;->k:[B

    iput-object v0, p0, Lr20;->o:Ljava/lang/Object;

    .line 63
    iget-object p1, p1, Ldo2;->m:Landroid/net/Uri;

    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 64
    iput-object p2, p0, Lr20;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 44
    iput p4, p0, Lr20;->n:I

    iput-object p1, p0, Lr20;->q:Ljava/lang/Object;

    iput-object p2, p0, Lr20;->o:Ljava/lang/Object;

    iput-object p3, p0, Lr20;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 37
    iput p5, p0, Lr20;->n:I

    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    iput-object p2, p0, Lr20;->p:Ljava/lang/Object;

    iput-object p3, p0, Lr20;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lr20;->n:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lr20;->p:Ljava/lang/Object;

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 48
    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput v0, p0, Lr20;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    new-array p1, p1, [Lwv4;

    .line 15
    .line 16
    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Lc6;

    .line 19
    .line 20
    new-instance v0, Lss2;

    .line 21
    .line 22
    const/16 v1, 0x18

    .line 23
    .line 24
    invoke-direct {v0, v1, p0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Lc6;-><init>(Lgz3;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lr20;->q:Ljava/lang/Object;

    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    invoke-virtual {p1, p0}, Lc6;->x(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Lwl0;Lik3;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lr20;->n:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20;->q:Ljava/lang/Object;

    .line 72
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    .line 73
    iput-object p2, p0, Lr20;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([BLic2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lr20;->n:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lr20;->o:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, Lr20;->q:Ljava/lang/Object;

    return-void
.end method

.method public static t(Landroid/content/Context;)Lr20;
    .locals 2

    .line 1
    sget-object v0, Lr20;->r:Lr20;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lr20;->s:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lr20;->r:Lr20;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lr20;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lr20;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lr20;->r:Lr20;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    sget-object p0, Lr20;->r:Lr20;

    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(Lru;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lwl0;

    .line 5
    .line 6
    iget-object v0, v0, Lwl0;->c:Lgj0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lgj0;->a(Lru;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object v0, p1, Lru;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lm9;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lr20;->u(Lm9;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lru;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lru;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p1, Lru;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lm9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public b()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget v0, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lr20;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lrm3;

    .line 13
    .line 14
    invoke-virtual {p0}, Lrm3;->b()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v1, -0x2

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v0

    .line 26
    :cond_2
    :goto_0
    iget-object p0, p0, Lr20;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lhg3;

    .line 29
    .line 30
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public c()I
    .locals 10

    .line 1
    iget-object v0, p0, Lr20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lr20;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/bumptech/glide/load/data/a;

    .line 8
    .line 9
    iget-object p0, p0, Lr20;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lqj0;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    const/4 v4, -0x1

    .line 19
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lwv1;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    :try_start_0
    new-instance v7, Law3;

    .line 29
    .line 30
    new-instance v8, Ljava/io/FileInputStream;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v7, v8, p0}, Law3;-><init>(Ljava/io/InputStream;Lqj0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    .line 45
    .line 46
    :try_start_1
    invoke-interface {v5, v7, p0}, Lwv1;->b(Ljava/io/InputStream;Lqj0;)I

    .line 47
    .line 48
    .line 49
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    invoke-virtual {v7}, Law3;->f()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 54
    .line 55
    .line 56
    if-eq v5, v4, :cond_0

    .line 57
    .line 58
    return v5

    .line 59
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    move-object v6, v7

    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    :goto_1
    if-eqz v6, :cond_1

    .line 67
    .line 68
    invoke-virtual {v6}, Law3;->f()V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_2
    return v4
.end method

.method public d()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget v0, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->T:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lr20;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lrm3;

    .line 13
    .line 14
    invoke-virtual {p0}, Lrm3;->d()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v1, -0x2

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v0

    .line 26
    :cond_2
    :goto_0
    iget-object p0, p0, Lr20;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lhg3;

    .line 29
    .line 30
    invoke-virtual {p0}, Lhg3;->d()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr20;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lr20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lxj;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lxj;->e(Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public declared-synchronized f(Lm9;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lwl0;

    .line 5
    .line 6
    iget-object v0, v0, Lwl0;->c:Lgj0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lgj0;->f(Lm9;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lr20;->u(Lm9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public declared-synchronized g()Lm9;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lwl0;

    .line 5
    .line 6
    iget-object v0, v0, Lwl0;->c:Lgj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgj0;->g()Lm9;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lr20;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/HashMap;

    .line 15
    .line 16
    iget-object v2, p0, Lr20;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lik3;

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lr20;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lwl0;

    .line 26
    .line 27
    iget-object v1, v1, Lwl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    iget-object v2, p0, Lr20;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lik3;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lvl0;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    :try_start_1
    iget v2, v1, Lvl0;->d:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, v1, Lvl0;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 53
    :cond_0
    :goto_0
    monitor-exit p0

    .line 54
    return-object v0

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 57
    throw v0
.end method

.method public declared-synchronized h()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lwl0;

    .line 5
    .line 6
    iget-object v0, v0, Lwl0;->c:Lgj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgj0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public i(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/bumptech/glide/load/data/a;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {p0, v0, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public j()I
    .locals 0

    .line 1
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->N:I

    .line 6
    .line 7
    return p0
.end method

.method public k()V
    .locals 0

    .line 1
    return-void
.end method

.method public l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 9

    .line 1
    iget-object v0, p0, Lr20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lr20;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/bumptech/glide/load/data/a;

    .line 8
    .line 9
    iget-object p0, p0, Lr20;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lqj0;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lwv1;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    :try_start_0
    new-instance v6, Law3;

    .line 28
    .line 29
    new-instance v7, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v8}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct {v7, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v6, v7, p0}, Law3;-><init>(Ljava/io/InputStream;Lqj0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-interface {v4, v6}, Lwv1;->d(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 46
    .line 47
    .line 48
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    invoke-virtual {v6}, Law3;->f()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 53
    .line 54
    .line 55
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 56
    .line 57
    if-eq v4, v5, :cond_0

    .line 58
    .line 59
    return-object v4

    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    move-object v5, v6

    .line 65
    goto :goto_1

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    :goto_1
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v5}, Law3;->f()V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 77
    .line 78
    return-object p0
.end method

.method public declared-synchronized m()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lwl0;

    .line 5
    .line 6
    iget-object v0, v0, Lwl0;->c:Lgj0;

    .line 7
    .line 8
    iget v0, v0, Lgj0;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return v0

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

.method public n(JLbe3;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Lbe3;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p3}, Lbe3;->m()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p3}, Lbe3;->m()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p3}, Lbe3;->A()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x1b2

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    const v0, 0x47413934

    .line 27
    .line 28
    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne v2, v0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lc6;

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, p3}, Lc6;->a(JLbe3;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public o()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->T:I

    .line 8
    .line 9
    const/4 v2, -0x2

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v1, v2

    .line 13
    :cond_0
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v2, p0

    .line 19
    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Lr20;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lr20;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Llm3;

    .line 9
    .line 10
    invoke-interface {p0}, Llm3;->g()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string p1, "Error getting artist info: "

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "ArtistRepository"

    .line 33
    .line 34
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 6

    .line 1
    iget p1, p0, Lr20;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Lr20;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lr20;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lr20;->p:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Llm3;

    .line 13
    .line 14
    invoke-static {p2}, Lmm3;->f(Lretrofit2/Response;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Ljava/lang/Thread;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    new-instance v3, Lqo2;

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    invoke-direct {v3, p0, v1, p1, v4}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    .line 41
    check-cast v0, Lmm3;

    .line 42
    .line 43
    invoke-virtual {v0}, Lmm3;->g()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Llm3;->onSuccess()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {v2}, Llm3;->g()V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :pswitch_0
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 55
    .line 56
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const-string p1, "ArtistRepository"

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_3

    .line 105
    .line 106
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v3, "Got albums directly: "

    .line 127
    .line 128
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_1

    .line 150
    .line 151
    const-string p0, "No albums found in artist response"

    .line 152
    .line 153
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_1
    invoke-static {p0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    new-instance v3, Lzj;

    .line 165
    .line 166
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-interface {p2, v3}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-interface {p2}, Ljava/util/stream/IntStream;->toArray()[I

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    new-instance v3, Lak;

    .line 178
    .line 179
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {p2, v3}, Ljava/util/Arrays;->parallelPrefix([ILjava/util/function/IntBinaryOperator;)V

    .line 183
    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-ge v3, v4, :cond_2

    .line 191
    .line 192
    aget v4, p2, v3

    .line 193
    .line 194
    const/16 v5, 0xc8

    .line 195
    .line 196
    if-ge v4, v5, :cond_2

    .line 197
    .line 198
    add-int/lit8 v3, v3, 0x1

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    filled-new-array {p2, v4}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    const-string v4, "Retaining %d/%d albums"

    .line 218
    .line 219
    invoke-static {v4, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    check-cast v0, Lpa;

    .line 227
    .line 228
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    int-to-long p1, v3

    .line 233
    invoke-interface {p0, p1, p2}, Ljava/util/stream/Stream;->limit(J)Ljava/util/stream/Stream;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    check-cast p0, Ljava/util/List;

    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    check-cast v2, Lk03;

    .line 256
    .line 257
    new-instance v1, Lxj;

    .line 258
    .line 259
    const/4 v3, 0x1

    .line 260
    invoke-direct {v1, v2, v3}, Lxj;-><init>(Lk03;I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v0, p0, p1, p2, v1}, Lpa;->n(Lpa;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ldk;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_3
    const-string p0, "Failed to get artist info"

    .line 268
    .line 269
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    :goto_2
    return-void

    .line 273
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lm51;Lsy4;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lwv4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, v0

    .line 8
    if-ge v2, v3, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, Lsy4;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lsy4;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, Lsy4;->d:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Lm51;->t(II)Lwv4;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lr20;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ltb1;

    .line 32
    .line 33
    iget-object v5, v4, Ltb1;->n:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    const-string v7, "Invalid closed caption MIME type provided: %s"

    .line 56
    .line 57
    invoke-static {v6, v7, v5}, Lrr2;->o(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Lsb1;

    .line 61
    .line 62
    invoke-direct {v6}, Lsb1;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lsy4;->b()V

    .line 66
    .line 67
    .line 68
    iget-object v7, p2, Lsy4;->e:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v7, v6, Lsb1;->a:Ljava/lang/String;

    .line 71
    .line 72
    const-string v7, "video/mp2t"

    .line 73
    .line 74
    invoke-static {v7}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iput-object v7, v6, Lsb1;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v5}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    iput-object v5, v6, Lsb1;->m:Ljava/lang/String;

    .line 85
    .line 86
    iget v5, v4, Ltb1;->e:I

    .line 87
    .line 88
    iput v5, v6, Lsb1;->e:I

    .line 89
    .line 90
    iget-object v5, v4, Ltb1;->d:Ljava/lang/String;

    .line 91
    .line 92
    iput-object v5, v6, Lsb1;->d:Ljava/lang/String;

    .line 93
    .line 94
    iget v5, v4, Ltb1;->K:I

    .line 95
    .line 96
    iput v5, v6, Lsb1;->J:I

    .line 97
    .line 98
    iget-object v4, v4, Ltb1;->q:Ljava/util/List;

    .line 99
    .line 100
    iput-object v4, v6, Lsb1;->p:Ljava/util/List;

    .line 101
    .line 102
    invoke-static {v6, v3}, Lf34;->l(Lsb1;Lwv4;)V

    .line 103
    .line 104
    .line 105
    aput-object v3, v0, v2

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    return-void
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-object v1, p0, Lr20;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    const v2, 0x7f130055

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-class v5, Lyy1;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {p0, v0, v2}, Lr20;->r(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catch_0
    move-exception p0

    .line 91
    new-instance p1, Landroidx/startup/StartupException;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    return-void
.end method

.method public r(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lr20;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "Cannot initialize "

    .line 6
    .line 7
    invoke-static {}, Lxl;->y()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_4

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lyy1;

    .line 49
    .line 50
    invoke-interface {v1}, Lyy1;->a()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_1

    .line 81
    .line 82
    invoke-virtual {p0, v3, p2}, Lr20;->r(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Landroid/content/Context;

    .line 89
    .line 90
    invoke-interface {v1, p0}, Lyy1;->b(Landroid/content/Context;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    :try_start_2
    new-instance p1, Landroidx/startup/StartupException;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p0, ". Cycle detected."

    .line 129
    .line 130
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    :catchall_1
    move-exception p0

    .line 144
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 145
    .line 146
    .line 147
    throw p0
.end method

.method public s()I
    .locals 0

    .line 1
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->M:I

    .line 6
    .line 7
    return p0
.end method

.method public u(Lm9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr20;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lik3;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lr20;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lwl0;

    .line 17
    .line 18
    iget-object p0, p0, Lwl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lvl0;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    monitor-enter p0

    .line 29
    :try_start_0
    iget p1, p0, Lvl0;->d:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    iput p1, p0, Lvl0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_0
    return-void
.end method

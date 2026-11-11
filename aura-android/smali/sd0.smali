.class public final Lsd0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lpi1;


# instance fields
.field public final n:Ljava/lang/Object;

.field public volatile o:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsd0;->n:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lsd0;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lwq0;
    .locals 6

    .line 1
    iget-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwq0;

    .line 4
    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lwq0;

    .line 11
    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Lsd0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Le20;

    .line 17
    .line 18
    iget-object v1, v0, Le20;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lrm3;

    .line 21
    .line 22
    iget-object v2, v1, Lrm3;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, v1, Lrm3;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    move-object v4, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v4, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {v4, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    if-nez v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    :cond_2
    iget-wide v0, v0, Le20;->o:J

    .line 60
    .line 61
    new-instance v3, Llr0;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lrm3;

    .line 67
    .line 68
    const/4 v5, 0x7

    .line 69
    invoke-direct {v2, v5}, Lrm3;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v2, v3, Llr0;->q:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, v3, Llr0;->p:Ljava/lang/Object;

    .line 75
    .line 76
    iput-wide v0, v3, Llr0;->n:J

    .line 77
    .line 78
    new-instance v0, Lqr2;

    .line 79
    .line 80
    const/16 v1, 0x11

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lqr2;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, v3, Llr0;->o:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_3
    :goto_1
    iput-object v3, p0, Lsd0;->o:Ljava/lang/Object;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    :goto_2
    iget-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lwq0;

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    new-instance v0, Lom0;

    .line 99
    .line 100
    const/4 v1, 0x6

    .line 101
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 105
    .line 106
    :cond_5
    monitor-exit p0

    .line 107
    goto :goto_4

    .line 108
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    throw v0

    .line 110
    :cond_6
    :goto_4
    iget-object p0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Lwq0;

    .line 113
    .line 114
    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lsd0;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lpi1;

    .line 13
    .line 14
    invoke-interface {v0}, Lpi1;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Argument must not be null"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit p0

    .line 29
    goto :goto_2

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_2
    iget-object p0, p0, Lsd0;->o:Ljava/lang/Object;

    .line 33
    .line 34
    return-object p0
.end method

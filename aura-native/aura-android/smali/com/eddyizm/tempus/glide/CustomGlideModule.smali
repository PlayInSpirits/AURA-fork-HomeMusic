.class public Lcom/eddyizm/tempus/glide/CustomGlideModule;
.super Lg12;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final M(Landroid/content/Context;Lcom/bumptech/glide/a;Ley3;)V
    .locals 2

    .line 1
    const-class p0, Ljava/lang/String;

    .line 2
    .line 3
    const-class p1, Ljava/io/InputStream;

    .line 4
    .line 5
    new-instance p2, Lji0;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-direct {p2, v0}, Lji0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p3, Ley3;->a:Lrf2;

    .line 12
    .line 13
    monitor-enter p3

    .line 14
    :try_start_0
    iget-object v0, p3, Lrf2;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lna4;

    .line 17
    .line 18
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    invoke-virtual {v0}, Lna4;->M()Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, p0, p1, p2}, Lna4;->e(Ljava/lang/Class;Ljava/lang/Class;Lvw2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :try_start_2
    monitor-exit v0

    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/4 p1, 0x0

    .line 32
    :goto_0
    if-ge p1, p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    check-cast p2, Lvw2;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p0, p3, Lrf2;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lom1;

    .line 49
    .line 50
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    .line 57
    monitor-exit p3

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    :try_start_4
    throw p0

    .line 62
    :goto_1
    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    goto :goto_1
.end method

.method public final e(Landroid/content/Context;Lhi1;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "image_cache_size"

    .line 13
    .line 14
    const-string v1, "500"

    .line 15
    .line 16
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/high16 v0, 0x100000

    .line 28
    .line 29
    mul-int/2addr p0, v0

    .line 30
    new-instance v0, Le20;

    .line 31
    .line 32
    const-string v1, "cache"

    .line 33
    .line 34
    int-to-long v2, p0

    .line 35
    invoke-direct {v0, p1, v1, v2, v3}, Le20;-><init>(Landroid/content/Context;Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p2, Lhi1;->i:Le20;

    .line 39
    .line 40
    new-instance p0, Lg04;

    .line 41
    .line 42
    invoke-direct {p0}, Llq;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object p1, Liu0;->f:Lab3;

    .line 46
    .line 47
    sget-object v0, Lvi0;->o:Lvi0;

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Llq;->v(Lab3;Ljava/lang/Object;)Llq;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, Lei1;->a:Lab3;

    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, Llq;->v(Lab3;Ljava/lang/Object;)Llq;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lg04;

    .line 60
    .line 61
    new-instance p1, Lhg3;

    .line 62
    .line 63
    const/16 v0, 0x15

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p2, Lhi1;->m:Lfi1;

    .line 69
    .line 70
    return-void
.end method

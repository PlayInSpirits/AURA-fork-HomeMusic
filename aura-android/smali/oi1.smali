.class public final Loi1;
.super Lc04;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final a(Lg04;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0, p1}, Lc04;->a(Lg04;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw p1
.end method

.method public final f(Ljava/lang/Class;)Lvz3;
    .locals 3

    .line 1
    new-instance v0, Lni1;

    .line 2
    .line 3
    iget-object v1, p0, Lc04;->n:Lcom/bumptech/glide/a;

    .line 4
    .line 5
    iget-object v2, p0, Lc04;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1, v2}, Lvz3;-><init>(Lcom/bumptech/glide/a;Lc04;Ljava/lang/Class;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g()Lvz3;
    .locals 0

    .line 1
    invoke-super {p0}, Lc04;->g()Lvz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lni1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final o()Lvz3;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Loi1;->f(Ljava/lang/Class;)Lvz3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lni1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final p()Lvz3;
    .locals 0

    .line 1
    invoke-super {p0}, Lc04;->p()Lvz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lni1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final r(Landroid/net/Uri;)Lvz3;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc04;->r(Landroid/net/Uri;)Lvz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lni1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final s(Ljava/io/File;)Lvz3;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc04;->s(Ljava/io/File;)Lvz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lni1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final t(Ljava/lang/String;)Lvz3;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc04;->t(Ljava/lang/String;)Lvz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lni1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final w(Lg04;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lmi1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lc04;->w(Lg04;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lmi1;

    .line 10
    .line 11
    invoke-direct {v0}, Llq;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lmi1;->F(Lg04;)Lmi1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-super {p0, p1}, Lc04;->w(Lg04;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.class public final synthetic Ldefpackage/ss2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/it2;
.implements Ldefpackage/gt2;
.implements Ldefpackage/jg2;
.implements Ldefpackage/q33;
.implements Ldefpackage/av4;
.implements Ldefpackage/tx;
.implements Ldefpackage/g3;
.implements Ldefpackage/gz3;
.implements Ldefpackage/mk;
.implements Ldefpackage/rc2;
.implements Ldefpackage/eg1;
.implements Ldefpackage/np4;
.implements Ldefpackage/fz;
.implements Ldefpackage/wc0;
.implements Ldefpackage/ro4;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Ldefpackage/ss2;->n:I

    iput-object p2, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/ip0;Ldefpackage/cy3;)V
    .locals 0

    .line 1
    const/16 p2, 0xc

    .line 2
    .line 3
    iput p2, p0, Ldefpackage/ss2;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/v23;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p0}, Ldefpackage/uo;->C(Landroid/view/MenuItem;Ldefpackage/v23;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ss2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/uw1;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/lg0;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Ldefpackage/un4;

    .line 17
    .line 18
    check-cast p1, Ldefpackage/lg0;

    .line 19
    .line 20
    new-instance v0, Ldefpackage/tn4;

    .line 21
    .line 22
    iget-wide v1, p1, Ldefpackage/lg0;->b:J

    .line 23
    .line 24
    iget-object v3, p1, Ldefpackage/lg0;->a:Ldefpackage/yw1;

    .line 25
    .line 26
    iget-wide v4, p1, Ldefpackage/lg0;->c:J

    .line 27
    .line 28
    invoke-static {v3, v4, v5}, Ldefpackage/i80;->y(Ldefpackage/yw1;J)[B

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v0, v1, v2, v3}, Ldefpackage/tn4;-><init>(J[B)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Ldefpackage/un4;->c:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-wide v1, p0, Ldefpackage/un4;->j:J

    .line 41
    .line 42
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v3, v1, v3

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    iget-wide v3, p1, Ldefpackage/lg0;->d:J

    .line 52
    .line 53
    cmp-long p1, v3, v1

    .line 54
    .line 55
    if-ltz p1, :cond_1

    .line 56
    .line 57
    :cond_0
    invoke-virtual {p0, v0}, Ldefpackage/un4;->g(Ldefpackage/tn4;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ldefpackage/ic2;
    .locals 0

    .line 73
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    check-cast p0, Ldefpackage/ic2;

    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/ss2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/x05;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/reflect/Type;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/x05;->b(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, Ldefpackage/x7;

    .line 18
    .line 19
    check-cast p1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 26
    .line 27
    if-gt v0, p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-le v0, p0, :cond_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-float p0, p0

    .line 44
    int-to-float v0, v0

    .line 45
    div-float v2, p0, v0

    .line 46
    .line 47
    int-to-float v1, v1

    .line 48
    div-float/2addr p0, v1

    .line 49
    invoke-static {v2, p0}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    mul-float/2addr v0, p0

    .line 54
    float-to-int v0, v0

    .line 55
    mul-float/2addr v1, p0

    .line 56
    float-to-int p0, v1

    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-static {p1, v0, p0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v0, 0x1f

    .line 65
    .line 66
    if-lt p0, v0, :cond_2

    .line 67
    .line 68
    invoke-static {p1}, Ldefpackage/db;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_2
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public b(JJJ)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/zq3;

    .line 4
    .line 5
    iget-object p5, p0, Ldefpackage/zq3;->e:Ldefpackage/kt0;

    .line 6
    .line 7
    if-nez p5, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-wide/16 p5, -0x1

    .line 11
    .line 12
    cmp-long p5, p1, p5

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    const-wide/16 p5, 0x0

    .line 17
    .line 18
    cmp-long p5, p1, p5

    .line 19
    .line 20
    if-nez p5, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-static {p3, p4, p1, p2}, Ldefpackage/f35;->U(JJ)F

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    :goto_0
    move v5, p5

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    const/high16 p5, -0x40800000    # -1.0f

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_2
    iget-object v0, p0, Ldefpackage/zq3;->e:Ldefpackage/kt0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-wide v1, p1

    .line 38
    move-wide v3, p3

    .line 39
    invoke-virtual/range {v0 .. v5}, Ldefpackage/kt0;->b(JJF)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public c(Ldefpackage/y10;)Ldefpackage/so4;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Landroid/content/Context;

    .line 5
    .line 6
    iget-object p0, p1, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, p0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p1, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, p0

    .line 14
    check-cast v3, Ldefpackage/uv;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    new-instance v0, Ldefpackage/bf1;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    move v5, v4

    .line 31
    invoke-direct/range {v0 .. v5}, Ldefpackage/bf1;-><init>(Landroid/content/Context;Ljava/lang/String;Ldefpackage/uv;ZZ)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    const-string p0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 36
    .line 37
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public d()V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/wf1;

    .line 4
    .line 5
    sget-object v0, Ldefpackage/jh4;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Ldefpackage/jh4;->h:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x1

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    invoke-static {v5, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    move v4, v6

    .line 50
    move v6, v3

    .line 51
    :cond_1
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sput-object v2, Ldefpackage/jh4;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    monitor-exit v0

    .line 63
    throw p0
.end method

.method public e(Ldefpackage/al3;Ldefpackage/fr2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/wc0;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Ljava/lang/Object;Ldefpackage/w71;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/qe4;

    .line 4
    .line 5
    check-cast p1, Ldefpackage/oi3;

    .line 6
    .line 7
    new-instance v0, Ldefpackage/ni3;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Ldefpackage/ni3;-><init>(Ldefpackage/w71;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Ldefpackage/oi3;->B(Ldefpackage/qi3;Ldefpackage/ni3;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/tz2;

    .line 4
    .line 5
    check-cast p2, Ljava/util/Collection;

    .line 6
    .line 7
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/tz2;->s:Ldefpackage/hg3;

    .line 10
    .line 11
    new-instance v0, Ldefpackage/rm3;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/rm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p2}, Ldefpackage/hw;->P(Ldefpackage/eg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/ss2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/lu3;

    .line 9
    .line 10
    iget-object p3, p1, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 11
    .line 12
    iget-object v0, p1, Ldefpackage/tn2;->k:Ldefpackage/kn2;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p2}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p2, p2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v0, p1, p2, p0}, Ldefpackage/pq;->e(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/lu3;)Ldefpackage/ic2;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast p0, Ldefpackage/gt2;

    .line 49
    .line 50
    sget-object v0, Ldefpackage/mw1;->o:Ldefpackage/mw1;

    .line 51
    .line 52
    invoke-virtual {p1}, Ldefpackage/tn2;->l()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p1, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 60
    .line 61
    invoke-interface {p0, v1, p2}, Ldefpackage/gt2;->e(Ldefpackage/al3;Ldefpackage/fr2;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, Ldefpackage/ab4;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {p0, v1}, Ldefpackage/ab4;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, p2, p3, p0}, Ldefpackage/kt2;->P0(Ldefpackage/tn2;Ldefpackage/fr2;ILdefpackage/ab4;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-object v0

    .line 74
    :pswitch_1
    check-cast p0, Ldefpackage/jn2;

    .line 75
    .line 76
    invoke-virtual {p1, p2, p0}, Ldefpackage/tn2;->s(Ldefpackage/fr2;Ldefpackage/jn2;)Ldefpackage/mw1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p1, p2, p0}, Ldefpackage/tn2;->z(Ldefpackage/fr2;Ljava/lang/String;)Ldefpackage/mw1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->i0()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Ldefpackage/up0;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/up0;->h:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public k(JLdefpackage/be3;)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/ss2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/r20;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/r20;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, [Ldefpackage/wv4;

    .line 13
    .line 14
    invoke-static {p1, p2, p3, p0}, Ldefpackage/ji2;->t(JLdefpackage/be3;[Ldefpackage/wv4;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Ldefpackage/jv3;

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, [Ldefpackage/wv4;

    .line 23
    .line 24
    invoke-static {p1, p2, p3, p0}, Ldefpackage/ji2;->s(JLdefpackage/be3;[Ldefpackage/wv4;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public onCancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/pj4;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/pj4;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x7f0a0083

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ne v0, v1, :cond_6

    .line 14
    .line 15
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->p0:Ldefpackage/qg4;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-virtual {p1, v0}, Ldefpackage/fr;->a(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Ldefpackage/wl3;

    .line 27
    .line 28
    iget-boolean p1, p0, Ldefpackage/wl3;->i:Z

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    iput-boolean v0, p0, Ldefpackage/wl3;->i:Z

    .line 35
    .line 36
    iget-object p1, p0, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    new-instance v6, Ldefpackage/rm2;

    .line 43
    .line 44
    const/16 p1, 0x8

    .line 45
    .line 46
    invoke-direct {v6, p1, p0}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Ldefpackage/wl3;->g:Ldefpackage/k03;

    .line 50
    .line 51
    invoke-virtual {p1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/util/List;

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    move-object v5, p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-object v5, v1

    .line 92
    :goto_1
    if-nez v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6}, Ldefpackage/rm2;->g()V

    .line 95
    .line 96
    .line 97
    return v0

    .line 98
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    iget-object p1, p0, Ldefpackage/wl3;->j:Ljava/lang/Integer;

    .line 105
    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-lez p1, :cond_5

    .line 113
    .line 114
    iget-object p0, v6, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Ldefpackage/wl3;

    .line 117
    .line 118
    iget-object p0, p0, Ldefpackage/wl3;->h:Ldefpackage/k03;

    .line 119
    .line 120
    const p1, 0x7f1303f5

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return v0

    .line 131
    :cond_5
    iget-object v2, p0, Ldefpackage/wl3;->c:Ldefpackage/mm3;

    .line 132
    .line 133
    iget-object p0, p0, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance p0, Ljava/lang/Thread;

    .line 143
    .line 144
    new-instance v1, Ldefpackage/mr;

    .line 145
    .line 146
    const/16 v7, 0xa

    .line 147
    .line 148
    invoke-direct/range {v1 .. v7}, Ldefpackage/mr;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 155
    .line 156
    .line 157
    return v0

    .line 158
    :cond_6
    return v2
.end method

.method public onTouchExplorationStateChanged(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/search/SearchBar;

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/search/SearchBar;->z0:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

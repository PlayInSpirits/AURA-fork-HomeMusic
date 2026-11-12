.class public final Lgf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lhd2;


# instance fields
.field public A:I

.field public final n:Lii0;

.field public final o:Lbi0;

.field public final p:Lrw4;

.field public final q:Li80;

.field public final r:Lue1;

.field public final s:Ltv4;

.field public final t:Ljava/util/ArrayList;

.field public final u:J

.field public final v:Li61;

.field public final w:Ltb1;

.field public final x:Z

.field public y:Z

.field public z:[B


# direct methods
.method public constructor <init>(Lii0;Lbi0;Lrw4;Ltb1;JLi80;Lue1;ZLty3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgf4;->n:Lii0;

    .line 5
    .line 6
    iput-object p2, p0, Lgf4;->o:Lbi0;

    .line 7
    .line 8
    iput-object p3, p0, Lgf4;->p:Lrw4;

    .line 9
    .line 10
    iput-object p4, p0, Lgf4;->w:Ltb1;

    .line 11
    .line 12
    iput-wide p5, p0, Lgf4;->u:J

    .line 13
    .line 14
    iput-object p7, p0, Lgf4;->q:Li80;

    .line 15
    .line 16
    iput-object p8, p0, Lgf4;->r:Lue1;

    .line 17
    .line 18
    iput-boolean p9, p0, Lgf4;->x:Z

    .line 19
    .line 20
    new-instance p1, Ltv4;

    .line 21
    .line 22
    new-instance p2, Lsv4;

    .line 23
    .line 24
    filled-new-array {p4}, [Ltb1;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const-string p4, ""

    .line 29
    .line 30
    invoke-direct {p2, p4, p3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {p2}, [Lsv4;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Ltv4;-><init>([Lsv4;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lgf4;->s:Ltv4;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lgf4;->t:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-eqz p10, :cond_0

    .line 50
    .line 51
    new-instance p1, Li61;

    .line 52
    .line 53
    invoke-direct {p1, p10}, Li61;-><init>(Lty3;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Li61;

    .line 58
    .line 59
    const-string p2, "SingleSampleMediaPeriod"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Li61;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iput-object p1, p0, Lgf4;->v:Li61;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final b(Ljd2;JJZ)V
    .locals 12

    .line 1
    check-cast p1, Lff4;

    .line 2
    .line 3
    iget-object v0, p1, Lff4;->b:Lyl4;

    .line 4
    .line 5
    new-instance v1, Led2;

    .line 6
    .line 7
    iget-object v2, p1, Lff4;->a:Lii0;

    .line 8
    .line 9
    iget-object v3, v0, Lyl4;->p:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v4, v0, Lyl4;->q:Ljava/util/Map;

    .line 12
    .line 13
    iget-wide v9, v0, Lyl4;->o:J

    .line 14
    .line 15
    move-wide v5, p2

    .line 16
    move-wide/from16 v7, p4

    .line 17
    .line 18
    invoke-direct/range {v1 .. v10}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lgf4;->q:Li80;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    iget-wide v10, p0, Lgf4;->u:J

    .line 29
    .line 30
    iget-object p0, p0, Lgf4;->r:Lue1;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, -0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    move-object v2, v1

    .line 38
    move-object v1, p0

    .line 39
    invoke-virtual/range {v1 .. v11}, Lue1;->q(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_3

    .line 4
    .line 5
    aget-object v1, p3, v0

    .line 6
    .line 7
    iget-object v2, p0, Lgf4;->t:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    aget-object v3, p1, v0

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    aget-boolean v3, p2, v0

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-object v1, p3, v0

    .line 24
    .line 25
    :cond_1
    aget-object v1, p3, v0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    aget-object v1, p1, v0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance v1, Lef4;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lef4;-><init>(Lgf4;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    aput-object v1, p3, v0

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    aput-boolean v1, p4, v0

    .line 45
    .line 46
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    return-wide p5
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lgf4;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lgf4;->v:Li61;

    .line 6
    .line 7
    invoke-virtual {p0}, Li61;->l()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 18
    .line 19
    return-wide v0
.end method

.method public final e(JLn84;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgf4;->v:Li61;

    .line 2
    .line 3
    invoke-virtual {p0}, Li61;->l()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g(Ljd2;JJ)V
    .locals 12

    .line 1
    check-cast p1, Lff4;

    .line 2
    .line 3
    iget-object v0, p1, Lff4;->b:Lyl4;

    .line 4
    .line 5
    iget-wide v0, v0, Lyl4;->o:J

    .line 6
    .line 7
    long-to-int v0, v0

    .line 8
    iput v0, p0, Lgf4;->A:I

    .line 9
    .line 10
    iget-object v0, p1, Lff4;->c:[B

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lgf4;->z:[B

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lgf4;->y:Z

    .line 19
    .line 20
    iget-object v0, p1, Lff4;->b:Lyl4;

    .line 21
    .line 22
    new-instance v1, Led2;

    .line 23
    .line 24
    iget-object v2, p1, Lff4;->a:Lii0;

    .line 25
    .line 26
    iget-object v3, v0, Lyl4;->p:Landroid/net/Uri;

    .line 27
    .line 28
    iget-object v4, v0, Lyl4;->q:Ljava/util/Map;

    .line 29
    .line 30
    iget p1, p0, Lgf4;->A:I

    .line 31
    .line 32
    int-to-long v9, p1

    .line 33
    move-wide v5, p2

    .line 34
    move-wide/from16 v7, p4

    .line 35
    .line 36
    invoke-direct/range {v1 .. v10}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lgf4;->q:Li80;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-wide/16 v8, 0x0

    .line 45
    .line 46
    iget-wide v10, p0, Lgf4;->u:J

    .line 47
    .line 48
    move-object v2, v1

    .line 49
    iget-object v1, p0, Lgf4;->r:Lue1;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    const/4 v4, -0x1

    .line 53
    iget-object v5, p0, Lgf4;->w:Ltb1;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-virtual/range {v1 .. v11}, Lue1;->r(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(J)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lgf4;->t:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lef4;

    .line 15
    .line 16
    iget v2, v1, Lef4;->n:I

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    iput v2, v1, Lef4;->n:I

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-wide p1
.end method

.method public final j(Ljd2;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lff4;

    .line 6
    .line 7
    iget-object v2, v1, Lff4;->b:Lyl4;

    .line 8
    .line 9
    if-nez p6, :cond_0

    .line 10
    .line 11
    new-instance v2, Led2;

    .line 12
    .line 13
    iget-object v1, v1, Lff4;->a:Lii0;

    .line 14
    .line 15
    move-wide/from16 v7, p2

    .line 16
    .line 17
    invoke-direct {v2, v7, v8, v1}, Led2;-><init>(JLii0;)V

    .line 18
    .line 19
    .line 20
    move-object v5, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide/from16 v7, p2

    .line 23
    .line 24
    new-instance v3, Led2;

    .line 25
    .line 26
    iget-object v4, v1, Lff4;->a:Lii0;

    .line 27
    .line 28
    iget-object v5, v2, Lyl4;->p:Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v6, v2, Lyl4;->q:Ljava/util/Map;

    .line 31
    .line 32
    iget-wide v11, v2, Lyl4;->o:J

    .line 33
    .line 34
    move-wide/from16 v9, p4

    .line 35
    .line 36
    invoke-direct/range {v3 .. v12}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 37
    .line 38
    .line 39
    move-object v5, v3

    .line 40
    :goto_0
    const-wide/16 v11, 0x0

    .line 41
    .line 42
    iget-wide v13, v0, Lgf4;->u:J

    .line 43
    .line 44
    iget-object v4, v0, Lgf4;->r:Lue1;

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, -0x1

    .line 48
    iget-object v8, v0, Lgf4;->w:Ltb1;

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    move/from16 v15, p6

    .line 53
    .line 54
    invoke-virtual/range {v4 .. v15}, Lue1;->u(Led2;IILtb1;ILjava/lang/Object;JJI)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final k(ZJ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final m(Lmo2;J)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lmo2;->b(Lno2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n()Ltv4;
    .locals 0

    .line 1
    iget-object p0, p0, Lgf4;->s:Ltv4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 3

    .line 1
    iget-boolean p1, p0, Lgf4;->y:Z

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Lgf4;->v:Li61;

    .line 6
    .line 7
    invoke-virtual {p1}, Li61;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p1, Li61;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/io/IOException;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lgf4;->o:Lbi0;

    .line 21
    .line 22
    invoke-interface {v0}, Lbi0;->m()Lci0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lgf4;->p:Lrw4;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lci0;->c(Lrw4;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    new-instance v1, Lff4;

    .line 34
    .line 35
    iget-object v2, p0, Lgf4;->n:Lii0;

    .line 36
    .line 37
    invoke-direct {v1, v0, v2}, Lff4;-><init>(Lci0;Lii0;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lgf4;->q:Li80;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    invoke-virtual {p1, v1, p0, v0}, Li61;->u(Ljd2;Lhd2;I)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-boolean p0, p0, Lgf4;->y:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    return-wide v0
.end method

.method public final s(Ljd2;JJLjava/io/IOException;I)Ldd2;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p7

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Lff4;

    .line 8
    .line 9
    iget-object v3, v2, Lff4;->b:Lyl4;

    .line 10
    .line 11
    new-instance v4, Led2;

    .line 12
    .line 13
    iget-object v5, v2, Lff4;->a:Lii0;

    .line 14
    .line 15
    iget-object v6, v3, Lyl4;->p:Landroid/net/Uri;

    .line 16
    .line 17
    iget-object v7, v3, Lyl4;->q:Ljava/util/Map;

    .line 18
    .line 19
    iget-wide v12, v3, Lyl4;->o:J

    .line 20
    .line 21
    move-wide/from16 v8, p2

    .line 22
    .line 23
    move-wide/from16 v10, p4

    .line 24
    .line 25
    invoke-direct/range {v4 .. v13}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, v0, Lgf4;->q:Li80;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-object/from16 v2, p6

    .line 36
    .line 37
    :goto_0
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    instance-of v3, v2, Landroidx/media3/common/ParserException;

    .line 45
    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    instance-of v3, v2, Ljava/io/FileNotFoundException;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    instance-of v3, v2, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    .line 53
    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    instance-of v3, v2, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    instance-of v3, v2, Landroidx/media3/datasource/DataSourceException;

    .line 61
    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    move-object v3, v2

    .line 65
    check-cast v3, Landroidx/media3/datasource/DataSourceException;

    .line 66
    .line 67
    iget v3, v3, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 68
    .line 69
    const/16 v7, 0x7d8

    .line 70
    .line 71
    if-ne v3, v7, :cond_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :goto_1
    move-wide v2, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    add-int/lit8 v2, v1, -0x1

    .line 82
    .line 83
    mul-int/lit16 v2, v2, 0x3e8

    .line 84
    .line 85
    const/16 v3, 0x1388

    .line 86
    .line 87
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    int-to-long v2, v2

    .line 92
    :goto_2
    cmp-long v5, v2, v5

    .line 93
    .line 94
    const/4 v6, 0x1

    .line 95
    const/4 v7, 0x0

    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    const/4 v8, 0x3

    .line 99
    if-lt v1, v8, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    move v1, v7

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    :goto_3
    move v1, v6

    .line 105
    :goto_4
    iget-boolean v8, v0, Lgf4;->x:Z

    .line 106
    .line 107
    if-eqz v8, :cond_5

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-string v1, "SingleSampleMediaPeriod"

    .line 112
    .line 113
    const-string v2, "Loading failed, treating as end-of-stream."

    .line 114
    .line 115
    move-object/from16 v15, p6

    .line 116
    .line 117
    invoke-static {v1, v2, v15}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    iput-boolean v6, v0, Lgf4;->y:Z

    .line 121
    .line 122
    sget-object v1, Li61;->s:Ldd2;

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    move-object/from16 v15, p6

    .line 126
    .line 127
    if-eqz v5, :cond_6

    .line 128
    .line 129
    new-instance v1, Ldd2;

    .line 130
    .line 131
    invoke-direct {v1, v7, v2, v3, v7}, Ldd2;-><init>(IJZ)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_6
    sget-object v1, Li61;->t:Ldd2;

    .line 136
    .line 137
    :goto_5
    iget v2, v1, Ldd2;->a:I

    .line 138
    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    if-ne v2, v6, :cond_8

    .line 142
    .line 143
    :cond_7
    move v7, v6

    .line 144
    :cond_8
    xor-int/lit8 v16, v7, 0x1

    .line 145
    .line 146
    const-wide/16 v11, 0x0

    .line 147
    .line 148
    iget-wide v13, v0, Lgf4;->u:J

    .line 149
    .line 150
    move-object v5, v4

    .line 151
    iget-object v4, v0, Lgf4;->r:Lue1;

    .line 152
    .line 153
    const/4 v6, 0x1

    .line 154
    const/4 v7, -0x1

    .line 155
    iget-object v8, v0, Lgf4;->w:Ltb1;

    .line 156
    .line 157
    const/4 v9, 0x0

    .line 158
    const/4 v10, 0x0

    .line 159
    invoke-virtual/range {v4 .. v16}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 160
    .line 161
    .line 162
    return-object v1
.end method

.method public final u(J)V
    .locals 0

    .line 1
    return-void
.end method

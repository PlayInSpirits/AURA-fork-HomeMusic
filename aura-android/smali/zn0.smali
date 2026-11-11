.class public final Lzn0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lof4;


# instance fields
.field public final synthetic n:I

.field public o:Z

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhq1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lzn0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzn0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Lcc1;

    .line 10
    .line 11
    iget-object p1, p1, Lhq1;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lew;

    .line 14
    .line 15
    invoke-interface {p1}, Lof4;->timeout()Lfu4;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, p1}, Lcc1;-><init>(Lfu4;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lzn0;->p:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lwu3;Ljava/util/zip/Deflater;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lzn0;->n:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lzn0;->p:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, Lzn0;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final L(Ltv;J)V
    .locals 12

    .line 1
    iget v0, p0, Lzn0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lzn0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Lzn0;->o:Z

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    iget-wide v2, p1, Ltv;->o:J

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    move-wide v6, p2

    .line 17
    invoke-static/range {v2 .. v7}, Lxe5;->a(JJJ)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lhq1;

    .line 21
    .line 22
    iget-object p0, v1, Lhq1;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lew;

    .line 25
    .line 26
    invoke-interface {p0, p1, v6, v7}, Lof4;->L(Ltv;J)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "closed"

    .line 31
    .line 32
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :pswitch_0
    move-wide v10, p2

    .line 37
    iget-wide v6, p1, Ltv;->o:J

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    invoke-static/range {v6 .. v11}, Lzz1;->i(JJJ)V

    .line 42
    .line 43
    .line 44
    move-wide v6, v10

    .line 45
    move-wide p2, v6

    .line 46
    :goto_1
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    cmp-long v0, p2, v2

    .line 49
    .line 50
    if-lez v0, :cond_2

    .line 51
    .line 52
    iget-object v0, p1, Ltv;->n:Lt84;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget v2, v0, Lt84;->c:I

    .line 58
    .line 59
    iget v3, v0, Lt84;->b:I

    .line 60
    .line 61
    sub-int/2addr v2, v3

    .line 62
    int-to-long v2, v2

    .line 63
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    long-to-int v2, v2

    .line 68
    move-object v3, v1

    .line 69
    check-cast v3, Ljava/util/zip/Deflater;

    .line 70
    .line 71
    iget-object v4, v0, Lt84;->a:[B

    .line 72
    .line 73
    iget v5, v0, Lt84;->b:I

    .line 74
    .line 75
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 76
    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-virtual {p0, v3}, Lzn0;->b(Z)V

    .line 80
    .line 81
    .line 82
    iget-wide v3, p1, Ltv;->o:J

    .line 83
    .line 84
    int-to-long v5, v2

    .line 85
    sub-long/2addr v3, v5

    .line 86
    iput-wide v3, p1, Ltv;->o:J

    .line 87
    .line 88
    iget v3, v0, Lt84;->b:I

    .line 89
    .line 90
    add-int/2addr v3, v2

    .line 91
    iput v3, v0, Lt84;->b:I

    .line 92
    .line 93
    iget v2, v0, Lt84;->c:I

    .line 94
    .line 95
    if-ne v3, v2, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0}, Lt84;->a()Lt84;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iput-object v2, p1, Ltv;->n:Lt84;

    .line 102
    .line 103
    invoke-static {v0}, La94;->a(Lt84;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    sub-long/2addr p2, v5

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lzn0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/zip/Deflater;

    .line 4
    .line 5
    iget-object p0, p0, Lzn0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lwu3;

    .line 8
    .line 9
    iget-object v1, p0, Lwu3;->o:Ltv;

    .line 10
    .line 11
    :cond_0
    :goto_0
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Ltv;->W(I)Lt84;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, v2, Lt84;->a:[B

    .line 17
    .line 18
    iget v4, v2, Lt84;->c:I

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    rsub-int v5, v4, 0x2000

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    :try_start_0
    invoke-virtual {v0, v3, v4, v5, v6}, Ljava/util/zip/Deflater;->deflate([BIII)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    rsub-int v5, v4, 0x2000

    .line 31
    .line 32
    invoke-virtual {v0, v3, v4, v5}, Ljava/util/zip/Deflater;->deflate([BII)I

    .line 33
    .line 34
    .line 35
    move-result v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :goto_1
    if-lez v3, :cond_2

    .line 37
    .line 38
    iget v4, v2, Lt84;->c:I

    .line 39
    .line 40
    add-int/2addr v4, v3

    .line 41
    iput v4, v2, Lt84;->c:I

    .line 42
    .line 43
    iget-wide v4, v1, Ltv;->o:J

    .line 44
    .line 45
    int-to-long v2, v3

    .line 46
    add-long/2addr v4, v2

    .line 47
    iput-wide v4, v1, Ltv;->o:J

    .line 48
    .line 49
    invoke-virtual {p0}, Lwu3;->b()Lew;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->needsInput()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    iget p0, v2, Lt84;->b:I

    .line 60
    .line 61
    iget p1, v2, Lt84;->c:I

    .line 62
    .line 63
    if-ne p0, p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2}, Lt84;->a()Lt84;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iput-object p0, v1, Ltv;->n:Lt84;

    .line 70
    .line 71
    invoke-static {v2}, La94;->a(Lt84;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void

    .line 75
    :catch_0
    move-exception p0

    .line 76
    new-instance p1, Ljava/io/IOException;

    .line 77
    .line 78
    const-string v0, "Deflater already closed"

    .line 79
    .line 80
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public final close()V
    .locals 4

    .line 1
    iget v0, p0, Lzn0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lzn0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lzn0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lhq1;

    .line 12
    .line 13
    iget-boolean v0, p0, Lzn0;->o:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, Lzn0;->o:Z

    .line 19
    .line 20
    check-cast v1, Lcc1;

    .line 21
    .line 22
    iget-object p0, v1, Lcc1;->e:Lfu4;

    .line 23
    .line 24
    sget-object v0, Lfu4;->d:Leu4;

    .line 25
    .line 26
    iput-object v0, v1, Lcc1;->e:Lfu4;

    .line 27
    .line 28
    invoke-virtual {p0}, Lfu4;->a()Lfu4;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lfu4;->b()Lfu4;

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    iput p0, v3, Lhq1;->a:I

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    check-cast v3, Ljava/util/zip/Deflater;

    .line 39
    .line 40
    iget-boolean v0, p0, Lzn0;->o:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ljava/util/zip/Deflater;->finish()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Lzn0;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    :goto_1
    :try_start_1
    invoke-virtual {v3}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v3

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    move-object v0, v3

    .line 63
    :cond_2
    :goto_2
    :try_start_2
    check-cast v1, Lwu3;

    .line 64
    .line 65
    invoke-virtual {v1}, Lwu3;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :catchall_2
    move-exception v1

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    move-object v0, v1

    .line 73
    :cond_3
    :goto_3
    iput-boolean v2, p0, Lzn0;->o:Z

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    :goto_4
    return-void

    .line 78
    :cond_4
    throw v0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget v0, p0, Lzn0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lzn0;->o:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Lzn0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lhq1;

    .line 14
    .line 15
    iget-object p0, p0, Lhq1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lew;

    .line 18
    .line 19
    invoke-interface {p0}, Lew;->flush()V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lzn0;->b(Z)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lzn0;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lwu3;

    .line 30
    .line 31
    invoke-virtual {p0}, Lwu3;->flush()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final timeout()Lfu4;
    .locals 1

    .line 1
    iget v0, p0, Lzn0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lzn0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcc1;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lwu3;

    .line 12
    .line 13
    iget-object p0, p0, Lwu3;->n:Lof4;

    .line 14
    .line 15
    invoke-interface {p0}, Lof4;->timeout()Lfu4;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lzn0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "DeflaterSink("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lzn0;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lwu3;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x29

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

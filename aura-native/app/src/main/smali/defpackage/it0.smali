.class public final Ldefpackage/it0;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/os/HandlerThread;

.field public final b:Ldefpackage/fk0;

.field public final c:Ldefpackage/z05;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/HashMap;

.field public g:I

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/os/HandlerThread;Ldefpackage/fk0;Ldefpackage/z05;Landroid/os/Handler;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/it0;->a:Landroid/os/HandlerThread;

    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 11
    .line 12
    iput-object p3, p0, Ldefpackage/it0;->c:Ldefpackage/z05;

    .line 13
    .line 14
    iput-object p4, p0, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    iput p1, p0, Ldefpackage/it0;->i:I

    .line 18
    .line 19
    const/4 p1, 0x5

    .line 20
    iput p1, p0, Ldefpackage/it0;->j:I

    .line 21
    .line 22
    iput-boolean p5, p0, Ldefpackage/it0;->h:Z

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance p1, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/it0;->f:Ljava/util/HashMap;

    .line 37
    .line 38
    return-void
.end method

.method public static a(Ldefpackage/ns0;II)Ldefpackage/ns0;
    .locals 12

    .line 1
    new-instance v0, Ldefpackage/ns0;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 4
    .line 5
    iget-wide v3, p0, Ldefpackage/ns0;->c:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    iget-wide v7, p0, Ldefpackage/ns0;->e:J

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    iget-object v11, p0, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 15
    .line 16
    move v2, p1

    .line 17
    move v9, p2

    .line 18
    invoke-direct/range {v0 .. v11}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJJIILdefpackage/mt0;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Z)Ldefpackage/ns0;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/it0;->c(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ldefpackage/ns0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-object p0, p0, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ldefpackage/fk0;->d(Ljava/lang/String;)Ldefpackage/ns0;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, "Failed to load download: "

    .line 30
    .line 31
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "DownloadManager"

    .line 42
    .line 43
    invoke-static {p2, p1, p0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public final c(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ldefpackage/it0;->e:Ljava/util/ArrayList;

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
    check-cast v1, Ldefpackage/ns0;

    .line 15
    .line 16
    iget-object v1, v1, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 17
    .line 18
    iget-object v1, v1, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, -0x1

    .line 31
    return p0
.end method

.method public final d(Ldefpackage/ns0;)V
    .locals 11

    .line 1
    iget v0, p1, Ldefpackage/ns0;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x3

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    if-eq v0, v4, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 18
    .line 19
    iget-object v0, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ldefpackage/it0;->c(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v4, -0x1

    .line 26
    const/16 v5, 0xb

    .line 27
    .line 28
    iget-object v6, p0, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-ne v0, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v0, Ldefpackage/n7;

    .line 36
    .line 37
    invoke-direct {v0, v5}, Ldefpackage/n7;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    iget-wide v7, p1, Ldefpackage/ns0;->c:J

    .line 45
    .line 46
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ldefpackage/ns0;

    .line 51
    .line 52
    iget-wide v9, v4, Ldefpackage/ns0;->c:J

    .line 53
    .line 54
    cmp-long v4, v7, v9

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v1, v2

    .line 60
    :goto_1
    invoke-virtual {v6, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    new-instance v0, Ldefpackage/n7;

    .line 66
    .line 67
    invoke-direct {v0, v5}, Ldefpackage/n7;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_2
    :try_start_0
    iget-object v0, p0, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ldefpackage/fk0;->j(Ldefpackage/ns0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :catch_0
    move-exception v0

    .line 80
    const-string v1, "DownloadManager"

    .line 81
    .line 82
    const-string v4, "Failed to update index."

    .line 83
    .line 84
    invoke-static {v1, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_3
    new-instance v0, Ldefpackage/ht0;

    .line 88
    .line 89
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-direct {v0, p1, v2, v1, v4}, Ldefpackage/ht0;-><init>(Ldefpackage/ns0;ZLjava/util/ArrayList;Ljava/lang/Exception;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 99
    .line 100
    invoke-virtual {p0, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final e(Ldefpackage/ns0;II)Ldefpackage/ns0;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p2, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p3}, Ldefpackage/it0;->a(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/it0;->d(Ldefpackage/ns0;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public final f(Ldefpackage/ns0;I)V
    .locals 13

    .line 1
    move v9, p2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez v9, :cond_0

    .line 4
    .line 5
    iget v2, p1, Ldefpackage/ns0;->b:I

    .line 6
    .line 7
    if-ne v2, v1, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, p1, v1, v1}, Ldefpackage/it0;->e(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v2, p1, Ldefpackage/ns0;->f:I

    .line 15
    .line 16
    if-eq v9, v2, :cond_3

    .line 17
    .line 18
    iget v2, p1, Ldefpackage/ns0;->b:I

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    :cond_1
    move v2, v1

    .line 26
    :cond_2
    new-instance v1, Ldefpackage/ns0;

    .line 27
    .line 28
    move-object v3, v1

    .line 29
    iget-object v1, p1, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 30
    .line 31
    move-object v5, v3

    .line 32
    iget-wide v3, p1, Ldefpackage/ns0;->c:J

    .line 33
    .line 34
    move-object v7, v5

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    move-object v10, v7

    .line 40
    iget-wide v7, p1, Ldefpackage/ns0;->e:J

    .line 41
    .line 42
    move-object v11, v10

    .line 43
    const/4 v10, 0x0

    .line 44
    iget-object v0, p1, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 45
    .line 46
    move-object v12, v11

    .line 47
    move-object v11, v0

    .line 48
    move-object v0, v12

    .line 49
    invoke-direct/range {v0 .. v11}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJJIILdefpackage/mt0;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ldefpackage/it0;->d(Ldefpackage/ns0;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final g()V
    .locals 14

    .line 1
    const/4 v7, 0x0

    .line 2
    move v8, v7

    .line 3
    move v9, v8

    .line 4
    :goto_0
    iget-object v0, p0, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v8, v1, :cond_e

    .line 11
    .line 12
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldefpackage/ns0;

    .line 17
    .line 18
    iget-object v10, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 19
    .line 20
    iget-object v1, v10, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v11, p0, Ldefpackage/it0;->f:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v11, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v12, v1

    .line 29
    check-cast v12, Ldefpackage/kt0;

    .line 30
    .line 31
    iget v1, v0, Ldefpackage/ns0;->b:I

    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/it0;->c:Ldefpackage/z05;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v13, 0x1

    .line 37
    if-eqz v1, :cond_7

    .line 38
    .line 39
    if-eq v1, v13, :cond_6

    .line 40
    .line 41
    if-eq v1, v3, :cond_4

    .line 42
    .line 43
    const/4 v3, 0x5

    .line 44
    if-eq v1, v3, :cond_1

    .line 45
    .line 46
    const/4 v3, 0x7

    .line 47
    if-ne v1, v3, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    :goto_1
    if-eqz v12, :cond_2

    .line 55
    .line 56
    iget-boolean v0, v12, Ldefpackage/kt0;->q:Z

    .line 57
    .line 58
    if-nez v0, :cond_c

    .line 59
    .line 60
    invoke-virtual {v12, v7}, Ldefpackage/kt0;->a(Z)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_2
    iget-boolean v1, p0, Ldefpackage/it0;->l:Z

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v2, v10}, Ldefpackage/z05;->d(Ldefpackage/tt0;)Ldefpackage/du0;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v1, Ldefpackage/kt0;

    .line 76
    .line 77
    move-object v3, v1

    .line 78
    iget-object v1, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 79
    .line 80
    move-object v4, v3

    .line 81
    iget-object v3, v0, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 82
    .line 83
    move-object v0, v4

    .line 84
    const/4 v4, 0x1

    .line 85
    iget v5, p0, Ldefpackage/it0;->j:I

    .line 86
    .line 87
    move-object v6, p0

    .line 88
    invoke-direct/range {v0 .. v6}, Ldefpackage/kt0;-><init>(Ldefpackage/tt0;Ldefpackage/du0;Ldefpackage/mt0;ZILdefpackage/it0;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v10, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v11, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    iput-boolean v13, p0, Ldefpackage/it0;->l:Z

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_4
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-boolean v1, v12, Ldefpackage/kt0;->q:Z

    .line 107
    .line 108
    xor-int/2addr v1, v13

    .line 109
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 110
    .line 111
    .line 112
    iget-boolean v1, p0, Ldefpackage/it0;->h:Z

    .line 113
    .line 114
    if-nez v1, :cond_5

    .line 115
    .line 116
    iget v1, p0, Ldefpackage/it0;->g:I

    .line 117
    .line 118
    if-nez v1, :cond_5

    .line 119
    .line 120
    iget v1, p0, Ldefpackage/it0;->i:I

    .line 121
    .line 122
    if-lt v9, v1, :cond_c

    .line 123
    .line 124
    :cond_5
    invoke-virtual {p0, v0, v7, v7}, Ldefpackage/it0;->e(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v7}, Ldefpackage/kt0;->a(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    if-eqz v12, :cond_c

    .line 132
    .line 133
    iget-boolean v0, v12, Ldefpackage/kt0;->q:Z

    .line 134
    .line 135
    xor-int/2addr v0, v13

    .line 136
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v7}, Ldefpackage/kt0;->a(Z)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    if-eqz v12, :cond_8

    .line 144
    .line 145
    iget-boolean v0, v12, Ldefpackage/kt0;->q:Z

    .line 146
    .line 147
    xor-int/2addr v0, v13

    .line 148
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v7}, Ldefpackage/kt0;->a(Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_8
    iget-boolean v1, p0, Ldefpackage/it0;->h:Z

    .line 156
    .line 157
    if-nez v1, :cond_b

    .line 158
    .line 159
    iget v1, p0, Ldefpackage/it0;->g:I

    .line 160
    .line 161
    if-nez v1, :cond_b

    .line 162
    .line 163
    iget v1, p0, Ldefpackage/it0;->k:I

    .line 164
    .line 165
    iget v4, p0, Ldefpackage/it0;->i:I

    .line 166
    .line 167
    if-lt v1, v4, :cond_9

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_9
    invoke-virtual {p0, v0, v3, v7}, Ldefpackage/it0;->e(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v10, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 175
    .line 176
    invoke-virtual {v2, v10}, Ldefpackage/z05;->d(Ldefpackage/tt0;)Ldefpackage/du0;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    new-instance v1, Ldefpackage/kt0;

    .line 181
    .line 182
    move-object v3, v1

    .line 183
    iget-object v1, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 184
    .line 185
    iget-object v0, v0, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    iget v5, p0, Ldefpackage/it0;->j:I

    .line 189
    .line 190
    move-object v6, v3

    .line 191
    move-object v3, v0

    .line 192
    move-object v0, v6

    .line 193
    move-object v6, p0

    .line 194
    invoke-direct/range {v0 .. v6}, Ldefpackage/kt0;-><init>(Ldefpackage/tt0;Ldefpackage/du0;Ldefpackage/mt0;ZILdefpackage/it0;)V

    .line 195
    .line 196
    .line 197
    iget-object v1, v10, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v11, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    iget v1, p0, Ldefpackage/it0;->k:I

    .line 203
    .line 204
    add-int/lit8 v2, v1, 0x1

    .line 205
    .line 206
    iput v2, p0, Ldefpackage/it0;->k:I

    .line 207
    .line 208
    if-nez v1, :cond_a

    .line 209
    .line 210
    const/16 v1, 0xc

    .line 211
    .line 212
    const-wide/16 v2, 0x1388

    .line 213
    .line 214
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 218
    .line 219
    .line 220
    :goto_2
    move-object v12, v0

    .line 221
    goto :goto_4

    .line 222
    :cond_b
    :goto_3
    const/4 v0, 0x0

    .line 223
    goto :goto_2

    .line 224
    :cond_c
    :goto_4
    if-eqz v12, :cond_d

    .line 225
    .line 226
    iget-boolean v0, v12, Ldefpackage/kt0;->q:Z

    .line 227
    .line 228
    if-nez v0, :cond_d

    .line 229
    .line 230
    add-int/lit8 v9, v9, 0x1

    .line 231
    .line 232
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_e
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v0, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x7

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x5

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x1

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, v1, Ldefpackage/it0;->f:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ldefpackage/kt0;

    .line 45
    .line 46
    invoke-virtual {v2, v11}, Ldefpackage/kt0;->a(Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    :try_start_0
    iget-object v0, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ldefpackage/fk0;->l()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    const-string v2, "DownloadManager"

    .line 58
    .line 59
    const-string v3, "Failed to update index."

    .line 60
    .line 61
    invoke-static {v2, v3, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object v0, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v1, Ldefpackage/it0;->a:Landroid/os/HandlerThread;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 72
    .line 73
    .line 74
    monitor-enter p0

    .line 75
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 76
    .line 77
    .line 78
    monitor-exit p0

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :catchall_0
    move-exception v0

    .line 82
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw v0

    .line 84
    :pswitch_1
    iget-object v2, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 85
    .line 86
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-ge v10, v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ldefpackage/ns0;

    .line 97
    .line 98
    iget v4, v0, Ldefpackage/ns0;->b:I

    .line 99
    .line 100
    if-ne v4, v8, :cond_1

    .line 101
    .line 102
    :try_start_2
    iget-object v4, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 103
    .line 104
    invoke-virtual {v4, v0}, Ldefpackage/fk0;->j(Ldefpackage/ns0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move-exception v0

    .line 109
    const-string v4, "DownloadManager"

    .line 110
    .line 111
    const-string v5, "Failed to update index."

    .line 112
    .line 113
    invoke-static {v4, v5, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    const-wide/16 v4, 0x1388

    .line 120
    .line 121
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_2
    iget-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Ldefpackage/kt0;

    .line 128
    .line 129
    iget v3, v0, Landroid/os/Message;->arg1:I

    .line 130
    .line 131
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 132
    .line 133
    sget-object v4, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 134
    .line 135
    int-to-long v3, v3

    .line 136
    const-wide v5, 0xffffffffL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    and-long/2addr v3, v5

    .line 142
    const/16 v7, 0x20

    .line 143
    .line 144
    shl-long/2addr v3, v7

    .line 145
    int-to-long v7, v0

    .line 146
    and-long/2addr v5, v7

    .line 147
    or-long v18, v3, v5

    .line 148
    .line 149
    iget-object v0, v2, Ldefpackage/kt0;->n:Ldefpackage/tt0;

    .line 150
    .line 151
    iget-object v0, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v1, v0, v10}, Ldefpackage/it0;->b(Ljava/lang/String;Z)Ldefpackage/ns0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-wide v2, v0, Ldefpackage/ns0;->e:J

    .line 161
    .line 162
    cmp-long v2, v18, v2

    .line 163
    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    const-wide/16 v2, -0x1

    .line 167
    .line 168
    cmp-long v2, v18, v2

    .line 169
    .line 170
    if-nez v2, :cond_3

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_3
    new-instance v11, Ldefpackage/ns0;

    .line 174
    .line 175
    iget-object v12, v0, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 176
    .line 177
    iget v13, v0, Ldefpackage/ns0;->b:I

    .line 178
    .line 179
    iget-wide v14, v0, Ldefpackage/ns0;->c:J

    .line 180
    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 182
    .line 183
    .line 184
    move-result-wide v16

    .line 185
    iget v2, v0, Ldefpackage/ns0;->f:I

    .line 186
    .line 187
    iget v3, v0, Ldefpackage/ns0;->g:I

    .line 188
    .line 189
    iget-object v0, v0, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 190
    .line 191
    move-object/from16 v22, v0

    .line 192
    .line 193
    move/from16 v20, v2

    .line 194
    .line 195
    move/from16 v21, v3

    .line 196
    .line 197
    invoke-direct/range {v11 .. v22}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJJIILdefpackage/mt0;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v11}, Ldefpackage/it0;->d(Ldefpackage/ns0;)V

    .line 201
    .line 202
    .line 203
    :cond_4
    :goto_4
    return-void

    .line 204
    :pswitch_3
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Ldefpackage/kt0;

    .line 207
    .line 208
    const-string v2, "DownloadManager"

    .line 209
    .line 210
    iget-object v12, v0, Ldefpackage/kt0;->n:Ldefpackage/tt0;

    .line 211
    .line 212
    iget-object v12, v12, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 213
    .line 214
    iget-object v13, v1, Ldefpackage/it0;->f:Ljava/util/HashMap;

    .line 215
    .line 216
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    iget-boolean v13, v0, Ldefpackage/kt0;->q:Z

    .line 220
    .line 221
    if-eqz v13, :cond_5

    .line 222
    .line 223
    iput-boolean v10, v1, Ldefpackage/it0;->l:Z

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_5
    iget v14, v1, Ldefpackage/it0;->k:I

    .line 227
    .line 228
    sub-int/2addr v14, v11

    .line 229
    iput v14, v1, Ldefpackage/it0;->k:I

    .line 230
    .line 231
    if-nez v14, :cond_6

    .line 232
    .line 233
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 234
    .line 235
    .line 236
    :cond_6
    :goto_5
    iget-boolean v3, v0, Ldefpackage/kt0;->t:Z

    .line 237
    .line 238
    if-eqz v3, :cond_7

    .line 239
    .line 240
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_24

    .line 244
    .line 245
    :cond_7
    iget-object v3, v0, Ldefpackage/kt0;->u:Ljava/lang/Exception;

    .line 246
    .line 247
    if-eqz v3, :cond_8

    .line 248
    .line 249
    new-instance v14, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v15, "Task failed: "

    .line 252
    .line 253
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, v0, Ldefpackage/kt0;->n:Ldefpackage/tt0;

    .line 257
    .line 258
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v0, ", "

    .line 262
    .line 263
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v2, v0, v3}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    :cond_8
    invoke-virtual {v1, v12, v10}, Ldefpackage/it0;->b(Ljava/lang/String;Z)Ldefpackage/ns0;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget v0, v12, Ldefpackage/ns0;->b:I

    .line 284
    .line 285
    if-eq v0, v8, :cond_d

    .line 286
    .line 287
    if-eq v0, v9, :cond_a

    .line 288
    .line 289
    if-ne v0, v5, :cond_9

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_9
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_a
    :goto_6
    invoke-static {v13}, Ldefpackage/rr2;->w(Z)V

    .line 297
    .line 298
    .line 299
    iget-object v3, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 300
    .line 301
    iget v0, v12, Ldefpackage/ns0;->b:I

    .line 302
    .line 303
    iget-object v4, v12, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 304
    .line 305
    if-ne v0, v5, :cond_c

    .line 306
    .line 307
    iget v0, v12, Ldefpackage/ns0;->f:I

    .line 308
    .line 309
    if-nez v0, :cond_b

    .line 310
    .line 311
    move v11, v10

    .line 312
    :cond_b
    invoke-virtual {v1, v12, v11, v0}, Ldefpackage/it0;->e(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_b

    .line 319
    .line 320
    :cond_c
    iget-object v0, v4, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Ldefpackage/it0;->c(Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    :try_start_3
    iget-object v0, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 330
    .line 331
    iget-object v4, v4, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v0}, Ldefpackage/fk0;->b()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 334
    .line 335
    .line 336
    :try_start_4
    iget-object v0, v0, Ldefpackage/fk0;->b:Ldefpackage/tk4;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    const-string v5, "ExoPlayerDownloads"

    .line 343
    .line 344
    const-string v9, "id = ?"

    .line 345
    .line 346
    filled-new-array {v4}, [Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-virtual {v0, v5, v9, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 351
    .line 352
    .line 353
    goto :goto_7

    .line 354
    :catch_2
    move-exception v0

    .line 355
    :try_start_5
    new-instance v4, Landroidx/media3/database/DatabaseIOException;

    .line 356
    .line 357
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 358
    .line 359
    .line 360
    throw v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 361
    :catch_3
    const-string v0, "Failed to remove from database"

    .line 362
    .line 363
    invoke-static {v2, v0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :goto_7
    new-instance v0, Ldefpackage/ht0;

    .line 367
    .line 368
    new-instance v2, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 371
    .line 372
    .line 373
    invoke-direct {v0, v12, v11, v2, v7}, Ldefpackage/ht0;-><init>(Ldefpackage/ns0;ZLjava/util/ArrayList;Ljava/lang/Exception;)V

    .line 374
    .line 375
    .line 376
    iget-object v2, v1, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 377
    .line 378
    invoke-virtual {v2, v6, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 383
    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_d
    xor-int/lit8 v0, v13, 0x1

    .line 387
    .line 388
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 389
    .line 390
    .line 391
    iget-object v5, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 392
    .line 393
    new-instance v13, Ldefpackage/ns0;

    .line 394
    .line 395
    iget-object v14, v12, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 396
    .line 397
    if-nez v3, :cond_e

    .line 398
    .line 399
    move v15, v6

    .line 400
    goto :goto_8

    .line 401
    :cond_e
    move v15, v4

    .line 402
    :goto_8
    iget-wide v8, v12, Ldefpackage/ns0;->c:J

    .line 403
    .line 404
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 405
    .line 406
    .line 407
    move-result-wide v18

    .line 408
    iget-wide v6, v12, Ldefpackage/ns0;->e:J

    .line 409
    .line 410
    iget v0, v12, Ldefpackage/ns0;->f:I

    .line 411
    .line 412
    if-nez v3, :cond_f

    .line 413
    .line 414
    move/from16 v23, v10

    .line 415
    .line 416
    goto :goto_9

    .line 417
    :cond_f
    move/from16 v23, v11

    .line 418
    .line 419
    :goto_9
    iget-object v4, v12, Ldefpackage/ns0;->h:Ldefpackage/mt0;

    .line 420
    .line 421
    move/from16 v22, v0

    .line 422
    .line 423
    move-object/from16 v24, v4

    .line 424
    .line 425
    move-wide/from16 v20, v6

    .line 426
    .line 427
    move-wide/from16 v16, v8

    .line 428
    .line 429
    invoke-direct/range {v13 .. v24}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJJIILdefpackage/mt0;)V

    .line 430
    .line 431
    .line 432
    iget-object v0, v13, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 433
    .line 434
    iget-object v0, v0, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v1, v0}, Ldefpackage/it0;->c(Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    :try_start_6
    iget-object v0, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 444
    .line 445
    invoke-virtual {v0, v13}, Ldefpackage/fk0;->j(Ldefpackage/ns0;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 446
    .line 447
    .line 448
    goto :goto_a

    .line 449
    :catch_4
    move-exception v0

    .line 450
    const-string v4, "Failed to update index."

    .line 451
    .line 452
    invoke-static {v2, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    :goto_a
    new-instance v0, Ldefpackage/ht0;

    .line 456
    .line 457
    new-instance v2, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 460
    .line 461
    .line 462
    invoke-direct {v0, v13, v10, v2, v3}, Ldefpackage/ht0;-><init>(Ldefpackage/ns0;ZLjava/util/ArrayList;Ljava/lang/Exception;)V

    .line 463
    .line 464
    .line 465
    iget-object v2, v1, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 466
    .line 467
    const/4 v3, 0x3

    .line 468
    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 473
    .line 474
    .line 475
    :goto_b
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 476
    .line 477
    .line 478
    goto/16 :goto_24

    .line 479
    .line 480
    :pswitch_4
    const-string v2, "DownloadManager"

    .line 481
    .line 482
    iget-object v3, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 483
    .line 484
    iget-object v5, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 485
    .line 486
    new-instance v6, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    const/4 v8, 0x3

    .line 492
    :try_start_7
    filled-new-array {v8, v4}, [I

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v3, v0}, Ldefpackage/fk0;->g([I)Ldefpackage/ek0;

    .line 497
    .line 498
    .line 499
    move-result-object v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 500
    :goto_c
    :try_start_8
    iget-object v0, v4, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 501
    .line 502
    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    add-int/2addr v8, v11

    .line 507
    invoke-interface {v0, v8}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-eqz v0, :cond_10

    .line 512
    .line 513
    iget-object v0, v4, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 514
    .line 515
    invoke-static {v0}, Ldefpackage/fk0;->e(Landroid/database/Cursor;)Ldefpackage/ns0;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 520
    .line 521
    .line 522
    goto :goto_c

    .line 523
    :catchall_1
    move-exception v0

    .line 524
    move-object v8, v0

    .line 525
    goto :goto_d

    .line 526
    :cond_10
    :try_start_9
    invoke-virtual {v4}, Ldefpackage/ek0;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 527
    .line 528
    .line 529
    goto :goto_f

    .line 530
    :goto_d
    :try_start_a
    invoke-virtual {v4}, Ldefpackage/ek0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 531
    .line 532
    .line 533
    goto :goto_e

    .line 534
    :catchall_2
    move-exception v0

    .line 535
    :try_start_b
    invoke-virtual {v8, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 536
    .line 537
    .line 538
    :goto_e
    throw v8
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 539
    :catch_5
    const-string v0, "Failed to load downloads."

    .line 540
    .line 541
    invoke-static {v2, v0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :goto_f
    move v0, v10

    .line 545
    :goto_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 546
    .line 547
    .line 548
    move-result v4

    .line 549
    if-ge v0, v4, :cond_11

    .line 550
    .line 551
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    check-cast v4, Ldefpackage/ns0;

    .line 556
    .line 557
    invoke-static {v4, v9, v10}, Ldefpackage/it0;->a(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    invoke-virtual {v5, v0, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    add-int/lit8 v0, v0, 0x1

    .line 565
    .line 566
    goto :goto_10

    .line 567
    :cond_11
    move v0, v10

    .line 568
    :goto_11
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-ge v0, v4, :cond_12

    .line 573
    .line 574
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    check-cast v4, Ldefpackage/ns0;

    .line 579
    .line 580
    invoke-static {v4, v9, v10}, Ldefpackage/it0;->a(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    add-int/lit8 v0, v0, 0x1

    .line 588
    .line 589
    goto :goto_11

    .line 590
    :cond_12
    new-instance v0, Ldefpackage/n7;

    .line 591
    .line 592
    const/16 v4, 0xb

    .line 593
    .line 594
    invoke-direct {v0, v4}, Ldefpackage/n7;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 598
    .line 599
    .line 600
    :try_start_c
    invoke-virtual {v3}, Ldefpackage/fk0;->m()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 601
    .line 602
    .line 603
    goto :goto_12

    .line 604
    :catch_6
    move-exception v0

    .line 605
    const-string v3, "Failed to update index."

    .line 606
    .line 607
    invoke-static {v2, v3, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 608
    .line 609
    .line 610
    :goto_12
    new-instance v0, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 613
    .line 614
    .line 615
    move v2, v10

    .line 616
    :goto_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-ge v2, v3, :cond_13

    .line 621
    .line 622
    new-instance v3, Ldefpackage/ht0;

    .line 623
    .line 624
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    check-cast v4, Ldefpackage/ns0;

    .line 629
    .line 630
    invoke-direct {v3, v4, v10, v0, v7}, Ldefpackage/ht0;-><init>(Ldefpackage/ns0;ZLjava/util/ArrayList;Ljava/lang/Exception;)V

    .line 631
    .line 632
    .line 633
    iget-object v4, v1, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 634
    .line 635
    const/4 v8, 0x3

    .line 636
    invoke-virtual {v4, v8, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 641
    .line 642
    .line 643
    add-int/lit8 v2, v2, 0x1

    .line 644
    .line 645
    goto :goto_13

    .line 646
    :cond_13
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_23

    .line 650
    .line 651
    :pswitch_5
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, Ljava/lang/String;

    .line 654
    .line 655
    invoke-virtual {v1, v0, v11}, Ldefpackage/it0;->b(Ljava/lang/String;Z)Ldefpackage/ns0;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    if-nez v2, :cond_14

    .line 660
    .line 661
    const-string v2, "DownloadManager"

    .line 662
    .line 663
    new-instance v3, Ljava/lang/StringBuilder;

    .line 664
    .line 665
    const-string v4, "Failed to remove nonexistent download: "

    .line 666
    .line 667
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-static {v2, v0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    goto/16 :goto_23

    .line 681
    .line 682
    :cond_14
    invoke-virtual {v1, v2, v9, v10}, Ldefpackage/it0;->e(Ldefpackage/ns0;II)Ldefpackage/ns0;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_23

    .line 689
    .line 690
    :pswitch_6
    iget-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 691
    .line 692
    move-object v13, v2

    .line 693
    check-cast v13, Ldefpackage/tt0;

    .line 694
    .line 695
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 696
    .line 697
    iget-object v2, v13, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 698
    .line 699
    invoke-virtual {v1, v2, v11}, Ldefpackage/it0;->b(Ljava/lang/String;Z)Ldefpackage/ns0;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 704
    .line 705
    .line 706
    move-result-wide v15

    .line 707
    if-eqz v2, :cond_1e

    .line 708
    .line 709
    iget v3, v2, Ldefpackage/ns0;->b:I

    .line 710
    .line 711
    if-eq v3, v9, :cond_16

    .line 712
    .line 713
    const/4 v8, 0x3

    .line 714
    if-eq v3, v8, :cond_16

    .line 715
    .line 716
    if-ne v3, v4, :cond_15

    .line 717
    .line 718
    goto :goto_14

    .line 719
    :cond_15
    iget-wide v6, v2, Ldefpackage/ns0;->c:J

    .line 720
    .line 721
    move-wide/from16 v17, v6

    .line 722
    .line 723
    goto :goto_15

    .line 724
    :cond_16
    :goto_14
    move-wide/from16 v17, v15

    .line 725
    .line 726
    :goto_15
    if-eq v3, v9, :cond_19

    .line 727
    .line 728
    if-ne v3, v5, :cond_17

    .line 729
    .line 730
    goto :goto_16

    .line 731
    :cond_17
    if-eqz v0, :cond_18

    .line 732
    .line 733
    move v5, v11

    .line 734
    goto :goto_16

    .line 735
    :cond_18
    move v5, v10

    .line 736
    :cond_19
    :goto_16
    new-instance v14, Ldefpackage/ns0;

    .line 737
    .line 738
    iget-object v2, v2, Ldefpackage/ns0;->a:Ldefpackage/tt0;

    .line 739
    .line 740
    iget-object v3, v2, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 741
    .line 742
    iget-object v4, v13, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 743
    .line 744
    iget-object v6, v13, Ldefpackage/tt0;->q:Ljava/util/List;

    .line 745
    .line 746
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    invoke-static {v3}, Ldefpackage/rr2;->l(Z)V

    .line 751
    .line 752
    .line 753
    iget-object v3, v2, Ldefpackage/tt0;->q:Ljava/util/List;

    .line 754
    .line 755
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 756
    .line 757
    .line 758
    move-result v4

    .line 759
    if-nez v4, :cond_1d

    .line 760
    .line 761
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 762
    .line 763
    .line 764
    move-result v4

    .line 765
    if-eqz v4, :cond_1a

    .line 766
    .line 767
    goto :goto_19

    .line 768
    :cond_1a
    new-instance v4, Ljava/util/ArrayList;

    .line 769
    .line 770
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 771
    .line 772
    .line 773
    :goto_17
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    if-ge v10, v3, :cond_1c

    .line 778
    .line 779
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    check-cast v3, Ldefpackage/fm4;

    .line 784
    .line 785
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v7

    .line 789
    if-nez v7, :cond_1b

    .line 790
    .line 791
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    :cond_1b
    add-int/lit8 v10, v10, 0x1

    .line 795
    .line 796
    goto :goto_17

    .line 797
    :cond_1c
    :goto_18
    move-object/from16 v29, v4

    .line 798
    .line 799
    goto :goto_1a

    .line 800
    :cond_1d
    :goto_19
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 801
    .line 802
    goto :goto_18

    .line 803
    :goto_1a
    new-instance v25, Ldefpackage/tt0;

    .line 804
    .line 805
    iget-object v2, v2, Ldefpackage/tt0;->n:Ljava/lang/String;

    .line 806
    .line 807
    iget-object v3, v13, Ldefpackage/tt0;->o:Landroid/net/Uri;

    .line 808
    .line 809
    iget-object v4, v13, Ldefpackage/tt0;->p:Ljava/lang/String;

    .line 810
    .line 811
    iget-object v6, v13, Ldefpackage/tt0;->r:[B

    .line 812
    .line 813
    iget-object v7, v13, Ldefpackage/tt0;->s:Ljava/lang/String;

    .line 814
    .line 815
    iget-object v8, v13, Ldefpackage/tt0;->t:[B

    .line 816
    .line 817
    iget-object v9, v13, Ldefpackage/tt0;->u:Ldefpackage/rt0;

    .line 818
    .line 819
    iget-object v10, v13, Ldefpackage/tt0;->v:Ldefpackage/st0;

    .line 820
    .line 821
    move-object/from16 v26, v2

    .line 822
    .line 823
    move-object/from16 v27, v3

    .line 824
    .line 825
    move-object/from16 v28, v4

    .line 826
    .line 827
    move-object/from16 v30, v6

    .line 828
    .line 829
    move-object/from16 v31, v7

    .line 830
    .line 831
    move-object/from16 v32, v8

    .line 832
    .line 833
    move-object/from16 v33, v9

    .line 834
    .line 835
    move-object/from16 v34, v10

    .line 836
    .line 837
    invoke-direct/range {v25 .. v34}, Ldefpackage/tt0;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[BLdefpackage/rt0;Ldefpackage/st0;)V

    .line 838
    .line 839
    .line 840
    move/from16 v21, v0

    .line 841
    .line 842
    move-wide/from16 v19, v15

    .line 843
    .line 844
    move-object/from16 v15, v25

    .line 845
    .line 846
    move/from16 v16, v5

    .line 847
    .line 848
    invoke-direct/range {v14 .. v21}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJI)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v1, v14}, Ldefpackage/it0;->d(Ldefpackage/ns0;)V

    .line 852
    .line 853
    .line 854
    goto :goto_1c

    .line 855
    :cond_1e
    move/from16 v19, v0

    .line 856
    .line 857
    new-instance v12, Ldefpackage/ns0;

    .line 858
    .line 859
    if-eqz v19, :cond_1f

    .line 860
    .line 861
    move v14, v11

    .line 862
    goto :goto_1b

    .line 863
    :cond_1f
    move v14, v10

    .line 864
    :goto_1b
    move-wide/from16 v17, v15

    .line 865
    .line 866
    invoke-direct/range {v12 .. v19}, Ldefpackage/ns0;-><init>(Ldefpackage/tt0;IJJI)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1, v12}, Ldefpackage/it0;->d(Ldefpackage/ns0;)V

    .line 870
    .line 871
    .line 872
    :goto_1c
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_23

    .line 876
    .line 877
    :pswitch_7
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 878
    .line 879
    iput v0, v1, Ldefpackage/it0;->j:I

    .line 880
    .line 881
    goto/16 :goto_23

    .line 882
    .line 883
    :pswitch_8
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 884
    .line 885
    iput v0, v1, Ldefpackage/it0;->i:I

    .line 886
    .line 887
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_23

    .line 891
    .line 892
    :pswitch_9
    iget-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v2, Ljava/lang/String;

    .line 895
    .line 896
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 897
    .line 898
    const-string v3, "DownloadManager"

    .line 899
    .line 900
    iget-object v4, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 901
    .line 902
    iget-object v5, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 903
    .line 904
    if-nez v2, :cond_21

    .line 905
    .line 906
    :goto_1d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    if-ge v10, v2, :cond_20

    .line 911
    .line 912
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    check-cast v2, Ldefpackage/ns0;

    .line 917
    .line 918
    invoke-virtual {v1, v2, v0}, Ldefpackage/it0;->f(Ldefpackage/ns0;I)V

    .line 919
    .line 920
    .line 921
    add-int/lit8 v10, v10, 0x1

    .line 922
    .line 923
    goto :goto_1d

    .line 924
    :cond_20
    :try_start_d
    invoke-virtual {v4}, Ldefpackage/fk0;->b()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 925
    .line 926
    .line 927
    :try_start_e
    new-instance v2, Landroid/content/ContentValues;

    .line 928
    .line 929
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 930
    .line 931
    .line 932
    const-string v5, "stop_reason"

    .line 933
    .line 934
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-virtual {v2, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 939
    .line 940
    .line 941
    iget-object v0, v4, Ldefpackage/fk0;->b:Ldefpackage/tk4;

    .line 942
    .line 943
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    const-string v4, "ExoPlayerDownloads"

    .line 948
    .line 949
    sget-object v5, Ldefpackage/fk0;->e:Ljava/lang/String;

    .line 950
    .line 951
    invoke-virtual {v0, v4, v2, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_e
    .catch Landroid/database/SQLException; {:try_start_e .. :try_end_e} :catch_7
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8

    .line 952
    .line 953
    .line 954
    goto :goto_1e

    .line 955
    :catch_7
    move-exception v0

    .line 956
    :try_start_f
    new-instance v2, Landroidx/media3/database/DatabaseIOException;

    .line 957
    .line 958
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 959
    .line 960
    .line 961
    throw v2
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8

    .line 962
    :catch_8
    move-exception v0

    .line 963
    const-string v2, "Failed to set manual stop reason"

    .line 964
    .line 965
    invoke-static {v3, v2, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 966
    .line 967
    .line 968
    goto :goto_1e

    .line 969
    :cond_21
    invoke-virtual {v1, v2, v10}, Ldefpackage/it0;->b(Ljava/lang/String;Z)Ldefpackage/ns0;

    .line 970
    .line 971
    .line 972
    move-result-object v5

    .line 973
    if-eqz v5, :cond_22

    .line 974
    .line 975
    invoke-virtual {v1, v5, v0}, Ldefpackage/it0;->f(Ldefpackage/ns0;I)V

    .line 976
    .line 977
    .line 978
    goto :goto_1e

    .line 979
    :cond_22
    :try_start_10
    invoke-virtual {v4, v0, v2}, Ldefpackage/fk0;->n(ILjava/lang/String;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9

    .line 980
    .line 981
    .line 982
    goto :goto_1e

    .line 983
    :catch_9
    move-exception v0

    .line 984
    const-string v4, "Failed to set manual stop reason: "

    .line 985
    .line 986
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    invoke-static {v3, v2, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 991
    .line 992
    .line 993
    :goto_1e
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 994
    .line 995
    .line 996
    goto :goto_23

    .line 997
    :pswitch_a
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 998
    .line 999
    iput v0, v1, Ldefpackage/it0;->g:I

    .line 1000
    .line 1001
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 1002
    .line 1003
    .line 1004
    goto :goto_23

    .line 1005
    :pswitch_b
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 1006
    .line 1007
    if-eqz v0, :cond_23

    .line 1008
    .line 1009
    move v10, v11

    .line 1010
    :cond_23
    iput-boolean v10, v1, Ldefpackage/it0;->h:Z

    .line 1011
    .line 1012
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_23

    .line 1016
    :pswitch_c
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 1017
    .line 1018
    iget-object v2, v1, Ldefpackage/it0;->b:Ldefpackage/fk0;

    .line 1019
    .line 1020
    iget-object v3, v1, Ldefpackage/it0;->e:Ljava/util/ArrayList;

    .line 1021
    .line 1022
    iput v0, v1, Ldefpackage/it0;->g:I

    .line 1023
    .line 1024
    :try_start_11
    invoke-virtual {v2}, Ldefpackage/fk0;->l()V

    .line 1025
    .line 1026
    .line 1027
    const/4 v4, 0x2

    .line 1028
    filled-new-array {v10, v11, v4, v9, v5}, [I

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    invoke-virtual {v2, v0}, Ldefpackage/fk0;->g([I)Ldefpackage/ek0;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v7

    .line 1036
    :goto_1f
    iget-object v0, v7, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 1037
    .line 1038
    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    add-int/2addr v2, v11

    .line 1043
    invoke-interface {v0, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    if-eqz v0, :cond_24

    .line 1048
    .line 1049
    iget-object v0, v7, Ldefpackage/ek0;->n:Landroid/database/Cursor;

    .line 1050
    .line 1051
    invoke-static {v0}, Ldefpackage/fk0;->e(Landroid/database/Cursor;)Ldefpackage/ns0;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_a
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 1056
    .line 1057
    .line 1058
    goto :goto_1f

    .line 1059
    :catchall_3
    move-exception v0

    .line 1060
    goto :goto_25

    .line 1061
    :catch_a
    move-exception v0

    .line 1062
    goto :goto_21

    .line 1063
    :cond_24
    :goto_20
    invoke-static {v7}, Ldefpackage/f35;->h(Ljava/io/Closeable;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_22

    .line 1067
    :goto_21
    :try_start_12
    const-string v2, "DownloadManager"

    .line 1068
    .line 1069
    const-string v4, "Failed to load index."

    .line 1070
    .line 1071
    invoke-static {v2, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 1075
    .line 1076
    .line 1077
    goto :goto_20

    .line 1078
    :goto_22
    new-instance v0, Ljava/util/ArrayList;

    .line 1079
    .line 1080
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1081
    .line 1082
    .line 1083
    iget-object v2, v1, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 1084
    .line 1085
    invoke-virtual {v2, v11, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v1}, Ldefpackage/it0;->g()V

    .line 1093
    .line 1094
    .line 1095
    :goto_23
    move v10, v11

    .line 1096
    :goto_24
    iget-object v0, v1, Ldefpackage/it0;->d:Landroid/os/Handler;

    .line 1097
    .line 1098
    iget-object v1, v1, Ldefpackage/it0;->f:Ljava/util/HashMap;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 1101
    .line 1102
    .line 1103
    move-result v1

    .line 1104
    const/4 v4, 0x2

    .line 1105
    invoke-virtual {v0, v4, v10, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1110
    .line 1111
    .line 1112
    return-void

    .line 1113
    :goto_25
    invoke-static {v7}, Ldefpackage/f35;->h(Ljava/io/Closeable;)V

    .line 1114
    .line 1115
    .line 1116
    throw v0

    .line 1117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lpi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Lgn2;

.field public final d:Ljava/lang/Object;

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:I

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x24

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lpi3;->j:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lpi3;->k:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lpi3;->l:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lpi3;->m:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lpi3;->n:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lpi3;->o:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lpi3;->p:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz p2, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 12
    .line 13
    .line 14
    if-ltz p5, :cond_1

    .line 15
    .line 16
    move v0, v1

    .line 17
    :cond_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lpi3;->a:Ljava/lang/Object;

    .line 21
    .line 22
    iput p2, p0, Lpi3;->b:I

    .line 23
    .line 24
    iput-object p3, p0, Lpi3;->c:Lgn2;

    .line 25
    .line 26
    iput-object p4, p0, Lpi3;->d:Ljava/lang/Object;

    .line 27
    .line 28
    iput p5, p0, Lpi3;->e:I

    .line 29
    .line 30
    iput-wide p6, p0, Lpi3;->f:J

    .line 31
    .line 32
    iput-wide p8, p0, Lpi3;->g:J

    .line 33
    .line 34
    iput p10, p0, Lpi3;->h:I

    .line 35
    .line 36
    iput p11, p0, Lpi3;->i:I

    .line 37
    .line 38
    return-void
.end method

.method public static c(Landroid/os/Bundle;)Lpi3;
    .locals 14

    .line 1
    sget-object v0, Lpi3;->j:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    sget-object v0, Lpi3;->k:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    move-object v5, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-static {v0}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    sget-object v0, Lpi3;->l:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    sget-object v0, Lpi3;->m:Ljava/lang/String;

    .line 39
    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v8

    .line 46
    sget-object v0, Lpi3;->n:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v10

    .line 52
    sget-object v0, Lpi3;->o:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    sget-object v0, Lpi3;->p:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    new-instance v2, Lpi3;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct/range {v2 .. v13}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 70
    .line 71
    .line 72
    return-object v2
.end method


# virtual methods
.method public final a(Lpi3;)Z
    .locals 4

    .line 1
    iget v0, p0, Lpi3;->b:I

    .line 2
    .line 3
    iget v1, p1, Lpi3;->b:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lpi3;->e:I

    .line 8
    .line 9
    iget v1, p1, Lpi3;->e:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lpi3;->f:J

    .line 14
    .line 15
    iget-wide v2, p1, Lpi3;->f:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-wide v0, p0, Lpi3;->g:J

    .line 22
    .line 23
    iget-wide v2, p1, Lpi3;->g:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget v0, p0, Lpi3;->h:I

    .line 30
    .line 31
    iget v1, p1, Lpi3;->h:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_0

    .line 34
    .line 35
    iget v0, p0, Lpi3;->i:I

    .line 36
    .line 37
    iget v1, p1, Lpi3;->i:I

    .line 38
    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    iget-object p0, p0, Lpi3;->c:Lgn2;

    .line 42
    .line 43
    iget-object p1, p1, Lpi3;->c:Lgn2;

    .line 44
    .line 45
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_0
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public final b(ZZ)Lpi3;
    .locals 14

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lpi3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget v2, p0, Lpi3;->b:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v2, v1

    .line 15
    :goto_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object v3, p0, Lpi3;->c:Lgn2;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    const/4 v3, 0x0

    .line 21
    :goto_1
    if-eqz p2, :cond_3

    .line 22
    .line 23
    iget v1, p0, Lpi3;->e:I

    .line 24
    .line 25
    :cond_3
    move v5, v1

    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    iget-wide v8, p0, Lpi3;->f:J

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_4
    move-wide v8, v6

    .line 34
    :goto_2
    if-eqz p1, :cond_5

    .line 35
    .line 36
    iget-wide v6, p0, Lpi3;->g:J

    .line 37
    .line 38
    :cond_5
    const/4 v1, -0x1

    .line 39
    if-eqz p1, :cond_6

    .line 40
    .line 41
    iget v4, p0, Lpi3;->h:I

    .line 42
    .line 43
    move v10, v4

    .line 44
    goto :goto_3

    .line 45
    :cond_6
    move v10, v1

    .line 46
    :goto_3
    if-eqz p1, :cond_7

    .line 47
    .line 48
    iget v1, p0, Lpi3;->i:I

    .line 49
    .line 50
    :cond_7
    move v11, v1

    .line 51
    iget-object v1, p0, Lpi3;->a:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v4, p0, Lpi3;->d:Ljava/lang/Object;

    .line 54
    .line 55
    move-wide v12, v8

    .line 56
    move-wide v8, v6

    .line 57
    move-wide v6, v12

    .line 58
    invoke-direct/range {v0 .. v11}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public final d(I)Landroid/os/Bundle;
    .locals 7

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lpi3;->b:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-lt p1, v2, :cond_0

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :cond_0
    sget-object v3, Lpi3;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v1, p0, Lpi3;->c:Lgn2;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v1, v3}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v3, Lpi3;->k:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget v1, p0, Lpi3;->e:I

    .line 33
    .line 34
    if-lt p1, v2, :cond_3

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    :cond_3
    sget-object v3, Lpi3;->l:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    :cond_4
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    iget-wide v5, p0, Lpi3;->f:J

    .line 46
    .line 47
    if-lt p1, v2, :cond_5

    .line 48
    .line 49
    cmp-long v1, v5, v3

    .line 50
    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    :cond_5
    sget-object v1, Lpi3;->m:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 56
    .line 57
    .line 58
    :cond_6
    iget-wide v5, p0, Lpi3;->g:J

    .line 59
    .line 60
    if-lt p1, v2, :cond_7

    .line 61
    .line 62
    cmp-long p1, v5, v3

    .line 63
    .line 64
    if-eqz p1, :cond_8

    .line 65
    .line 66
    :cond_7
    sget-object p1, Lpi3;->n:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, p1, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
    :cond_8
    const/4 p1, -0x1

    .line 72
    iget v1, p0, Lpi3;->h:I

    .line 73
    .line 74
    if-eq v1, p1, :cond_9

    .line 75
    .line 76
    sget-object v2, Lpi3;->o:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    :cond_9
    iget p0, p0, Lpi3;->i:I

    .line 82
    .line 83
    if-eq p0, p1, :cond_a

    .line 84
    .line 85
    sget-object p1, Lpi3;->p:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, p1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    :cond_a
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lpi3;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lpi3;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lpi3;->a(Lpi3;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lpi3;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v3, p1, Lpi3;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, Lpi3;->d:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, p1, Lpi3;->d:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 10

    .line 1
    iget v0, p0, Lpi3;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, p0, Lpi3;->e:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-wide v0, p0, Lpi3;->f:J

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    iget-wide v0, p0, Lpi3;->g:J

    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget v0, p0, Lpi3;->h:I

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    iget v0, p0, Lpi3;->i:I

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget-object v1, p0, Lpi3;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, p0, Lpi3;->c:Lgn2;

    .line 40
    .line 41
    iget-object v4, p0, Lpi3;->d:Ljava/lang/Object;

    .line 42
    .line 43
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "mediaItem="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lpi3;->b:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", period="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lpi3;->e:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pos="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lpi3;->f:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, -0x1

    .line 38
    iget v2, p0, Lpi3;->h:I

    .line 39
    .line 40
    if-ne v2, v1, :cond_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    const-string v1, ", contentPos="

    .line 44
    .line 45
    invoke-static {v0, v1}, Lb11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-wide v3, p0, Lpi3;->g:J

    .line 50
    .line 51
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", adGroup="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", ad="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget p0, p0, Lpi3;->i:I

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

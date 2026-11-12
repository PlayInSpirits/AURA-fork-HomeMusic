.class public final Lyq4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrd;


# instance fields
.field public final a:Lg45;

.field public final b:Lhd5;

.field public final c:Ljava/lang/Float;

.field public final d:Ljava/lang/Object;

.field public final e:Lce;

.field public final f:Lce;

.field public final g:Lce;

.field public h:J

.field public i:Lce;


# direct methods
.method public constructor <init>(Lwd;Ljava/lang/Object;Ljava/lang/Float;Lce;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lwd;->a()Lg45;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lyq4;->a:Lg45;

    .line 9
    .line 10
    sget-object p1, Lp35;->a:Lhd5;

    .line 11
    .line 12
    iput-object p1, p0, Lyq4;->b:Lhd5;

    .line 13
    .line 14
    iput-object p3, p0, Lyq4;->c:Ljava/lang/Float;

    .line 15
    .line 16
    iput-object p2, p0, Lyq4;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lif1;

    .line 21
    .line 22
    invoke-interface {p1, p2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lce;

    .line 27
    .line 28
    iput-object v0, p0, Lyq4;->e:Lce;

    .line 29
    .line 30
    invoke-interface {p1, p3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    check-cast p3, Lce;

    .line 35
    .line 36
    iput-object p3, p0, Lyq4;->f:Lce;

    .line 37
    .line 38
    if-eqz p4, :cond_0

    .line 39
    .line 40
    invoke-static {p4}, Lkb4;->n(Lce;)Lce;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {p1, p2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lce;

    .line 50
    .line 51
    invoke-virtual {p1}, Lce;->c()Lce;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    iput-object p1, p0, Lyq4;->g:Lce;

    .line 56
    .line 57
    const-wide/16 p1, -0x1

    .line 58
    .line 59
    iput-wide p1, p0, Lyq4;->h:J

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyq4;->a:Lg45;

    .line 2
    .line 3
    invoke-interface {p0}, Lg45;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lyq4;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyq4;->f:Lce;

    .line 10
    .line 11
    iget-object v1, p0, Lyq4;->g:Lce;

    .line 12
    .line 13
    iget-object v2, p0, Lyq4;->a:Lg45;

    .line 14
    .line 15
    iget-object v3, p0, Lyq4;->e:Lce;

    .line 16
    .line 17
    invoke-interface {v2, v3, v0, v1}, Lg45;->m(Lce;Lce;Lce;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, Lyq4;->h:J

    .line 22
    .line 23
    :cond_0
    iget-wide v0, p0, Lyq4;->h:J

    .line 24
    .line 25
    return-wide v0
.end method

.method public final c()Lhd5;
    .locals 0

    .line 1
    iget-object p0, p0, Lyq4;->b:Lhd5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(J)Lce;
    .locals 7

    .line 1
    invoke-interface {p0, p1, p2}, Lrd;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v5, p0, Lyq4;->f:Lce;

    .line 8
    .line 9
    iget-object v6, p0, Lyq4;->g:Lce;

    .line 10
    .line 11
    iget-object v1, p0, Lyq4;->a:Lg45;

    .line 12
    .line 13
    iget-object v4, p0, Lyq4;->e:Lce;

    .line 14
    .line 15
    move-wide v2, p1

    .line 16
    invoke-interface/range {v1 .. v6}, Lg45;->d(JLce;Lce;Lce;)Lce;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    iget-object p1, p0, Lyq4;->i:Lce;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lyq4;->f:Lce;

    .line 26
    .line 27
    iget-object p2, p0, Lyq4;->g:Lce;

    .line 28
    .line 29
    iget-object v0, p0, Lyq4;->a:Lg45;

    .line 30
    .line 31
    iget-object v1, p0, Lyq4;->e:Lce;

    .line 32
    .line 33
    invoke-interface {v0, v1, p1, p2}, Lg45;->l(Lce;Lce;Lce;)Lce;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lyq4;->i:Lce;

    .line 38
    .line 39
    :cond_1
    return-object p1
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-interface {p0, p1, p2}, Lrd;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v5, p0, Lyq4;->f:Lce;

    .line 8
    .line 9
    iget-object v6, p0, Lyq4;->g:Lce;

    .line 10
    .line 11
    iget-object v1, p0, Lyq4;->a:Lg45;

    .line 12
    .line 13
    iget-object v4, p0, Lyq4;->e:Lce;

    .line 14
    .line 15
    move-wide v2, p1

    .line 16
    invoke-interface/range {v1 .. v6}, Lg45;->k(JLce;Lce;Lce;)Lce;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lce;->b()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-ge v0, p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lce;->a(I)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v4, "AnimationVector cannot contain a NaN. "

    .line 40
    .line 41
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v4, ". Animation: "

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v4, ", playTimeNanos: "

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lqo3;->b(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object p0, p0, Lyq4;->b:Lhd5;

    .line 74
    .line 75
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Lif1;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_2
    iget-object p0, p0, Lyq4;->c:Ljava/lang/Float;

    .line 85
    .line 86
    return-object p0
.end method

.method public final g()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyq4;->c:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyq4;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long/2addr v0, v2

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v3, "TargetBasedAnimation: "

    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lyq4;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, " -> "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lyq4;->c:Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, ",initial velocity: "

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lyq4;->g:Lce;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, ", duration: "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, " ms,animationSpec: "

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lyq4;->a:Lg45;

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

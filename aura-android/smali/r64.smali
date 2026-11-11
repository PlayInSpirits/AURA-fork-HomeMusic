.class final Lr64;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Llm0;

.field public final b:Z

.field public final c:Ly71;

.field public final d:Lrm2;

.field public final e:Lfv;

.field public final f:Ltb;


# direct methods
.method public constructor <init>(Llm0;ZLy71;Lrm2;Lfv;Ltb;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr64;->a:Llm0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lr64;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lr64;->c:Ly71;

    .line 9
    .line 10
    iput-object p4, p0, Lr64;->d:Lrm2;

    .line 11
    .line 12
    iput-object p5, p0, Lr64;->e:Lfv;

    .line 13
    .line 14
    iput-object p6, p0, Lr64;->f:Ltb;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 2

    .line 1
    new-instance v0, Ls64;

    .line 2
    .line 3
    invoke-direct {v0}, Lfo0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr64;->a:Llm0;

    .line 7
    .line 8
    iput-object v1, v0, Ls64;->D:La74;

    .line 9
    .line 10
    sget-object v1, Lhb3;->o:Lhb3;

    .line 11
    .line 12
    iput-object v1, v0, Ls64;->E:Lhb3;

    .line 13
    .line 14
    iget-boolean v1, p0, Lr64;->b:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Ls64;->F:Z

    .line 17
    .line 18
    iget-object v1, p0, Lr64;->c:Ly71;

    .line 19
    .line 20
    iput-object v1, v0, Ls64;->G:Ly71;

    .line 21
    .line 22
    iget-object v1, p0, Lr64;->d:Lrm2;

    .line 23
    .line 24
    iput-object v1, v0, Ls64;->H:Lrm2;

    .line 25
    .line 26
    iget-object v1, p0, Lr64;->e:Lfv;

    .line 27
    .line 28
    iput-object v1, v0, Ls64;->I:Lfv;

    .line 29
    .line 30
    iget-object p0, p0, Lr64;->f:Ltb;

    .line 31
    .line 32
    iput-object p0, v0, Ls64;->J:Ltb;

    .line 33
    .line 34
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 8

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ls64;

    .line 3
    .line 4
    iget-object v6, p0, Lr64;->d:Lrm2;

    .line 5
    .line 6
    iget-object v7, p0, Lr64;->e:Lfv;

    .line 7
    .line 8
    iget-object v1, p0, Lr64;->a:Llm0;

    .line 9
    .line 10
    sget-object v2, Lhb3;->o:Lhb3;

    .line 11
    .line 12
    iget-object v3, p0, Lr64;->f:Ltb;

    .line 13
    .line 14
    iget-boolean v4, p0, Lr64;->b:Z

    .line 15
    .line 16
    iget-object v5, p0, Lr64;->c:Ly71;

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v7}, Ls64;->v0(La74;Lhb3;Ltb;ZLy71;Lrm2;Lfv;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_8

    .line 6
    .line 7
    const-class v1, Lr64;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    check-cast p1, Lr64;

    .line 17
    .line 18
    iget-object v1, p0, Lr64;->a:Llm0;

    .line 19
    .line 20
    iget-object v2, p1, Lr64;->a:Llm0;

    .line 21
    .line 22
    if-eq v1, v2, :cond_2

    .line 23
    .line 24
    return v0

    .line 25
    :cond_2
    iget-boolean v1, p0, Lr64;->b:Z

    .line 26
    .line 27
    iget-boolean v2, p1, Lr64;->b:Z

    .line 28
    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    iget-object v1, p0, Lr64;->c:Ly71;

    .line 33
    .line 34
    iget-object v2, p1, Lr64;->c:Ly71;

    .line 35
    .line 36
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    iget-object v1, p0, Lr64;->d:Lrm2;

    .line 44
    .line 45
    iget-object v2, p1, Lr64;->d:Lrm2;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_5
    iget-object v1, p0, Lr64;->e:Lfv;

    .line 55
    .line 56
    iget-object v2, p1, Lr64;->e:Lfv;

    .line 57
    .line 58
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    iget-object p0, p0, Lr64;->f:Ltb;

    .line 66
    .line 67
    iget-object p1, p1, Lr64;->f:Ltb;

    .line 68
    .line 69
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_7

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_7
    :goto_0
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_8
    :goto_1
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lr64;->a:Llm0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    sget-object v2, Lhb3;->o:Lhb3;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, Lr64;->b:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, Lxa3;->c(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Lr64;->c:Ly71;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v2

    .line 39
    :goto_0
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v3, p0, Lr64;->d:Lrm2;

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v2

    .line 51
    :goto_1
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v3, p0, Lr64;->e:Lfv;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v3, v2

    .line 63
    :goto_2
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object p0, p0, Lr64;->f:Ltb;

    .line 70
    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    :cond_3
    add-int/2addr v0, v2

    .line 78
    return v0
.end method

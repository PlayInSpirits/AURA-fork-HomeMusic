.class public final synthetic Ltr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyr2;
.implements Lks2;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lls2;Lgn2;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltr2;->p:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ltr2;->q:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, Ltr2;->n:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Ltr2;->o:Z

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lza4;ZZLfr2;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltr2;->p:Ljava/lang/Object;

    iput-boolean p2, p0, Ltr2;->n:Z

    iput-boolean p3, p0, Ltr2;->o:Z

    iput-object p4, p0, Ltr2;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Lfr2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ltr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    iget-object v1, p0, Ltr2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lgn2;

    .line 8
    .line 9
    iget-object v2, v0, Lls2;->g:Ltn2;

    .line 10
    .line 11
    invoke-static {v1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 v5, -0x1

    .line 16
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-object v3, p1

    .line 22
    invoke-virtual/range {v2 .. v7}, Ltn2;->x(Lfr2;Ljava/util/List;IJ)Llb4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, Lla0;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, v1, Lla0;->q:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v3, v1, Lla0;->p:Ljava/lang/Object;

    .line 34
    .line 35
    iget-boolean v0, p0, Ltr2;->n:Z

    .line 36
    .line 37
    iput-boolean v0, v1, Lla0;->n:Z

    .line 38
    .line 39
    iget-boolean p0, p0, Ltr2;->o:Z

    .line 40
    .line 41
    iput-boolean p0, v1, Lla0;->o:Z

    .line 42
    .line 43
    new-instance p0, Llg1;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, v0, p1, v1}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lgq0;->n:Lgq0;

    .line 50
    .line 51
    invoke-virtual {p1, p0, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public f(Ler2;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Ltr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v3, v0

    .line 4
    check-cast v3, Lza4;

    .line 5
    .line 6
    iget-object v0, p0, Ltr2;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfr2;

    .line 9
    .line 10
    iget v6, v0, Lfr2;->c:I

    .line 11
    .line 12
    iget-boolean v4, p0, Ltr2;->n:Z

    .line 13
    .line 14
    iget-boolean v5, p0, Ltr2;->o:Z

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-interface/range {v1 .. v6}, Ler2;->B(ILza4;ZZI)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

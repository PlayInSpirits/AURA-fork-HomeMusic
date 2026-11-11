.class public final Lwd5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lt80;
.implements Lw92;


# instance fields
.field public final n:Lra;

.field public final o:Lz80;

.field public p:Z

.field public q:Lea2;

.field public r:Lr70;


# direct methods
.method public constructor <init>(Lra;Lz80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwd5;->n:Lra;

    .line 5
    .line 6
    iput-object p2, p0, Lwd5;->o:Lz80;

    .line 7
    .line 8
    sget-object p1, Lrr2;->a:Lr70;

    .line 9
    .line 10
    iput-object p1, p0, Lwd5;->r:Lr70;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lwd5;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lwd5;->p:Z

    .line 7
    .line 8
    iget-object v0, p0, Lwd5;->n:Lra;

    .line 9
    .line 10
    invoke-virtual {v0}, Lra;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0a0669

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lwd5;->q:Lea2;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lea2;->f(Laa2;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v3, p0, Lwd5;->q:Lea2;

    .line 29
    .line 30
    iget-object v1, v0, Lra;->t:Lbs0;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, Lbs0;->o:Lds0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lds0;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v3, v0, Lra;->t:Lbs0;

    .line 40
    .line 41
    :cond_2
    iget-object p0, p0, Lwd5;->o:Lz80;

    .line 42
    .line 43
    invoke-virtual {p0}, Lz80;->m()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final b(Lba2;Lq92;)V
    .locals 0

    .line 1
    sget-object p1, Lq92;->ON_DESTROY:Lq92;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwd5;->a()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Lq92;->ON_CREATE:Lq92;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lwd5;->p:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lwd5;->r:Lr70;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lwd5;->c(Lwf1;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final c(Lwf1;)V
    .locals 2

    .line 1
    new-instance v0, Lz15;

    .line 2
    .line 3
    check-cast p1, Lr70;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, p1, v1}, Lz15;-><init>(Ljava/lang/Object;Lsf1;I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lwd5;->n:Lra;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lra;->setOnReadyForComposition(Lif1;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

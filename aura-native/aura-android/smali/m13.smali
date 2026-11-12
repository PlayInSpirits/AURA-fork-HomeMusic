.class public final Lm13;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laz;
.implements Lt85;


# instance fields
.field public final n:Lcz;

.field public final synthetic o:Ln13;


# direct methods
.method public constructor <init>(Ln13;Lcz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm13;->o:Ln13;

    .line 5
    .line 6
    iput-object p2, p0, Lm13;->n:Lcz;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu84;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcz;->a(Lu84;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ljava/lang/Object;Lxf1;)Lf01;
    .locals 1

    .line 1
    check-cast p1, Lj15;

    .line 2
    .line 3
    new-instance p2, Lbz;

    .line 4
    .line 5
    iget-object v0, p0, Lm13;->o:Ln13;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lbz;-><init>(Ln13;Lm13;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcz;->G(Ljava/lang/Object;Lxf1;)Lf01;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Ln13;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final getContext()Lne0;
    .locals 0

    .line 1
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 2
    .line 3
    iget-object p0, p0, Lcz;->r:Lne0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final k(Ljava/lang/Object;Lxf1;)V
    .locals 2

    .line 1
    sget-object p1, Ln13;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iget-object v0, p0, Lm13;->o:Ln13;

    .line 5
    .line 6
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lx;

    .line 10
    .line 11
    const/16 p2, 0x19

    .line 12
    .line 13
    invoke-direct {p1, p2, v0, p0}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 17
    .line 18
    iget p2, p0, Lor0;->p:I

    .line 19
    .line 20
    new-instance v0, Lbz;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1, p1}, Lbz;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lj15;->a:Lj15;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2, v0}, Lcz;->D(Ljava/lang/Object;ILxf1;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final r(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcz;->r(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm13;->n:Lcz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcz;->t(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

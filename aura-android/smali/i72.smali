.class public final Li72;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvi2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lif1;

.field public final synthetic e:Lj72;

.field public final synthetic f:Lo72;

.field public final synthetic g:Lif1;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lif1;Lj72;Lo72;Lif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Li72;->a:I

    .line 5
    .line 6
    iput p2, p0, Li72;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Li72;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Li72;->d:Lif1;

    .line 11
    .line 12
    iput-object p5, p0, Li72;->e:Lj72;

    .line 13
    .line 14
    iput-object p6, p0, Li72;->f:Lo72;

    .line 15
    .line 16
    iput-object p7, p0, Li72;->g:Lif1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Li72;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Li72;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Li72;->f:Lo72;

    .line 2
    .line 3
    iget-object v0, v0, Lo72;->n:Lc72;

    .line 4
    .line 5
    iget-object v1, p0, Li72;->e:Lj72;

    .line 6
    .line 7
    invoke-virtual {v1}, Lj72;->K()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object p0, p0, Li72;->g:Lif1;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lc72;->Q:Lw12;

    .line 16
    .line 17
    iget-object v1, v1, Lw12;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Liz1;

    .line 20
    .line 21
    iget-object v1, v1, Liz1;->o0:Lhz1;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lcf2;->C:Ldf2;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, v0, Lc72;->Q:Lw12;

    .line 32
    .line 33
    iget-object v0, v0, Lw12;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Liz1;

    .line 36
    .line 37
    iget-object v0, v0, Lcf2;->C:Ldf2;

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final d()I
    .locals 0

    .line 1
    iget p0, p0, Li72;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final g()Lif1;
    .locals 0

    .line 1
    iget-object p0, p0, Li72;->d:Lif1;

    .line 2
    .line 3
    return-object p0
.end method

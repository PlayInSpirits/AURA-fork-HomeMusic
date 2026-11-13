.class public final synthetic Ldefpackage/zs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ldefpackage/kt2;

.field public final synthetic o:Ldefpackage/fr2;

.field public final synthetic p:I

.field public final synthetic q:Ldefpackage/tn2;

.field public final synthetic r:I

.field public final synthetic s:Ldefpackage/it2;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/kt2;Ldefpackage/fr2;ILdefpackage/tn2;ILdefpackage/it2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zs2;->n:Ldefpackage/kt2;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/zs2;->o:Ldefpackage/fr2;

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/zs2;->p:I

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/zs2;->q:Ldefpackage/tn2;

    .line 11
    .line 12
    iput p5, p0, Ldefpackage/zs2;->r:I

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/zs2;->s:Ldefpackage/it2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/zs2;->n:Ldefpackage/kt2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/zs2;->o:Ldefpackage/fr2;

    .line 6
    .line 7
    iget v2, p0, Ldefpackage/zs2;->p:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ldefpackage/na4;->H(Ldefpackage/fr2;I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v4, p0, Ldefpackage/zs2;->q:Ldefpackage/tn2;

    .line 14
    .line 15
    iget v5, p0, Ldefpackage/zs2;->r:I

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    new-instance p0, Ldefpackage/ab4;

    .line 20
    .line 21
    const/4 v0, -0x4

    .line 22
    invoke-direct {p0, v0}, Ldefpackage/ab4;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v1, v5, p0}, Ldefpackage/kt2;->P0(Ldefpackage/tn2;Ldefpackage/fr2;ILdefpackage/ab4;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v3, v4, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 30
    .line 31
    invoke-virtual {v4, v1}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x1b

    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/zs2;->s:Ldefpackage/it2;

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    invoke-interface {p0, v4, v1, v5}, Ldefpackage/it2;->h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    new-instance p0, Ldefpackage/ct2;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2, p0}, Ldefpackage/na4;->d(Ldefpackage/fr2;ILdefpackage/aa0;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    new-instance v3, Ldefpackage/dt2;

    .line 56
    .line 57
    invoke-direct {v3, p0, v4, v1, v5}, Ldefpackage/dt2;-><init>(Ldefpackage/it2;Ldefpackage/tn2;Ldefpackage/fr2;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/na4;->d(Ldefpackage/fr2;ILdefpackage/aa0;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

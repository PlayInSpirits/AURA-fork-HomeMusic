.class public final Ldefpackage/qo4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/fa0;


# instance fields
.field public final n:Ldefpackage/pz1;


# direct methods
.method public constructor <init>(Ldefpackage/pz1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qo4;->n:Ldefpackage/pz1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qo4;->n:Ldefpackage/pz1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/so4;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final k(ZLdefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/qo4;->n:Ldefpackage/pz1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/so4;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p1, Ldefpackage/uo4;

    .line 11
    .line 12
    new-instance v0, Ldefpackage/po4;

    .line 13
    .line 14
    invoke-interface {p0}, Ldefpackage/so4;->z()Ldefpackage/we1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Ldefpackage/po4;-><init>(Ldefpackage/we1;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0}, Ldefpackage/uo4;-><init>(Ldefpackage/po4;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2, p1, p3}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

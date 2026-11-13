.class public final synthetic Ldefpackage/zd4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/go4;


# instance fields
.field public final synthetic n:Ldefpackage/qe4;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Ldefpackage/pe4;

.field public final synthetic q:I

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Ldefpackage/qe4;Ljava/util/List;Ldefpackage/pe4;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zd4;->n:Ldefpackage/qe4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/zd4;->o:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/zd4;->p:Ldefpackage/pe4;

    .line 9
    .line 10
    iput p4, p0, Ldefpackage/zd4;->q:I

    .line 11
    .line 12
    iput-wide p5, p0, Ldefpackage/zd4;->r:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Ldefpackage/zd4;->o:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v0, v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ldefpackage/gn2;

    .line 20
    .line 21
    invoke-static {v2}, Ldefpackage/qe4;->e1(Ldefpackage/gn2;)Ldefpackage/he4;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Ldefpackage/zd4;->n:Ldefpackage/qe4;

    .line 32
    .line 33
    iget-object v5, v0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 34
    .line 35
    iget-object v0, p0, Ldefpackage/zd4;->p:Ldefpackage/pe4;

    .line 36
    .line 37
    iget v2, p0, Ldefpackage/zd4;->q:I

    .line 38
    .line 39
    iget-wide v3, p0, Ldefpackage/zd4;->r:J

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Ldefpackage/qe4;->k1(Ldefpackage/pe4;Ljava/util/ArrayList;IJLdefpackage/bu4;)Ldefpackage/pe4;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

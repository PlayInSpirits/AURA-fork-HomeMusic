.class public final Lp64;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvb3;


# instance fields
.field public final n:I

.field public final o:Ljava/util/List;

.field public p:Ljava/lang/Float;

.field public q:Ljava/lang/Float;

.field public r:Lh64;

.field public s:Lh64;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lp64;->n:I

    .line 5
    .line 6
    iput-object p2, p0, Lp64;->o:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lp64;->p:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, Lp64;->q:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, Lp64;->r:Lh64;

    .line 14
    .line 15
    iput-object p1, p0, Lp64;->s:Lh64;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp64;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

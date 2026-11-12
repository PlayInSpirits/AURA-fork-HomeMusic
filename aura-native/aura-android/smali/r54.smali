.class public final Lr54;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lm54;


# instance fields
.field public final synthetic n:Lwf1;

.field public final synthetic o:Lif1;


# direct methods
.method public constructor <init>(Lwf1;Lif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr54;->n:Lwf1;

    .line 5
    .line 6
    iput-object p2, p0, Lr54;->o:Lif1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lr54;->o:Lif1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(Lt44;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lr54;->n:Lwf1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

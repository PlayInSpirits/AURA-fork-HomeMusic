.class public final Lmb4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ScanCallback;


# instance fields
.field public final synthetic n:Lpz1;


# direct methods
.method public constructor <init>(Lpz1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmb4;->n:Lpz1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lmb4;->n:Lpz1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lpz1;->onError(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onSuccess(ZJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lmb4;->n:Lpz1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lpz1;->onSuccess(ZJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

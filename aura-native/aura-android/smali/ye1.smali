.class public final Lye1;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Lze1;

.field public final o:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lze1;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lye1;->n:Lze1;

    .line 5
    .line 6
    iput-object p2, p0, Lye1;->o:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, Lye1;->o:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method

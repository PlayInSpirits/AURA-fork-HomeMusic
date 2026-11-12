.class public final Lc32;
.super Luc0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic p:Luc0;


# direct methods
.method public constructor <init>(Luc0;Luc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc32;->p:Luc0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Luc0;-><init>(Luc0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, p0, Lc32;->p:Luc0;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Luc0;->c(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

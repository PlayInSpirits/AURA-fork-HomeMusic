.class public final Lha4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lx32;


# instance fields
.field public final synthetic n:Lmo0;


# direct methods
.method public constructor <init>(Lmo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lha4;->n:Lmo0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Llo0;

    .line 2
    .line 3
    iget-object p0, p0, Lha4;->n:Lmo0;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Llo0;-><init>(Lmo0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.class public final Lwy0;
.super Landroid/view/View;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:Lmr;


# direct methods
.method public constructor <init>(Lmr;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwy0;->n:Lmr;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lwy0;->n:Lmr;

    .line 5
    .line 6
    invoke-virtual {p0}, Lmr;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.class public abstract Ldefpackage/ju4;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ldefpackage/ku4;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    sget p0, Ldefpackage/a45;->a:I

    .line 13
    .line 14
    :cond_0
    return-void
.end method
